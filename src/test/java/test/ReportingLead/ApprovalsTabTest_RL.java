package test.ReportingLead;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ApprovalsTab;

public class ApprovalsTabTest_RL extends BaseTest {
	private ApprovalsTab approvalTab;
	private Interactions interactions;

	@BeforeMethod
	public void setUp() {
		approvalTab = new ApprovalsTab(driver);
		interactions = new Interactions(driver);
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)

	public void initiaTest() {
		RoleSelection roleSelection = new RoleSelection(driver);
		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();
		interactions.executeWithDelay(() -> roleSelection.iframeSwitch1());
		interactions.executeWithDelay(() -> roleSelection.iframeSwitch2());
		interactions.executeWithDelay(() -> roleSelection.selectRLRole());
		approvalTab.selectapprovaltab_Rl();
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_066_searchtimesheetbyDate_RL() throws InterruptedException {
		initiaTest();

		approvalTab.searchprojectbydate();
	}

	@Test(priority = 3)
	public void TC_067_searchtimesheetbyStatus_RL() throws InterruptedException {
		initiaTest();

		approvalTab.searchprojectbystatus();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_068_searchtimesheetbyReportee_RL() throws InterruptedException {
		initiaTest();
		approvalTab.searchprojectreportee();

	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_069_refresh_RL() throws InterruptedException {
		initiaTest();
		approvalTab.reset();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_070_approveTimesheet_RL() throws InterruptedException {
		initiaTest();
		approvalTab.approve_timesheet();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_071_rejectTimesheet_RL() throws InterruptedException {
		initiaTest();
		approvalTab.reject_timesheet();
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC_072_holidayMarking_RL() throws InterruptedException {
		initiaTest();
		approvalTab.holiday_marking();
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC_138_partiallyApproved_RL() throws InterruptedException {
		initiaTest();
		approvalTab.approved_partially();
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC_147_fyFilter_RL() throws InterruptedException {
		initiaTest();
		approvalTab.fy_filter();
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC_299_visibilityofReportee_RL() throws InterruptedException {
		initiaTest();
		approvalTab.visibility_reportees();
	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC_300_approvedTimesheet_With_Reportees_RL() throws InterruptedException {
		initiaTest();
		approvalTab.approve_timesheet_with_reportee();
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void TC_301_rejectTimesheet_With_Reportee_RL() throws InterruptedException {
		initiaTest();
//approvalTab.reject_timesheet_with_reportee();
	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void TC_354_notResetting_RL() throws InterruptedException {
		initiaTest();
		approvalTab.not_resetted();
	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void TC_146_dataVisibility_RL() throws InterruptedException {
		initiaTest();
		approvalTab.data_visibility();

	}

}
