package qa.test;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.*;
import qa.model.IndexLocators;

public class ChangeViewedListTest extends SuperTestNG {

    @Test(priority = 1)
    public static void isPopularActive() {
        Reporter.log("check if the popular btn is active");
        String before = driver.findElement(By.xpath(IndexLocators.POPULAR_BTN_IS_ACTIVE)).getAttribute("class");
        Assert.assertEquals(before, "active");
    }

    @Test(priority = 2)
    public static void clickBestSeller() {
        Reporter.log("click the best seller btn");
        driver.findElement(By.xpath(IndexLocators.BEST_SELLERS_BTN)).click();
    }

    @Test(priority = 3)
    public static void isBestSellerActive() {
        Reporter.log("check if the best seller btn is active");
        String after = driver.findElement(By.xpath(IndexLocators.BEST_SELLER_BTN_IS_ACTIVE)).getAttribute("class");
        Assert.assertEquals(after, "active");
    }
}
