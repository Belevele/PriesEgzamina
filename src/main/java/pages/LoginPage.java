package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (name = "username")
    private WebElement username;

    @FindBy (name = "password")
    private WebElement password;

    @FindBy (xpath = "/html/body/div/form/div/button")
    private WebElement login;

    @FindBy (xpath = "/html/body/div/h2/a")
    private WebElement logout;



    public void enterUsername() {
        username.sendKeys("ruta999");
    }

    public void enterPassword() {
        password.sendKeys("rutaruta");
    }

    public void clickLogin() {
        login.click();
    }

    public void clickLogout() {
        logout.click();
    }


}
