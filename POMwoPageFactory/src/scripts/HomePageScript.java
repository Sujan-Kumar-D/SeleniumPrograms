package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomePageRepo;

public class HomePageScript {
	
	WebDriver driver;
	HomePageRepo Function;
	
	@Test
	public void Pageload() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Function = new HomePageRepo(driver);
	}
	
	@Test
	public void signin() {
		Function.SigninClick();
	}
	
	@Test
	public void signout() {
		Function.SignOutClick();
	}
	
	

}
