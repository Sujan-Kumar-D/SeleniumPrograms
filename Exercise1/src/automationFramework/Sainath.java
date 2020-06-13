package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sainath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.sai.org.in/");
	String Output = driver.findElement(By.xpath("//a[@class='logo flex-align-center']")).getText();
	System.out.println(Output);
	driver.close();
	}
}
