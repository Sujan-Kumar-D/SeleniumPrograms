package automationFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoITUpload {
	WebDriver driver;

	@Test
	public void pageload() {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		// Open Webpage
		driver.get("http://tinyupload.com/");

	}

	@Test
	public void runtime() throws Exception {
		WebElement upload = driver.findElement(By.name("uploaded_file"));
		Actions act = new Actions(driver);
		act.moveToElement(upload).click().build().perform();
		Thread.sleep(3000);
		// Calling AutoITexe file
		Runtime.getRuntime().exec("C://Sujan//AutoIT//Single File//SingleFileUploadScript.exe");
		driver.findElement(By.xpath("//td[contains(text(),'close')]/preceding::img[1]")).click();
	}

}
