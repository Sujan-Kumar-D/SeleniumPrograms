package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YourLogoRegistrationParallel {
	
	WebDriver driver;

	@Test (priority=1)
	@Parameters("browser")
	public void Browser(String Browsertype) {
		
		if (Browsertype.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if (Browsertype.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:/Sujan/Essentials/Browser Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else if (Browsertype.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:/Sujan/Essentials/Browser Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		
	}
	
	@Test (priority=2)
	public void Pageload() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test (priority=3)
	public void Signin() throws InterruptedException {
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("may01st2019dsk@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("SubmitLogin")).click();
		String PageName = driver.getTitle();
		Assert.assertEquals(PageName, "My account - My Store");
		System.out.println(PageName);
		Thread.sleep(2000);
	}
	
	@Test (priority=4)
	public void SignOut() {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		String PageName = driver.getTitle();
		Assert.assertEquals(PageName, "Login - My Store");
		System.out.println(PageName);
	}
	
}
