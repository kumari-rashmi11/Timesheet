package test;

import pages.RoleSelectionPage;
import pages.TimesheetDashboardpage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;


public class TimesheetDashboardTest extends BaseTest {

    @Test (priority = 1)
    public void different_colour_clues() {
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
        dashboard.navigateToDashboard();
    }  
     
    @Test (priority = 2, dependsOnMethods = {"different_colour_clues"})
    public void GreenRlButton() {
    	different_colour_clues();
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
        dashboard.clickGreenRlButton();
    }
    
    @Test (priority = 3, dependsOnMethods = {"different_colour_clues"})
    public void PurplePlButton() {
    	different_colour_clues();
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
      dashboard.clickPurplePlButton();
    }
    
    @Test (priority = 4, dependsOnMethods = {"different_colour_clues"})
    public void BlackUserButton() {
    	different_colour_clues();
        TimesheetDashboardpage dashboard= new TimesheetDashboardpage(driver);
      dashboard.clickBlackUserButton();
    }
    
    @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
    

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,100)");

    }


