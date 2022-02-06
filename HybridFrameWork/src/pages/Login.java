package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class Login extends testBase {
  
	@FindBy(name = "email")
	WebElement emailAddress ;
	
	@FindBy(name = "password")
	WebElement password ;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn ;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement forgotPassword;
			
			
	public Login(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public static String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Homepage login(String username ,String pass){
		emailAddress.sendKeys(username);
		password.sendKeys(pass);
		loginBtn.click();
		return new Homepage();
	}


	
	  
}
