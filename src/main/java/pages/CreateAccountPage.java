package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class CreateAccountPage extends AbstractObjectPage {

    @FindBy(xpath = "/html/body/div/form/div/h4/a")
    private WebElement createAccount;

    @FindBy (id = "username")
    private WebElement createUsername;

    @FindBy (id = "password")
    private WebElement createPassword;

    @FindBy (id = "passwordConfirm")
    private WebElement confirmPassword;

    @FindBy (xpath = "//*[@id=\"userForm\"]/button")
    private WebElement submit;

    @FindBy (xpath = "/html/body/div/h2/a")
    private WebElement logoutAfterRegistration;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccount() {
     //   WaitUtils.waitForJS(driver);
        createAccount.click();
    }

    public void enterNewUsername() {
        createUsername.sendKeys("Testasas");
    }

    public void enterNewPassword() {
        createPassword.sendKeys("abcd123456");
    }

    public void confirmPassword() {
        confirmPassword.sendKeys("abcd123456");
    }

    public void submitRegistration() {
        submit.click();
    }

    public void clickLogoutAfterRegistration() {
        logoutAfterRegistration.click();
    }
}
