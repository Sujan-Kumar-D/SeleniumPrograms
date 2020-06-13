package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println("The page title is:" +title);
		 
		 //linkText
		 driver.findElement(By.linkText("REGISTER")).click();
		 
		 //name
		 
		 driver.findElement(By.name("firstName")).sendKeys("MayQA");
		 driver.findElement(By.name("lastName")).sendKeys("QAMayy");
		 driver.findElement(By.name("phone")).sendKeys("7474747474");
		 driver.findElement(By.name("address1")).sendKeys("QSpiders Chromepet");
		 driver.findElement(By.name("address2")).sendKeys("Opp. Saravana Stores");
		 driver.findElement(By.name("city")).sendKeys("Chennai");
		 driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
		 driver.findElement(By.name("postalCode")).sendKeys("600115");
		 driver.findElement(By.name("country")).click();
		 new Select(driver.findElement(By.name("country"))).selectByVisibleText("INDIA");
		 driver.findElement(By.name("country")).click();
		 
		 //id
		 
		 driver.findElement(By.id("userName")).sendKeys("Seleniumdemoscript@gmail.com");
		 
		 //css selector - ID
		 
		 //driver.findElement(By.cssSelector("#userName")).sendKeys("Seleniumdemoscript@gmail.com");
		 //driver.findElement(By.cssSelector("input[id=userName]")).sendKeys("Seleniumdemoscript@gmail.com");
		 
		 
		 //Xpath
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demousername");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demopassword");
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demopassword");
		 driver.findElement(By.xpath("//input[@name='register']")).click();
		 
		 //partialinkText
		 
		 driver.findElement(By.partialLinkText("sign")).click();
		 
		 //name
		 
		 driver.findElement(By.name("userName")).sendKeys("demousername");
		 driver.findElement(By.name("password")).sendKeys("demopassword");
		 driver.findElement(By.name("login")).click();
	}

}
