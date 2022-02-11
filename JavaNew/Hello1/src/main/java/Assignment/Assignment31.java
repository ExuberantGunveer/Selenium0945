package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment31 {

		WebDriver driver ;	
		String path;
		@Test
		public void launch() throws IOException {
			WebDriverManager.chromedriver().setup();
			
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
//			path = System.getProperty("user.dir")+"/TestData/GunveerFile.xlsx";
//			FileInputStream prop = new FileInputStream(path);
//			XSSFWorkbook wb = new XSSFWorkbook(prop);
//			XSSFSheet sheet = wb.getSheet("Sheet1");
//			for(int i = 1 ; i<=sheet.getLastRowNum();i++) {
//				
//				String username = sheet.getRow(i).getCell(0).getStringCellValue();
//		        driver.findElement(By.id("txtUsername")).sendKeys(username);
//				
//			    String pass = sheet.getRow(i).getCell(1).getStringCellValue();
//			    driver.findElement(By.id("txtPassword")).sendKeys(pass);	
//			    System.out.println("Username is : " + username + "  And Password is : " + pass );
//			
//			    
//			    
//			    driver.findElement(By.id("btnLogin")).submit();
//			    
//			    driver.findElement(By.id("txtUsername")).clear();
//			    driver.findElement(By.id("txtPassword")).clear();
//			    
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			 driver.findElement(By.id("btnLogin")).submit();
			    
			}	
			
		}
//}
