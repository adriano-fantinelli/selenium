package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.CategoryPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utils.Browser;

@Feature("Make an order")
public class OrderTest extends BaseTest {

    @Test
    @Story("Make an order successfully")
    public void testMakeOrderSuccesfully() throws InterruptedException {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        CategoryPage categoryPage = new CategoryPage();

        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);
        PageFactory.initElements(Browser.getCurrentDriver(), categoryPage);

        homePage.clickBtnLogin();
        loginPage.doLogin("novoemailteste@gmail.com", "teste123");

        System.out.println("Click on T-SHIRTS");
        myAccountPage.clickTShirts();

        Thread.sleep(3000);

        System.out.println("Add to cart first product");
        categoryPage.clickAddToCartFirstProduct();


    }
}
