package test.Viewer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.EvalSettingLocators;
import helper.BaseTest;
import helper.RoleSelection;
import pages.EvalSettingPage;
import helper.RetryAnalyzer;

public class ViewerEvalSettingTest extends BaseTest {
	
	@Test(priority=1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_165_Viewer() {

		System.out.println("TC-165");
		evaluationSettings();

	}
	
	@Test(priority=2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_166_Viewer() {
		
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-166");
		evaluationSettings();
		tabSwitch.switchEvalTab_Viewer();
		tabSwitch.switchEvalCategoryTab_Viewer();

	}
	
	@Test(priority=3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_167_Viewer() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		
		System.out.println("TC-167");
		evaluationSettings();
		tabSwitch.switchEvalEligibilityTab_Viewer();

	}
	
	@Test(priority=4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_168_Viewer() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		
		System.out.println("TC-168");
		evaluationSettings();
		tabSwitch.clickRefreshBtn_Viewer();

	}
	
	@Test(priority=5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_169_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-169");
		evaluationSettings();
		evalPageSelect.employeeFieldInput_Viewer();
		evalPageSelect.employeeDropDown_Viewer();
		evalPageSelect.employeeSelectionFromDropDown_Viewer();

	}

	@Test(priority=6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_170_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-170");
		evaluationSettings();
		evalPageSelect.employeeFieldInput_Viewer();
		evalPageSelect.employeeDropDown_Viewer();
		evalPageSelect.employeeSelectionFromDropDown_Viewer();
		evalPageSelect.employeeSelectionRefreshButton_Viewer();

	}
	
	@Test(priority=7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_171_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-171");
		evaluationSettings();
		evalPageSelect.reviewPeriod_Viewer();
		evalPageSelect.reviewPeriodSelect_Viewer();
		//evalPageSelect.reviewPeriodVerifyEmpDiv();	
	}
	
	
	
	@Test(priority=17, retryAnalyzer = RetryAnalyzer.class)
	public void TC_186_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-186");
		evaluationSettings();
		tabSwitch.switchEvalTab_Viewer();
		tabSwitch.switchEvalCategoryTab_Viewer();
		tabSwitch.clickActiveBtn_Viewer();


	}

	@Test(priority=18, retryAnalyzer = RetryAnalyzer.class)
	public void TC_187_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-187");
		evaluationSettings();
		tabSwitch.switchEvalTab_Viewer();
		tabSwitch.switchEvalCategoryTab_Viewer();
		tabSwitch.clickArchivedBtn_Viewer();


	}
	
	@Test(priority=20, retryAnalyzer = RetryAnalyzer.class)
	public void TC_189_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-189");
		evaluationSettings();
		tabSwitch.switchEvalTab_Viewer();
		tabSwitch.switchEvalCategoryTab_Viewer();
		tabSwitch.clickCategoryRefreshBtn_Viewer();


	}
	
	@Test(priority=21, retryAnalyzer = RetryAnalyzer.class)
	public void TC_190_Viewer() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-190");
		evaluationSettings();
		tabSwitch.switchEvalTab_Viewer();
		tabSwitch.switchEvalCategoryTab_Viewer();
		tabSwitch.clickCategorySearch_Viewer();
		tabSwitch.enterCategorySearch_Viewer("abc");


	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void roleSelectPL() {

    	RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.selectRole("Viewer");
	}
	
	public void evaluationSettings() {
		
		EvalSettingLocators evalSettingTab = new EvalSettingLocators(driver);
		roleSelectPL();
		evalSettingTab.test_Viewer();
	}
	
}
