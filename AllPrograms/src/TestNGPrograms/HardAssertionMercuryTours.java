package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionMercuryTours {
	WebDriver driver;
	String Elemnt1;
	@Test (priority=1)
	public void Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/Essentials/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void assertEquals() {
		Elemnt1 = driver.findElement(By.linkText("SIGN-ON")).getText();
		System.out.println("Elemnt1 =" +Elemnt1);
		Assert.assertEquals(Elemnt1, "SIGN-ONN");
		System.out.println("Assert Equals Pass");
	}
	
	@Test (priority=3)
	public void assertNotEquals() {
		Assert.assertNotEquals(Elemnt1, "sign-on");
		System.out.println("Assert Not Equals Pass");
	}
	
	@Test (priority=4)
	public void assertTrue() {
		Assert.assertTrue("SIGN-ON".equals(driver.findElement(By.linkText("SIGN-ON")).getText()), "Assert True Statement");
		System.out.println("Assert True Pass");
	}
	
	@Test (priority=5)
	public void assertFalse() {
		Assert.assertFalse("sign-on".equals(Elemnt1), "Assert Fail Statement");
		System.out.println("Assert False Pass");
	}
		
	@Test (priority=6)
	public void assertNotNull() {
		Object obj2 = driver.getTitle();
		Assert.assertNotNull(obj2);
		System.out.println(obj2);
		System.out.println("Assert Not Null Pass");
	}
	
	@Test (priority=7)
	public void assertNull() {
		Object obj3 = null;
		System.out.println(obj3);
		Assert.assertNull(obj3);
		System.out.println("Assert Null Pass");
		
	}
	}
