package com.Stepdefenitions;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.Pages.Filter_page;
import com.ReuseableFunctions.SeleniumReuseable;

import io.cucumber.java.en.Then;

public class Fliter_Stepdefination_TestCase extends Library{
	
	Filter_page fp;
	SeleniumReuseable se;
	
	@Then("Select Mininum and Maxinum Amount")
	public void select_mininum_and_maxinum_amount() throws InterruptedException {
	    fp = new Filter_page(driver);
	    String beforeFilter = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
	    System.out.println("BEFORE FILTER :" + beforeFilter);
	   
	    fp.min();
	    se = new SeleniumReuseable(driver);
	    se.waits();
	    fp.max();
	    se.waits();
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
	    fp.brand();
	    se.waits();
	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException {
	    fp.ram();
	    se.waits();
	}

	@Then("Select the Battery Capacity")
	public void select_the_battery_capacity() throws InterruptedException {
	    fp.clickBattery();
	    se.waits();
	}

	@Then("It should display the Relevant result")
	public void it_should_display_the_relevant_result() {
		System.out.println("***********************************************************");
		String afterFilter = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
	    System.out.println("AFTER FILTER :" + afterFilter);
	    
	}

}
