package Framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileDownload {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void Filedownload() throws InterruptedException {
		String filepath = "C:\\Users\\P01242\\Downloads";
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Download")).click();
		Thread.sleep(2000);
		WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'some-file.txt')]"));
		Element.click();
	}
	
}
