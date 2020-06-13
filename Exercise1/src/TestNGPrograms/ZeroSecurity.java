package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class ZeroSecurity {

	WebDriver driver;

	@Test
	public void LoginLogout() {

		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("username")).click();
		driver.findElement(By.id("logout_link")).click();
	}

	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest()
	public void afterMethod() {
		driver.close();
	}

}
