package pageobject.service;

import io.qameta.allure.Step;
import pageobject.page.HomePage;
import pageobject.page.LoginPage;

public class LoginService {

    @Step("Step2")
    public HomePage login(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail(login);
        loginPage.enterPassword(password);
        return loginPage.singIn();
    }
}
