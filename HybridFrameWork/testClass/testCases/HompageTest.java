package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import pages.Homepage;
import pages.Login;
import pages.company;
import pages.contacts;
import pages.deals;

public class HompageTest extends testBase {
	
	Login loginpage ;
	Homepage homepage;
	contacts Contact ;
	company Company;
	deals Deals;
	
	public HompageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		
		initialization();
		
		loginpage = new Login();
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Contact = new contacts();
		Company = new company();
		Deals = new deals();
	}
	
	@Test(priority=1)
	public void verifyHomepageTitleTest(){
		String homepageTitle  = homepage.verifyHomepageTitle();
		Assert.assertEquals(homepageTitle,"Cogmento CRM");
	}
	@Test(priority=2)
	public void userNameTitleTest(){
		
		Assert.assertTrue(homepage.verifyUserNameTitle());
	}
	
	@Test(priority=3)
	public void verifyContactLinkTest(){
		Contact = homepage.clickOnContactLink();
		
	}
	
	@Test(priority=4)
	public void verifyCompanyLinkTest(){
		Company = homepage.clickOnCompanyLink();
		
	}
	@Test(priority=1)
	public void verifyDealsLinkTest(){
		Deals = homepage.clickOnDealsLink();
		
	}
}
