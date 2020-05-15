package StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import generalComponent.Registration;

public class registration_StepDef {
	WebDriver driver;
	Registration reg = new Registration(driver);
	
	@Given("^User is in login page$")
	public void user_is_in_login_page() throws Throwable {
		reg.launchPage();
		System.out.println("SD1");
	}

	@When("^User ID textbox is shown entering the details$")
	public void user_ID_textbox_is_shown_entering_the_details() throws Throwable {
		System.out.println("SD2");
	}

	@When("^Enter the required details to complete the registraiton$")
	public void enter_the_required_details_to_complete_the_registraiton() throws Throwable {
		System.out.println("SD3");
	}

	
}
