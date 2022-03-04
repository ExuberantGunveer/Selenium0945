package pages;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import opencart_interface.AccountEdit_Interface;

public class AccountEdit extends BaseTest implements AccountEdit_Interface{
	
	
	@FindBy(xpath="//img[@alt='Account']")
	WebElement accountDetails ;
	
	@FindBy(id="input-company")
	WebElement companyName ;
	
	@FindBy(xpath ="//button[contains(text(),'Submit')]")
	WebElement submitBtn ;

//	private HSSFWorkbook wb;
	
     public AccountEdit() {
    	 PageFactory.initElements(driver, this);
     }
     
     public void clickAccountDetails() {
    	 accountDetails.click();
     }
	
	public void editAccountDetails() throws IOException {
		
		companyName.clear();
	
//      FileInputStream prop1 =  new FileInputStream("C:\\Users\\GunveerSingh\\Desktop\\My Work\\New folder\\OpenCart\\src\\main\\java\\config\\GunveerFile.xls");
//       wb = new HSSFWorkbook(prop1);
//      HSSFSheet sheet = wb.getSheet("Sheet1");
//      String companyname = sheet.getRow(1).getCell(0).getStringCellValue();
//   		
//		companyName.sendKeys(companyname);
//		submitBtn.click();
		companyName.sendKeys(prop.getProperty("companyname"));
		submitBtn.click();
		
		}

	
	
}
