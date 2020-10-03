package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsPromptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Driver Invoke
				System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Open Webpage
				driver.get("http://demo.automationtesting.in/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[@id='btn2']")).click();
				Thread.sleep(5000);
				WebElement Switch = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
				Switch.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
				driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				
				//Pop Handling
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();
				String popupDetails = alert.getText();
				System.out.println(popupDetails);
				Thread.sleep(5000);
				alert.sendKeys("Sujan");
				Thread.sleep(10000);
				alert.accept();
				
				//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
				//driver.manage().window().maximize();
				//driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
				//Thread.sleep(3000);
				//Alert alert = driver.switchTo().alert();
				//String popupDetails = alert.getText();
				//System.out.println(popupDetails);
				//Thread.sleep(5000);
				//alert.sendKeys("Sujan");
				//Thread.sleep(10000);
				//alert.accept();
				

			}


}
