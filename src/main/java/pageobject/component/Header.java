package pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.page.LoginPage;
import webdriver.WebDriverService;

public class Header {

    private WebDriver driver;
    private static final By LOGO_BY = By.cssSelector("[alt='My Store']");
    private static final By SIGN_IN_BUTTON_BY = By.cssSelector("[title='Log in to your customer account']");

    public Header() {
        driver = WebDriverService.getDriver();
    }

    public void clickLogo() {
        driver.findElement(LOGO_BY).click();
    }

    public LoginPage clickSignIn() {
        driver.findElement(SIGN_IN_BUTTON_BY).click();
        return new LoginPage();
    }
}
