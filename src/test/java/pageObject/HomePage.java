package test.java.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "login")
    public WebElement login;


    public void clickBtnLogin() {
        login.click();
    }
}
