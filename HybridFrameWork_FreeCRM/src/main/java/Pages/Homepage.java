package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseTest.Base.driver;

public class Homepage {
    @FindBy(xpath ="//span[contains(text(),'Gunveer Singh')]")
    WebElement userNametitle;

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    WebElement contactLink;

    @FindBy(xpath = "//span[contains(text(),'Companies')]")
    WebElement dealsLink;

    @FindBy(xpath = "//span[contains(text(),'Deals')]")
    WebElement companyLink;

    public Homepage(){

        PageFactory.initElements(driver, this);
    }

    public  String verifyHomepageTitle(){

        return driver.getTitle();
    }

    public boolean verifyUserNameTitle(){

        return userNametitle.isDisplayed();

    }


    public Contacts clickOnContactLink(){

        contactLink.click();
        return new Contacts() ;
    }

    public Company clickOnCompanyLink(){
        companyLink.click();
        return new Company();
    }

    public Deals clickOnDealsLink(){
        dealsLink.click();
        return new Deals();
    }


}
