package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.projectTabdataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ProjectTab;

public class ProjectTabTest_HR extends BaseTest {

	public void initiaTest() {
//		RoleSelection roleSelection = new RoleSelection(driver);
//		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//		Interactions interactions = new Interactions(driver);
	    ProjectTab projectTab = new ProjectTab(driver);  
//		nt.clickTeamsBtn();
//		nt.clickTimesheetBtn();
//		nt.clickTimesheetLink();
//		interactions.executeWithDelay(() -> roleSelection.iframeSwitch1());
//		interactions.executeWithDelay(() -> roleSelection.iframeSwitch2());
//		interactions.executeWithDelay(() -> roleSelection.selectRole("Editor"));
		projectTab.SelectProjectTabHr();
	}

	 @Test(priority = 1, retryAnalyzer = RetryAnalyzer.class,dataProvider = "searchProject",dataProviderClass = projectTabdataProvider.class)
	    public void TC_032_SearchProject_Hr(String projectName) throws InterruptedException {
	        initiaTest();
	    	ProjectTab projectTab = new ProjectTab(driver);  
	        projectTab.SearchProject(projectName);

	    }

	    @Test(priority = 2, retryAnalyzer = RetryAnalyzer.class,dataProvider = "searchProject",dataProviderClass = projectTabdataProvider.class)
	    public void TC_033_RefreshProject_Hr(String projectName) throws InterruptedException {
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