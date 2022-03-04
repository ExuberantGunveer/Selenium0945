package Runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"C:\\Users\\GunveerSingh\\Desktop\\My Work\\New folder\\OpenCart\\src\\main\\java\\FeatureFile\\AccountPage.feature"},
		glue  = {"stepdefination"},
		monochrome = true ,
                plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
                        "html:Report/cucumberReport"}
		
		)


public class TestRunner {
	
	

}
