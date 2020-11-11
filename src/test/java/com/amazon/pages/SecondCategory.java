package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondCategory {
	
	WebDriver driver;
	@FindBy(id="nav-hamburger-menu")
	private WebElement secondhamburger;
	@FindBy(xpath="//div[contains(text(),'Mobiles, Computers')]")
	private WebElement seconditemMenu;
	@FindBy(xpath="//a[contains(text(),'Power Banks')]")
	private WebElement seconditem;
	
	public SecondCategory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMenu() {
	secondhamburger.click();
	}
	
	public void clickItemMenu() {
	seconditemMenu.click();
	}
	
	public void clickItem() {
	seconditem.click();
	}


}

