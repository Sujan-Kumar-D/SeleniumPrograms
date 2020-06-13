package com.toptal.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class ToptalFreelancerPageObjects {
	
WebDriver driver;
	
	public ToptalFreelancerPageObjects() {
		this.driver = driver;
	} 
	
	@FindBy(how=How.XPATH, using = "//div[contains(text(),'I am a')]") WebElement RoleName;
	@FindBy(how=How.XPATH, using = "//div[contains(text(),'Developer')]") WebElement DevRole;
	@FindBy(how=How.ID, using = "talent_create_applicant_email") WebElement Email;
	@FindBy(how=How.ID, using = "talent_create_applicant_password") WebElement Password;
	@FindBy(how=How.ID, using = "talent_create_applicant_password_confirmation") WebElement PasswordConfirmation;
	@FindBy(how=How.ID, using = "talent_create_applicant_full_name") WebElement FullName;
	@FindBy(how=How.CLASS_NAME, using = "//span[@class='label_wrap']") WebElement TermsandConditions;
	@FindBy(how=How.ID, using = "save_new_talent_create_applicant") WebElement Submit;
	
	
	public void registration() throws InterruptedException {
		RoleName.click();
		DevRole.click();
		Email.sendKeys("may24thkumar@gmail.com");
		Password.sendKeys("Passw0rd$123");
		PasswordConfirmation.sendKeys("Passw0rd$123");
		FullName.sendKeys("Kumar Babu");
		Thread.sleep(2000);
		Submit.click();
	}
	
	
	
	
}
