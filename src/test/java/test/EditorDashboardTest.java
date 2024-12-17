package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.EditorDashboardPage;
import pages.RoleSelectionPage;
import pages.TimesheetDashboardpage;

public class EditorDashboardTest extends BaseTest{
	
	@Test (priority = 1)
    public void Navigate_to_dashboard() {
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
        dashboard.navigateToDashboard();
    }
 
	@Test (priority = 2, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_002_Click_reportee() {
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.clickreportee();
    }
	
	@Test (priority = 3, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_GreenRlButton() {
    	Navigate_to_dashboard();
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
        dashboard.clickGreenRlButton();
    }
    
    @Test (priority = 4, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_PurplePlButton() {
    	Navigate_to_dashboard();
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
        dashboard.clickPurplePlButton();
    }
    
    @Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_BlackUserButton() {
    	Navigate_to_dashboard();
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
        dashboard.clickBlackUserButton();
    }
	
	
	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchon() {
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.clickswitchon();
    }
	
	@Test (priority = 7, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchoff() {
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.clickswitchoff();
    }
		
	@Test (priority = 8, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_005_Verification_of_list_of_associated_clients(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd();
	}
	
	@Test (priority = 11, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_008__total_billable_and_non_billable_hour_according_to_year_dropdown(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd();
	}
	
	@Test (priority = 12, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarr();
		dashboard.approvbtn();	
    }
	
	
	@Test (priority = 13, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_010_reportee_dropdown() throws InterruptedException{
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedd();
		Thread.sleep(2000);
		dashboard.reporteename();

	}
	
	@Test (priority = 14, dependsOnMethods = {"TC_002_Click_reportee"})
    public void TC_011_Verification_of_filter_reset_operation(){
		TC_002_Click_reportee();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteeydd();
	}
	
	
	//Admin Dashboard Test cases
	
	@Test (priority = 15, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_289_notification_icon(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.notification();
	}
	
	@Test (priority = 16, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_290_refresh_btn(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.refreshh();
	}
	
	@Test (priority = 17, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_291_Verification_of_visibility_of_requests_for_lead_change(){
		Navigate_to_dashboard();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.notification();
	}
	
	@Test (priority = 18, dependsOnMethods = {"TC_289_notification_icon"})
	public void TC_292_Verification_of_approving_submitted_lead_change_request(){
		TC_289_notification_icon();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.aprovnotify();
	}
	
	@Test (priority = 19, dependsOnMethods = {"TC_289_notification_icon"})
	public void TC_293_Verification_of_rejecting_submitted_lead_change_request(){
		TC_289_notification_icon();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.reject();
	}
	
	@Test (priority = 20, dependsOnMethods = {"TC_289_notification_icon"})
	public void TC_294_close_btn(){
		TC_289_notification_icon();
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.closebtn();
	}
	
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	 }       
}


	