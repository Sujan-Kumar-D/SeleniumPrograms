package com.flipkart.scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjects.FlipkartPageObjectsandReusables;

public class FlipkartProductShopScript {
	WebDriver driver;
	FlipkartPageObjectsandReusables BuyAMobile;
	
	@Test (priority=1)
	public void PageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 78/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		BuyAMobile = PageFactory.initElements(driver, FlipkartPageObjectsandReusables.class);
	}
	
	@Test (priority=2)
	public void startuplayer() {
		BuyAMobile.layerclosure();
	}
	
	@Test (priority=3)
	public void searchingMobile() {
		BuyAMobile.searchAproduct();
	}
	
	@Test (priority=4)
	public void mobileSelection() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BuyAMobile.selectproduct();
	}
	
	@Test (priority=5)
	public void addToCart() {
		ArrayList <String> Check = new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(Check.get(1));
		BuyAMobile.Buy();
		System.out.println("Checking");
	}

}
