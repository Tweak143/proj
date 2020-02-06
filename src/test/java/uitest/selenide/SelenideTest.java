package uitest.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @BeforeMethod
    public void setUp() {
        baseUrl = "http://automationpractice.com";
        browser = "chrome";
        headless = false;
        browserSize = "1024x768";
    }

    @Test
    public void selenideTest() {
        open("/");
        $("[alt='My Store']").should(Condition.appear).click();
        closeWebDriver();
    }
}
