package pageobject.page;

import org.openqa.selenium.By;
import pageobject.base.BasePage;

public class LoginPage extends BasePage {

    private static final By titleBy = By.cssSelector(".page-heading");
    private static final By createAccountButtonBy = By.id("SubmitCreate");
    private static final By EMAIL_FIELD_BY = By.id("email234234324324");
    private static final By PASSWORD_FIELD_BY = By.id("passwd");
    private static final By SIGN_IN_BUTTON_BY = By.id("SubmitLogin");
    private static final By ALERT_BY = By.cssSelector(".alert-danger");

    public String getTitleText() {
        return driver.findElement(titleBy).getText();
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButtonBy).click();
    }

    public String getCreateAccountButtonText() {
        return driver.findElement(createAccountButtonBy).getText();
    }

    public void sdf() {
        header.clickLogo();
    }

    public void enterEmail(String email) {
        driver.findElement(EMAIL_FIELD_BY).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(PASSWORD_FIELD_BY).sendKeys(password);
    }

    public HomePage singIn() {
        driver.findElement(SIGN_IN_BUTTON_BY).click();
        return new HomePage();
    }

    public String getAlertText() {
        return driver.findElement(ALERT_BY).getText();
    }
}
