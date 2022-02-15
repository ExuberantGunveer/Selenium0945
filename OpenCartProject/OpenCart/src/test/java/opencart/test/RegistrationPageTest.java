package opencart.test;

import opencart.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {


	public RegistrationPageTest(){super();}

    @BeforeTest
    public void setUp() throws InterruptedException {
        initialization();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();

    }

//    @Test
//    public void verifyRegisterTitleTest(){
//     String title =   obj.getRegistrationPage().verifyRegisterTitle();
//        Assert.assertEquals(title,"");
//    }
    @Test
    public void userCredentialsTest(){
        obj.getRegistrationPage().enterUserCredentials();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
