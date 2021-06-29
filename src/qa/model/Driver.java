package qa.model;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static final String BASE_URL = "http://automationpractice.com/index.php";
    public static final String SYSTEM_ATTR = "webdriver.chrome.driver";
    public static final String DRIVER_PATH = "C:\\Users\\playh\\WebDrivers\\chromedriver_win32\\chromedriver.exe";
    private static ChromeDriver instance;

    public static ChromeDriver getInstance() {
        if (instance == null) {
            System.setProperty(SYSTEM_ATTR, DRIVER_PATH);
            instance = new ChromeDriver();
        }
        instance.get(BASE_URL);
        return instance;
    }
}