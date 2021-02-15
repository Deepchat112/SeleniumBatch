package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.suvideals.ooo/Login.action");
	WebElement emailTextBox=driver.findElement(By.id("userHandle"));
	emailTextBox.sendKeys("Deepti");
    WebElement createNewAccountButton =driver.findElement(By.id("new-account-btn"));
    createNewAccountButton.click();
    Thread.sleep(3000);
    WebElement NewUserRegistrationform=driver.findElement(By.id("registration-form"));
    WebElement newUserTextBox =driver.findElement(By.name("userName"));
    newUserTextBox.sendKeys("Neelam");
	WebElement newUserPasswordTextBox=driver.findElement(By.name("password"));
	newUserPasswordTextBox.sendKeys("Neelam");
	
	
	}

}
