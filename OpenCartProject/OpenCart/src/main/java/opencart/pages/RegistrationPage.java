package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import opencart.base.BaseTest;

public class RegistrationPage extends BaseTest {
	
	@FindBy(className = "btn btn-black navbar-btn")
	WebElement registerBtn;
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "firstname")
	WebElement firstName;
	
	@FindBy(name = "lastname")
	WebElement lastName ;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(className = "btn btn-primary btn-lg hidden-xs")
	WebElement regiserBtn;
	
	@FindBy(id = "input-country")
	WebElement countryDropdown;
	
	public RegistrationPage() {
	
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterUserCredentials() {
		
		userName.sendKeys(System.getProperty("username"));
		firstName.sendKeys(System.getProperty("firstname"));
		lastName.sendKeys(System.getProperty("lastname"));
		email.sendKeys(System.getProperty("emailId"));
		
		WebElement countries = countryDropdown ;
		Select select = new Select(countries);
		select.selectByVisibleText("India");
		
		password.sendKeys(System.getProperty("password"));
		regiserBtn.click();
	}
	public String verifyRegisterTitle(){
		return driver.getTitle();
	}
	
}
