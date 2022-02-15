package opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import opencart.base.BaseTest;

public class LoginPage extends BaseTest {
	
//	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-link navbar-btn']")
//	WebElement loginBtn;
	
//	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	@FindBy(css = "#input-email")
	WebElement email;
	
//	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	@FindBy(css = "#input-password")
	WebElement password;
	
	@FindBy(className ="btn btn-primary btn-lg hidden-xs")
	WebElement submitBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement forgotLink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		email.sendKeys(System.getProperty("emailId"));
		password.sendKeys(System.getProperty("password"));
		submitBtn.click();
	}

	public String verifyLoginPageTitle(){
		return driver.getTitle();
	}

	public String forgotPassword() {
		
		forgotLink.click();
		return driver.getTitle();
	}


}
