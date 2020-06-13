package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePageRepo {

	WebDriver driver;

	protected By loginButton = By.xpath("//a[@class='login']");
	protected By UserName = By.id("email");
	protected By Password = By.name("passwd");
	protected By SubmitButton = By.id("SubmitLogin");
	protected By logOutButton = By.xpath("//a[@class='logout']");

	public HomePageRepo(WebDriver driver) {
		this.driver = driver;
	}

	
}
