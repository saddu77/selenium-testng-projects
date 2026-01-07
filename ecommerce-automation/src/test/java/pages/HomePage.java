package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtn;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addProductToCart() {
        addToCartBtn.click();
    }

    public void openCart() {
        cartIcon.click();
    }
}
