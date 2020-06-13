package com.youlogo.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.yourlogo.repo.HomePageRepo;
import com.yourlogo.repo.Properties;
import com.yourlogo.repo.TShirtsRepo;

public class TshirtsScript extends Properties{
	

	TShirtsRepo TShirt;
		
		@Test (priority=3)
		public void productSelection() {
			TShirt = PageFactory.initElements(driver, TShirtsRepo.class);
			TShirt.TShirts();
		}

}
