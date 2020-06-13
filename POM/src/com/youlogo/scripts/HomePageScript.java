package com.youlogo.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.yourlogo.repo.HomePageRepo;
import com.yourlogo.repo.Properties;

public class HomePageScript extends Properties{
	
HomePageRepo Home;
	
	@Test (priority=1)
	public void Signin() {
		Home = PageFactory.initElements(driver, HomePageRepo.class);
		Home.Signin();
	}
	
	@Test (priority=2)
	public void TShirtSelection() {
		Home = PageFactory.initElements(driver, HomePageRepo.class);
		Home.TshirtsSelection();
	}
	
	@Test (priority=3)
	public void Signout() {
		Home = PageFactory.initElements(driver, HomePageRepo.class);
		Home.Signout();
	}
	

}
