package opencart.test;

import opencart.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MarketplacePageTest extends BaseTest {
    public MarketplacePageTest(){
        super();
    }

    @BeforeSuite
    public void setUp(){
        initialization();
        driver.findElement(By.linkText("Marketplace"));

    }

    @Test(priority = 2)
    public void verifyMarketplaceTitleTest(){
        String title = obj.getMarketplacePage().verifyMarketplaceTitle();
        Assert.assertEquals(title,"OpenCart - Marketplace");
    }

    @Test(priority = 1)
    public void verifyAddToCart(){
        obj.getMarketplacePage().addToCart();

    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
