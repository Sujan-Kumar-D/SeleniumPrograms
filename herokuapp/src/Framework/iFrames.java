package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iFrames {
	
	
WebDriver driver;
	
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void iFrames(){
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		int count = driver.findElements(By.tagName("frame")).size();
		System.out.println(count);
		WebElement fr = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		driver.switchTo().frame(fr);
		String LeftFrame = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(LeftFrame);
	}

}
