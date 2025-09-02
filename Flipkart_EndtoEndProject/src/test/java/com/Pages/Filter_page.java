package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReuseableFunctions.SeleniumReuseable;

public class Filter_page extends Library {
	
	SeleniumReuseable se;
	
	public Filter_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")
	WebElement minimumAmount;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	WebElement maximumAmount;
	
	@FindBy(xpath="//div[text()='vivo']/preceding-sibling::div")
	WebElement brand;
	
	@FindBy(xpath="//div[text()='3 GB']/preceding-sibling::div")
	WebElement ram;
	
	@FindBy(xpath="//div[text()='Battery Capacity']/..")
	WebElement batteryArrow;
	
	@FindBy(xpath="//div[text()='4000 - 4999 mAh']/preceding-sibling::div")
	WebElement batteryCapacity;
	
	public void min() {
		se = new SeleniumReuseable(driver);
		se.dropDown(minimumAmount, "10000");
	}
	
	public void max() {
		se.dropDown(maximumAmount, "20000");
	}
	
	public void brand() {
		se.click(brand);
	}
	
	public void ram() {
		se.scrollDown(ram);
		se.click(ram);
	}
	
	public void clickBattery() {
		se.scrollDown(batteryArrow);
		se.click(batteryArrow);
		se.click(batteryCapacity);
	}
	
}
