package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddRemoveElements {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void addandRemove() {
		WebElement Element1 = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		Element1.click();
		WebElement Element2 = driver.findElement(By.xpath("//button[@class='added-manually']"));
		Element2.click();
	}
}
