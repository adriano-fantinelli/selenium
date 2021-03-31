package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Browser;

public class HomePage extends BasePage {

    @FindBy(className = "login")
    public WebElement login;


    public void clickBtnLogin() {
        login.click();
    }

}
