package test.HumanResource;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
 
import utils.EvalSettingLocators;
import helper.BaseTest;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EvalSettingPage;
 
public class HREvalSettingTest extends BaseTest {
	
	public void initial_test() throws InterruptedException {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
		roleSelectionPage.timesheetNavigation(); 
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.HRRoleBtn();
	
		EvalSettingLocators evalSettingTab = new EvalSettingLocators(driver);
		evalSettingTab.test_HR();
	}
	
	@Test(priority=1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_165_Verification_of_navigation_to_the_evaluation_section_HR() throws InterruptedException {
 
		System.out.println("TC-165");
		initial_test();
	}
	@Test(priority=2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_166_Verification_of_navigation_to_the_evaluation_categories_section_HR() throws InterruptedException {
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
 
		System.out.println("TC-166");
		initial_test();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
 
	}
	@Test(priority=3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_167_Verification_of_navigation_to_the_evaluation_eligibility_section_HR() throws InterruptedException {
 
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		System.out.println("TC-167");
		initial_test();
		tabSwitch.switchEvalEligibilityTab_editor();
 
	}
	@Test(priority=4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_168_Verification_of_refresh_opeartion_for_data_set_changes_in_evaluation_section_HR() throws InterruptedException {
 
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		System.out.println("TC-168");
		initial_test();
		tabSwitch.clickRefreshBtn_editor();
 
	}
	@Test(priority=5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_169_Verification_of_filteration_of_employee_through_employee_dropdown_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		System.out.println("TC-169");
		initial_test();
		evalPageSelect.employeeFieldInput_editor();
		evalPageSelect.employeeDropDown_editor();
		evalPageSelect.employeeSelectionFromDropDown_editor();
 
	}
 
	@Test(priority=6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_170_Verification_of_refresh_operation_for_the_filter_of_employee_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		System.out.println("TC-170");
		initial_test();
		evalPageSelect.employeeFieldInput_editor();
		evalPageSelect.employeeDropDown_editor();
		evalPageSelect.employeeSelectionFromDropDown_editor();
		evalPageSelect.employeeSelectionRefreshButton_editor();
 
	}
	@Test(priority=7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_171_Verification_of_filteration_of_quarters_by_Review_Period_dropdown_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		System.out.println("TC-171");
		initial_test();
		evalPageSelect.reviewPeriod_editor();
		evalPageSelect.reviewPeriodSelect_editor();
		//evalPageSelect.reviewPeriodVerifyEmpDiv();	
	}

	@Test(priority=17, retryAnalyzer = RetryAnalyzer.class)
	public void TC_186_Verification_of_active_section_of_categories_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
 
		System.out.println("TC-186");
		initial_test();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickActiveBtn_editor();
 
 
	}
 
	@Test(priority=18, retryAnalyzer = RetryAnalyzer.class)
	public void TC_187_Verification_of_archived_section_of_categories_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
 
		System.out.println("TC-187");
		initial_test();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickArchivedBtn_editor();
 
 
	}
	@Test(priority=20, retryAnalyzer = RetryAnalyzer.class)
	public void TC_189_Verification_of_search_operation_of_active_category_by_providing_category_name_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
 
		System.out.println("TC-189");
		initial_test();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickCategoryRefreshBtn_editor();
 
 
	}
	@Test(priority=21, retryAnalyzer = RetryAnalyzer.class)
	public void TC_190_Verification_of_refresh_button_for_active_category_HR() throws InterruptedException {
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);
 
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
 
		System.out.println("TC-190");
		initial_test();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickCategorySearch_editor();
		tabSwitch.enterCategorySearch_editor("abc");
 
 
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}