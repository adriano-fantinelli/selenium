package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.BaseTest;

public class CategoryPage extends BasePage {


    @FindBy(css = "a[title=\"Add to cart\"]")
    public WebElement addToCartFirstProduct;

    public void clickAddToCartFirstProduct() {
        addToCartFirstProduct.click();
    }
}
