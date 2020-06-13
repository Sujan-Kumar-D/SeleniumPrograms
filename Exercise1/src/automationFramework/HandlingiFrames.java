package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingiFrames {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://demo.guru99.com/test/guru99home/");
		driver.get("https://nunzioweb.com/iframes-example.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);

		// driver.switchTo().frame("_mN_main_224278574_0_n");
		// String Framelink = driver.findElement(By.xpath("//a[@id='dk2']")).getText();
		// System.out.println(Framelink);
		driver.switchTo().frame("frame");
		String text1 = driver.findElement(By.xpath("//td[@class='headline']")).getText();
		System.out.println(text1);
		Thread.sleep(5000);
	}

}
