package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sujan/Essentials/Browser Drivers/Chrome Driver 76/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement Element1 = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement Element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		//act.dragAndDrop(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		act.dragAndDrop(Element1, Element2).build().perform();
	}

}
