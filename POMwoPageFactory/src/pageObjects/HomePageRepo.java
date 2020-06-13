package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePageRepo {

	WebDriver driver;

	By loginButton = By.xpath("//a[@class='login']");
	By UserName = By.id("email");
	By Password = By.name("passwd");
	By SubmitButton = By.id("SubmitLogin");
	By logOutButton = By.xpath("//a[@class='logout']");

	public HomePageRepo(WebDriver driver) {
		this.driver = driver;
	}

	public void SigninClick() {

		driver.findElement(loginButton).click();
		driver.findElement(UserName).sendKeys("may01st2019@yopmail.com");
		driver.findElement(Password).sendKeys("Passw0rd$123");
		driver.findElement(SubmitButton).click();
	}

	public void SignOutClick() {

		driver.findElement(logOutButton).click();
	}
}
