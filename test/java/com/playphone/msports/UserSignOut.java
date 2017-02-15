package com.playphone.msports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserSignOut {
	private WebDriver driver;
	  private String baseUrl;
	  
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		//WebDriver driver;  
		System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
		
	    driver = new FirefoxDriver();
	    baseUrl = "http://tournaments.olympus-stage.playphone.cc/#/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void SignOut () throws Exception {
	    driver.get(baseUrl + "/#/");
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@data-pp-auto-id='login-with-google'][contains(text(),'Log in with Email')]")).click();
	    //(".//*[@id='play-now-button-1']")).click();
	    driver.findElement(By.name("email")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.name("email")).sendKeys("ppsvm01@hotmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("test1234");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'][contains(@class, 'nav-btn btn-menu btn msports large active float-xs-right hidden-xl-up')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//i[@id='profileMenu']")).click();
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//i[@id='profileMenu']")).click();
	    
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  Thread.sleep(3000);
	    //driver.quit();
	   
	    }
	  }

