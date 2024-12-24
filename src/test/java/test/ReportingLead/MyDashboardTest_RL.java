package test.ReportingLead;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.MyDashboardPage;

public class MyDashboardTest_RL extends BaseTest {

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Basic_self_details_TC_012_RL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();

		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("RL"));
		interact.executeWithDelay(() -> mdp.clickMyDashboardTab());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Associate_clients_TC_013_RL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Basic_self_details_TC_012_RL();
		Assert.assertEquals(mdp.associatedClients_RL(), "Associated Clients");
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Timesheet_statistics_TC_014_RL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Basic_self_details_TC_012_RL();
		Assert.assertEquals(mdp.timesheetStatistics(), "Timesheet Statistics");
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Filter_Operation_TC_015_RL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		Basic_self_details_TC_012_RL();
		interact.executeWithDelay(() -> mdp.requestFilter());
		interact.executeWithDelay(() -> mdp.chooseRequest());
		interact.executeWithDelay(() -> mdp.resetFilter());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Filter_Operation_using_year_dropdown_TC_016_RL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		Basic_self_details_TC_012_RL();
		interact.executeWithDelay(() -> mdp.clickFinancialYearDiv());
		interact.executeWithDelay(() -> mdp.selectFinancialYear());
		interact.executeWithDelay(() -> mdp.requestFilter());
		interact.executeWithDelay(() -> mdp.chooseRequestAfterYear());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Request_Lead_change_TC_283_RL() {
		Basic_self_details_TC_012_RL();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> mdp.clickLeadChange());
		interact.executeWithDelay(() -> mdp.clickUserLead());
		interact.executeWithDelay(() -> mdp.selectLead());
		interact.executeWithDelay(() -> mdp.selectReasonDiv());
		interact.executeWithDelay(() -> mdp.chooseReason());
		interact.executeWithDelay(() -> mdp.cancelLeadChange());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Task_Expired_Icon_TC_286_RL() {
		Basic_self_details_TC_012_RL();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> mdp.taskExpired());
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Increase_Hour_Request_TC_287_RL() {
		Basic_self_details_TC_012_RL();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> mdp.hourRequest());
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Only_active_Employee_visible_in_Lead_change_TC_284_RL() {
		Basic_self_details_TC_012_RL();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> mdp.clickLeadChange());
		interact.executeWithDelay(() -> mdp.clickUserLead());
		interact.executeWithDelay(() -> mdp.selectLead());
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Verify_Timesheet_Count_TC_163_RL() {
		Basic_self_details_TC_012_RL();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		try {
			Thread.sleep(4000);
			Assert.assertEquals(mdp.VerifyDraftsTimesheet(), "0");
			Assert.assertEquals(mdp.VerifySubmittedTimesheet(), "7");
			Assert.assertEquals(mdp.VerifyPartiallySubmittedTimesheet(), "1");
			Assert.assertEquals(mdp.VerifyApprovedTimesheet(), "4");
			Assert.assertEquals(mdp.VerifyPartiallyApprovedTimesheet(), "0");
			Assert.assertEquals(mdp.VerifyRejectedTimesheet(), "2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Request_Lead_change_One_Time_TC_285_RL() {
		Basic_self_details_TC_012_RL();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);

//		interact.executeWithDelay(()-> mdp.clickLeadChange());
//		interact.executeWithDelay(()-> mdp.clickUserLead());
//		interact.executeWithDelay(()-> mdp.selectLead());
//		interact.executeWithDelay(()-> mdp.selectReasonDiv());
//		interact.executeWithDelay(()-> mdp.chooseReason());
//		interact.executeWithDelay(()-> mdp.cancelLeadChange());
		interact.executeWithDelay(() -> mdp.checkLeadChangeIcon());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
