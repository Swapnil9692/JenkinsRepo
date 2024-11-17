package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationClass {

	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
	    
		System.out.println("User is at login page");
	}

	@When("User should enter the username")
	public void user_should_enter_the_username() {
		System.out.println("User enters the Username");
	}

	@When("User should enter the password")
	public void user_should_enter_the_password() {
		System.out.println("User enters the Password");
	}

	@When("User should click on Login button")
	public void user_should_click_on_login_button() {
		System.out.println("User Clicked login Button");
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		System.out.println("User is homepage");
		System.out.println("User is homepage & mission Completed");
		System.out.println("User is homepage & mission Completed 1");
		System.out.println("User is homepage & mission Completed 2");
	}

}
