package test.ReportingLead;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.approvalsTabdataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ApprovalsTab;




public class ApprovalsTabTest_RL extends BaseTest {
	
	  public void initiaTest()  {
//			RoleSelection roleSelectionPage = new RoleSelection(driver);
//	        NavigateToTimesheet nt = new NavigateToTimesheet(driver);
			Interactions interact = new Interactions(driver);
		    ApprovalsTab approvalTab = new ApprovalsTab(driver);  
//	        nt.clickTeamsBtn();
//	        nt.clickTimesheetBtn();
//	        nt.clickTimesheetLink();
//	        interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//			interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//			interact.executeWithDelay(() -> roleSelectionPage.selectRole("RL"));
	       // approvalTab.selectapprovaltab_Rl();  
	    }
	private ApprovalsTab approvalTab;
	
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class,dataProvider = "weekSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_066_searchtimesheetbyDate_RL(String week ,String year) throws InterruptedException {
		System.out.println("Executing TC_066_searchtimesheetbyDate_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.selectapprovaltab_Rl();
		approvalTab.dynamicYearSelection(year);
		approvalTab.dynamicWeekSelection(week);
	}
	@Test(priority = 2, dataProvider = "statusSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_067_searchtimesheetbyStatus_RL(String year,String status) throws InterruptedException {
		System.out.println("Executing TC_067_searchtimesheetbyStatus_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.selectapprovaltab_Rl();
		approvalTab.dynamicYearSelection(year);
		Thread.sleep(1500);
		approvalTab.dynamicStatusSelection(status);
		//approvalTab.dynamicWeekSelection("22 Dec - 28 Dec");
	}
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class,dataProvider = "SearchAndRefresh_Timesheet_RL", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_068_searchtimesheetbyReportee_RL(String year,String status,String week,String reportee) throws InterruptedException {
		System.out.println("Executing TC_068_searchtimesheetbyReportee_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.selectapprovaltab_Rl();
		approvalTab.dynamicYearSelection(year);
	    approvalTab.dynamicStatusSelection(status);
		Thread.sleep(1500);
		approvalTab.dynamicWeekSelection(week);
		approvalTab.searchprojectreportee(reportee);
	}
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class,dataProvider = "SearchAndRefresh_Timesheet_RL", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_069_refresh_RL(String year,String status,String week,String reportee) throws InterruptedException {	
		System.out.println("Executing TC_069_refresh_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.selectapprovaltab_Rl();
		approvalTab.dynamicYearSelection(year);
		approvalTab.dynamicWeekSelection(week);
		approvalTab.dynamicStatusSelection(status);
		approvalTab.searchprojectreportee(reportee);
		approvalTab.reset();
	}
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class,dataProvider = "weekSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_070_approveTimesheet_RL(String week,String year) throws InterruptedException {
		System.out.println("Executing TC_070_approveTimesheet_RL");
		initiaTest();
		approvalTab = new ApprovalsTab(driver);
		approvalTab.approve_timesheet(week,year);
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class,dataProvider = "weekSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_071_rejectTimesheet_RL(String week,String year) throws InterruptedException {
		System.out.println("Executing TC_071_rejectTimesheet_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.reject_timesheet(week,year);
	}
	//
	@Test(priority = 7)
	public void TC_072_holidayMarking_RL() throws InterruptedException {
		System.out.println("Executing TC_072_holidayMarking_RL");
		initiaTest();
		approvalTab.holiday_marking();
	}
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class,dataProvider = "PartiallyApproveTimesheetDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_138_partiallyApproved_RL(String week,String year,String reportee,String status) throws InterruptedException {
		System.out.println("Executing TC_138_partiallyApproved_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.approved_partially(status,week, year,reportee);
	}
	//
	@Test(priority = 9,dataProvider = "weekSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_146_dataVisibility_RL(String week, String year) throws InterruptedException {	
		System.out.println("Executing TC_146_dataVisibility_RL");
		initiaTest();
		approvalTab.data_visibility(week,year);
	}
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class,dataProvider = "yearSelectionDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_147_fyFilter_RL(String year) throws InterruptedException {
		System.out.println("Executing TC_147_fyFilter_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.fy_filter(year);
	}
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC_299_visibilityofReportee_RL() throws InterruptedException {	
		System.out.println("Executing TC_299_visibilityofReportee_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.visibility_reportees();
	}
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class,dataProvider = "ApproveTimesheetDataProvider",dataProviderClass = approvalsTabdataProvider.class)
	public void TC_300_approvedTimesheet_With_Reportees_RL(String week,String year,String reportee) throws InterruptedException {
		System.out.println("Executing TC_300_approvedTimesheet_With_Reportees_RL");
		approvalTab = new ApprovalsTab(driver);
		approvalTab.approve_timesheet_with_reportee(week, year, reportee);
	}
	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class,dataProvider = "RejectTimesheetDataProvider",dataProviderClass = approvalsTabdataProvider.class)
	public void TC_301_rejectTimesheet_With_Reportee_RL(String week,String year ,String reportee) throws InterruptedException {	
		System.out.println("Executing TC_301_rejectTimesheet_With_Reportee_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		approvalTab.reject_timesheet_with_reportee(week, year, reportee);
	}
	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class,dataProvider = "notResetingDataProvider", dataProviderClass = approvalsTabdataProvider.class)
	public void TC_354_notResetting_RL(String status,String year,String week,String reportee) throws InterruptedException{	
		System.out.println("Executing TC_354_notResetting_RL");
		approvalTab = new ApprovalsTab(driver);
		initiaTest();
		Thread.sleep(3000);
		approvalTab.not_resetted(week, year, reportee,status);
	}
	
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
}