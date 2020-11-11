package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
	private WebElement login;
	@FindBy(id="ap_email")
	private WebElement emailid;
	@FindBy(id="continue")
	private WebElement continuebtn;
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement loginbtn;
	
	static WebDriver driver;
	public Login(WebDriver driver) {
	driver =this.driver;
	}
	
	public void clickSignIn() {
		login.click();	
	}
	
	public void enterUserName(String text) {
	emailid.sendKeys(text);
	}
	
	public void clickContinue() {
	continuebtn.click();
	}

	public void enterPassword(String text) {
	password.sendKeys(text);
	}

	public void clickLogin() {
	loginbtn.click();
	}
	
}

