package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriCSSTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String FontSize = driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Login')]")).getCssValue("font-size");
		System.out.println(FontSize);
		String TagName = driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Login')]")).getTagName();
		System.out.println(TagName);
		
	}

}
