package com.day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://139.59.91.96:5000/selenium-workbook/open-a-new-window.html#");
	    WebElement link=driver.findElement(By.xpath("//a[@href=\"new-window.html\"]"));
	    link.click();
	   
	    String currentHandle=driver.getWindowHandle();
	    System.out.println(currentHandle);
	    
	    Set<String> allHandles=driver.getWindowHandles();
	    Iterator<String> myiterator=allHandles.iterator();
	    	while(myiterator.hasNext())	//if there is a new handle or data for processing
	    	{     
	    	  String handle = myiterator.next(); //get the new data or handle
	    	 if(!(handle.equals(currentHandle)))
	    	 {
	    		 driver.switchTo().window(handle);
	    	     WebElement newPageHeading= driver.findElement(By.tagName("h1"));
	 	         String result=newPageHeading.getText();
	 	         System.out.println(result);
	 	         driver.close();
	    	 }
	    	}	
	    	driver.switchTo().window(currentHandle);
	       WebElement newPageHeading= driver.findElement(By.tagName("h1"));
	       String result=newPageHeading.getText();
	       System.out.println(result);
	    
	
	
	
	
	
	
	}

}
