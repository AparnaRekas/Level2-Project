package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOut {
	
	WebDriver driver;
	@FindBy(id="nav-hamburger-menu")
	private WebElement thirdhamburger;
	@FindBy(xpath="//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[35]/a[1]")
	private WebElement signout;
	
	public SignOut(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMenu() {
		thirdhamburger.click();
	}
	
	public void clickSignOut() {
		signout.click();
	}
	

}
