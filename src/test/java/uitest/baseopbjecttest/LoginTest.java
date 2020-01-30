package uitest.baseopbjecttest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.page.HomePage;
import pageobject.page.LoginPage;
import pageobject.service.LoginService;
import webdriver.WebDriverService;

import java.util.concurrent.TimeUnit;

import static webdriver.WebDriverService.getDriver;

public class LoginTest {

    @BeforeMethod
    public void setUp() {
        getDriver().get("http://automationpractice.com");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void fakeLoginTest() {
        new HomePage().openSignInPage();
        LoginService loginService = new LoginService();
        loginService.login("login", "pass");
        Assert.assertEquals("There is 1 error\nInvalid email address.", new LoginPage().getAlertText());
    }

    @AfterMethod
    public void cleanUp() {
        getDriver().close();
    }
}
