package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("fname");
		driver.findElement(By.name("lastName")).sendKeys("lname");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.id("userName")).sendKeys("testcheckqa@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("QSpiders");
		driver.findElement(By.name("address2")).sendKeys("Chromepet");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TN");
		driver.findElement(By.name("postalCode")).sendKeys("34565");
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("ARGENTINA");
		driver.findElement(By.name("email")).sendKeys("testcheckQA");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Passw0rd$123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Passw0rd$123");
		driver.findElement(By.name("register")).click();
	}

}
