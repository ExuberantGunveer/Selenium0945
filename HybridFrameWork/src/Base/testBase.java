package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.testUtil;

public class testBase {
	
	public static WebDriver driver ;
	public static Properties prop ;
	
	public testBase(){
		
		try {
			prop = new Properties() ;
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//Config//config.properties");
			prop.load(ip);
		}
		
		
		catch(FileNotFoundException e){
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void initialization(){
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
							
		}
		else if (browsername.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testUtil.Page_Load_Timeunit, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testUtil.Implicit_Load_Timeunit, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
}


