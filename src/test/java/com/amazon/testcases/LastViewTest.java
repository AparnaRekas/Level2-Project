package com.amazon.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.amazon.pages.LastSignIn;
import com.amazon.pages.SecondCategory;
import com.amazon.pages.SecondFilter;
import com.amazon.pages.SecondProduct;
import com.amazon.pages.SignOut;
import com.amazon.pages.ViewCart;

public class LastViewTest extends InitialSetUp {
	
	SignOut signout;
	LastSignIn lastsignin;
	ViewCart viewcart;
	String parent="";
	
  @Test
  public void finalCart() throws InterruptedException {
	  
	  signout = new SignOut(driver);
	  signout = PageFactory.initElements(driver, SignOut.class);
	  lastsignin = new LastSignIn(driver);
	  lastsignin = PageFactory.initElements(driver, LastSignIn.class);
	  viewcart = new ViewCart(driver);
	  viewcart = PageFactory.initElements(driver, ViewCart.class);
	  signout.clickMenu();
	  signout.clickSignOut();
	  Thread.sleep(5000);
	  lastsignin.enterUserName("aparnarekas@gmail.com");
	  lastsignin.clickContinue();
	  Thread.sleep(5000);
	  lastsignin.enterPassword("Rose@1234");
	  lastsignin.clickLogin();
	  viewcart.clickViewCart();
	  Thread.sleep(5000);
	  
	  
  }
}

