package uitest;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UiExampleTest {

    @Test
    public void uiTest() {
//        WebDriver driver = new RemoteWebDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
//        driver.navigate().refresh();
//        WebElement element = driver.findElement(By.className("logo"));
//        element.click();
//        WebElement elementField = driver.findElement(By.cssSelector(".search_query"));
//        boolean bool = elementField.isDisplayed();
//        elementField.sendKeys("t-shirt");
//        elementField.clear();
//        elementField.sendKeys("t-shirt123");
//        String text = elementField.getText();
//        elementField.click();
//        elementField.submit();
//        driver.findElement(By.xpath("//div[@id='header_logo']//img[contains(@class,'img')]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.cssSelector(".replace-2x"))).build().perform();
        driver.findElement(By.cssSelector("[title='Women']")).click();
        Select select = new Select(driver.findElement(By.id("selectProductSort")));
        select.selectByValue("price:asc");
//        new WebDriverWait(driver, 10, 200)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#asdfsfw987rwdskjs")));
        new WebDriverWait(driver, 3).until(new ExpectedCondition<Boolean>() {
            @Nullable
            @Override
            public Boolean apply(@Nullable WebDriver webDriver) {
                return webDriver.findElement(By.cssSelector(".xxxxxxxxxx")).isDisplayed();
            }
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
