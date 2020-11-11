package com.amazon.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pages.Home;
import com.amazon.pages.Login;

public class LoginTest extends InitialSetUp {
	
	Login login;
	Home home;
	String parent="";
  @Test
  public void Login() throws InterruptedException {
	  login = new Login(driver);
	  login = PageFactory.initElements(driver, Login.class);
	  home = new Home(driver);
	  home = PageFactory.initElements(driver, Home.class);
	  login.clickSignIn();
	  Thread.sleep(5000);
	  login.enterUserName("aparnarekas@gmail.com");
	  login.clickContinue();
	  Thread.sleep(5000);
	  login.enterPassword("Rose@1234");
	  login.clickLogin();
	  Thread.sleep(5000);

  }
  @Test(priority=1)
  public void selectItem()  throws InterruptedException {
	  home.clickMenu();
	  Thread.sleep(5000);
	  home.clickItemMenu();
	  Thread.sleep(5000);
	  home.clickItem();
	  Thread.sleep(5000);
	  
	
  }
}

