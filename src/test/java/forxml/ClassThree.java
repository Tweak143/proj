package forxml;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Epic1234")
@Feature("Three")
public class ClassThree {

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two", "three"})
    public void firstBTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two", "three"})
    public void secondBTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"two", "three"})
    public void thirdBTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two"})
    public void forthBTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one"})
    public void fifthBTest() {
        Assert.assertTrue(true);
    }
}
