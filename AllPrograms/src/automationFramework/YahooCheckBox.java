package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("uh-signin")).click();
		Thread.sleep(10000);
		WebElement Check = driver.findElement(By.id("persistent"));
		Actions act = new Actions(driver);
		act.moveToElement(Check).click().build().perform();
		System.out.println(Check.isSelected());
	}

}
