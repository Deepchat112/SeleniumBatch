package com.day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;

public class UnidavisTest {
	private String URL;
	private String USER_EMAIL;
	private String USER_PASSWORD;
    private WebDriver driver;
    private Properties prop;
    private WebDriverWait wait;
    private LoginPage loginPage;
    
    @BeforeMethod
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe"); 	
	    driver= new ChromeDriver();
	    wait= new WebDriverWait(driver,10, 1000);
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//config//config.properties");
	    prop=new Properties();
	    prop.load(fis);
	    URL=prop.getProperty("URL");
	    System.out.println(URL);
	    USER_EMAIL=prop.getProperty("USER_EMAIL");
	    System.out.println(USER_EMAIL);
	    USER_PASSWORD=prop.getProperty("USER_PASSWORD");
	    System.out.println(USER_PASSWORD);
	    driver.get(URL);
	    System.out.println("Sample test");
	  LandingPage landingpage= new LandingPage(driver,wait);
	  loginPage= landingpage.goToLoginPage(); //new LoginPage(driver,wait);
	  //performance test
	  //My test
    }
	
    @Test
	public void loginTest() throws InterruptedException  
	{
       HomePage homePage=loginPage.doLogin(USER_EMAIL, USER_PASSWORD);
       String userNameRecieved =homePage.getUserName();
       Assert.assertEquals(userNameRecieved, prop.getProperty("EXPECTED_USER_NAME"));
	}
   @AfterMethod 
   public void tearDown() {
   driver.quit();
   
   } 
}
