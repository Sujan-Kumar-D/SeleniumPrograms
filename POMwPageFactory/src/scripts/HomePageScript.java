package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomePageRepo;
import reusables.HomePageRuse;

public class HomePageScript {
	

	WebDriver driver;
	
	@Test
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		HomePageRepo LoginFlow = PageFactory.initElements(driver, HomePageRepo.class);
		LoginFlow.Signin();
		LoginFlow.Signout();
	}
	


}
