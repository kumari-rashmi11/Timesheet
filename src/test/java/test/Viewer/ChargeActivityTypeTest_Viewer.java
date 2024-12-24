package test.Viewer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ChargeActivityTypePage;

public class ChargeActivityTypeTest_Viewer extends BaseTest {

	public void initialTest() {
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);

		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();

		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Viewer"));
		interact.executeWithDelay(() -> cat.clickChargeActivityType_Viewer());
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_charge_code_Viewer_TC_037() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_charge_code());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_refresh_using_charge_code_Viewer_TC_038() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_charge_code());
		interact.executeWithDelay(() -> cat.refresh_icon());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_project_Name_Viewer_TC_039() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_project_Name());
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Search_operation_Viewer_TC_040() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_Activity_Type());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
