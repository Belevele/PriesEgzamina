package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/form/div/a")
    private WebElement createAccount;

    public void clickCreateAccount() {
        createAccount.click();
    }
}
