package test.Viewer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.DashboardPage;

public class ViewerDashboardTest extends BaseTest {

	@Test 
    public void initial_test() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_Viewer();
    }
	
	@Test (priority = 1)
    public void TC_001_Verification_of_drill_down_operation() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Viewer();
    }
 
	@Test (priority = 2)
    public void TC_002_Verification_of_Home_Button_after_drill_down() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Viewer();
		dashboard.navigateToDashboard_Viewer();
    }
    
    @Test (priority = 3)
    public void TC_003_Verification_of_different_colour_clues_for_different_access_type() {
		initial_test(); 
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.blackuser_Viewer();
    }
	
	@Test (priority = 4)
    public void TC_004_toogle_switchon() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchon_Viewer();
    }
	
	@Test (priority = 5)
    public void TC_004_toogle_switchoff() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchoff_Viewer();
    }
	
	@Test (priority = 6)
    public void TC_005_Verification_of_list_of_associated_clients(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.allclients_Viewer();
//		Assert.assertEquals(driver.getTitle(), "All Clients");
	}
	
	@Test (priority = 7)
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees_(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.claimedtask_Viewer();
	}
	
	@Test (priority = 8)
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown_(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Viewer();
	}

	@Test (priority = 9)
    public void TC_008_Verification_of_total_billable_and_non_billable_hour_according_to_year_dropdown(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Viewer();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Viewer();
		dashboard.chooseyear_Viewer();

    }
	
	@Test (priority = 10)
    public void TC_010_Verification_of_filter_operation_on_submitted_timesheets_using_reportee_dropdown() throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Viewer();
		Thread.sleep(2000);
		dashboard.repname_Viewer();

	}
	
	@Test (priority = 11)
    public void TC_011_Verification_of_filter_reset_operation_() throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Viewer();
		Thread.sleep(2000);
		dashboard.repname_Viewer();
		dashboard.filterbtn_Viewer();
	}

	@Test (priority = 12)
    public void TC_162_Verification_of_count() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.notstartedyet_Viewer();
        dashboard.draft_Viewer();
        dashboard.Submitted_Viewer();
        dashboard.Partially_Submitted_Viewer();
        dashboard.Approved_Viewer();
        dashboard.Partially_Approved_Viewer();
        dashboard.Rejected_Viewer();
    }
		
	@Test (priority = 13)
    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet_to_lead_from_the_date_lead_is_selected () throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Viewer();
		Thread.sleep(2000);
		dashboard.repname_Viewer();
		dashboard.submittedtimesheet_Viewer();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
 } 
	
}
