package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToDoSite {
	
	WebDriver driver;
	Actions act;
	
	//Browser Instantiation & Page Load
	@BeforeTest
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://todomvc.com/examples/angularjs/#/");
		driver.manage().window().maximize();
	}
	
	//Tasks Addition
	@Test (priority=1)
	public void addTask() {
		
		act = new Actions(driver);
		WebElement Task1 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		Task1.sendKeys("Task1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.sendKeys(Keys.RETURN).build().perform();
		WebElement Task2 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		Task2.sendKeys("Task2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.sendKeys(Keys.RETURN).build().perform();
		WebElement Task3 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		Task3.sendKeys("Task3");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.sendKeys(Keys.RETURN).build().perform();
	}
	

	//Task Completion = Task1
	@Test (priority=2)
	public void taskCompletion() {
		
		WebElement complt = driver.findElement(By.xpath("(//input[@ng-model='todo.completed'])[1]"));
		complt.click();
	}
	
	//Printing Remaining Tasks Count
	@Test (priority=3)
	public void pendingCount() {
		String pendinginitial = driver.findElement(By.xpath("//span[@class='todo-count']")).getText();
		System.out.println("Pending Items:"+ pendinginitial);
		Assert.assertEquals("2 items left", pendinginitial);
		System.out.println("Assert Equals Pass");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	//Deleting Task On Clicking "x" icon - Mouse Hover Action
	@Test (priority=4)
	public void deleteTask() {
		WebElement close = driver.findElement(By.xpath("(//label[@class='ng-binding'])[2]"));
		act.moveToElement(close).build().perform();
		driver.findElement(By.xpath("(//button[@class='destroy'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	//Clearing Completed Tasks
	@Test (priority=5)
	public void clearComplete() {
		driver.findElement(By.xpath("//button[@class='clear-completed']")).click();
		String pendingfinally = driver.findElement(By.xpath("//span[@class='todo-count']")).getText();
		System.out.println("Final Pending Items:"+ pendingfinally);
	}
}
