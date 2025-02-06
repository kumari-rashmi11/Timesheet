
package test.HumanResource;

import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.EmployeeTabDataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EmployeesPage;

public class EmployeesTest_HR extends BaseTest {
	
	public void initialTest() throws InterruptedException {
		
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
////      roleSelectionPage.switchToIframe();
//      // Select the desired role 
//		roleSelectionPage.timesheetNavigation(); 
//		roleSelectionPage.iframeSwitch1();
//		roleSelectionPage.iframeSwitch2();
//		roleSelectionPage.HRRoleBtn();
		interact.executeWithDelay(() -> ep.clickEmployeesTab());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void details_of_employees_HR_TC017(String employeeClick) throws InterruptedException {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
//		interact.executeWithDelay(() -> ep.employeeDetails(employeeClick));
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class, dataProvider = "searchemployee", dataProviderClass = EmployeeTabDataProvider.class)
	public void search_Operation_HR_TC019(String name) throws InterruptedException {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation(name));
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class, dataProvider = "searchemployee", dataProviderClass = EmployeeTabDataProvider.class)
	public void refresh_Operation_HR_TC020(String name) throws InterruptedException {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.searchOperation(name));
		interact.executeWithDelay(() -> ep.clickRefreshBtn());
	}
	

	@Test(priority = 4, dataProvider = "employeeData", dataProviderClass = EmployeeTabDataProvider.class)
	public void add_Employee_HR_TC021(String firstName, String lastName, String empNo, String email, String Leadname) throws InterruptedException {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		  	interact.executeWithDelay(() -> ep.clickAddBtn());
	        interact.executeWithDelay(() -> ep.firstName(firstName));
	        interact.executeWithDelay(() -> ep.lastName(lastName));
	        interact.executeWithDelay(() -> ep.empNo(empNo));
	        interact.executeWithDelay(() -> ep.emailInput(email));
	        interact.executeWithDelay(() -> ep.clickLeadMenu());
	        interact.executeWithDelay(() -> ep.clickChooseLead(Leadname));
	        interact.executeWithDelay(() -> ep.clickAddEmployee());
		}
	
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void modify_Employee_Status_HR_TC161() throws InterruptedException {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickEmployeeAndPencilIcon());
		interact.executeWithDelay(() -> ep.clickStatusDropDown());
		interact.executeWithDelay(() -> ep.selectRelievedStatus());
		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void change_Effective_date_current_lead_of_inactive_employee_HR_TC238() throws InterruptedException {
		initialTest();
		EmployeesPage ep = new EmployeesPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickInactiveTab());
		interact.executeWithDelay(() -> ep.clickEmployeeAndPencilIcon());
		interact.executeWithDelay(() -> ep.effectiveDate());
//		interact.executeWithDelay(() -> ep.clickSaveBtn());
	}
	

	  
    @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
