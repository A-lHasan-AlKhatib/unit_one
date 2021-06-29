package qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import qa.model.Driver;
import qa.model.IndexLocators;

public class ChangeViewedListTest {
    private static ChromeDriver driver;

    //Call the chrome driver and set the base url
    @BeforeSuite
    public static void startDriver() {
        driver = Driver.getInstance();

    }

    // check if the popular btn is active
    @Test(priority = 1)
    public static void isPopularActive() {
        String before = driver.findElement(By.xpath(IndexLocators.POPULAR_BTN_IS_ACTIVE)).getAttribute("class");
        Assert.assertEquals(before, "active");
    }

    //click the best seller btn
    @Test(priority = 2)
    public static void clickBestSeller() {
        driver.findElement(By.xpath(IndexLocators.BEST_SELLERS_BTN)).click();
    }

    // check if the best seller btn is active
    @Test(priority = 3)
    public static void isBestSellerActive() {
        String after = driver.findElement(By.xpath(IndexLocators.BEST_SELLER_BTN_IS_ACTIVE)).getAttribute("class");
        Assert.assertEquals(after, "active");
    }

    //    Close the chrome driver after all the steps are done
    @AfterSuite
    public static void closeDriver() {
        driver.close();
    }
}
