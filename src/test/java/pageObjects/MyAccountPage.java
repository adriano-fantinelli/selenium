package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(css = "h1.page-heading")
    public WebElement titlePage;

    @FindBy(className = "logout")
    public WebElement logout;

    public String txtTitlePage() {
        return titlePage.getText().trim();
    }

    public void clickLogout() {
        logout.click();
    }

}