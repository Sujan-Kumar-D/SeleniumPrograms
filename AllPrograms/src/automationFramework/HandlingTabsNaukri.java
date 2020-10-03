package automationFramework;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsNaukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String mainWindow = driver.getWindowHandle();
		System.out.println("MainWindow Handle --->" +mainWindow);
		
		//Multiple Browsers
		Set <String> naukriTabs = driver.getWindowHandles();
		for(String output: naukriTabs) {
			System.out.println(output);
		}
		
		ArrayList <String> tabs = new ArrayList(naukriTabs);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
