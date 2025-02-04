package test.Editor;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.DashboardTabDataProvider;
import DataProvider.EmployeeTabDataProvider;
import helper.BaseTest;
import pages.DashboardPage;

public class EditorDashboardTest extends BaseTest{
	
	@Test
    public void initial_test() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_Editor();
    }
 
	@Test (priority = 1)
    public void TC_001_Verification_of_drill_down_operation() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Editor();	
    }
	
	@Test (priority = 2)
    public void TC_002_Verification_of_Home_Button_after_drill_down() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Editor();
		initial_test();
    }
	
	@Test (priority = 3)
    public void TC_003_Verification_of_different_colour_clues_for_different_access_type() {
    	initial_test();
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickGreenRlButton_Editor();
    }
    
    @Test (priority = 4)
    public void TC_003_PurplePlButton() {
    	initial_test();
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickPurplePlButton_Editor();
    }
    
    @Test (priority = 5)
    public void TC_003_BlackUserButton() {
    	initial_test();
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickBlackUserButton_Editor();
    }
	
	
	@Test (priority = 6)
    public void TC_004_toogle_switchon() {
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickswitchon_Editor();
    }
	
	@Test (priority = 7)
    public void TC_004_toogle_switchoff() {
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickswitchoff_Editor();
    }
		
	@Test (priority = 8)
	public void TC_005_Verification_of_list_of_associated_clients(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.allclients_Viewer();
	}
	
	@Test (priority = 9)
	 public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees_(){
			initial_test(); 
			DashboardPage dashboard= new DashboardPage(driver);
			dashboard.claimedtask_Viewer();
		}
		
	@Test (priority = 10)
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown_(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Editor();
		
	}
	
	@Test (priority = 11, dataProvider = "dashboardData", dataProviderClass = DashboardTabDataProvider.class)
    public void TC_008__total_billable_and_non_billable_hour_according_to_year_dropdown(String selectyear){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Editor();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Editor();
		dashboard.selectyear_Editor(selectyear);
	}
	
	@Test (priority = 12)
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarr_Editor();
		dashboard.approvbtn_Editor();	
    }
	
	
	@Test (priority = 13, dataProvider = "selectreportee", dataProviderClass = DashboardTabDataProvider.class)
    public void TC_010_Verification_of_filter_operation_on_submitted_timesheets_using_reportee_dropdown(String repnameeditor) throws InterruptedException{
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedd_Editor();
		Thread.sleep(2000);
		dashboard.reporteename_Editor(repnameeditor);
	}
	
	@Test (priority = 14)
    public void TC_011_Verification_of_filter_reset_operation(String repnameeditor) throws InterruptedException{
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedd_Editor();
		Thread.sleep(2000);
		dashboard.reporteename_Editor(repnameeditor);
		Thread.sleep(2000);
		dashboard.reporteefilter_Editor();
	}
	
	
	@Test (priority = 15)
    public void TC_162_Verification_of_count() {
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.notstartedyeteditor();
        dashboard.drafteditor();
        dashboard.Submittededitor();
        dashboard.Partially_Submittededitor();
        dashboard.Approvededitor();
        dashboard.Partially_Approvededitor();
        dashboard.Rejectededitor();
    }
	
	@Test (priority = 16)
    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet_to_lead_from_the_date_lead_is_selected (String repnameeditor) throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedd_Editor();
		Thread.sleep(2000);
		dashboard.reporteename_Editor(repnameeditor);
		dashboard.submittedtimesheeteditor();
	}
	
	//Admin Dashboard Test cases
	
	@Test (priority = 17)
    public void TC_289_Verification_of_visibility_of_notification_area(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
	}
	
	@Test (priority = 18)
    public void TC_290_Verification_of_refresh_button(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.refreshh_Editor();
	}
	
	@Test (priority = 19)
    public void TC_291_Verification_of_visibility_of_requests_for_lead_change(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
	}
	
	@Test (priority = 20)
	public void TC_292_Verification_of_approving_submitted_lead_change_request(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
		dashboard.aprovnotify_Editor();
		dashboard.selectdate("Thu,Jan 16,2025");
	}
	
	@Test (priority = 21)
	public void TC_293_Verification_of_rejecting_submitted_lead_change_request(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
		dashboard.reject_Editor();
		dashboard.rejectreason("This is for testing");
	}
	
	@Test (priority = 22)
	public void TC_294_close_btn(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
		dashboard.closebtn_Editor();
	}
	
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	 }       
}


	