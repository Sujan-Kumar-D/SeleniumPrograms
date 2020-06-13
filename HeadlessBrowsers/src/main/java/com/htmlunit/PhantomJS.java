package com.htmlunit;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhantomJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);                 
		caps.setCapability(
		                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		                        "C:\\Sujan\\Essentials\\Unit Driver Jar\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"
		                    );
		WebDriver driver = new  PhantomJSDriver(caps);
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
	}

}
