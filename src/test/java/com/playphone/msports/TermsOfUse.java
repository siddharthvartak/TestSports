package com.playphone.msports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TermsOfUse {

	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
	    driver = new FirefoxDriver();
	    baseUrl = "http://tournaments.olympus01.playphone.cc/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	@Test
	  public void termsOf() throws Exception {
	    driver.get(baseUrl + "/#/?theme=basic");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(".//div[@id='account']//div[7]/a[1]")).click();
	    Thread.sleep(3000);
}
	@AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    //driver.quit();
	    
	    }
}