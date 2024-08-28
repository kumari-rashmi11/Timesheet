package Timesheet_Test;

import pages.RoleSelectionPage;
import pages.TimesheetDashboardpage;
import org.testng.annotations.Test;


public class TimesheetDashboardTest extends BaseTest {

    @Test
    public void testTimesheetDashboard() {

        // Perform login using the login method from BaseTest
        login();

        // Role Selection
        RoleSelectionPage roleSelectionPage = new RoleSelectionPage(driver);
        roleSelectionPage.switchToIframe();
        roleSelectionPage.selectHRRole();

        // Navigate to Timesheet Dashboard
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
        dashboard.navigateToDashboard();
        dashboard.toggleBetweenThisMonthAndThisWeek();
        dashboard.testNotificationIcon();
        


   
    }
}

