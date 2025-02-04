package test.PracticeLead;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.EmployeeTabDataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EmployeesPage;

public class EmployeesTest_PL extends BaseTest {
	public void initialTest() {

		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
//
//		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//		nt.clickTeamsBtn();
//		nt.clickTimesheetBtn();
//		nt.clickTimesheetLink();
//
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("PL"));
		interact.executeWithDelay(() -> ep.clickEmployeesTab());
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void details_of_employees_PL_TC017() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class, dataProvider = "searchemployee", dataProviderClass = EmployeeTabDataProvider.class)
	public void search_Operation_PL_TC019(String name) {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation(name));
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class, dataProvider = "searchemployee", dataProviderClass = EmployeeTabDataProvider.class)
	public void refresh_Operation_PL_TC020(String name) {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation(name));
		interact.executeWithDelay(() -> ep.clickRefreshBtn());
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void active_Employees_only_in_active_tab_PL_TC255() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.activeEmployees());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void inactive_Employees_only_in_inactive_tab_PL_TC256() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.inactiveEmployees());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Only_active_and_inactive_tab_visible_PL_TC276() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.inactiveEmployees());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void components_of_past_and_persent_lead_info_screen_PL_TC296() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickEyeIcon());
		Assert.assertEquals(ep.verifyLeadName(), "Lead Name");
		Assert.assertEquals(ep.verifyEffectiveFrom(), "Effective From");
		Assert.assertEquals(ep.verifyEndDate(), "End Date");
		Assert.assertEquals(ep.verifyRequestedBy(), "Requested By");
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void visibility_of_past_and_persent_lead_info_screen_PL_TC297() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickEyeIcon());
		Assert.assertEquals(ep.verifypastAndPresentInfo(), "Past and Present lead Info");
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void closing_past_and_persent_lead_info_screen_PL_TC298() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickEyeIcon());

		interact.executeWithDelay(() -> ep.clickCloseBtn());
	}
	
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
}