package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void DragDrop() throws InterruptedException {
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Drag and Drop")).click();
		Actions act = new Actions(driver);
		WebElement Element1 = driver.findElement(By.id("column-a"));
		WebElement Element2 = driver.findElement(By.id("column-b"));
		Thread.sleep(2000);
		act.dragAndDrop(Element1, Element2).build().perform();
	}
}
