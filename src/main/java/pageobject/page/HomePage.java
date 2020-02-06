package pageobject.page;

import io.qameta.allure.Step;
import pageobject.base.BasePage;

public class HomePage extends BasePage {

    @Step("Step login")
    public LoginPage openSignInPage() {
        return header.clickSignIn();
    }
}
