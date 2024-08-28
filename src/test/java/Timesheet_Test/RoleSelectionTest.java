package Timesheet_Test;

import org.testng.annotations.Test;
import pages.RoleSelectionPage;

public class RoleSelectionTest extends BaseTest {

    @Test
    public void testRoleSelection() {
        login(); // Perform login first

        RoleSelectionPage roleSelectionPage = new RoleSelectionPage(driver);
        roleSelectionPage.switchToIframe();

        // Select the desired role (e.g., RL role)
        roleSelectionPage.selectHRRole();
    }
}