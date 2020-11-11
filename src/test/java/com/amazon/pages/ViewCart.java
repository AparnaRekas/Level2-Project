package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCart {
	
	WebDriver driver;
	@FindBy(id="nav-cart-count")
	private WebElement cart;
	
	public ViewCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickViewCart() {
		cart.click();
	}

}

