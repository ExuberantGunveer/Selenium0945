package PageFactory;

import Pages.Homepage;
import Pages.LoginPage;

public class ObjectFactory {

    private LoginPage loginPage;
    private Homepage homepage;

    public LoginPage getLoginPage(){

        if(loginPage==null){
            loginPage = new LoginPage();
        }
        return  loginPage;
    }

    public Homepage getHomepage(){

        if(homepage == null){
            homepage = new Homepage();
        }
        return homepage;
    }


}
