package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import pages.Homepage;
import pages.Login;

public class LoginTest extends testBase {
	
	Login loginpage ;
	Homepage homepage;
	
	public LoginTest(){
				super();
			}
	@BeforeMethod
	public void setUp(){
		
		initialization();
		loginpage = new Login();
		
	}
	
	@Test(priority=1)
	public void LoginTitleTest(){
		
		String titlee = loginpage.validateLoginPageTitle();
		Assert.assertEquals(titlee, "Cogmento CRM");
//		Assert.assertEquals(title, "Cogmento CRM");
	
		
	}	
	@Test(priority=2)
	public void loginTest(){
		
     homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
//	@AfterMethod
//	public void tearDown(){
//		
//		driver.quit();
//	}
	
	
	

}
