package test.java.utils;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;


    public static WebDriver getCurrentDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 30);
            maximizeBrowser();
            setPageLoadTimeout();
        }
        return driver;
    }

    public static void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public static void setPageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public static void loadPage(String url) {
        getCurrentDriver().get(url);
    }

    public static String getUrl() {
        return getCurrentDriver().getCurrentUrl();
    }

    public static void close() {
        try {
            getCurrentDriver().quit();
            driver = null;
        } catch (UnreachableBrowserException e) {
        }
    }
}