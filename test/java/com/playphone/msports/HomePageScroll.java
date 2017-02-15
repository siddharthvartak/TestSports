package com.playphone.msports;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageScroll {
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
  public void PageScroll() throws Exception {
    driver.get(baseUrl + "/#/");
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    //driver.findElement(By.cssSelector("span.label")).click();
    //Actions action = new Actions(driver);
    //action.sendKeys(Keys.PAGE_DOWN);
    Thread.sleep(3000);
  }

@AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    
    }
  }

  
  


