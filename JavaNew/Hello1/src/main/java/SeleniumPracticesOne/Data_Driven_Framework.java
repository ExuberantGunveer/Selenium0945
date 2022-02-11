package SeleniumPracticesOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven_Framework {

	String path , uname  , pass , username ;
	
	public void launch() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
		path = System.getProperty("user.dir")+"/TestData/GunveerFile.xlsx";
		FileInputStream prop = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(prop);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		uname = sheet.getRow(1).getCell(0).getStringCellValue();
		
		 int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        System.out.println(rowCount);
		
		for(int i = 1 ; i<=sheet.getLastRowNum();i++) {
		username = sheet.getRow(i).getCell(0).getStringCellValue();
       
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	    pass = sheet.getRow(i).getCell(1).getStringCellValue();
	    driver.findElement(By.id("txtPassword")).sendKeys(pass);	
	    System.out.println("Username is : " + username + "  And Password is : " + pass );
	    FileOutputStream fi = new FileOutputStream(path);
	    String message = "Hello World";
	    sheet.getRow(i).createCell(2).setCellValue(message);
	    wb.write(fi);
	    fi.close();
	    
		        
		//System.out.println(sheet.getRow(i).getCell(2).getStringCellValue());	
			
			driver.findElement(By.id("btnLogin")).submit();
			
			
		
			
				}
		
		
			}		
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Data_Driven_Framework dt = new Data_Driven_Framework();
		dt.launch();
		

	}

}
