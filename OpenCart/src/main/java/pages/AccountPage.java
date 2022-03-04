package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import opencart_interface.AccountDetails_Interface;

public class AccountPage extends BaseTest implements AccountDetails_Interface {

	
	@FindBy(xpath= "//input[@name='pin']")
	WebElement PINValue;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginPage() {
		obj.getLoginPage().loginPage();
	}
	public void enterPINValue() {
	
	PINValue.sendKeys(prop.getProperty("PIN"));
	submitBtn.click();
		
	}

}
