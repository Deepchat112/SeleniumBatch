package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebDriverMethods {

	public static void main(String[] arg) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("https://www.facebook.com");	
	driver.get("https://www.quora.com");	
	driver.get("https://www.linkedin.com");	
    String currentURL=driver.getCurrentUrl();	
	System.out.println(currentURL);
	String pageTitle=driver.getTitle();
	System.out.println(pageTitle); 
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
	
	}

}
