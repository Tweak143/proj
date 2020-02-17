package forxml;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Epic123")
@Feature("Two")
public class ClassTwo {

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two", "three"})
    public void firstCTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two", "three"})
    public void secondCTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"two", "three"})
    public void thirdCTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two"})
    public void forthCTest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one"})
    public void fifthCTest() {
        Assert.assertTrue(true);
    }
}
