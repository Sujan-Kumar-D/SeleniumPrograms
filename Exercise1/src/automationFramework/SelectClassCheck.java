package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Registration
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("may26th2020@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		
		//Registration Form Filling
		
		//Personal Information
		WebElement radio1 = driver.findElement(By.id("id_gender2"));
		Thread.sleep(5000);
		radio1.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Sujan");
		Thread.sleep(5000);
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		Thread.sleep(5000);
		driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("days")).click();
		Thread.sleep(5000);
		new Select (driver.findElement(By.id("days"))).selectByVisibleText("1  ");
		driver.findElement(By.id("days")).click();
		driver.findElement(By.id("months")).click();
		Thread.sleep(5000);
		new Select (driver.findElement(By.id("months"))).selectByVisibleText("April ");
		driver.findElement(By.id("months")).click();
		driver.findElement(By.id("years")).click();
		Thread.sleep(5000);
		new Select (driver.findElement(By.id("years"))).selectByVisibleText("1988  ");
		driver.findElement(By.id("years")).click();

	}

}
