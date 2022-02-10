package TestCases;

import BaseTest.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends Base {

    public LoginPageTest(){
         super();
    }

    @BeforeSuite
    public void setUp() { initialization();}

    @Test(priority = 0)
    public void VerifyLoginPageTitle(){
        String title = obj.getLoginPage().validateLoginPageTitle();
        Assert.assertEquals(title,"Cogmento CRM");
    }

        @Test(priority = 1)
    public void setLoginpage()
        {
        try{
        obj.getLoginPage().login();}
        catch(Exception e){
            e.printStackTrace();
        }
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtil.Explicit_Wait_Time));
//        wait.until(ExpectedConditions.visibilityOfAllElements(loginpage.login()));

    }

}
