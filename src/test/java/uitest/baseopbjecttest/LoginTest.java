package uitest.baseopbjecttest;

import io.qameta.allure.*;
import listener.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobject.page.HomePage;
import pageobject.page.LoginPage;
import pageobject.service.LoginService;

import java.util.concurrent.TimeUnit;

import static webdriver.WebDriverService.getDriver;

@Listeners({TestListener.class})
@Epic("UI")
@Feature("Login")
public class LoginTest {

    @BeforeMethod
    public void setUp() {
        getDriver().get("http://automationpractice.com");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test (priority = 1, description="12345234324324")
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
