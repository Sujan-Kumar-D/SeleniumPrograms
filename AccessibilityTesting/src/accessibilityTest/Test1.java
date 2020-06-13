package accessibilityTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	
	@Test
	public void pageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 79/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		int elements = driver.findElements(By.tagName("a")).size();
		System.out.println(elements);
		Actions act = new Actions(driver);
		WebElement activeElement;
		
		for(int i=0; i<elements; i++) {
			act.sendKeys(Keys.TAB).build().perform();
			activeElement = driver.switchTo().activeElement();
			System.out.println(activeElement.getText());
			
		}
		
	}
	

}
