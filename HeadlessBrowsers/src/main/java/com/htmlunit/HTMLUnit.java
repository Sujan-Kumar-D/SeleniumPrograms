package com.htmlunit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		
	}

}
