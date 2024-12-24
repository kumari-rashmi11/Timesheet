package test.Viewer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ApprovalsTab;

public class ApprovalsTabTest_Viewer extends BaseTest {
	private ApprovalsTab approvalTab;
	public Interactions interactions;

	public void setUp() {
		approvalTab = new ApprovalsTab(driver);
		interactions = new Interactions(driver);
	}

	public void initiaTest() {
		RoleSelection roleSelection = new RoleSelection(driver);
		roleSelection.iframeSwitch1();
		roleSelection.iframeSwitch2();
		roleSelection.selectRole("Viewer");
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_066_searchtimesheetbyDate_Viewer() throws InterruptedException {

		initiaTest();
		approvalTab.selectapprovaltab_viewer();
		approvalTab.searchprojectbydate();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_067_searchtimesheetbyStatus_Viewer() throws InterruptedException {
		initiaTest();
		approvalTab.selectapprovaltab_viewer();
		approvalTab.searchprojectbystatus();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_068_searchtimesheetbyReportee_Viewer() throws InterruptedException {
		initiaTest();
		approvalTab.selectapprovaltab_viewer();

		approvalTab.searchprojectreportee_hr_editor();

	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_069_refresh_Viewer() throws InterruptedException {
		initiaTest();
		approvalTab.selectapprovaltab_viewer();

		approvalTab.reset_hr_editor();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_146_dataVisibility_Viewer() throws InterruptedException {
		initiaTest();
		approvalTab.selectapprovaltab_viewer();

		approvalTab.data_visibility();

	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_147_fyFilter_Viewer() throws InterruptedException {
		initiaTest();
		approvalTab.selectapprovaltab_viewer();
		approvalTab.fy_filter();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
