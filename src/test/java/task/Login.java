package task;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

@Test
public class Login extends BaseTest {

private LoginPage loginPage;

public void clickCreateAccount() {
    loginPage = new LoginPage(driver);
    loginPage.clickCreateAccount();
}

}
