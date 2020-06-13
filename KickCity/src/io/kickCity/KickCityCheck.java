package io.kickCity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KickCityCheck {

	WebDriver driver;
	Actions act;

	@Test (priority=1)

	public void PageLoad() {
		//Browser Instantiation & Page Load
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.kickcity.io/login");
		driver.manage().window().maximize();
	}

	@Test (priority=2)

	public void Signin() {
		//Signing into Kickcity BlockChain application
		driver.findElement(By.id("email")).sendKeys("blockchainqa1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Passw0rd$123");
		driver.findElement(By.xpath("//button[@class='btn__1aZS4 primary__308_9']//span[contains(text(),'Log in')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test (priority=3)
	
	public void CreateEvent() {
		//Clicking on Create Event Button on top right corner
		act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@class='createEvent__2dgsI highlighted__1wB-W']"))).click().build().perform();
	}
	
	@Test (priority=4)
	
	public void EventCreation() throws InterruptedException {
		//Filling The Required Details To Create An Event
		driver.findElement(By.id("title")).sendKeys("Educational Event");
		Thread.sleep(20000);
		//In This Interruption, Image File Will Be Uploaded
		driver.findElement(By.id("description")).sendKeys("Educational Training For Students");
		driver.findElement(By.xpath("//select[@class='hidden__1NwJR select__2fNFU']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//select[@class='hidden__1NwJR select__2fNFU']")).click();
		WebElement Button = driver.findElement(By.xpath("//label[contains(text(),'Public')]"));
		Button.click();
		driver.findElement(By.id("address")).sendKeys("223 East Concord Street, Orlando, FL 32801, USA");
		driver.findElement(By.xpath("//span[contains(text(),'223 East Concord Street, Orlando, FL 32801, USA')]")).click();
		driver.findElement(By.id("startDate")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='month-2019-07']//div[@aria-label='day-29']")).click();
		driver.findElement(By.id("endDate")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='month-2019-07']//div[@aria-label='day-31']")).click();
		WebElement fee = driver.findElement(By.xpath("//span[contains(text(),'User pays fees')]"));
		fee.click();
		driver.findElement(By.xpath("//span[contains(text(),'Paid ticket')]")).click();
		driver.findElement(By.id("tickets.0.title-field")).sendKeys("Premium");
		driver.findElement(By.id("tickets.0.price-field")).sendKeys("25");
		driver.findElement(By.id("tickets.0.count-field")).sendKeys("50");
		driver.findElement(By.id("customUrl")).sendKeys("checkevent500");
		WebElement Submit = driver.findElement(By.xpath("//span[contains(text(),'Publish')]"));
		Submit.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test (priority=5)
	
	public void BookingPage() {
		//Event Is Created Successfully
		//Opening The Event Page - Which Opens in New Tab
		driver.findElement(By.xpath("//span[contains(text(),'Open event page')]")).click();
		ArrayList <String> Check = new ArrayList <String> (driver.getWindowHandles());
		int TotalTabs = Check.size();
		System.out.println("Total Tabs = " + TotalTabs);
		driver.switchTo().window(Check.get(1));
	}
	
	@Test (priority=6)
	
	public void Payment() throws InterruptedException {
		//Ticket Booking Process
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Premium']")).click();
		Thread.sleep(5000);
		//Select Ticket Page
		driver.findElement(By.xpath("//button[@class='btn__1aZS4 primary__308_9']//span[text()='Continue']")).click();
		//Ticket Information
		driver.findElement(By.id("answers.0.form.person.firstName-field")).sendKeys("Richard");
		driver.findElement(By.id("answers.0.form.person.lastName-field")).sendKeys("Joseph");
		driver.findElement(By.id("answers.0.form.person.email-field")).sendKeys("RJoseph@gmail.com");
		driver.findElement(By.xpath("//button[@class='btn__1aZS4 button__FPe-G primary__308_9 success__3mGRX']//span[contains(text(),'Continue')]")).click();
		Thread.sleep(3000);
		//Payment Information
		driver.findElement(By.xpath("//span[contains(text(),'Bitcoin')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
