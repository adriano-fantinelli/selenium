package tests;

import io.qameta.allure.*;
import static org.junit.Assert.*;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import utils.Browser;

@Feature("Login")
public class LoginTest extends BaseTest{

    @Test
    @Story("Login Successfully")
    public void testLoginSuccessfully() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        System.out.println("Click on Sign in button");
        homePage.clickBtnLogin();

        System.out.println("Login");
        loginPage.doLogin("novoemailteste@gmail.com", "teste123");

        System.out.println("assertEquals: " + myAccountPage.txtTitlePage() + " - " + "MY ACCOUNT");
        assertEquals(myAccountPage.txtTitlePage(), "MY ACCOUNT");

        System.out.println("Logout");
        myAccountPage.clickLogout();
    }

    @Test
    @Story("Login without success, with an incorrect email")
    public void testLoginWithoutSuccessIncorrectEmail() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        System.out.println("Login");
        loginPage.doLogin("emailinvalido@gmail.com", "teste123");

        System.out.println("assertEquals: " + loginPage.txtAlertError() + " - " + "Authentication failed.");
        assertEquals(loginPage.txtAlertError(), "Authentication failed.");
    }

    @Test
    @Story("Login without success, with an incorrect password")
    public void testLoginWithoutSuccessIncorrectPassword() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        System.out.println("Login");
        loginPage.doLogin("novoemailteste@gmail.com", "invalidPassword");

        System.out.println("assertEquals: " + loginPage.txtAlertError() + " - " + "Authentication failed.");
        assertEquals(loginPage.txtAlertError(), "Authentication failed.");
    }

    @Test
    @Story("Login without success, blank email")
    public void testLoginWithoutSuccessBlankEmail() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        System.out.println("Login");
        loginPage.doLogin("", "teste123");

        System.out.println("assertEquals: " + loginPage.txtAlertError() + " - " + "An email address required.");
        assertEquals(loginPage.txtAlertError(), "An email address required.");
    }

    @Test
    @Story("Login without success, blank password")
    public void testLoginWithoutSuccessBlankPassword() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);

        System.out.println("Login");
        loginPage.doLogin("novoemailteste@gmail.com", "");

        System.out.println("assertEquals: " + loginPage.txtAlertError() + " - " + "Password is required.");
        assertEquals(loginPage.txtAlertError(), "Password is required.");
    }
}