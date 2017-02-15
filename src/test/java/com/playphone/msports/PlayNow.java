package com.playphone.msports;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.Keys;

@Test
public class PlayNow {
	
	private WebDriver driver;
	  private String baseUrl;
	  

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
	    driver = new FirefoxDriver();
	    baseUrl = "http://tournaments.olympus-stage.playphone.cc/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //JavascriptExecutor jsx = (JavascriptExecutor)driver;
	    //jsx.executeScript("window.scrollBy(0,250)", "");

}
	  public void testUntitled3() throws Exception {
	    driver.get(baseUrl + "/#/?theme=basic");
	    driver.findElement(By.xpath(".//button[@data-pp-auto-id='play-now-button-2']")).sendKeys(Keys.ENTER);
	    Thread.sleep(20000);
	    driver.findElement(By.xpath(".//img[contains(@src, 'http://sdk.olympus-stage.playphone.cc/dist/assets/msports-logo-not-text@3x.png')]")).click();
	    driver.findElement(By.xpath(".//img[contains(@src, 'http://sdk.olympus-stage.playphone.cc/dist/assets/msports-logo-not-text@3x.png')]")).click();
	    Thread.sleep(20000);
	    //driver.findElement(By.xpath("//span[contains(text(),'How to Play')][contains(@class, 'label')]")).sendKeys(Keys.ENTER);
	    //Thread.sleep(3000);
	    //driver.findElement(By.xpath("//button[@type='button'][contains(@class, 'btn float-xs-right')]")).sendKeys(Keys.ENTER);
	    //Thread.sleep(3000);
	    //Adding verification, in progress
	   // String PlayNowText = driver.findElement(By.xpath(".//button[@data-pp-auto-id='play-now-button-2']")).getText();
	   // Assert.assertTrue("Text not found", PlayNowText.contains(""));
}

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  Thread.sleep(2000);
		// driver.quit();
	    
	  }
}

