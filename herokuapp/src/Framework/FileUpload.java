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

public class FileUpload {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void Fileupload1() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(2000);
		WebElement Element1 = driver.findElement(By.id("file-upload"));
		Element1.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		WebElement Element2 = driver.findElement(By.id("file-submit"));
		Element2.click();
		Assert.assertEquals("File Uploaded!", "File Uploaded!");
		System.out.println("File Uploaded Successfully");
		
	}
	
	@Test (priority=2)
	public void Fileupload2() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(2000);
		WebElement Element1 = driver.findElement(By.id("drag-drop-upload"));
		Thread.sleep(2000);
		Element1.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		WebElement Element2 = driver.findElement(By.id("file-submit"));
		Element2.click();
		Assert.assertEquals("File Uploaded!", "File Uploaded!");
		System.out.println("File Uploaded Successfully");
		
	}
	
}
