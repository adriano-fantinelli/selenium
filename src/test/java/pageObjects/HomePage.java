package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Browser;

public class HomePage extends BasePage {

    @FindBy(className = "login")
    public WebElement login;
    public String TITLETShirt = "T-SHIRTS";

    public WebElement tShirt() {
        return driver.findElement(By.linkText(TITLETShirt));
    }

    public void clickTShirt() {
        tShirt().click();
    }

    public void clickBtnLogin() {
        driver.findElement(By.className("login")).click();
    }

}
