package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 78/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		String FontSize = driver.findElement(By.id("signin_button")).getCssValue("font-size");
		System.out.println(FontSize);
		String Tagname = driver.findElement(By.id("signin_button")).getTagName();
		System.out.println(Tagname);
		String att = driver.findElement(By.id("signin_button")).getAttribute("class");
		System.out.println(att);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Sujan");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Sujankumar");
	}

}
