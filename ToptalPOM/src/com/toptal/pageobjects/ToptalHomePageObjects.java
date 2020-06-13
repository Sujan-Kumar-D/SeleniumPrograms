package com.toptal.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class ToptalHomePageObjects {

	WebDriver driver;

	public ToptalHomePageObjects() {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Apply as a Freelancer')]")
	WebElement Role;

	public void Rolelink() {
		Role.click();
	}

}
