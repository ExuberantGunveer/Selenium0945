package opencart.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	public LoginPageTest() {super();}
	
	@BeforeTest
	public void setUp() {
		initialization();
	}

	@Test
	public void setLoginPage()  {
//		Thread.sleep(3000);
		obj.getLoginPage().login();
	}
	
//	@Test
//	public void verifyLoginPageTitle() {
//	 String Title =	obj.getLoginPage().verifyLoginPageTitle();
//	 Assert.assertEquals(Title,"OpenCart - Account Login");
//	}
	

//	@Test(priority = 3)
//	public void verifyForgotLink() {
//		String title = obj.getLoginPage().forgotPassword();
//		Assert.assertEquals(title,"OpenCart - Forgotten Password");
//	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}
	
}
