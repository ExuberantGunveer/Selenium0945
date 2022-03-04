package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class AccountPageTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLoginPage() {
		obj.getLoginPage().loginPage();
	}
	
	
	@Test(priority = 2)
	public void verifyEnterPIN() {
		obj.getAccountPage().enterPINValue();
	}
	
}
