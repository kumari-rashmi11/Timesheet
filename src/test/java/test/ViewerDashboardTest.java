package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.ViewerDashboardPage;

public class ViewerDashboardTest extends BaseTest {

	@Test (priority = 1)
    public void Navigate_to_dashboard() {
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
        dashboard.navigateToDashboard();
    }
 
	@Test (priority = 2, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_002_Click_reportee() {
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		dashboard.clickreporteeViewer();
    }
    
    @Test (priority = 3, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_003_BlackUserButton() {
    	Navigate_to_dashboard();
    	ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
    	dashboard.blackuserViewer();
    }
	
	
	@Test (priority = 4, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchon() {
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		dashboard.switchonViewer();
    }
	
	@Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchoff() {
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		dashboard.switchoffViewer();
    }
	
	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_005_Verification_of_list_of_associated_clients(){
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 7, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 8, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd();
	}
	
	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_008__total_billable_and_non_billable_hour_according_to_year_dropdown(){
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd();
	}
	
	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_010_reportee_dropdown() throws InterruptedException{
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repddViewer();
		Thread.sleep(2000);
		dashboard.repnameViewer();

	}
	
	@Test (priority = 11, dependsOnMethods = {"TC_002_Click_reportee"})
    public void TC_011_Verification_of_filter_reset_operation() throws InterruptedException{
		Navigate_to_dashboard();
		ViewerDashboardPage dashboard= new ViewerDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repddViewer();
		Thread.sleep(2000);
		dashboard.repnameViewer();
		Thread.sleep(2000);
		dashboard.filterbtn();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
 } 
	
}
