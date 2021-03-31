package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public static void setPageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
