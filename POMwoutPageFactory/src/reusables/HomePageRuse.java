package reusables;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageRepo;

public class HomePageRuse extends HomePageRepo{
	  

	public HomePageRuse(WebDriver driver) {
		super(driver);
	}


	public void SigninClick(WebDriver driver) {
		System.out.println("Driver : " +driver);
		driver.findElement(loginButton).click();
		driver.findElement(UserName).sendKeys("may01st2019@yopmail.com");
		driver.findElement(Password).sendKeys("Passw0rd$123");
		driver.findElement(SubmitButton).click();
	}

	public void SignOutClick(WebDriver driver) {
		System.out.println("Driver : " +driver);
		driver.findElement(logOutButton).click();
	}
}
