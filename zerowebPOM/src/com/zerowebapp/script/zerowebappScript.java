package com.zerowebapp.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.zerowebapp.pageobjects.zerowebappPageObjects;

public class zerowebappScript {
	
WebDriver driver;
zerowebappPageObjects SignInFlow;
	
	@Test (priority=1)
	public void PageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 78/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		SignInFlow = PageFactory.initElements(driver, zerowebappPageObjects.class);
	}
	
	@Test (priority=2)
	public void UserLoginFlow() {
		SignInFlow.SignInLink();
		SignInFlow.SignInAction();
		
	}

}
