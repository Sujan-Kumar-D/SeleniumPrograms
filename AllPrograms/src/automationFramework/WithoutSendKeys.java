package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 	driver.get("https://www.facebook.com/");
		 	driver.manage().window().maximize();
		 	((JavascriptExecutor)driver).executeScript("document.getElementById('u_0_l').value='fname';");
		 	Thread.sleep(3000);
		 	driver.findElement(By.id("u_0_n")).clear();
		 	((JavascriptExecutor)driver).executeScript("document.getElementById('u_0_n').value='lname';");
	}

}