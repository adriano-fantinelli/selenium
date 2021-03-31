package tests;

import org.junit.Test;
import pageObjects.HomePage;


public class LoginTest extends BaseTest{

    @Test
    public void loginSuccessfully(){
        HomePage homePage = new HomePage();

        homePage.clickBtnLogin();

    }

}
