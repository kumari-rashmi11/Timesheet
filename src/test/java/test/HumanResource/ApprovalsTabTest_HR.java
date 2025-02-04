package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ApprovalsTab;

public class ApprovalsTabTest_HR extends BaseTest {
	
	public void initiaTest() throws InterruptedException  {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
		roleSelectionPage.timesheetNavigation(); 
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.HRRoleBtn();
    ApprovalsTab approvalTab = new ApprovalsTab(driver);  
	approvalTab.selectapprovaltab_Hr();
	}
	
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_066_searchtimesheetbyDate_HR() throws InterruptedException {

		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicWeekSelection("12 Jan - 18 Jan, 2025","2025");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_067_searchtimesheetbyStatus_HR() throws InterruptedException {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
        	//approvalTab.dynamicPlSelection("Vivek Rajput");
			//approvalTab.dynamicReporteesSelection("Ananya  Satpati(1239)");
			approvalTab.dynamicStatusSelection("All","2025");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_068_searchtimesheetbyReportee_HR() throws InterruptedException {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicPlSelection("Rashmi Kumari");
			approvalTab.dynamicReporteesSelection("Ananya Satpati(1239)");
 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
 
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_069_refresh_HR() throws InterruptedException  {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicPlSelection("Vivek Rajput");
			approvalTab.dynamicReporteesSelection("Uddhav Gupta(1509)");
			approvalTab.reset_hr_editor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
 
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_070_approveTimesheet_HR() throws InterruptedException {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicWeekSelection("12 Jan - 18 Jan, 2025","2025");
			approvalTab.dynamicPlSelection("Vivek Rajput");
			approvalTab.dynamicReporteesSelection("Uddhav Gupta(1509)");
//			approvalTab.approve_timesheet_hr_editor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      		
	}
 
 
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_146_dataVisibility_HR() throws InterruptedException {
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
		initiaTest();
		try {
			approvalTab.dynamicPlSelection("Vivek Rajput");
			approvalTab.dynamicWeekSelection("01 Dec - 07 Dec, 2024","2024");
			approvalTab.visibility_reportees_editor();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_147_fyFilter_HR() throws InterruptedException  {
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
		initiaTest();	
		try {
			approvalTab.dynamicYearSelection("2023");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
 
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}