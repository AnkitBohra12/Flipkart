package com.Stepdefenitions;

import com.Baseclass.Library;
import com.Pages.Fashion_page;
import com.ReuseableFunctions.SeleniumReuseable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_Stepdefinition_TestCase extends Library {
	
	Fashion_page fp;
	SeleniumReuseable se ;
	
	@Given("User moves to the Fashion link")
	public void user_moves_to_the_fashion_link() {
		 se = new SeleniumReuseable(driver);
		 System.out.println("Before clicking FashioLink");
		 se.getTittle();
		 
		 fp = new Fashion_page(driver);
		 fp.moveFashionLink();
	}

	@When("Cursor to move to the Kids link")
	public void cursor_to_move_to_the_kids_link() {
	    fp.moveKidsLink();
	}

	@When("Moves to girls dress and click")
	public void moves_to_girls_dress_and_click() {
	   fp.clickGirlsLink();
	}

	@When("Clicks the price high to low link")
	public void clicks_the_price_high_to_low_link() {
	    fp.clickPrice();
	}

	@Then("It should display the relevant details and get the title")
	public void it_should_display_the_relevant_details_and_get_the_title() {
	    System.out.println("After clicking FashionLink ");
	    se.getTittle();
	}


}
