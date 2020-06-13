package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoIbibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage.
		driver.get("https://www.goibibo.com/trains/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='gosuggest_inputL'])[1]")).sendKeys("Chennai");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("(//input[@id='gosuggest_inputL'])[2]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}

}
