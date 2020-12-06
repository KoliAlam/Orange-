package com.runner;

import java.util.Date;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\FeatureFiles\\FeatureFiles.feature",
glue = {"com.stepdef"},
monochrome = true,

plugin = "junit:target/Report/cucumber.junit"
		)


public class TestRunner_OrangeCucumber {
	
public static void main(String[] args) {
	 Date date = new Date();
	System.out.println("CompleteRunnerFile");
	System.out.println(date.toString());
}

}
