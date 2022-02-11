package SeleniumPractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinks{

	public static void main(String[] args) throws Exception , FileNotFoundException  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Properties pro = new Properties();

		InputStream ip = new FileInputStream("C:\\Users\\GunveerSingh\\Documents\\JavaNew\\Hello1\\"
				+ "src\\main\\java\\SeleniumPractices\\config.properties");
		pro.load(ip);
		
		

        driver.get(pro.getProperty("url"));

       List<WebElement> linktext = driver.findElements(By.tagName("a"));
       System.out.println(linktext.size());
       for(int i = 0;i<linktext.size();i++){
           String linktxt = linktext.get(i).getText();
           String linkurl  = linktext.get(i).getAttribute("href");
           System.out.println(linktxt+"    "+linkurl);

       }
		
	}

}
