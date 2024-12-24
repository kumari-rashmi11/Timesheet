package test.Editor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ChargeActivityTypePage;

public class ChargeActivityTypeTest_Editor extends BaseTest {
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
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Editor"));
		interact.executeWithDelay(() -> cat.clickChargeActivityType_Editor());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_charge_code_Editor_TC_037() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_charge_code());
	}
	
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_refresh_using_charge_code_Editor_TC_038() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_charge_code());
		interact.executeWithDelay(() -> cat.refresh_icon());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Search_using_project_Name_Editor_TC_039() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_project_Name());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Search_operation_Editor_TC_040() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_Activity_Type());
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void add_chargeActivityType_Editor_TC_034() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.clickAddBtn());
		interact.executeWithDelay(() -> cat.clickProjectName());
		interact.executeWithDelay(() -> cat.clickSelectProjectName());
		interact.executeWithDelay(() -> cat.clickchargeCodeMenu());
		interact.executeWithDelay(() -> cat.clickselectchargeCode());
		interact.executeWithDelay(() -> cat.clickactivityType());
		interact.executeWithDelay(() -> cat.clickselectactivityType());
		interact.executeWithDelay(() -> cat.clicktask());
		interact.executeWithDelay(() -> cat.clickselectTask());
		interact.executeWithDelay(() -> cat.clickaddChargeActivityTypeBtn());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void modify_chargeActivityType_Editor_TC_035() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.clickChargeCode());
		interact.executeWithDelay(() -> cat.clickEditIcon());
		interact.executeWithDelay(() -> cat.clickeditActivityTypeMenu());
		interact.executeWithDelay(() -> cat.clickeditSelectActivityTypeMenu());
		interact.executeWithDelay(() -> cat.clickeditTask());
		interact.executeWithDelay(() -> cat.clickeditSelecTask());
		interact.executeWithDelay(() -> cat.clicksaveEditedChargeActivityType());
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void delete_chargeActivityType_Editor_TC_036() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.clickChargeCode());
		interact.executeWithDelay(() -> cat.clickDeleteIcon());
		interact.executeWithDelay(() -> cat.clickconfirmDelete());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
