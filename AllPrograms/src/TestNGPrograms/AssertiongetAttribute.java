package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertiongetAttribute {
	
	WebDriver driver;
	
	@Test
	public void Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		String actual = driver.findElement(By.xpath("//span[contains(text(),'Please enter valid')]")).getAttribute("innerHTML");
		String expected = "Please enter valid Email ID/Mobile number----";
		
		//Assertions
		
		//Assert.assertEquals(actual, expected);
		System.out.println("actual:" +actual);
		System.out.println("expected:" +expected);
		Assert.assertTrue(actual.contains("Valid Email ID"));
		System.out.println("Test Case Passed");
	}
	
	
	

}
