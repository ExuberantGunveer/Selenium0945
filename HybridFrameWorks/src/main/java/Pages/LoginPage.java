package Pages;

import BaseTest.Base;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage extends Base {



    @FindBy(name = "email")
    WebElement emailAddress ;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password ;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    WebElement loginBtn ;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
    WebElement forgotPassword;

    public LoginPage(){ PageFactory.initElements(driver, this); }

    public   String validateLoginPageTitle(){ return driver.getTitle(); }

    public void login() throws IOException, InterruptedException {

        emailAddress.sendKeys(prop.getProperty("username"));
//        Thread.sleep(5000);
        password.click();
        password.sendKeys("50192Prince");
        loginBtn.click();
    }
}
