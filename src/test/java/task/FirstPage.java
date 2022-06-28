package task;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.LoginPage;


public class FirstPage extends BaseTest {

private LoginPage loginPage;
private CreateAccountPage createAccountPage;

@Test
public void login() {
    loginPage = new LoginPage(driver);
    loginPage.enterUsername();
    loginPage.enterPassword();
    loginPage.clickLogin();
    loginPage.clickLogout();
}

@Test
public void createAccount() {
    createAccountPage = new CreateAccountPage(driver);
    createAccountPage.clickCreateAccount();
    createAccountPage.enterNewUsername();
    createAccountPage.enterNewPassword();
    createAccountPage.confirmPassword();
    createAccountPage.submitRegistration();
    createAccountPage.clickLogoutAfterRegistration();
}


}
