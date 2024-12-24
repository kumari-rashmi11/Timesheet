package test.Editor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EmployeesPage;

public class EmployeesTest_Editor extends BaseTest {
	public void initialTest() {
		
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		
		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
	    nt.clickTeamsBtn();
	    nt.clickTimesheetBtn();
	    nt.clickTimesheetLink();
		
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Editor"));
		interact.executeWithDelay(() -> ep.clickEmployeesTab_Editor());
	}
	
	@Test(priority = 1)
	public void details_of_employees_Editor_TC017() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void modifying_details_of_employees_Editor_TC018() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void search_Operation_Editor_TC019() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void refresh_Operation_Editor_TC020() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation());
		interact.executeWithDelay(() -> ep.clickRefreshBtn());
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void add_Employee_Editor_TC021() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickAddBtn());
		interact.executeWithDelay(() -> ep.firstName());
		interact.executeWithDelay(() -> ep.lastName());
		interact.executeWithDelay(() -> ep.empNo());
		interact.executeWithDelay(() -> ep.emailInput());
		interact.executeWithDelay(() -> ep.clickLeadMenu());
		interact.executeWithDelay(() -> ep.clickChooseLead());
		interact.executeWithDelay(() -> ep.clickAddEmployee());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Modification_of_Employee_status_TC131() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void modify_Employee_Status_Editor_TC161() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Lead_change_of_active_employee_TC234() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickleadDropdown_Editor());
		interact.executeWithDelay(() -> ep.clickChooseLead_Editor());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Lead_change_of_Inactive_employee_TC235() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
		
		interact.executeWithDelay(() -> ep.clickleadDropdown_Editor());
		interact.executeWithDelay(() -> ep.clickChooseLead_Editor());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Lead_change_of_Relieved_employee_TC236() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
		interact.executeWithDelay(() -> ep.clickleadDropdown_Editor());
		interact.executeWithDelay(() -> ep.clickChooseLead_Editor());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
		interact.executeWithDelay(() -> ep.selectReasonDropdown_Editor());
		interact.executeWithDelay(() -> ep.enterReasonDropdown_Editor());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Effective_date_change_of_Active_employee_TC237() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterFutureEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void Effective_date_change_of_Relived_employee_TC239() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void Future_Effective_date_change_of_Active_employee_TC240() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterFutureEffectiveFrom());
	}
	
	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void Past_Effective_date_change_of_Active_employee_TC241() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterPastEffectiveFrom());
	}
	
	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void Equal_Effective_date_change_of_Active_employee_TC242() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void Future_Effective_date_change_of_Inactive_employee_TC243() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterFutureEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void Past_Effective_date_change_of_Inactive_employee_TC244() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterPastEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void Equal_Effective_date_change_of_Inactive_employee_TC245() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void Future_Effective_date_change_of_Relieved_Employee_TC246() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
		interact.executeWithDelay(() -> ep.enterFutureEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void Past_Effective_date_change_of_Relieved_Employee_TC247() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
		interact.executeWithDelay(() -> ep.enterPastEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void Effective_date_change_of_Relieved_Employee_TC248() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickpencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
		interact.executeWithDelay(() -> ep.enterEffectiveFrom());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 22, retryAnalyzer = RetryAnalyzer.class)
	public void active_Employees_only_in_active_tab_Editor_TC255() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.activeEmployees());
	}
	
	@Test(priority = 23, retryAnalyzer = RetryAnalyzer.class)
	public void inactive_Employees_only_in_inactive_tab_Editor_TC256() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.inactiveEmployees());
	}
	
	@Test(priority = 24, retryAnalyzer = RetryAnalyzer.class)
	public void change_status_active_to_inactive_Editor_TC258() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectInActiveStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 25, retryAnalyzer = RetryAnalyzer.class)
	public void change_status_Inactive_to_Relieved_Editor_TC259() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 27, retryAnalyzer = RetryAnalyzer.class)
	public void change_status_Relieved_to_Inactive_Editor_TC260() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectInActiveStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 28, retryAnalyzer = RetryAnalyzer.class)
	public void change_status_Relieved_to_Active_Editor_TC261() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickRelievedTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 29, retryAnalyzer = RetryAnalyzer.class)
	public void change_status_Inactive_to_Active_Editor_TC262() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectActiveStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 30, retryAnalyzer = RetryAnalyzer.class)
	public void change_status_Active_to_Relieved_Editor_TC263() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 31, retryAnalyzer = RetryAnalyzer.class)
	public void components_of_past_and_persent_lead_info_screen_Editor_TC296() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickEyeIconEditor());
	}
	
	@Test(priority = 32, retryAnalyzer = RetryAnalyzer.class)
	public void visibility_of_past_and_persent_lead_info_screen_Editor_TC297() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickEyeIconEditor());
	}
	
	@Test(priority = 33, retryAnalyzer = RetryAnalyzer.class)
	public void closing_past_and_persent_lead_info_screen_Editor_TC298() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickEyeIconEditor());
		
		interact.executeWithDelay(() -> ep.clickCloseBtn());
	}
	
	@Test(priority = 34, retryAnalyzer = RetryAnalyzer.class)
	public void change_Effective_date_current_lead_of_inactive_employee_Editor_TC238() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.effectiveDate());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 35, retryAnalyzer = RetryAnalyzer.class)
	public void relieved_Employees_only_in_relieved_tab_Editor_TC257() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.relievedEmployees());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
