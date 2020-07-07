package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingiFramesNew {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 83//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		int iFramescount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iFramescount);
		driver.switchTo().frame("oddcouple");
		String iFrametext = driver.findElement(By.xpath("//div[contains(text(),'A television show')]")).getText();
		System.out.println(iFrametext);

	}

}
