package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement Element = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		act.doubleClick(Element).build().perform();
		Alert alert = driver.switchTo().alert();
		String PopupInfo = alert.getText();
		System.out.println(PopupInfo);
		alert.accept();
	}

}
