package automationFramework;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsNaukriExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String mainWindow = driver.getWindowHandle();
		System.out.println("MainWindow Handle --->" +mainWindow);
		
		//Multiple Browsers
		//Set <String> naukriTabs = driver.getWindowHandles();
		//for(String output: naukriTabs) {
			//System.out.println(output);
		//}
		
		ArrayList <String> tabs = new ArrayList <String> (driver.getWindowHandles());
		for(String obj: tabs) {
			System.out.println(obj);
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
