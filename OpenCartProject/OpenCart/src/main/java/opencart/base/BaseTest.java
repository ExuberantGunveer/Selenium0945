package opencart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import opencart.pagefactory.ObjectFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import opencart.utils.TestUtils;

public class BaseTest {
	
	public static Properties prop ;
	public static WebDriver driver ;
	protected static ObjectFactory obj ;
	
	
	public BaseTest() {
		 try{
			    prop = new Properties(); //C:\Users\GunveerSingh\Documents\NewProject\src\src\main\java\opencart\config\config.properties
			    FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\opencart\\config\\config.properties");
			    prop.load(ip);
			       }catch(FileNotFoundException e){

			        e.printStackTrace();
			    }catch (IOException e) {
			        e.printStackTrace();
			    }
	}
	
	  public void initialization(){

	        obj = new ObjectFactory() ;
	        String browsername = prop.getProperty("browser");
	        if(browsername.equals("chrome")){
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();

	        }else if(browsername.equals("FireFox")){
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        }

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_Load_Time, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(TestUtils.Implicit_Wait_Time, TimeUnit.SECONDS);

	        driver.get(prop.getProperty("url"));

	    }

	

}
