package pageObjects;

import org.openqa.selenium.By;
import utils.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Browser {

    public static boolean waitElement(String type, String locator) {
        if ("id".equals(type)) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
            return true;
        } else if ("xpath".equals(type)) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return true;
        } else if ("className".equals(type)) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
            return true;
        } else if ("cssSelector".equals(type)) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
            return true;
        } else if ("linkText".equals(type)) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator)));
            return true;
        }
        return false;
    }

}
