package pageobject.page;

import pageobject.base.BasePage;

public class HomePage extends BasePage {

    public LoginPage openSignInPage() {
        return header.clickSignIn();
    }
}
