package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccordCoaching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.accordinfomatrix.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ename")).sendKeys("Raghu");;
		driver.findElement(By.id("phone")).sendKeys("9494848484");;
		driver.findElement(By.id("email")).sendKeys("Raghu.Kumar@gmail.com");
		driver.findElement(By.name("course")).click();
		new Select(driver.findElement(By.name("course"))).selectByVisibleText("Testing");
		driver.findElement(By.name("course")).click();
		driver.findElement(By.id("location")).sendKeys("Chennai");
		driver.findElement(By.id("query")).sendKeys("Need Sample Quotation");
		driver.findElement(By.xpath("//input[@id='fsubmit']")).click();
		Thread.sleep(2000);
		
	}

}

