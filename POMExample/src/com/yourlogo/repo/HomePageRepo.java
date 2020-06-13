package com.yourlogo.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageRepo {
	
	WebDriver driver;
	
	public HomePageRepo(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (how = How.XPATH,using="//a[@class='login']") WebElement SignInLink;
	@FindBy(how=How.ID,using="email") WebElement Username;
	@FindBy(how=How.NAME,using="passwd") WebElement Password;
	@FindBy(how=How.ID,using="SubmitLogin") WebElement SubmitButton;
	@FindBy(how=How.XPATH,using="//a[@class='logout']") WebElement SignOutLink;
	@FindBy(how=How.XPATH,using="//li[@class='sfHoverForce sfHover']//a[contains(text(),'T-shirts')]") WebElement TShirtsLink;
	
	public void Signin() {
		SignInLink.click();
		Username.sendKeys("may01st2019@yopmail.com");
		Password.sendKeys("Passw0rd$123");
		SubmitButton.click();
	}
	
	public void Signout() {
		SignOutLink.click();
	}
	
	public void TshirtsSelection() {
		TShirtsLink.click();
	}
	

}
