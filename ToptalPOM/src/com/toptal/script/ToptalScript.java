package com.toptal.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.toptal.pageobjects.ToptalFreelancerPageObjects;
import com.toptal.pageobjects.ToptalHomePageObjects;

public class ToptalScript {
	
WebDriver driver;
ToptalHomePageObjects HomeRole;
ToptalFreelancerPageObjects RegistrationForm;
	
	@BeforeSuite
	public void PageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 81/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.toptal.com/");
		driver.manage().window().maximize();
		HomeRole = PageFactory.initElements(driver, ToptalHomePageObjects.class);
		RegistrationForm = PageFactory.initElements(driver, ToptalFreelancerPageObjects.class);
	}
	
	@Test (priority=1)
	public void RoleLinkClick() throws InterruptedException {
		HomeRole.Rolelink();
		Thread.sleep(5000);
	}
	
	@Test (priority=2)
	public void Registration() throws InterruptedException {
		RegistrationForm.registration();
	}

}
