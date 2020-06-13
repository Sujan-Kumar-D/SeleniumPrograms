package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		List <WebElement> el = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		System.out.println(el.size());
		for(int i=0;i<el.size();i++) {
			System.out.println(el.iterator());
			System.out.println(i);
			if(el.get(i).isSelected()) {
				System.out.println("Checbox is selected");
			}else {
				System.out.println("Checkbox is not selected. It's selected now");
				el.get(i).click();
			}
		}
	}

}
