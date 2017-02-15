package com.playphone.msports;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class PlayButton {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
    driver = new FirefoxDriver();
    baseUrl = "http://tournaments.olympus-stage.playphone.cc/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
  }

  public void testPlayButton() throws Exception {
    driver.get(baseUrl + "/#/");
    Thread.sleep(3000);
    //driver.findElement(By.xpath("//button[@class='games-item-play btn msports button-filled large float-xs-right']")).click();
    //Thread.sleep(3000);
   
    driver.findElement(By.id("play-now-button-1")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
