package com.Stepdefenitions;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library {
	SearchPage sp;
	
	@Given("Launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException {
	   launchApplication();
	}

	@When("Close the popup")
	public void close_the_popup() {
	    System.out.println(driver.getTitle());
	}

	@Then("It should Navigate to the Home page")
	public void it_should_navigate_to_the_home_page() {
	    sp = new SearchPage(driver);
	    sp.homeScreen();
	}

	@Given("User enter the Text in the Search field")
	public void user_enter_the_text_in_the_search_field() {	    
		sp.Search("Mobile");
	}

	@When("Click the search button")
	public void click_the_search_button() {
	    sp.clickSearch();
	}

	@Then("It should navigate to the search result page and display the relevant details")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_details() {
	    sp.result();
	}
	
	@Then("Extract the Results and print in console")
	public void extract_the_results_and_print_in_console() {
		sp.printEntireResult();
		System.out.println("********************************************************");
	}

	@Then("Print the Third result and keep it in the console")
	public void print_the_third_result_and_keep_it_in_the_console() {
	   sp.printThirdResult();
	}


}
