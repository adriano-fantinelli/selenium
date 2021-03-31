package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement fieldEmail;

    @FindBy(id = "passwd")
    public WebElement fieldPasswd;

    @FindBy(id = "SubmitLogin")
    public WebElement submitLogin;

    @FindBy(css = ".alert-danger > ol > li")
    public WebElement alertError;

    public void fillFieldEmail(String email) {
        fieldEmail.clear();
        fieldEmail.sendKeys(email);
    }

    public void fillFieldPasswd(String passwd) {
        fieldPasswd.clear();
        fieldPasswd.sendKeys(passwd);
    }

    public void clickSubmitLogin() {
        submitLogin.click();
    }

    public void doLogin(String email, String passwd) {
        fillFieldEmail(email);
        fillFieldPasswd(passwd);
        clickSubmitLogin();
    }

    public String txtAlertError() {
        return alertError.getText().trim();
    }
}