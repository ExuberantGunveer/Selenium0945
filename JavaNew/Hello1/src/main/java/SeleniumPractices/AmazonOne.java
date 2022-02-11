package SeleniumPractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AmazonOne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\GunveerSingh\\Documents\\JavaNew\\Hello1\\src\\main\\java\\SeleniumPractices\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("url"));
		System.out.println("browser");
		

	}

}
