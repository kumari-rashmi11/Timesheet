package test;

import org.testng.annotations.Test;

import helper.BaseTest;
import pages.RoleSelectionPage;

public class RoleSelectionTest extends BaseTest {

    @Test
    public void testRoleSelection() {

        RoleSelectionPage roleSelectionPage = new RoleSelectionPage(driver);
        roleSelectionPage.switchToIframe();
        // Select the desired role
        roleSelectionPage.selectRLRole();
    }
}