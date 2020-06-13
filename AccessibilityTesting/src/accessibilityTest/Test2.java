package accessibilityTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 {
	
WebDriver driver;
	
	@Test
	public void pageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 79/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		List<WebElement> allElements = driver.findElements(By.xpath("//a"));      //Identify all the elements on web page
        
        int elementsCount = allElements.size();     //Count the total all element on web page
		Actions act = new Actions(driver);
		WebElement activeElement;
		
		for(int i=0; i<elementsCount; i++) {
			act.sendKeys(Keys.TAB).build().perform();
			activeElement = driver.switchTo().activeElement();
			System.out.println(activeElement.getText());
			
		}
		
	}

}
