package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionZeroWebApp {
	
WebDriver driver;
String Elemnt1;
	
	@Test (priority=1)
	public void Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 81/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void assertEquals() {
		String Elemnt1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		System.out.println("Elemnt1 =" +Elemnt1);
		SoftAssert softassertEqual = new SoftAssert();
		softassertEqual.assertEquals(Elemnt1, "ONLINE BANKINGG");
		System.out.println("Assert Equals Pass");
		softassertEqual.assertAll();
	}
	
	@Test (priority=3)
	public void assertNotEquals() {
		SoftAssert softassertNotEqual = new SoftAssert();
		softassertNotEqual.assertNotEquals(Elemnt1, "Online Banking");
		System.out.println("Assert Not Equals Pass");
		softassertNotEqual.assertAll();
	}
	
	@Test (priority=4)
	public void assertTrue() {
		SoftAssert softassertTrue = new SoftAssert();
		softassertTrue.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("Assert True Pass");
		softassertTrue.assertAll();
	}
	
	@Test (priority=5)
	public void assertFalse() {
		SoftAssert softassertFalse = new SoftAssert();
		softassertFalse.assertFalse("Online Banking".equals(Elemnt1));
		System.out.println("Assert False Pass");
		softassertFalse.assertAll();
	}
		
	@Test (priority=6)
	public void assertNotNull() {
		SoftAssert softassertNotNull = new SoftAssert();
		Object obj2 = driver.getTitle();
		softassertNotNull.assertNotNull(obj2);
		System.out.println(obj2);
		System.out.println("Assert Not Null Pass");
		softassertNotNull.assertAll();
	}
	
	@Test (priority=7)
	public void assertNull() {
		SoftAssert softassertNull = new SoftAssert();
		Object obj3 = null;
		System.out.println(obj3);
		softassertNull.assertNull(obj3);
		System.out.println("Assert Null Pass");
		softassertNull.assertAll();
		
	}

}
