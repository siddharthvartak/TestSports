package com.playphone.msports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
		
		driver = new FirefoxDriver();
		String baseURL = "http://games.o01.dev.playphone.cc/#/?";
		
		driver.get(baseURL);
		//driver.manage().window().maximize();
		
		
	

	}

}
