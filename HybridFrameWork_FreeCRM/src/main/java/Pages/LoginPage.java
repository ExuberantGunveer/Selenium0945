package Pages;

import BaseTest.Base;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage extends Base {

    public static  String path;
    public static String username ;
    public static String pass ;

    @FindBy(name = "email")
    WebElement emailAddress ;

    @FindBy(name = "password")
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
        path = System.getProperty("user.dir")+"//src//main//java//TestData//GunveerFile.xls";
//        FileInputStream fis = new FileInputStream(path);
        FileInputStream prop1 = null;
        try{
            prop1 = new FileInputStream(path);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        HSSFWorkbook wb = new HSSFWorkbook(prop1);
        HSSFSheet sheet = wb.getSheet("Sheet1");
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String  pwd = sheet.getRow(1).getCell(1).getStringCellValue();

        emailAddress.sendKeys(username);
        password.sendKeys(pwd);
        loginBtn.click();

//        for(int i = 1 ; i<=sheet.getLastRowNum();i++) {
//           username = sheet.getRow(i).getCell(0).getStringCellValue();
//            emailAddress.sendKeys(username);
//            Thread.sleep(5000);
//            pass = sheet.getRow(i).getCell(1).getStringCellValue();
//            password.sendKeys(pass);
//            Thread.sleep(3000);
//            loginBtn.click();
//            Thread.sleep(5000);
//        }
    }
}
