package test.PracticeLead;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.MyDashboardPage;

public class MyDashboardTest_PL extends BaseTest {

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Basic_self_details_TC_012_PL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);

		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();

		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("PL"));
		interact.executeWithDelay(() -> mdp.clickMyDashboardTab_PL());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Associate_clients_TC_013_PL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Basic_self_details_TC_012_PL();
		Assert.assertEquals(mdp.associatedClients_PL(), "Associated Clients");
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Timesheet_statistics_TC_014_PL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Basic_self_details_TC_012_PL();
		Assert.assertEquals(mdp.timesheetStatistics(), "Timesheet Statistics");
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Filter_Operation_TC_015_PL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		Basic_self_details_TC_012_PL();
		interact.executeWithDelay(() -> mdp.requestFilter_PL());
		interact.executeWithDelay(() -> mdp.chooseRequest());
		interact.executeWithDelay(() -> mdp.resetFilter_PL());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Filter_Operation_using_year_dropdown_TC_016_PL() {
		MyDashboardPage mdp = new MyDashboardPage(driver);
		Interactions interact = new Interactions(driver);
		Basic_self_details_TC_012_PL();
		interact.executeWithDelay(() -> mdp.clickFinancialYearDiv());
		interact.executeWithDelay(() -> mdp.selectFinancialYear());
		interact.executeWithDelay(() -> mdp.requestFilter_PL());
		interact.executeWithDelay(() -> mdp.chooseRequest_PL());
		interact.executeWithDelay(() -> mdp.resetFilter_PL());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Verify_Timesheet_Count_TC_163_PL() {
		Basic_self_details_TC_012_PL();
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

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
