package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class login {

    WebDriver driver;
    @Given("^User is on Login Page$")
    public void User_is_on_Login_Page(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

    }

    @Then("^user Enter the Username in User Text Box$")
    public void user_Enter_the_Username_in_User_Text_Box(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

    }

    @Then("^user Enter the Password in Password Text Box$")
    public void user_Enter_the_Password_in_Password_Text_Box(){
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
    }

    @When("^user should click on Login Button$")
    public void user_should_click_on_Login_Button(){

        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^user is on Homepage$")
    public void user_is_on_Homepage()
    {
        Assert.assertEquals("OrangeHRM",driver.getTitle());

    }


    @Then("user Enter the Username in {string} and enter the password {string}")
    public void userEnterValue(String user , String pass){
        driver.findElement(By.id("txtUsername")).sendKeys(user);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
    }
}




