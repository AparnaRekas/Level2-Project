package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Filter {
	
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[11]/div/li[2]/span/a/span")
	private WebElement price;
	@FindBy(xpath="//span[contains(text(),'ANNI DESIGNER')]")
	private WebElement brand;
	@FindBy(xpath="//*[@id=\"p_n_size_five_browse-vebin/1975367031\"]/span/a/span/span/button/span")
	private WebElement size;
	@FindBy(xpath="//*[@id=\"p_72/1318476031\"]/span/a/section/i")
	private WebElement rating;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")
	private WebElement item;
	@FindBy(xpath="//select[@id='native_dropdown_selected_size_name']")
	private WebElement  sizeselect;
	
	static WebDriver driver;
	public Filter(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickPrice() {
		price.click();	
	}
	public void clickBrand() {
		brand.click();
		}
	public void size() {
		size.click();
		}
	public void clickRating() {
		rating.click();
		}
	public void clickItem() {
		item.click();
		}
	public void clicksize(String value) {
		Select selectsizeselect=new Select(sizeselect);
		selectsizeselect.selectByValue(value);
		}

}

