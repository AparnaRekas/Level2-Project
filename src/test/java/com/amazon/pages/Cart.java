package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Cart {
	
	static WebDriver driver;
	@FindBy(name="quantity")
	private WebElement  qty;
	
	
	
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickQty(String value) {
		Select selectqty=new Select(qty);
		selectqty.selectByValue(value);
		}
	


}
