package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Driver Invoke
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//Pop Handling
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		String popupDetails = alert.getText();
		System.out.println(popupDetails);
		alert.accept();

	}

}
