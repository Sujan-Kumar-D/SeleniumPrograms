package com.zerowebapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class zerowebappPageObjects {
	
WebDriver driver;
	
	public zerowebappPageObjects() {
		this.driver = driver;
	} 
	
	@FindBy(how=How.ID,using ="signin_button")WebElement SignIn;
	@FindBy(how=How.NAME,using ="user_login")WebElement UserNameField;
	@FindBy(how=How.XPATH,using ="//input[@id='user_password']")WebElement UserPasswordField;
	@FindBy(how=How.NAME,using ="submit")WebElement Submitbutton;
	
public void SignInLink() {
	SignIn.click();
}
public void SignInAction() {
	UserNameField.sendKeys("username");
	UserPasswordField.sendKeys("password");
	Submitbutton.click();
}
	
	
}
