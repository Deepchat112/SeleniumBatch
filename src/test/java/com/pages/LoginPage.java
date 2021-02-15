package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private By emailIDLocator = By.id("_username");
	private By passwordIDLocator = By.id("_password");
	private By loginXpathLocator = By.xpath("//input[@value=\"Login\"]");

	private WebDriver driver;
	private WebDriverWait wait;

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;

	}

	// functionality
	public HomePage doLogin(String userName, String password) {
		WebElement emailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(emailIDLocator));
		emailTextBox.sendKeys(userName);

		WebElement passwordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordIDLocator));
		passwordTextBox.sendKeys(password);

		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(loginXpathLocator));
		loginButton.click();
        return new HomePage(driver,wait);
	}
}