package tests;

import org.testng.annotations.Test;


import base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	                 
@Test(priority = 2)
public void verifyLoginPage() {
	obj.getLoginPage().loginPage();
}
	
@Test( priority = 3)
public void verifyLoginPageTitle() {
	obj.getLoginPage().validateLoginPageTitle();
	
}
	
@Test(priority = 1 )
public void verifyForgetPassLink() {
	obj.getLoginPage().forgotPasswordLink();
	driver.navigate().back();
}

}
