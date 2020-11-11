package com.amazon.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pages.Cart;
import com.amazon.pages.Filter;
import com.amazon.pages.Product;

public class FilterTest extends InitialSetUp {
	Filter filter;
	Product product;
	Cart cart;
	String parent="";
	
  @Test
  public void addToCart() throws InterruptedException {
	  	 filter = new Filter(driver);
		 filter = PageFactory.initElements(driver, Filter.class);
		 product = new Product(driver);
		 product = PageFactory.initElements(driver, Product.class);
		 cart = new Cart(driver);
		 cart = PageFactory.initElements(driver, Cart.class);
		 filter.clickPrice();
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  filter.clickBrand();
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  filter.size();
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  filter.clickRating();
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  filter.clickItem();
		  parent = driver.getWindowHandle();
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			while (it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			Thread.sleep(5000);
			filter.clicksize("4,B08GZK4CGM");
			Thread.sleep(5000);
			 product.clickAddToCart();
			  Thread.sleep(5000);
			  product.clickCart();
			  Thread.sleep(5000);
			  cart.clickQty("2");
			  Thread.sleep(5000);
  }
}

