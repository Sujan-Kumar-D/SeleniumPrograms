package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pageObjects.HomePageRepo;

import java.util.*;

public class HomePageRuse extends HomePageRepo {
	
	WebDriver driver;
	
	public HomePageRuse() {
		this.driver=driver;
	}
	
	public void Signin() {
		SignInLink.click();
		Username.sendKeys("may01st2019@yopmail.com");
		Password.sendKeys("Passw0rd$123");
		SubmitButton.click();
	}
	
	public void Signout() {
		SignOutLink.click();
	}
	
	

}
