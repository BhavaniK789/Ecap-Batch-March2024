package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("user is on login page");	
	}
	@When("user enters valid data")
	public void user_enters_valid_data() {
		System.out.println("user enters valid data");
	    
	}

	@When("click on login page")
	public void click_on_login_page() {
		System.out.println("click on login page");
	    
	}

	@Then("user login successfully")
	public void user_login_successfully() {
		System.out.println("user login successfully");
	    
	}




}
