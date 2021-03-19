package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open Webpage
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
		int linkscount = driver.findElements(By.tagName("a")).size();
		System.out.println(linkscount);
		int imagecount = driver.findElements(By.tagName("img")).size();
		System.out.println(imagecount);
		

	}

}
