package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Browser;
import utils.Utils;

public class BaseTest extends Browser {

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get(Utils.getBaseUrl());
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
