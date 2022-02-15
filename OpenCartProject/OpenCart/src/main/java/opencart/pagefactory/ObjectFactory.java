package opencart.pagefactory;

import opencart.pages.LoginPage;
import opencart.pages.MarketplacePage;

import opencart.pages.RegistrationPage;

public class ObjectFactory {
	
	 private LoginPage loginPage;
	 private MarketplacePage marketplacePage ;
	 private RegistrationPage registerPage ;

		 public LoginPage getLoginPage(){

	        if(loginPage == null){
	            loginPage = new LoginPage();
	        }
	        return  loginPage;
	    }
	 
	 public MarketplacePage getMarketplacePage() {
		 if(marketplacePage == null) {
			 marketplacePage = new MarketplacePage();
		 }
		 return marketplacePage;
	 }


	 
	 public RegistrationPage getRegistrationPage() {
		 if(registerPage==null) {
			 registerPage = new RegistrationPage();
		 }
		 return registerPage;
	 }
	 
	 

}
