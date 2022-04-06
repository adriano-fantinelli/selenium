package test.java.pageObject;

import org.openqa.selenium.By;
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

    public WebElement tShirts() {
        return driver.findElement(By.linkText("T-SHIRTS"));
    }

    public void clickTShirts() {
        tShirts().click();
    }

}