package fortest;

import data.DataProviderForTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginApiTest {

    @Test(dataProvider = "getData", dataProviderClass = DataProviderForTest.class, enabled = true, groups = {"Group1", "Group2"})
    public void possitiveLoginTest(String smth, int i) {
        SoftAssert softAssert = new SoftAssert();
//        Assert.assertEquals(smth, "123");
//        Assert.assertEquals(i, 123);
        softAssert.assertEquals(smth, "123");
        softAssert.assertEquals(i, 123);
        softAssert.assertAll();
    }

    public void cleanUp() {
        System.out.println("Bye");
    }
}
