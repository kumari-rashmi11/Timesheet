package test.ReportingLead;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.DashboardPage;

public class RLDashboardTest extends BaseTest{
	
	@Test (priority = 1)
    public void Navigate_to_dashboard() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_RL();
    }
	
	@Test (priority = 1)
    public void TC_004_toogle_switchon() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickswitchon_RL();
    }
	
	@Test (priority = 2)
    public void TC_004_toogle_switchoff() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickswitchoff_RL();
    }
	
	@Test (priority = 3)
    public void TC_005_Verification_of_list_of_associated_clients(){
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 4)
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_RL();
	}
	
	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarrow_RL();
		dashboard.approvbtn_RL();	
    }
	
	@Test (priority = 7, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_010_reportee_dropdown() throws InterruptedException{
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteedd_Editor();
		Thread.sleep(2000);
		dashboard.reporteename_RL();

	}
	
	@Test (priority = 8)
    public void TC_011_Verification_of_filter_reset_operation(){
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.reporteeydd_RL();
	}
	
	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_162_Verification_of_count1() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.notstartedyet_RL();
    }
	
	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_249_Verification_of_visibility_of_consumed_hours1() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.consumedhrs_RL();
    }
		
	
	@Test (priority = 11)
    public void TC_295_() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.financialdd_RL();
        dashboard.yearr_RL();
        dashboard.calculate_RL();

    }
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
