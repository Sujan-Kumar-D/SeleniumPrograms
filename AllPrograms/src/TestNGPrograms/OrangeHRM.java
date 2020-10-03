package TestNGPrograms;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;

	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver",
				"C://Sujan//Essentials//Browser Drivers//Chrome Driver 84//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		// Open Webpage
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void b_login() {
		driver.findElement(By.id("btnLogin")).submit();
	}

	@Test
	public void c_addEmployeeStep() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();
		driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
		Thread.sleep(30000);
		driver.findElement(By.id("firstName")).sendKeys("first");
		driver.findElement(By.id("lastName")).sendKeys("last");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("12345");
		driver.findElement(By.xpath("//div[@id='location_inputfileddiv']")).click();
		// Country Dropdown
		ArrayList<WebElement> Country = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@id='location_inputfileddiv']//ul/li")));
		for (WebElement Countryoptions : Country) {
			String dropdownvalues = Countryoptions.getText();
			System.out.println(dropdownvalues);
		}
		for (WebElement Countryoptions : Country) {
			String dropdownvalues = Countryoptions.getText();
			if (dropdownvalues.equalsIgnoreCase("     German Regional HQ")) {
				Countryoptions.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("systemUserSaveBtn")).click();
	}

	@Test
	public void d_personaldetails() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("//label[text()='Marital Status']/preceding::i[1]")).click();
		// Year dropdown in Date Of Birth
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]")).click();
		ArrayList<WebElement> dobyear = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]//ul/li")));
		for (WebElement yearlist : dobyear) {
			String yeardropdown = yearlist.getText();
			System.out.println(yeardropdown);
		}
		for (WebElement yearlist : dobyear) {
			String yeardropdown = yearlist.getText();
			if (yeardropdown.equalsIgnoreCase("1988")) {
				yearlist.click();
				break;
			}
		}
		// Month dropdown in Date Of Birth
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--month'])[1]")).click();
		ArrayList<WebElement> dobmonth = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--month'])[1]//ul/li")));
		for (WebElement monthlist : dobmonth) {
			String monthdropdown = monthlist.getText();
			System.out.println(monthdropdown);
		}
		for (WebElement monthlist : dobmonth) {
			String monthdropdown = monthlist.getText();
			if (monthdropdown.equalsIgnoreCase("June")) {
				monthlist.click();
				break;
			}
		}
		// Date Selection in Date Of Birth
		driver.findElement(By.xpath("(//div[text()='10'])[1]")).click();

		// Marital Status dropdown
		driver.findElement(By.id("emp_marital_status_inputfileddiv")).click();
		ArrayList<WebElement> marrital = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//ul/li")));
		for (WebElement maritallist : marrital) {
			String marvalues = maritallist.getText();
			System.out.println(marvalues);
		}
		for (WebElement maritallist : marrital) {
			String marvalues = maritallist.getText();
			if (marvalues.equalsIgnoreCase("Married")) {
				maritallist.click();
				break;
			}
		}
		// Gender dropdown
		driver.findElement(By.id("emp_gender_inputfileddiv")).click();
		ArrayList<WebElement> gender = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@id='emp_gender_inputfileddiv']//ul/li")));
		for (WebElement genderlist : gender) {
			String gendervalues = genderlist.getText();
			System.out.println(gendervalues);
		}
		for (WebElement genderlist : gender) {
			String gendervalues = genderlist.getText();
			if (gendervalues.equalsIgnoreCase("Male")) {
				genderlist.click();
				break;
			}
		}
		// Nationality dropdown
		driver.findElement(By.id("nation_code_inputfileddiv")).click();
		ArrayList<WebElement> nation = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@id='nation_code_inputfileddiv']//ul/li")));
		for (WebElement nationlist : nation) {
			String nationvalues = nationlist.getText();
			System.out.println(nationvalues);
		}
		for (WebElement nationlist : nation) {
			String nationvalues = nationlist.getText();
			if (nationvalues.equalsIgnoreCase("Indian")) {
				nationlist.click();
				break;
			}
		}
		driver.findElement(By.id("licenseNo")).sendKeys("123456");

		// Year dropdown in License Expiry
		driver.findElement(By.xpath("//label[text()='Nick Name']/preceding::i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--year'])[2]")).click();
		ArrayList<WebElement> licnseyear = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--year'])[2]//ul/li")));
		for (WebElement yearlist : licnseyear) {
			String yeardropdown = yearlist.getText();
			System.out.println(yeardropdown);
		}
		for (WebElement yearlist : licnseyear) {
			String yeardropdown = yearlist.getText();
			if (yeardropdown.equalsIgnoreCase("2030")) {
				yearlist.click();
				break;
			}
		}
		// Month dropdown in License Expiry
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--month'])[2]")).click();
		ArrayList<WebElement> licnsemonth = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--month'])[2]//ul/li")));
		for (WebElement monthlist : licnsemonth) {
			String monthdropdown = monthlist.getText();
			System.out.println(monthdropdown);
		}
		for (WebElement monthlist : licnsemonth) {
			String monthdropdown = monthlist.getText();
			if (monthdropdown.equalsIgnoreCase("June")) {
				monthlist.click();
				break;
			}
		}
		// Date Selection in License Expiry
		driver.findElement(By.xpath("(//div[text()='15'])[2]")).click();

		driver.findElement(By.id("nickName")).sendKeys("sachin");
		driver.findElement(By.id("militaryService")).sendKeys("yes");
		Thread.sleep(2000);

		// Bloodgroup dropdown
		driver.findElement(By.id("1_inputfileddiv")).click();
		ArrayList<WebElement> bloodgrp = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@id='1_inputfileddiv']//ul/li")));
		for (WebElement bloodgrplist : bloodgrp) {
			String bloodgrpvalues = bloodgrplist.getText();
			System.out.println(bloodgrpvalues);
		}
		for (WebElement bloodgrplist : bloodgrp) {
			String bloodgrpvalues = bloodgrplist.getText();
			if (bloodgrpvalues.equalsIgnoreCase("O")) {
				bloodgrplist.click();
				break;
			}
		}
		driver.findElement(By.id("5")).sendKeys("Cricket");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	@Test
	public void e_employeedetails() throws InterruptedException {
		Thread.sleep(20000);
		// Joining Date Dropdown
		driver.findElement(By.xpath("//label[text()='Date of Permanency']//preceding::i[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]")).click();
		ArrayList<WebElement> joinyear = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]//ul/li")));
		for (WebElement joinyearlist : joinyear) {
			String joinyeardrop = joinyearlist.getText();
			System.out.println(joinyeardrop);
		}
		for (WebElement joinyearlist : joinyear) {
			String joinyeardrop = joinyearlist.getText();
			if (joinyeardrop.equalsIgnoreCase("2009")) {
				joinyearlist.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--month'])[1]")).click();
		ArrayList<WebElement> joinmonth = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--month'])[1]//ul/li")));
		for (WebElement joinmonthlist : joinmonth) {
			String joinmonthdrop = joinmonthlist.getText();
			System.out.println(joinmonthdrop);
		}
		for (WebElement joinmonthlist : joinmonth) {
			String joinmonthdrop = joinmonthlist.getText();
			if (joinmonthdrop.equalsIgnoreCase("December")) {
				joinmonthlist.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//div[text()='28'])[2]")).click();

		// Permanency Data Dropdown
		driver.findElement(By.xpath("//label[text()='Job Title']/preceding::i[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--year'])[2]")).click();
		ArrayList<WebElement> permanyear = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--year'])[2]//ul/li")));
		for (WebElement permanyearlist : permanyear) {
			String permanyeardrop = permanyearlist.getText();
			System.out.println(permanyeardrop);
		}
		for (WebElement permanyearlist : permanyear) {
			String permanyeardrop = permanyearlist.getText();
			if (permanyeardrop.equalsIgnoreCase("2019")) {
				permanyearlist.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--month'])[2]")).click();
		ArrayList<WebElement> permanmonth = new ArrayList<WebElement>(
				driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--month'])[2]//ul/li")));
		for (WebElement permanmonthlist : permanmonth) {
			String permanmonthdrop = permanmonthlist.getText();
			System.out.println(permanmonthdrop);
		}
		for (WebElement permanmonthlist : permanmonth) {
			String permanmonthdrop = permanmonthlist.getText();
			if (permanmonthdrop.equalsIgnoreCase("December")) {
				permanmonthlist.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//div[text()='15'])[2]")).click();

		// JobTitle dropdown

		driver.findElement(By.id("job_title_id_inputfileddiv")).click();
		ArrayList<WebElement> Jobtitle = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@id='job_title_id_inputfileddiv']//ul/li")));
		for (WebElement Jobtitlelist : Jobtitle) {
			String Jobtitledropdown = Jobtitlelist.getText();
			System.out.println(Jobtitledropdown);
		}
		for (WebElement Jobtitlelist : Jobtitle) {
			String Jobtitledropdown = Jobtitlelist.getText();
			if (Jobtitledropdown.equalsIgnoreCase("Finance Manager")) {
				Jobtitlelist.click();
			}
		}
	}
}
