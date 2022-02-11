package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMAddUser {
	
	
	@FindBy(xpath = "//li[@class='current main-menu-first-level-list-item']")
	WebElement PIMButton ;
	@FindBy(id = "btnAdd")
	WebElement addButton;
	@FindBy(id = "firstName")
	WebElement firstname ;
	@FindBy(id = "lastName")
	WebElement lastname;
	@FindBy(id = "chkLogin")
	WebElement loginCheckBtn ;
	@FindBy(id= "btnSave")
	WebElement saveButton ;
	
	

}
