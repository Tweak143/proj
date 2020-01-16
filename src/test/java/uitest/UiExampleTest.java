package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UiExampleTest {

    @Test
    public void uiTest() {
//        WebDriver driver = new RemoteWebDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
                .pageLoadTimeout(10, TimeUnit.SECONDS)
                .setScriptTimeout(10, TimeUnit.SECONDS);
//        driver.navigate().refresh();
        driver.findElement(By.className("logo img-responsive"));
        driver.findElement(By.cssSelector("[id*='logo']"));
        driver.findElement(By.xpath("//div[@id='header_logo']//img[contains(@class,'img')]"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
