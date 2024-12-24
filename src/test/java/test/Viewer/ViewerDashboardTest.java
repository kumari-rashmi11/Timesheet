package test.Viewer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.DashboardPage;

public class ViewerDashboardTest extends BaseTest {

	@Test (priority = 1)
    public void Navigate_to_dashboard() {
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_Viewer();
    }
	
	@Test (priority = 1, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_001_drill_down() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Viewer();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
    }
 
	@Test (priority = 2, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_002_Click_reportee() {
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.clickreportee_Viewer();
    }
    
    @Test (priority = 3, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_BlackUserButton() {
    	Navigate_to_dashboard();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.blackuser_Viewer();
    }
	
	
	@Test (priority = 4, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchon() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchon_Viewer();
    }
	
	@Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchoff() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		dashboard.switchoff_Viewer();
    }
	
	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_005_Verification_of_list_of_associated_clients(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 7, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 8, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Viewer();
	}
	
	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_008__total_billable_and_non_billable_hour_according_to_year_dropdown(){
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd_Viewer();
	}
	
	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_010_reportee_dropdown() throws InterruptedException{
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Viewer();
		Thread.sleep(2000);
		dashboard.repname_Viewer();

	}
	
	@Test (priority = 11, dependsOnMethods = {"TC_002_Click_reportee"})
    public void TC_011_Verification_of_filter_reset_operation() throws InterruptedException{
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Viewer();
		Thread.sleep(2000);
		dashboard.repname_Viewer();
		Thread.sleep(2000);
		dashboard.filterbtn_Viewer();
	}
	
	@Test (priority = 12, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_162_Verification_of_count() {
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
        dashboard.notstartedyet_Viewer();
    }
	
	@Test (priority = 13, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet() throws InterruptedException{
		Navigate_to_dashboard();
		DashboardPage dashboard= new DashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repdd_Viewer();
		Thread.sleep(2000);
		dashboard.repname_Viewer();

	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
 } 
	
}
