package TestNGPrograms;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapSpiceJet {
	
	WebDriver driver;

	@Test
	public void a_bootstrapsite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test
	public void b_spicejetfrom() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ArrayList <WebElement> dropIndiafrom = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[1]//ul/li/a")));
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
	public void c_spicejetto() throws InterruptedException {
		Thread.sleep(5000);
		ArrayList <WebElement> dropIndiato = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[2]//ul/li/a")));
		for (WebElement Indiato:dropIndiato) {
			String IndiaDropdownValuesto = Indiato.getText();
			System.out.println(IndiaDropdownValuesto);
			if(IndiaDropdownValuesto.equalsIgnoreCase("Guwahati (GAU)")) {
				Indiato.click();
				break;
			}
		}
		
	}
	
	@Test
	public void d_spicejetdeparturedate() {
		for(int i=0;i<3;i++) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
			//driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]//a[text()='10']")).click();
			ArrayList <WebElement> dates = new ArrayList <WebElement> (driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]//td/a")));
			for(WebElement datelist: dates) {
				String datevalues = datelist.getText();
				System.out.println(datevalues);
				if(datevalues.equals("10")) {
					datelist.click();
					break;
				}
				
			}
			
		}
		
	}

