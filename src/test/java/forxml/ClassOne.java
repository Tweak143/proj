package forxml;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Epic123")
@Feature("One")
public class ClassOne {

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two", "three"})
    public void firstATest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two", "three"})
    public void secondATest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"two", "three"})
    public void thirdATest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one", "two"})
    public void forthATest() {
        Assert.assertTrue(true);
    }

    @Description("bla-bla-bla")
    @Story("storyyyyy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"one"})
    public void fifthATest() {
        Assert.assertTrue(true);
    }
}
