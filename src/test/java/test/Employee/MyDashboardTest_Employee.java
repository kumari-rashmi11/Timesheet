package test.Employee;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.MyDashboardPage;

public class MyDashboardTest_Employee extends BaseTest {

	public void intialTest() {
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);

		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();

		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Employee"));
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Verify_Timesheet_Count_TC_163_Employee() {
		intialTest();
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
			e.printStackTrace();
		}
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Request_Lead_change_TC_283_Employee() {
		intialTest();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> mdp.clickLeadChange_Employee());
		interact.executeWithDelay(() -> mdp.clickUserLead_Employee());
		interact.executeWithDelay(() -> mdp.selectLead());
		interact.executeWithDelay(() -> mdp.selectReasonDiv_Employee());
		interact.executeWithDelay(() -> mdp.chooseReason_Employee());
		interact.executeWithDelay(() -> mdp.cancelLeadChange_Employee());
//		interact.executeWithDelay(()-> mdp.submitLeadChange_Employee());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Task_Expired_Icon_TC_286_Employee() {
		intialTest();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> mdp.taskExpired_Employee());
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Increase_Hour_Request_TC_287_Employee() {
		intialTest();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> mdp.hourRequest_Employee());
		interact.executeWithDelay(() -> mdp.cancelHourRequest_Employee());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Only_active_Employee_visible_in_Lead_change_TC_284_Employee() {
		intialTest();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> mdp.clickLeadChange_Employee());
		interact.executeWithDelay(() -> mdp.clickUserLead_Employee());
		interact.executeWithDelay(() -> mdp.selectLead());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Request_Lead_change_One_Time_TC_285_Employee() {
		intialTest();
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);

//		interact.executeWithDelay(()-> mdp.clickLeadChange_Employee());
//		interact.executeWithDelay(()-> mdp.clickUserLead());
//		interact.executeWithDelay(()-> mdp.selectLead());
//		interact.executeWithDelay(()-> mdp.selectReasonDiv());
//		interact.executeWithDelay(()-> mdp.chooseReason());
//		interact.executeWithDelay(()-> mdp.cancelLeadChange());
		interact.executeWithDelay(() -> mdp.checkLeadChangeIcon_Employee());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
