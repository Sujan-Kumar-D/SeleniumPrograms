package TestNGPrograms;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bootstrap {
	WebDriver driver;

	@Test
	public void bootstrapsite() {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
	}

	@Test
	public void dropdown() throws InterruptedException {
		driver.findElement(By.id("bootstrapmenu")).click();
		ArrayList <WebElement> options = new ArrayList <WebElement> (driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a")));
		for(WebElement i:options) {
			String dropdownvalues = i.getText();
			System.out.println(dropdownvalues);
			if(dropdownvalues.equalsIgnoreCase("ABOUT US")) {
				i.click();
				break;
			}
		}
		Thread.sleep(2000);
	}

}
