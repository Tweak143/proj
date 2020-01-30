package pageobject.base;

import org.openqa.selenium.WebDriver;
import pageobject.component.Header;
import webdriver.WebDriverService;

public abstract class BasePage {

    protected static Header header;
    protected WebDriver driver;

    public BasePage() {
        driver = WebDriverService.getDriver();
        header = new Header();
    }
}
