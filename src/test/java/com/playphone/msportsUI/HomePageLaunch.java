package com.playphone.msportsUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
		
	    baseUrl = "http://tournaments.olympus01.playphone.cc/";
	    //driver.get(baseUrl);
	   // String currentWindow = driver.getWindowHandle();
	       //driver.switchTo().window(currentWindow);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().setPosition(new Point(-2000, 0));
	    
	       
	  }

	  @Test
	  public void AccountLoginInvalidTest () throws Exception {
	    driver.get(baseUrl + "/#/");
	    Thread.sleep(3000);
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
}
	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  Thread.sleep(3000);
	    driver.quit();

}
}
