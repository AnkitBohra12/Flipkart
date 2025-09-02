package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com/Stepdefenitions"}, plugin= {
"pretty",    // shows step execution + summary in console
"summary",   // optional, gives clean final report
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags= "@Regression")

public class Runner  {

}
