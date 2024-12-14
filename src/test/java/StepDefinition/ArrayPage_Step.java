package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPage_Step {

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		System.out.println("The user is in Homepage");
		// throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the {string} button in Array Panel")
	public void the_user_clicks_the_button_in_array_panel(String string) {
		System.out.println("The user clicks on Array link");
		// throw new io.cucumber.java.PendingException();
	}

	@Then("The user is directed to {string} Data Structure page")
	public void the_user_is_directed_to_data_structure_page(String string) {

		System.out.println("The user is in Array page");
		// throw new io.cucumber.java.PendingException();
	}

}
