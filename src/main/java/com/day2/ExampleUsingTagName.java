package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleUsingTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		Dimension myScreenresolution=new Dimension(375, 812);
		driver.manage().window().setSize(myScreenresolution);
		
		driver.get("http://139.59.91.96:5000/selenium-workbook/login.html");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		WebElement myLink=driver.findElement(By.tagName("a"));
	    String text=myLink.getText();
	    System.out.println(text);
	    WebElement myTextBox=driver.findElement(By.tagName("input"));
	    myTextBox.sendKeys("23");
	    WebElement myLink12=driver.findElement(By.linkText("Forgotten Password"));
	    text=myLink12.getText();
	    System.out.println(text);
	    WebElement myLink13=driver.findElement(By.partialLinkText("For"));
	    text=myLink13.getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//*[@*=\"userid\" and @name=\"userid\" and @type=\"text\"]")).sendKeys("Nancy");
	    driver.findElement(By.xpath("//h1")).getText();
        driver.findElement(By.xpath("//p[contains(text(),\"A paragraph with\"]")).getText();
	    Thread.sleep(3000);
        driver.findElement(By.cssSelector("*[name=\"password\"]")).sendKeys("password");
	    
	    Select referenceDropDown = new Select(driver.findElement(By.name("hearAbout"))); 
	    referenceDropDown.selectByIndex(2);
	    Thread.sleep(3000);
	    referenceDropDown.selectByIndex(1);
	    
	    driver.close(); //closes the current tab which webdriver is using.
	    driver.quit(); //closes the entire chromedriver session.
	    
	
	}

}
