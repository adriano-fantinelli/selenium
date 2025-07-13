package test.java.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.pageObject.HomePage;
import test.java.pageObject.LoginPage;
import test.java.pageObject.MyAccountPage;
import test.java.utils.Browser;

import static org.testng.Assert.assertEquals;
import static test.java.controller.LoginController.*;

@Feature("Purchase")
public class PurchaseTest extends BaseTest {
    @Test
    @Story("Successful purchase")
    public void successfulPurchase() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        homePage.clickBtnLogin();
        loginPage.doLogin(validEmail(), validPassword());
        myAccountPage.clickWomensSection();

    }
}