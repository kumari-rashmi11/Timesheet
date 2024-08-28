package Timesheet_Test;

import org.testng.annotations.Test;

import pages.AddEmployeePage;
import pages.RoleSelectionPage;

 
public class AddEmployeeTest extends BaseTest {
	@Test
	public void addNewEmpoyeeTest() {
		
		login();

		RoleSelectionPage roleSelectionPage = new RoleSelectionPage(driver);
        roleSelectionPage.switchToIframe();
        roleSelectionPage.selectHRRole();
        
        //click the employee tab
        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        addEmployeePage.addNewEmployee();
        
        //click on add button
        addEmployeePage.clickAddEmployeeButton();

        // Fill in the employee details
        addEmployeePage.enterFirstName();
        addEmployeePage.enterLastName();
        addEmployeePage.enterEmployeeNumber();
        addEmployeePage.enterEmail();
        
	}
}