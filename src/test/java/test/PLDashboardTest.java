package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.EditorDashboardPage;
import pages.PLDashboardPage;
import pages.RoleSelectionPage;
import pages.ViewerDashboardPage;

public class PLDashboardTest extends BaseTest {

	@Test (priority = 1)
    public void Navigate_to_dashboard() {
		PLDashboardPage dashboard= new PLDashboardPage(driver);
        dashboard.navigateToDashboard();
    }
	
	@Test (priority = 2, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_002_Click_reportee() {
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		dashboard.reporteePL();
    }
	
	@Test (priority = 3, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchon() {
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		dashboard.switchonPL();
    }
	
	@Test (priority = 4, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_004_toogle_switchoff() {
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		dashboard.switchoffPL();
    }
	
	@Test (priority = 5, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_005_Verification_of_list_of_associated_clients(){
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	@Test (priority = 6, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_006_Verification_of_list_of_claimed_tasks_by_direct_reportees(){
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
	}
	
	
	@Test (priority = 7, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_007_Verification_of_claimed_task_hours_change_with_Financial_year_dropdown(){
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.clickyeardd();
	}
	
	@Test (priority = 8, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_009_navigation_to_submitted_timesheet_for_approval_or_rejection(){
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.rightarrowPL();
		dashboard.approvebtnPL();	
    }
	
	@Test (priority = 9, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_010_reportee_dropdown() throws InterruptedException{
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repddPL();
		Thread.sleep(2000);
		dashboard.repnamePL();

	}
	
	@Test (priority = 10, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_011_Verification_of_filter_reset_operation() throws InterruptedException{
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repddPL();
		Thread.sleep(2000);
		dashboard.repnamePL();
		Thread.sleep(2000);
		dashboard.filterbtnPL();
	}
	
	@Test (priority = 11, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_162_Verification_of_count() {
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
        dashboard.notstartedyet();
    }
	
	@Test (priority = 12, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_249_Verification_of_visibility_of_consumed_hours() {
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
        dashboard.consumedhrs();
    }
	
	@Test (priority = 13, dependsOnMethods = {"Navigate_to_dashboard"})
    public void TC_250_Verification_of_visibility_of_submitted_or_partially_submitted_timesheet() throws InterruptedException{
		Navigate_to_dashboard();
		PLDashboardPage dashboard= new PLDashboardPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("Scrolling operation completed successfully.");
		dashboard.repddPL();
		Thread.sleep(2000);
		dashboard.repnamePL();

	}
	
	
	
	
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
 } 
 
}