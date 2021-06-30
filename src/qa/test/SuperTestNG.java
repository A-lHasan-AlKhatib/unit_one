package qa.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import qa.model.Driver;

public class SuperTestNG {
    protected static ChromeDriver driver;

    @BeforeSuite
    public static void startDriver() {
        Reporter.log("Call the chrome driver and set the base url");
        driver = Driver.getInstance();
    }


    @AfterSuite
    public static void closeDriver() {
        Reporter.log("Close the chrome driver after all the steps are done");
        driver.close();
    }
}
