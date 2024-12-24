package test.Editor;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.DashboardPage;

public class EditorDashboardTest extends BaseTest{
	
	@Test (priority = 1)
    public void Navigate_to_dashboard() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_Editor();
    }
 
	@Test (priority = 1, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_001_drill_down() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Editor();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
    }
	
	@Test (priority = 2, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_002_Click_reportee() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Editor();
    }
	
	@Test (priority = 3, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_GreenRlButton() {
    	Navigate_to_dashboard();
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickGreenRlButton_Editor();
    }
    
    @Test (priority = 4, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_PurplePlButton() {
    	Navigate_to_dashboard();
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickPurplePlButton_Editor();
    }
    
    @Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_BlackUserButton() {
    	Navigate_to_dashboard();
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickBlackUserButton_Editor();
    }
	
	
	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchon() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickswitchon_Editor();
    }
	
	@Test (priority = 7, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchoff() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickswitchoff_Editor();
    }
		
	@Test (priority = 8, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_005_Verification_of_list_of_associated_clients(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Editor();
	}
	
	@Test (priority = 11, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_008__total_billable_and_non_billable_hour_according_to_year_dropdown(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Editor();
	}
	
	@Test (priority = 12, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarr_Editor();
		dashboard.approvbtn_Editor();	
    }
	
	
	@Test (priority = 13, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_010_reportee_dropdown() throws InterruptedException{
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedd_Editor();
		Thread.sleep(2000);
		dashboard.reporteename_Editor();

	}
	
	@Test (priority = 14, dependsOnMethods = {"TC_002_Click_reportee"})
    public void TC_011_Verification_of_filter_reset_operation(){
		TC_002_Click_reportee();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteeydd_Editor();
	}
	
	@Test (priority = 12, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_162_Verification_of_count() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.notstartedyet_Editor();
    }
	
	@Test (priority = 13, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet() throws InterruptedException{
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Editor();
		Thread.sleep(2000);
		dashboard.repname_Editor();

	}
	
	//Admin Dashboard Test cases
	
	@Test (priority = 15, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_289_notification_icon(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
	}
	
	@Test (priority = 16, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_290_refresh_btn(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.refreshh_Editor();
	}
	
	@Test (priority = 17, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_291_Verification_of_visibility_of_requests_for_lead_change(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.notification_Editor();
	}
	
	@Test (priority = 18, dependsOnMethods = {"TC_289_notification_icon"})
	public void TC_292_Verification_of_approving_submitted_lead_change_request(){
		TC_289_notification_icon();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.aprovnotify_Editor();
	}
	
	@Test (priority = 19, dependsOnMethods = {"TC_289_notification_icon"})
	public void TC_293_Verification_of_rejecting_submitted_lead_change_request(){
		TC_289_notification_icon();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.reject_Editor();
	}
	
	@Test (priority = 20, dependsOnMethods = {"TC_289_notification_icon"})
	public void TC_294_close_btn(){
		TC_289_notification_icon();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.closebtn_Editor();
	}
	
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	 }       
}


	