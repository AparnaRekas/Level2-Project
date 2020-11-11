package com.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class InitialSetUp {
	
	static WebDriver driver;
	
  
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony vaio\\Desktop\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.Amazon.in");
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.quit();
  }

}
