package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 79/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement dressButton = driver.findElement(By.xpath("(//a[@class = 'sf-with-ul'])[1]"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(dressButton).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text() = 'Casual Dresses'])[1]")).click();
		
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	}

}
