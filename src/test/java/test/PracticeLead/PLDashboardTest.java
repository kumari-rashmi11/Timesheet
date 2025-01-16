package test.PracticeLead;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import pages.DashboardPage;

public class PLDashboardTest extends BaseTest {

	@Test 
    public void initial_test() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_PL();
    }
	
	@Test (priority = 1)
    public void TC_001_Verification_of_drill_down_operation() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_PL();
    }
 
	@Test (priority = 2)
    public void TC_002_Verification_of_Home_Button_after_drill_down() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_PL();
		dashboard.navigateToDashboard_PL();
    }
    	
	@Test (priority = 3)
    public void TC_004_toogle_switchon() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchon_PL();
    }
	
	@Test (priority = 4)
    public void TC_004_toogle_switchoff() {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchoff_PL();
    }
	
	@Test (priority = 5)
    public void TC_005_Verification_of_list_of_associated_clients(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.allclients_pl();
//		Assert.assertEquals(driver.getTitle(), "All Clients");
	}
	
	@Test (priority = 6)
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees_(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.claimedtask_pl();
	}
	
	@Test (priority = 7)
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown_(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_pl();
	}

	@Test (priority = 8)
    public void TC_008_Verification_of_total_billable_and_non_billable_hour_according_to_year_dropdown(){
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_PL();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_pl();
		dashboard.chooseyearpl();

    }
	
	@Test (priority = 9)
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		initial_test();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarrowPL();
		dashboard.approbebtn();	
    }
	
	@Test (priority = 10)
    public void TC_010_Verification_of_filter_operation_on_submitted_timesheets_using_reportee_dropdown() throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedropdown();
		Thread.sleep(2000);
		dashboard.choosereportee();

	}
	
	@Test (priority = 11)
    public void TC_011_Verification_of_filter_reset_operation_() throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedropdown();
		Thread.sleep(2000);
		dashboard.choosereportee();
		dashboard.filterbtnPL();
	}

	@Test (priority = 12)
    public void TC_162_Verification_of_count() {
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
		
	@Test (priority = 13)
    public void TC_249_Verification_of_visibility_of_consumed_hours_to_lead_from_the_date_lead_is_selected () {
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.consumedhrsPL();
	}
	
	
	@Test (priority = 14)
    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet_to_lead_from_the_date_lead_is_selected () throws InterruptedException{
		initial_test(); 
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedropdown();
		Thread.sleep(2000);
		dashboard.choosereporteenew();
//		dashboard.submittedtimesheetPL();
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
 } 
 
}