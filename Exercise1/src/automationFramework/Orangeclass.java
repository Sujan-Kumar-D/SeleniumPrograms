package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orangeclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 79/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");

		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//span[contains(text(),'My Info')]")).click();

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sowmiya");

		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Palani");
		driver.findElement(By.id("emp_birthday")).click();
		driver.findElement(By.id("emp_birthday")).clear();
		driver.findElement(By.id("emp_birthday")).sendKeys("05-23-1995");
		// driver.findElement(By.xpath("//div[@id='emp_marital_status_inputfileddiv']")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//ul[@id='select-options-156511c1-6efc-2dfc-7270-b38785bbccd9']//span[contains(text(),'Single')]"
		 * )).click(); Selectnew Select(
		 * driver.findElement(By.xpath("//div[@id='emp_marital_status_inputfileddiv']"))
		 * ); Thread.sleep(2000); // status.selectByIndex(0);
		 */
		driver.findElement(By.xpath("//div[@id='emp_marital_status_inputfileddiv']")).click();
		driver.findElement(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//span[contains(text(),'Single')]"))
				.click();
		WebElement e1 = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		e1.click();
		driver.findElement(By.xpath("//div[@id='nation_code_inputfileddiv']")).click();
		// new
		// Select(driver.findElement(By.xpath("//div[@id='nation_code_inputfileddiv']//span[contains(text(),'Ukrainian')]"))).selectByVisibleText("Indian");
		driver.findElement(By.xpath("//div[@id='nation_code_inputfileddiv']//span[contains(text(),'Indian')]")).click();
		driver.findElement(By.xpath("//div[@id='eeo_race_ent_inputfileddiv']")).click();
		driver.findElement(By.xpath("//div[@id='eeo_race_ent_inputfileddiv']//span[contains(text(),'White')]")).click();
		driver.findElement(By.xpath("(//button[@class=' btn waves-effect waves-green '])[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='1_inputfileddiv']")).click();
		driver.findElement(By.xpath("//div[@id='1_inputfileddiv']//span[contains(text(),'O')]")).click();
		driver.findElement(By.xpath("//input[@id='5']")).click();
		driver.findElement(By.xpath("//input[@id='5']")).clear();
		driver.findElement(By.xpath("//input[@id='5']")).sendKeys("Carrom");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=' btn waves-effect waves-green '])[2]")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e2 = driver.findElement(By.xpath("//input[@id='12_Non-Veg']"));
		e2.click();
		e2.isSelected();
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.xpath("//label[contains(text(),'Football')]"));
		e3.click();
		Thread.sleep(4000);
		WebElement e4 = driver.findElement(By.xpath("//label[contains(text(),'Music')]"));
		e4.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=' btn waves-effect waves-green '])[3]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
		WebElement attach = driver.findElement(By.id("filename"));
		Thread.sleep(5000);
		attach.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		attach.sendKeys("C:\\Users\\public\\Sample Pictures\\Chrysanthemum.jpg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(text(),'Upload')])[2]")).click();

	}
}