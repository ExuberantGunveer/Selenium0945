package BaseTest;

import PageFactory.ObjectFactory;
import Utils.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

public static Properties prop ;
public static WebDriver driver ;
protected static ObjectFactory obj ;
    public Base()  {

    try{
    prop = new Properties();
    FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Config//config.properties");
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
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Page_Load_Time));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Implicit_Wait_Time));

        driver.get(prop.getProperty("url"));

    }

}
