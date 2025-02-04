package test.ReportingLead;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.DashboardTabDataProvider;
import helper.BaseTest;
import pages.DashboardPage;

public class RLDashboardTest extends BaseTest{
	
	@Test 
    public void initial_test() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_RL();
    }
	
	@Test (priority = 1)
    public void TC_004_toogle_switchon() {
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchon_RL();
    }
	
	@Test (priority = 2)
    public void TC_004_toogle_switchoff() {
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchoff_RL();
    }
	
	@Test (priority = 3)
    public void TC_005_Verification_of_list_of_associated_clients(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.associatedclients_RL();
	}
	
	@Test (priority = 4)
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees_(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.claimedtask_RL();
	}
	
	@Test (priority = 5, dataProvider = "dashboardData", dataProviderClass = DashboardTabDataProvider.class)
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(String selectyear){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.financialdropdown();
		dashboard.selectyear_RL(selectyear);
	}
	
	@Test (priority = 6)
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarrow_RL();
		dashboard.approvebtn_RL();	
    }
	
	
	@Test (priority = 7)
    public void TC_010_Verification_of_filter_operation_on_submitted_timesheets_using_reportee_dropdown() throws InterruptedException{
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedropdown_RL();
		Thread.sleep(2000);
		dashboard.choosereportee_RL("Aheli Bhattacharya(1370)");

	}
	
	@Test (priority = 8)
    public void TC_011_Verification_of_filter_reset_operation() throws InterruptedException{
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedropdown_RL();
		Thread.sleep(2000);
		dashboard.choosereportee_RL("Aditya Dubey(1169)");
		dashboard.filterbtn_RL();
	}
	
	@Test (priority = 9)
    public void TC_162_Verification_of_count1() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.notstartedyetPL();
        dashboard.draftPL();
        dashboard.SubmittedPL();
        dashboard.Partially_SubmittedPL();
        dashboard.ApprovedPL();
        dashboard.Partially_ApprovedPL();
        dashboard.RejectedPL();
    }
	
	@Test (priority = 10)
    public void TC_249_Verification_of_visibility_of_consumed_hours_to_lead_from_the_date_lead_is_selected() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.consumedhrs_RL();
	}
		
	
//	@Test (priority = 11)
//    public void TC_295_() {
//		DashboardPage dashboard= new DashboardPage(driver);
//		dashboard.financialdd_RL();
//        dashboard.yearr_RL();
//        dashboard.calculate_RL();
//
//    }
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
