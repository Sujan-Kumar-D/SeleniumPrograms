package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleRuns {
	
	WebDriver driver;
	
	@Test(invocationCount=3)
	public void gmail() {
	System.setProperty("webdriver.gecko.driver", "C:/Sujan/Essentials/Browser Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");

	}
	
}
