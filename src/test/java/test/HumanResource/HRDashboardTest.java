package test.HumanResource;

import pages.DashboardPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import helper.RoleSelection;


public class HRDashboardTest extends BaseTest {
	
//	public void initiaTest() {
//		RoleSelection roleSelection = new RoleSelection(driver);
//		roleSelection.iframeSwitch1();
//		roleSelection.iframeSwitch2();
//		roleSelection.selectRole("HR");
//	}

    @Test (priority = 1,retryAnalyzer = RetryAnalyzer.class)
    public void different_colour_clues() {
        DashboardPage dashboard= new DashboardPage(driver);
        dashboard.navigateToDashboard_HR();
    }  
     
    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void GreenRlButton() {
    	different_colour_clues();
    	DashboardPage dashboard= new DashboardPage(driver);
        dashboard.clickGreenRlButton_HR();
    }
    
    @Test (priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void PurplePlButton() {
    	different_colour_clues();
    	DashboardPage dashboard= new DashboardPage(driver);
      dashboard.clickPurplePlButton_HR();
    }
    
    @Test (priority = 4, retryAnalyzer = RetryAnalyzer.class)
    public void BlackUserButton() {
    	different_colour_clues();
    	DashboardPage dashboard= new DashboardPage(driver);
      dashboard.clickBlackUserButton_HR();
    }
    
    @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
    

    }


