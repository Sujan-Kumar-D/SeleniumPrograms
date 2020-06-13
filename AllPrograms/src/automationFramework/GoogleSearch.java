package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Rajinikanth");
		driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.xpath("(//h3[text()='Rajinikanth - Wikipedia'])[1]")).click();
	}
}
