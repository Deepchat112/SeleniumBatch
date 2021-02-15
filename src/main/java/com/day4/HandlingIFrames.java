package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://http://139.59.91.96:5000/selenium-workbook/wyswyg-editor.html");
		driver.switchTo().frame("editor_ifr");
		WebElement editorText=driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p"));
        String body=editorText.getText();
	    editorText.clear();
        editorText.sendKeys("I wrote it via eclipse!!");
	    System.out.println(body);
	    driver.switchTo().defaultContent();//switch to page from frame.Once job has been done on frame use switch to method.
	    String h1Value=driver.findElement(By.tagName("h1")).getText();
	    System.out.println(h1Value);
		
		
		
		
		
		
		
		
		
	}

}
