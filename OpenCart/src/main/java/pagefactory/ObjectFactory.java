package pagefactory;



import pages.AccountEdit;
import pages.AccountPage;
import pages.LoginPage;

public class ObjectFactory {
	
	private LoginPage loginPage ;
	private AccountPage accPage;
	private AccountEdit accEdit;
	
	
	public LoginPage getLoginPage() {
		
		 if(loginPage==null){
	            loginPage = new LoginPage();
	        }
	        return  loginPage;
	}
	
	public AccountPage getAccountPage() {
		if(accPage==null) {
			accPage = new AccountPage();
		}
		return accPage;
	}

	public AccountEdit getAccountEdit() {
		if(accEdit==null) {
			accEdit = new AccountEdit();
		}
		return accEdit;
	}

	


}
