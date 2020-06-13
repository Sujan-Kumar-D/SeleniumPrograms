package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormAuthentication {
	
	
WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void WrongCredentials() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("Sujan");
		driver.findElement(By.id("password")).sendKeys("Kumar");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		String FlashMessageError = driver.findElement(By.id("flash")).getText();
		System.out.println(FlashMessageError);
	}
	
	@Test (priority=2)
	public void SuccessfulLoign() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		String FlashMessage1 = driver.findElement(By.id("flash")).getText();
		System.out.println(FlashMessage1);
		driver.findElement(By.xpath("//i[contains(text(),' Logout')]")).click();
		String FlashMessage2 = driver.findElement(By.id("flash")).getText();
		System.out.println(FlashMessage2);
		
	}
	
	

}
