package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.approvalsTabdataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ApprovalsTab;

public class ApprovalsTabTest_HR extends BaseTest {
	
	public void initiaTest()  {
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
//        NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//		Interactions interact = new Interactions(driver);
	    ApprovalsTab approvalTab = new ApprovalsTab(driver);  
//        nt.clickTeamsBtn();
//        nt.clickTimesheetBtn();
//        nt.clickTimesheetLink();
//        interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Editor"));
		approvalTab.selectapprovaltab_Hr();
	}
	
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class,dataProvider = "weekSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_066_searchtimesheetbyDate_Hr(String week,String year) throws InterruptedException {

		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicWeekSelection(week,year);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class,dataProvider = "statusSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_067_searchtimesheetbyStatus_Hr(String status,String year) throws InterruptedException {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
        	
			approvalTab.dynamicStatusSelection(status,year);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class,dataProvider = "plAndreporteesSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_068_searchtimesheetbyReportee_Hr(String plName,String reportee) {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicPlSelection(plName);
			approvalTab.dynamicReporteesSelection(reportee);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class,dataProvider = "plAndreporteesSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_069_refresh_Hr(String plName,String reportee)  {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicPlSelection(plName);
			approvalTab.dynamicReporteesSelection(reportee);
			approvalTab.reset_hr_editor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class, dataProvider = "ApproveTimesheetDataProvider_Editor",dataProviderClass = approvalsTabdataProvider.class)
	public void TC_070_approveTimesheet_Hr(String week,String year,String plName,String reportee) {
		initiaTest();
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
        try {
			approvalTab.dynamicWeekSelection(week,year);
			approvalTab.dynamicPlSelection(plName);
			approvalTab.dynamicReporteesSelection(reportee);
			approvalTab.approve_timesheet_hr_editor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      		
	}
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class,dataProvider = "dataVisibilityDataProvider_Editor",dataProviderClass = approvalsTabdataProvider.class)
	public void TC_146_dataVisibility_Hr(String plName,String week,String year) {
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
		initiaTest();
		try {
			approvalTab.dynamicPlSelection(plName);
			approvalTab.dynamicWeekSelection(week,year);
			approvalTab.visibility_reportees_editor();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class,dataProvider = "yearSelectionDataProvider",dataProviderClass = approvalsTabdataProvider.class)
	public void TC_147_fyFilter_Hr(String year)  {
        ApprovalsTab approvalTab = new ApprovalsTab(driver);  
		initiaTest();	
		approvalTab.dynamicYearSelection(year);
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}