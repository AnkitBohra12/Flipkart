package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReuseableFunctions.SeleniumReuseable;

public class SearchPage extends Library {
	SeleniumReuseable se;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchtext;
	
	@FindBy(xpath="//html[@lang='en-IN']")
	WebElement Homepage;
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement Searchresult;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]")
	List<WebElement> Entireresult;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]")
	WebElement ThirdResult;
	
	public void Search(String Text) {
		se = new SeleniumReuseable(driver);
		se.EnterValue(Searchtext, Text);
	}
	
	public void clickSearch() {
		Searchtext.sendKeys(Keys.ENTER);
	}
	
	public void homeScreen() {
		System.out.println(Homepage.isDisplayed());
	}
	
	public void result() {
		System.out.println(Searchresult.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void printEntireResult() {
		se.multipleGetText(Entireresult);
	}
	
	public void printThirdResult() {
		se.getValue(ThirdResult);
	}
	
}
