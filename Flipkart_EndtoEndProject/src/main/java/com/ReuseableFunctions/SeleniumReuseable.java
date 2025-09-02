package com.ReuseableFunctions;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.Library;

public class SeleniumReuseable extends Library {
	
	Actions act;
	
	public SeleniumReuseable(WebDriver driver){
		this.driver = driver;
	}
	
//	Enter the Text of Element
	public void EnterValue(WebElement element, String Text) {
		
		try {
			element.sendKeys(Text);
		}
		catch(Exception e) {
			System.out.println("No such element Exception");
		}
	}
	
//	Click the Element
	public void click(WebElement element) {
		try {
			element.click();
		}
		catch(Exception e) {
			System.out.println("NoSuchElement Exception");
		}
	}
	
//	Get the title of the page
	public void getTittle() {
		try {
			System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			System.out.println("Couldn't get the Title");
		}
	}
	
	public void multipleGetText(List<WebElement> element) {
		List<WebElement> text = element;
		System.out.println(text.size());
		
		for(WebElement textCount:text) {
			String totalList = textCount.getText();
			System.out.println("********************************************");
			System.out.println(totalList);
		}
	}
	
//	for getting the value
	public void getValue(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
//	For dropDown
	public void dropDown(WebElement element, String text) {
		Select drp = new Select(element);
		drp.selectByValue(text);
	}
	
	
//	For scrollDown
	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click()", element);
	}
	
	
//	For wait
	public void waits() throws InterruptedException {
		Thread.sleep(2000);
	}
	
//	method for mouseHover
	public void mouseHover(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
//	move Element
	public void moveElement(WebElement element) {
		act.moveToElement(element).click().build().perform();
	}
	
	
//	Take the screenshot of the TestCase 
	public void screenShot(String path) {
		TakesScreenshot TS = (TakesScreenshot) driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File(path));
		}
		catch(Exception e) {
			System.out.println("Screenshot not found");
		}
	}

}
