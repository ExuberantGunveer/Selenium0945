package stepdefination;

import java.io.IOException;

import base.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountDetails_BDDTest extends BaseTest {
	
	@Given("^User is on Login Page and enter the Valid Credentials$")
	public void user_is_on_Login_Page_and_enter_the_Valid_Credentials() {
		intialization();
		obj.getLoginPage().loginPage();
				
	}

	@Then("^Enter the PIN$")
	public void enter_the_PIN() {
		obj.getAccountPage().enterPINValue();

	}

	@When("^Click on Account Details$")
	public void click_on_Account_Details() {
	  obj.getAccountEdit().clickAccountDetails();
	}

	@Then("^Edit the Account Details$")
	public void edit_the_Account_Details() throws IOException {
	   obj.getAccountEdit().editAccountDetails();
	}


	
}
