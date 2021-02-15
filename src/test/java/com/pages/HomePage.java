package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private By userNameXpathLocator= By.xpath("//li[@class=\"user-account__user\"]/span");
	private WebDriver driver;
	private WebDriverWait wait;	

	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

 public String getUserName() {
	 WebElement userNameSpan=wait.until(ExpectedConditions.visibilityOfElementLocated(userNameXpathLocator));
	 String userNameRecieved=userNameSpan.getAttribute("data-fullname");
	 return userNameRecieved;
}







}