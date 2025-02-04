package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TimesheetSettingPage;

public class TimesheetSettingTest_HR extends BaseTest {
	public void initialTest() throws InterruptedException {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
		roleSelectionPage.timesheetNavigation(); 
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.HRRoleBtn();
		interact.executeWithDelay(() -> ts.clickTimesheetSetting());
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_employee_TC_049_HR() throws InterruptedException {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.searchEmployee());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_client_TC_050_HR() throws InterruptedException {
		TimesheetSettingPage ts = new TimesheetSettingPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ts.searchClient());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_refresh_TC_051_HR() throws InterruptedException {
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