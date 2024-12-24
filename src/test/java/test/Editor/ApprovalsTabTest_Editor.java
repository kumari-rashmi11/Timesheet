package test.Editor;

import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ApprovalsTab;

public class ApprovalsTabTest_Editor extends BaseTest {
	private ApprovalsTab approvalTab;
	public Interactions interactions;

	public void setUp() {
		approvalTab = new ApprovalsTab(driver);
		interactions = new Interactions(driver);
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)

	public void initiaTest() {
		RoleSelection roleSelection = new RoleSelection(driver);
		roleSelection.iframeSwitch1();
		roleSelection.iframeSwitch2();
		roleSelection.selectRole("Editor");
		approvalTab.selectapprovaltab_Editor();
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_066_searchtimesheetbyDate_Editor() throws InterruptedException {
		initiaTest();

		approvalTab.searchprojectbydate();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_067_searchtimesheetbyStatus_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.searchprojectbystatus();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_068_searchtimesheetbyReportee_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.searchprojectreportee_hr_editor();

	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_069_refresh_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.reset_hr_editor();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_070_approveTimesheet_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.approve_timesheet_hr_editor();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_071_rejectTimesheet_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.reject_timesheet_hr_editor();
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC_146_dataVisibility_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.visibility_reportees_editor();

	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC_147_fyFilter_Editor() throws InterruptedException {
		initiaTest();
		approvalTab.fy_filter();
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC_138_partiallyApproved_Editor() throws InterruptedException {
		initiaTest();
		Thread.sleep(5000);
		approvalTab.approved_partially();
	}

}
