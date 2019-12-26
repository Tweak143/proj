package data;

import org.testng.annotations.DataProvider;

public class DataProviderForTest {

    @DataProvider(parallel = true)
    public Object[][] getData() {
        return new Object[][] {
                {"123", 123},
                {"123", 1423},
                {"String16", 1234},
                {"String189", 123}
        };
    }
}
