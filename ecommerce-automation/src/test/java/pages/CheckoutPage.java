package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CheckoutPage {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDetails(String f, String l, String p) {
        firstName.sendKeys(f);
        lastName.sendKeys(l);
        postalCode.sendKeys(p);
        continueBtn.click();
    }
}
