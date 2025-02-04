package test.HumanResource;

import pages.DashboardPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import helper.RoleSelection;


public class HRDashboardTest extends BaseTest {
	
  
    public void initial_test() throws InterruptedException {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
		roleSelectionPage.timesheetNavigation(); 
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.HRRoleBtn();
	   
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_HR();
    }  
     
    @Test (priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void GreenRlButton() throws InterruptedException {
    	initial_test();
    	DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickGreenRlButton_HR();
    }
    
    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void PurplePlButton() throws InterruptedException {
    	initial_test();   
    	DashboardPage dashboard= new DashboardPage(driver);
      dashboard.clickPurplePlButton_HR();
    }
    
    @Test (priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void BlackUserButton() throws InterruptedException {
    	initial_test();
    	DashboardPage dashboard= new DashboardPage(driver);
      dashboard.clickBlackUserButton_HR();
    }
    
    @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
    

    }


