package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TimesheetSettingPage;

public class TimesheetSettingTest_HR extends BaseTest {
	public void initialTest() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("HR"));
		interact.executeWithDelay(() -> ts.clickTimesheetSetting_HR());
	}	

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_employee_TC_049_HR() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.searchEmployee());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_client_TC_050_HR() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.searchClient());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_refresh_TC_051_HR() {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);

		initialTest();

		interact.executeWithDelay(() -> ts.searchClient());
		interact.executeWithDelay(() -> ts.refreshEmployeelist());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
