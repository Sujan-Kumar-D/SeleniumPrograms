package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.*;

public class FlipkartPageObjectsandReusables {
	
	WebDriver driver;
	
	public FlipkartPageObjectsandReusables() {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='_2AkmmA _29YdH8']") WebElement LayerClose;
	@FindBy(how=How.NAME,using="q") WebElement SearchField;
	@FindBy(how=How.XPATH,using="(//div[@class='_3wU53n'])[5]") WebElement SearchResult;
	@FindBy(how=How.XPATH,using="//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']") WebElement BuyNow;
	
	public void layerclosure() {
		LayerClose.click();
	}
	
	public void searchAproduct() {
		SearchField.sendKeys("Mobiles");
		SearchField.submit();
	}
	
	public void selectproduct() {
		SearchResult.click();
	}
	
	public void Buy() {
		BuyNow.click();
	}


}
