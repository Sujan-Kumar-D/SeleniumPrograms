package Framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextMenu {
	
WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void ContextMenu() throws InterruptedException {
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Context Menu")).click();
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		String AlertText = al.getText();
		System.out.println(AlertText);
		al.accept();
	}
	
}
