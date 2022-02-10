package StepDefination;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginNew {
    WebDriver driver;
    @Given("^User must be on Login Page$")
    public void User_must_be_on_Login_Page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
    }
    @When("^Enter the Valid Username and Valid Password$")
    public void Enter_the_Valid_Username_and_Valid_Password(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for(List<String> e : userList){
            System.out.println(e);
        }
        driver.findElement(By.id("txtUsername")).sendKeys(userList.get(1).get(0));
        driver.findElement(By.id("txtPassword")).sendKeys(userList.get(1).get(1));
    }


    @Then("^Click on Login Button$")
        public void Click_on_Login_Button(){
            driver.findElement(By.id("btnLogin")).click();

        }



    }


