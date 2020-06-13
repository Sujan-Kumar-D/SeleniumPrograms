package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardIncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		Actions act = new Actions(driver);
		for (int i = 0; i < 3; i++) {
			act.sendKeys(Keys.ARROW_UP).build().perform();;
		}

		for (int i = 0; i <= 1; i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();;
		}

	}

}
