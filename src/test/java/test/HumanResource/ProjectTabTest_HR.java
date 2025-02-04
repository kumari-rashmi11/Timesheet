package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ProjectTab;

public class ProjectTabTest_HR extends BaseTest {

	public void initiaTest() throws InterruptedException {
	    ProjectTab projectTab = new ProjectTab(driver);  
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
		roleSelectionPage.timesheetNavigation(); 
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.HRRoleBtn();
			projectTab.SelectProjectTabHr();
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_032_SearchProject_HR() throws InterruptedException  {
		String projectName = "Sample Project";
	    ProjectTab projectTab = new ProjectTab(driver);  
		initiaTest();
		projectTab.SearchProject(projectName);
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_033_RefreshProject_HR() throws InterruptedException {
		String projectName = "Sample Project";
		initiaTest();
	    ProjectTab projectTab = new ProjectTab(driver);  
		projectTab.RefreshProject(projectName);
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}