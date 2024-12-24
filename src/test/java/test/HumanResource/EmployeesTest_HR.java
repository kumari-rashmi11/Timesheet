package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EmployeesPage;

public class EmployeesTest_HR extends BaseTest {
	
	public void initialTest() {	
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
		
//		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//	    nt.clickTeamsBtn();
//	    nt.clickTimesheetBtn();
//	    nt.clickTimesheetLink();
//		
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("HR"));
		interact.executeWithDelay(() -> ep.clickEmployeesTab_HR());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void details_of_employees_HR_TC017() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void search_Operation_HR_TC019() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void refresh_Operation_HR_TC020() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation());
		interact.executeWithDelay(() -> ep.clickRefreshBtn());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void add_Employee_HR_TC021() {
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
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void modify_Employee_Status_HR_TC161() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void change_Effective_date_current_lead_of_inactive_employee_HR_TC238() {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.employeeDetails());
		interact.executeWithDelay(() -> ep.clickmodifyIcon());
		interact.executeWithDelay(() -> ep.effectiveDate());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
