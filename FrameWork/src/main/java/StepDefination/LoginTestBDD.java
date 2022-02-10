package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseTest.Base;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestBDD extends Base {
	
	
	 LoginPage loginDetails ;
	 
	 
	 public LoginTestBDD() {
		 super();
	 }

	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		initialization();
			
	}
	   
	

	@Then("^user Enter the Username in User Text Box$")
	public void user_Enter_the_Username_in_User_Text_Box() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	}
	   

	@Then("^user Enter the Password in Password Text Box$")
	public void user_Enter_the_Password_in_Password_Text_Box() {
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	}

	@When("^user should click on Login buttn$")
	public void user_should_click_on_Login_buttn() {
		driver.findElement(By.id("btnLogin")).click();
	  
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage() {
		Assert.assertEquals("OrangeHRM",driver.getTitle());
	}

	@Then("^Click on Forgot Password Link$")
	public void click_on_Forgot_Password_Link() {
	driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
	 //   "//a[contains(text(),'Forgot your password?')]"
	}

	@Then("user Enter the Username in {string} and enter the password {string}")
	public void user_Enter_the_Username_in_and_enter_the_password(String user , String pass) {
		
		 driver.findElement(By.id("txtUsername")).sendKeys(user);
		 driver.findElement(By.id("txtPassword")).sendKeys(pass);
		 
	       
	   
	}
	

	@Then("^user should get Invalid Credential Message$")
	public void user_should_get_Invalid_Credential_Message() {
	
		boolean title =	driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).isDisplayed();
	   Assert.assertTrue("Invalid credentials", title);
	}

//	@Then("user get Logout")
//	public void user_get_Logout() {
//		
//	}
	@Then("Enter the valid Credentials and Click Login")
	public void Enter_the_valid_Credentials_and_Click_Login() {
		loginDetails = new LoginPage();
		loginDetails.login();
	}
	
	@And("Close the Browser")
	public void Close_the_Browser() throws Exception {
		Thread.sleep(3000);
		driver.close();
		
	}
	
}
