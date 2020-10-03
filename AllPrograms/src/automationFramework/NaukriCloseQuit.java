package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriCloseQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//String PageData = driver.getPageSource();
		//System.out.println(PageData);
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	
		
	}

}
