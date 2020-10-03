package automationFramework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxSelectionDifferentApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		List<WebElement> el = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		int checkbox = el.size();
		System.out.println(checkbox);

		for (int i = 0; i <= checkbox; i++) {
			if (el.get(i).isSelected()) {
				System.out.println("Checkbox Already Selected");
			} else
			{
				System.out.println("Checkbox Was Not Selected Earlier. It's Selected Now");
			el.get(i).click();
			}
		}

	}

}
