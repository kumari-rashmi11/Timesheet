package test.PracticeLead;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TimesheetSettingPage;

public class TimesheetSettingTest_PL extends BaseTest {
	public void initialTest() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);

		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();

		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("PL"));
		interact.executeWithDelay(() -> ts.clickTimesheetSetting_PL());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Add_new_timesheet_setting_TC_046_PL() {
		Interactions interact = new Interactions(driver);
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		initialTest();

		Assert.assertEquals(ts.isTimesheetSettingPage(), "Project Timesheet");
		interact.executeWithDelay(() -> ts.addEmployees());
		Assert.assertEquals(ts.isAddEmployeePage(), "Timesheet Setting");
		interact.executeWithDelay(() -> ts.employeeName());
		interact.executeWithDelay(() -> ts.selectClientType());
		interact.executeWithDelay(() -> ts.location());
		interact.executeWithDelay(() -> ts.addNotes());
		interact.executeWithDelay(() -> ts.SaveInfo());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Modify_timesheet_setting_TC_047_PL() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.newEmployee());
		interact.executeWithDelay(() -> ts.editNewEmployeeBtn());
		interact.executeWithDelay(() -> ts.editNewEmployeeLocation());
		interact.executeWithDelay(() -> ts.selectEditedLocation());
		interact.executeWithDelay(() -> ts.SaveInfo());
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Delete_timesheet_setting_TC_048_PL() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.selectEmployee());
		interact.executeWithDelay(() -> ts.deleteNewEmployee());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_employee_TC_049_PL() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.searchEmployee());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_client_TC_050_PL() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.searchClient());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_refresh_TC_051_PL() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);

		initialTest();

		interact.executeWithDelay(() -> ts.searchClient());
		interact.executeWithDelay(() -> ts.refreshEmployeelist());
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Active_employee_visibility_TC_277_PL() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ts.addEmployees());
		interact.executeWithDelay(() -> ts.employeeName());

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
