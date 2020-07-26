package TestNGPrograms;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapSpiceJet {
	
	WebDriver driver;

	@Test
	public void bootstrapsite() {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void spicejetfrom() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ArrayList <WebElement> dropIndiafrom = new ArrayList <WebElement> (driver.findElements(By.xpath("(//div[@class='dropdownDiv'])[1]//ul/li/a")));
		for (WebElement Indiafrom:dropIndiafrom) {
			String IndiaDropdownValuesfrom = Indiafrom.getText();
			System.out.println(IndiaDropdownValuesfrom);
			if(IndiaDropdownValuesfrom.equalsIgnoreCase("Chennai (MAA)")) {
				Indiafrom.click();
				break;
			}
		}
	}
	
	@Test
	public void spicejetto() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ArrayList <WebElement> dropIndiato = new ArrayList <WebElement> (driver.findElements(By.xpath("(//div[@class='dropdownDiv'])[3]//ul/li/a")));
		for (WebElement Indiato:dropIndiato) {
			String IndiaDropdownValuesto = Indiato.getText();
			System.out.println(IndiaDropdownValuesto);
			if(IndiaDropdownValuesto.equalsIgnoreCase("Guwahati (GAU)")) {
				Indiato.click();
				break;
			}
		}
		
	}
	
	
	}

