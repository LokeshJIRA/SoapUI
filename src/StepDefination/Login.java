package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	
	
	
	@Given("^User should able to launch Amazon URL$")
	public void user_should_able_to_launch_Amazon_URL() throws Throwable {
	    System.out.println("User should able to launch Amazon URL");
	}

	@Given("^logged in successfully$")
	public void logged_in_successfully() throws Throwable {
	    System.out.println("logged in successfully");
	}

	@When("^user logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
	    System.out.println("user logged in successfully");
	}

	@Then("^validate the current url$")
	public void validate_the_current_url() throws Throwable {
	   System.out.println("validate the current url");
	}

	@Then("^title of the page$")
	public void title_of_the_page() throws Throwable {
	     System.out.println("title of the page");
	}
}
 