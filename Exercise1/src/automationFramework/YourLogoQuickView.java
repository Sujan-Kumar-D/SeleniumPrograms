package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YourLogoQuickView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 78/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(8000);
		WebElement product = driver.findElement(By.xpath("(//h1[contains(@class,'product-listing')]/following::span)[33]"));
		Thread.sleep(5000);
		act.moveToElement(product).build().perform();
		Thread.sleep(7000);
		WebElement quick = driver.findElement(By.xpath("(//span[contains(text(),'Quick view')])[4]"));
		quick.click();
		Thread.sleep(5000);
		WebElement frme = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(frme);
		System.out.println("Switched into iFrame Successfully");
		Thread.sleep(5000);
		String ProductName = driver.findElement(By.xpath("//h1[contains(text(),'Printed Chiffon Dress')]")).getText();
		System.out.println(ProductName);
	}

}
