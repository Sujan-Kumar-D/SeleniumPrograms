package com.yourlogo.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TShirtsRepo extends Properties {

	WebDriver driver;

	public TShirtsRepo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement ProductName;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add to cart')]")
	WebElement AddToCart;

	public void TShirts() {
		Actions act = new Actions(driver);
		act.moveToElement(ProductName).build().perform();
		AddToCart.click();
	}
}
