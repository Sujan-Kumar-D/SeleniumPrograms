package automationFramework;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsGmail {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]")).click();
		Set <String> AllWindows = driver.getWindowHandles();
		int TotalTabs = AllWindows.size();
		System.out.println(TotalTabs);
		System.out.println(AllWindows);
		
		ArrayList <String> WindowSwitch = new ArrayList <String>(AllWindows);
		driver.switchTo().window(WindowSwitch.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("firstName")).sendKeys("Sujan");
	}
}

	