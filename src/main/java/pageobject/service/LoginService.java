package pageobject.service;

import pageobject.page.HomePage;
import pageobject.page.LoginPage;

public class LoginService {

    public HomePage login(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail(login);
        loginPage.enterPassword(password);
        return loginPage.singIn();
    }
}
