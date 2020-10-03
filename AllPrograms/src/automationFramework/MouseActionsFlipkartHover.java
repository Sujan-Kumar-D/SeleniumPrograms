package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsFlipkartHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Men')]"))).build().perform();
		driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']/following::a[@title='Shirts']")).click();
		//Random random = new Random();
		//int x = random.nextInt(20);
		//System.out.println(x);
		Thread.sleep(5000);
		WebElement Element = driver.findElement(By.xpath("(//*[@class='_2mylT6'])[7]"));
		Element.click();

	}

}
