package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.EvalSettingLocators;
import helper.BaseTest;
import helper.RoleSelection;
import pages.EvalSettingPage;
import helper.RetryAnalyzer;

public class HREvalSettingTest extends BaseTest {
	
	public void evaluationSettings() {
		
		EvalSettingLocators evalSettingTab = new EvalSettingLocators(driver);
		evalSettingTab.test_HR();
	}
	
	@Test(priority=1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_165_Verification_of_navigation_to_the_evaluation_section_HR() {

		System.out.println("TC-165");
		evaluationSettings();

	}
	
	@Test(priority=2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_166_Verification_of_navigation_to_the_evaluation_categories_section_HR() {
		
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-166");
		evaluationSettings();
		tabSwitch.switchEvalTab_HR();
		tabSwitch.switchEvalCategoryTab_HR();

	}
	
	@Test(priority=3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_167_Verification_of_navigation_to_the_evaluation_eligibility_section_HR() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		
		System.out.println("TC-167");
		evaluationSettings();
		tabSwitch.switchEvalEligibilityTab_HR();

	}
	
	@Test(priority=4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_168_Verification_of_refresh_opeartion_for_data_set_changes_in_evaluation_section_HR() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
			
		System.out.println("TC-168");
		evaluationSettings();
		tabSwitch.clickRefreshBtn_HR();

	}
	
	@Test(priority=5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_169_Verification_of_filteration_of_employee_through_employee_dropdown_HR() {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-169");
		evaluationSettings();
		evalPageSelect.employeeFieldInput_HR();
		evalPageSelect.employeeDropDown_HR();
		evalPageSelect.employeeSelectionFromDropDown_HR();

	}

	@Test(priority=6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_170_Verification_of_refresh_operation_for_the_filter_of_employee_HR() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-170");
		evaluationSettings();
		evalPageSelect.employeeFieldInput_HR();
		evalPageSelect.employeeDropDown_HR();
		evalPageSelect.employeeSelectionFromDropDown_HR();
		evalPageSelect.employeeSelectionRefreshButton_HR();

	}
	
	@Test(priority=7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_171_Verification_of_filteration_of_quarters_by_Review_Period_dropdown_HR() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-171");
		evaluationSettings();
		evalPageSelect.reviewPeriod_HR();
		evalPageSelect.reviewPeriodSelect_HR();
		//evalPageSelect.reviewPeriodVerifyEmpDiv();	
	}
	
	@Test(priority=17, retryAnalyzer = RetryAnalyzer.class)
	public void TC_186_Verification_of_active_section_of_categories_HR() {
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		System.out.println("TC-186");
		evaluationSettings();
		tabSwitch.switchEvalTab_HR();
		tabSwitch.switchEvalCategoryTab_HR();
		tabSwitch.clickActiveBtn_HR();


	}

	@Test(priority=18, retryAnalyzer = RetryAnalyzer.class)
	public void TC_187_Verification_of_archived_section_of_categories_HR() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-187");
		evaluationSettings();
		tabSwitch.switchEvalTab_HR();
		tabSwitch.switchEvalCategoryTab_HR();
		tabSwitch.clickArchivedBtn_HR();


	}
	
	@Test(priority=20, retryAnalyzer = RetryAnalyzer.class)
	public void TC_189_Searching_of_active_Category_HR() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-189");
		evaluationSettings();
		tabSwitch.switchEvalTab_HR();
		tabSwitch.switchEvalCategoryTab_HR();
		tabSwitch.clickCategoryRefreshBtn_HR();


	}
	
	@Test(priority=21, retryAnalyzer = RetryAnalyzer.class)
	public void TC_190_Search_and_refresh_of_active_CategoryHR() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-190");
		evaluationSettings();
		tabSwitch.switchEvalTab_HR();
		tabSwitch.switchEvalCategoryTab_HR();
		tabSwitch.clickCategorySearch_HR();
		tabSwitch.enterCategorySearch_HR("abc");


	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
//	public void roleSelectHR() {
//
//    	RoleSelection roleSelectionPage = new RoleSelection(driver);
//		roleSelectionPage.iframeSwitch1();
//		roleSelectionPage.selectRole("HR");
//	}
//	
	
	
}
