package test.PracticeLead;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import pages.DashboardPage;

public class PLDashboardTest extends BaseTest {

	@Test (priority = 1)
    public void initial_test() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_PL();
    }
//	
//	@Test (priority = 1, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_001_drill_down() {
//		DashboardPage dashboard= new DashboardPage(driver);
//		dashboard.clickreportee_PL();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		System.out.println("Scrolling operation completed successfully.");
//    }
	
	@Test (priority = 2)
    public void TC_001_Click_reportee() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.reportee_PL();
    }
	
//	@Test (priority = 3, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_004_toogle_switchon() {
//		DashboardPage dashboard= new DashboardPage(driver);
//		dashboard.switchon_PL();
//    }
//	
//	@Test (priority = 4, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_004_toogle_switchoff() {
//		DashboardPage dashboard= new DashboardPage(driver);
//		dashboard.switchoff_PL();
//    }
//	
//	@Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_005_Verification_of_list_of_associated_clients(){
//		DashboardPage dashboard= new DashboardPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		System.out.println("Scrolling operation completed successfully.");
//	}
//	
//	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
//		DashboardPage dashboard= new DashboardPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		System.out.println("Scrolling operation completed successfully.");
//	}
//	
//	
	@Test (priority = 7)
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_PL();
	}
//	
//	@Test (priority = 8, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
//		DashboardPage dashboard= new DashboardPage(driver);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		System.out.println("Scrolling operation completed successfully.");
//		dashboard.rightarrow_PL();
//		dashboard.approvebtn_PL();	
//    }
//	
//	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_010_reportee_dropdown() throws InterruptedException{
//		DashboardPage dashboard= new DashboardPage(driver);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,150)");
//		System.out.println("Scrolling operation completed successfully.");
//		dashboard.repdd_PL();
//		Thread.sleep(2000);
//		dashboard.repname_PL();
//
//	}
//	
//	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_011_Verification_of_filter_reset_operation() throws InterruptedException{
//		DashboardPage dashboard= new DashboardPage(driver);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		System.out.println("Scrolling operation completed successfully.");
//		dashboard.repdd_PL();
//		Thread.sleep(2000);
//		dashboard.repname_PL();
//		Thread.sleep(2000);
//		dashboard.filterbtn_PL();
//	}
//	
//	@Test (priority = 11, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_162_Verification_of_count() {
//		DashboardPage dashboard= new DashboardPage(driver);
//        dashboard.notstartedyet_PL();
//    }
//	
//	@Test (priority = 12, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_249_Verification_of_visibility_of_consumed_hours() {
//		DashboardPage dashboard= new DashboardPage(driver);
//        dashboard.consumedhrs_PL();
//    }
//	
//	@Test (priority = 13, dependsOnMethods = {"Navigate_to_dashboard"})
//    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet() throws InterruptedException{
//		DashboardPage dashboard= new DashboardPage(driver);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,150)");
//		System.out.println("Scrolling operation completed successfully.");
//		dashboard.repdd_PL();
//		Thread.sleep(2000);
//		dashboard.repname_PL();
//
//	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
 } 
 
}