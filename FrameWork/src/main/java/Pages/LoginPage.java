package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.Base;

public class LoginPage extends Base{
	
	 @FindBy(id ="txtUsername")
	    WebElement username;

	    @FindBy(id="txtPassword")
	    WebElement password;

	    @FindBy(id ="btnLogin")
	    WebElement loginButton;
	    
	    public LoginPage() {
	    	PageFactory.initElements(driver, this);
	    }
	
	    public void login(){
	        username.sendKeys(prop.getProperty("username"));
	        password.sendKeys(prop.getProperty("password"));
	        loginButton.click();

	    }
	

}
