package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

 private By LOGIN_LINKLOCATOR=By.linkText("Login");
 private WebDriver driver;
 private WebDriverWait wait;

public LandingPage(WebDriver driver, WebDriverWait wait ) {
   this.driver= driver;
   this.wait= wait;
}
 
 public LoginPage goToLoginPage()
 {
   WebElement loginLink=wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_LINKLOCATOR));
   loginLink.click();
   return new LoginPage(driver,wait);
 
 
 
 
 }
}