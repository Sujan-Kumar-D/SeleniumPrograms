package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbiboSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.goibibo.com/trains/");
		driver.findElement(By.xpath("(//input[@id='gosuggest_inputL'])[1]")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//input[@id='gosuggest_inputL'])[2]")).sendKeys("Hyderabad");
	}

}
