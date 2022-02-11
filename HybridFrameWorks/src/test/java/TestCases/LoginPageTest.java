package TestCases;

import BaseTest.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPageTest extends Base {

    public LoginPageTest(){
         super();
    }

    @BeforeMethod
    public void setUp() { initialization();}

    @Test(priority = 1)
    public void VerifyLoginPageTitle(){
        String title = obj.getLoginPage().validateLoginPageTitle();
        Assert.assertEquals(title,"Cogmento CRM");
    }

        @Test(priority = 2)
    public void setLoginpage() throws InterruptedException, IOException  {
        obj.getLoginPage().login();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtil.Explicit_Wait_Time));
//        wait.until(ExpectedConditions.visibilityOfAllElements(loginpage.login()));

    }

}
