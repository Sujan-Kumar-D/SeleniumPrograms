package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxSpicJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement Type = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		Type.click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(Type.isSelected());
		System.out.println(Type.isDisplayed());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String LoginText = driver.findElement(By.id("ctl00_HyperLinkLogin")).getText();
		System.out.println(LoginText);
		
	}

}
