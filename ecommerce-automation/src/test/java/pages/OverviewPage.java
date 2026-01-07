package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class OverviewPage {

    WebDriver driver;

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(className = "complete-header")
    WebElement confirmationMsg;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void finishOrder() {
        finishBtn.click();
    }

    public String getConfirmationMessage() {
        return confirmationMsg.getText();
    }
}
