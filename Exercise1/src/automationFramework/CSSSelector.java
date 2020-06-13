package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		WebElement classvalue = driver.findElement(By.cssSelector("input[class=search-query]"));
		classvalue.sendKeys("Sujan");
		classvalue.submit();
		//WebElement idvalue = driver.findElement(By.cssSelector("#searchTerm"));
		//WebElement idvalue = driver.findElement(By.cssSelector("input[id=searchTerm]"));
		//idvalue.sendKeys("Sujan");
		//idvalue.submit();
	}

}
