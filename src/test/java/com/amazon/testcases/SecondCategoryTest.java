package com.amazon.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.amazon.pages.SecondCategory;
import com.amazon.pages.SecondFilter;
import com.amazon.pages.SecondProduct;

public class SecondCategoryTest extends InitialSetUp {
	
	SecondCategory secondcategory;
	SecondFilter secondfilter;
	SecondProduct secondproduct;
	String parent="";
	
	
  @Test
  public void secondAddToCart() throws InterruptedException {
	  
	  	 secondcategory = new SecondCategory(driver);
	  	 secondcategory = PageFactory.initElements(driver, SecondCategory.class);
	  	 secondfilter = new SecondFilter(driver);
		 secondfilter = PageFactory.initElements(driver, SecondFilter.class);
		 secondproduct = new SecondProduct(driver);
		 secondproduct = PageFactory.initElements(driver, SecondProduct.class);
		 secondcategory.clickMenu();
		  Thread.sleep(5000);
		  secondcategory.clickItemMenu();
		  Thread.sleep(5000);
		  secondcategory.clickItem();
		  Thread.sleep(5000);
		  secondfilter.clickPrice();
		  Thread.sleep(5000);
		  secondfilter.clickBatteryCapacity();
		  Thread.sleep(5000);
		  secondfilter.clickRating();
		  Thread.sleep(5000);
		  secondfilter.clickItem();
		  parent = driver.getWindowHandle();
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			while (it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			secondproduct.clickAddToCart();
			  Thread.sleep(5000);
			secondproduct.clickCart();
			  Thread.sleep(5000);
  }
}
