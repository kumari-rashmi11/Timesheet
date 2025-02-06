package test.HumanResource;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.EvaluationSettingDataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EvalSettingPage;

public class HREvalSettingTest extends BaseTest {

	
	public void initialTest() {
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
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("HR"));

	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC165_HR_click_on_evaluationSettingTab() {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationtab();
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC166_HR_click_on_evaluationCatagory() {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_167_HR_eligibility() {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		Assert.assertEquals(evaluationSettingPage.isEligibiltyPage(), "Evaluation Eligibility");
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class, dataProvider = "createEmpCycle", dataProviderClass = EvaluationSettingDataProvider.class)
	public void TC168_HR_createEmpCycle(String emp) {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.createEmpCyc();
		evaluationSettingPage.FYdropdown2023();
		evaluationSettingPage.selectEmp(emp);
		evaluationSettingPage.selectQuaterscheckbox();
		evaluationSettingPage.saveCycle();
		evaluationSettingPage.refreshButton();
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class, dataProvider = "selectEmp", dataProviderClass = EvaluationSettingDataProvider.class)
	public void TC169_HR_employeeFilter_evaluationTab(String emp) {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationtab();
		evaluationSettingPage.SelectEmployee(emp);
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class, dataProvider = "selectEmp", dataProviderClass = EvaluationSettingDataProvider.class)
	public void TC170_HR_Refresh_employeeFilter_evaluationTab(String emp) {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationtab();
		evaluationSettingPage.SelectEmployee(emp);
		evaluationSettingPage.employeeFilterReset();
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class, dataProvider = "quarterandstatus", dataProviderClass = EvaluationSettingDataProvider.class)
	public void TC171_HR_QuaterFilter(String quarter, String status) {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationtab();
		evaluationSettingPage.selectQuater(quarter);
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC175_TC176_HR_StatusAndRefresh() {
		initialTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectStatusRL("Evaluated");
		EvalSettingPage.statusFilterReset();
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class, dataProvider = "addCatagory", dataProviderClass = EvaluationSettingDataProvider.class)
	public void TC_185_HR_addCatagory(String category, String def) {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.addCategory(category, def);
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC186_HR_ActiveCatagory() {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.activeButton();
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC187_HR_ArchiveCatagory() {
		initialTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.archiveButton();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	
}