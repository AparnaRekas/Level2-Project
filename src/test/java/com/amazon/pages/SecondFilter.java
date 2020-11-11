package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondFilter {
	
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[12]/div/li[2]/span/a/span")
	private WebElement price;
	@FindBy(xpath="//*[@id=\"p_n_power_source_browse-bin/11875796031\"]/span/a/span")
	private WebElement batterycapacity;
	@FindBy(xpath="//*[@id=\"p_72/1318476031\"]/span/a/section/i")
	private WebElement rating;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/span/a/div/img")
	private WebElement item;
	
	
	static WebDriver driver;
	public SecondFilter(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickPrice() {
		price.click();	
	}
	public void clickBatteryCapacity() {
		batterycapacity.click();
		}
	public void clickRating() {
		rating.click();
		}
	public void clickItem() {
		item.click();
		}

}

