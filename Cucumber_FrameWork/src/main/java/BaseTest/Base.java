package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver ;
	public Base() {
		try {
		prop = new Properties();
		FileInputStream ip  = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//PropertiesFile//config.properties");
		prop.load(ip);
		}catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	 public void initialization(){

	        
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
