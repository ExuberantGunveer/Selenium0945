package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseTest;


import opencart_interface.LoginPage_Interface;

public class LoginPage extends BaseTest implements LoginPage_Interface {
	

	
	@FindBy(xpath ="//input[@name='email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwrd;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement submitBtn ;
	
	@FindBy(xpath = "//a[@class='btn btn-black navbar-btn']")
	WebElement registartionLink;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement forgotLink;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginPage() {
		emailId.sendKeys(prop.getProperty("emailID"));
		passwrd.sendKeys(prop.getProperty("username"));
		submitBtn.click();
		
	}

	public void validateLoginPageTitle() {
		String actl = driver.getTitle();
		Assert.assertEquals("Account PIN",actl);
	}

	public void forgotPasswordLink() {
		
		forgotLink.click();
		String actl = driver.getTitle();
		Assert.assertEquals("OpenCart - Forgotten Password", actl);
	}
//
//	public void registerLink() {
//		// TODO Auto-generated method stub
//		
//	}

}
