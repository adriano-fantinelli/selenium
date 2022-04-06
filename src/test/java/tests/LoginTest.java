package test.java.tests;

import io.qameta.allure.*;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.pageObject.HomePage;
import test.java.pageObject.LoginPage;
import test.java.pageObject.MyAccountPage;
import test.java.utils.Browser;

import static org.testng.Assert.assertEquals;
import static test.java.controller.LoginController.*;

@Feature("Login")
public class LoginTest extends BaseTest {
    @DataProvider(name = "invalidData")
    public Object[][] invalidData() {
        return new Object[][]{
                {invalidEmail(), validPassword(), authenticationFailed()},
                {validEmail(), invalidPassword(), authenticationFailed()},
                {invalidEmail(), invalidPassword(), authenticationFailed()},
                {validEmail(), blank(), passwordIsRequired()},
                {blank(), validPassword(), emailRequired()},
                {blank(), blank(), emailRequired()}
        };
    }

    @Test
    @Story("Login Successfully")
    public void loginSuccessfully() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        homePage.clickBtnLogin();
        loginPage.doLogin(validEmail(), validPassword());

        assertEquals(myAccountPage.txtTitlePage(), myAccount());

        myAccountPage.clickLogout();
    }

    @Test(dataProvider = "invalidData")
    @Story("Login with invalid data")
    public void loginWithInvalidData(String email, String password, String message) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        homePage.clickBtnLogin();
        loginPage.doLogin(email, password);

        assertEquals(loginPage.txtAlertError(), message);
    }
}