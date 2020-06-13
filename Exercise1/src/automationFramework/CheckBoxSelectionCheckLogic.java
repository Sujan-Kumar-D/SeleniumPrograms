package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectionCheckLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 78/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(checkbox1.isSelected()==true) {
			System.out.println("Checkbox1 is already selected");
		}
		else
		{
			checkbox1.click();
		}
		if(checkbox2.isSelected()==true) {
			System.out.println("Checkbox2 is already selected");
		}
		else
		{
			checkbox2.click();
		}
	}

}
