package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 	driver.get("https://www.facebook.com/");
		 	driver.manage().window().maximize();
		    driver.findElement(By.id("u_0_j")).click();
		    driver.findElement(By.id("u_0_j")).clear();
		    driver.findElement(By.id("u_0_j")).sendKeys("Kalyan");
		    driver.findElement(By.id("u_0_l")).click();
		    driver.findElement(By.id("u_0_l")).clear();
		    driver.findElement(By.id("u_0_l")).sendKeys("Siri");
		    driver.findElement(By.id("u_0_o")).click();
		    driver.findElement(By.id("u_0_o")).clear();
		    driver.findElement(By.id("u_0_o")).sendKeys("may122009testqa12345@gmail.com");
		    driver.findElement(By.id("u_0_r")).click();
		    driver.findElement(By.id("u_0_r")).clear();
		    driver.findElement(By.id("u_0_r")).sendKeys("may122009testqa12345@gmail.com");
		    driver.findElement(By.id("u_0_v")).click();
		    driver.findElement(By.id("u_0_v")).clear();
		    driver.findElement(By.id("u_0_v")).sendKeys("Passw0rd!@#$%");
		    driver.findElement(By.id("day")).click();
		    new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
		    driver.findElement(By.id("day")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("month")).click();
		    new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jun");
		    driver.findElement(By.id("month")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("year")).click();
		    new Select(driver.findElement(By.id("year"))).selectByVisibleText("1988");
		    Thread.sleep(2000);
		    driver.findElement(By.id("year")).click();
		    Thread.sleep(3000);
		    WebElement radio1 = driver.findElement(By.xpath("//input[@id='u_0_7']"));
		    Thread.sleep(1000);
		    radio1.click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[@id='u_0_11']")).click();
		  }
	

}
