package opencart.pages;

import opencart.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketplacePage extends BaseTest{


    @FindBy(xpath = "//a[contains(text(),'Form Builder - Multi Form Creator ( 2x & 3x )')]")
    WebElement productLink;

    @FindBy(id = "button-purchase")
    WebElement purchaseBtn;

    @FindBy(id = "button-continue")
    WebElement continueLinkBtn;

    public MarketplacePage(){
        PageFactory.initElements(driver, this);
    }

    public String  verifyMarketplaceTitle(){

        return driver.getTitle();
    }

    public void addToCart(){

        productLink.click();
        purchaseBtn.click();
        continueLinkBtn.click();
    }

}
