package com.playphone.msports;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpNegativeTest {
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
  public void testUntitled3() throws Exception {
    driver.get(baseUrl + "/#/?theme=basic");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("email")).clear();
    Thread.sleep(3000);
    driver.findElement(By.name("email")).sendKeys("svm33@hotmail.com");
    Thread.sleep(3000);
    driver.findElement(By.name("password")).clear();
    Thread.sleep(3000);
    driver.findElement(By.name("password")).sendKeys("test1234");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    //driver.findElement(By.xpath("//div[@id='auth']/div/div/button")).click();
    Thread.sleep(3000);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
	  Thread.sleep(3000);
    driver.quit();
    
    }
  }

  


