package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CartPage {

    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckout() {
        checkoutBtn.click();
    }
}
