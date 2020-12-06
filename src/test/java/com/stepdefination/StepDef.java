package com.stepdefination;

import cucumber.api.java.en.*;

public class StepDef {
	
	@Given("^Open OpenHRM Application$")
	public void open_OpenHRM_Application() throws Throwable {
		
		System.out.println("Open");
	   
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
		System.out.println("UserName");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		System.out.println("PassWord");
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		System.out.println("Login");
	}

	@Then("^User login to application$")
	public void user_login_to_application() throws Throwable {
		System.out.println("InWeb");
	}

}
