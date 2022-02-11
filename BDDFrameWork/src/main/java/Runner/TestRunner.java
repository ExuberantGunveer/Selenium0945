package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (

//                features = {"C:\\Users\\GunveerSingh\\Documents\\JavaNewOne\\BDDFrameWork\\src\\main\\java\\FeatureFile\\Login.feature"},
                features = {"src\\main\\java\\FeatureFile"},

                glue  = {"StepDefination"},
                dryRun = true,
//                tags = {"@SmokeTest"},
                monochrome = true,


                plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
                        "html:Report/cucumberReport"}
       )
public class TestRunner {


}
