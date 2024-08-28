package Timesheet_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        login();
        Assert.assertEquals(driver.getTitle(), "Timesheet - Power Apps");
    }
}
