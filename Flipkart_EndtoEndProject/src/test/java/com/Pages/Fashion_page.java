package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReuseableFunctions.SeleniumReuseable;

public class Fashion_page extends Library {
	
	SeleniumReuseable se;
	
	public Fashion_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Fashion']")
	WebElement fashionLink;
	
	@FindBy(xpath="//a[text()='Kids']")
	WebElement kidsLink;
	
	@FindBy(linkText="Girls Dresses")
	WebElement girlsDressLink;
	
	@FindBy(xpath="//div[text()='Price -- High to Low']")
	WebElement priceHighToLow;
	
	public void moveFashionLink(){
		se = new SeleniumReuseable(driver);
		se.mouseHover(fashionLink);
	}
	
	public void moveKidsLink() {
		se.mouseHover(kidsLink);
	}
	
	public void clickGirlsLink() {
		se.moveElement(girlsDressLink);
	}
	
	public void clickPrice() {
		se.click(priceHighToLow);
	}

}
