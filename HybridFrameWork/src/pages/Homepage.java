package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class Homepage extends testBase {
	
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

public static String verifyHomepageTitle(){
	
	return driver.getTitle();
}

public boolean verifyUserNameTitle(){
	
	return userNametitle.isDisplayed();
	
}


public contacts clickOnContactLink(){
	
	contactLink.click();
	return new contacts() ;
}
	
public company clickOnCompanyLink(){
	companyLink.click();
	return new company();
}

public deals clickOnDealsLink(){
	dealsLink.click();
	return new deals();
}


}
