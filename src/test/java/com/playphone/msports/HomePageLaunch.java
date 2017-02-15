package com.playphone.msports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageLaunch {

	private WebDriver driver;
	  private String baseUrl;
	  
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		//WebDriver driver;  
		System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
		
	    driver = new FirefoxDriver();
	    baseUrl = "http://tournaments.olympus01.playphone.cc/";
	   // String currentWindow = driver.getWindowHandle();
	       //driver.switchTo().window(currentWindow);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().setPosition(new Point(-2000, 0));
	    
	       
	  }

	  @Test
	  public void AccountLoginInvalidTest () throws Exception {
	    driver.get(baseUrl + "/#/");
	    Thread.sleep(3000);
}
	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  Thread.sleep(3000);
	    driver.quit();

}
}
