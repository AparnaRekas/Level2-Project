package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	WebDriver driver;
	@FindBy(id="nav-hamburger-menu")
	private WebElement hamburger;
	@FindBy(xpath="//div[contains(text(),\"Women's Fashion\")]")
	private WebElement itemMenu;
	@FindBy(xpath="//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[11]/li[3]/a[1]")
	private WebElement item;
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMenu() {
	hamburger.click();
	}
	
	public void clickItemMenu() {
	itemMenu.click();
	}
	
	public void clickItem() {
	item.click();
	}

}
