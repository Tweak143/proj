package junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.testng.annotations.Test;

@Execution(ExecutionMode.CONCURRENT)
public class TestClassJUnit {

    @Test(enabled = false)
    public void firstTest() {
        Assertions.assertAll(() -> Assertions.assertEquals(1, 2),
                () -> Assertions.assertTrue(false),
                () -> Assertions.assertEquals(1, 1)
        );
//        Assertions.assertTrue(false);
    }
}
