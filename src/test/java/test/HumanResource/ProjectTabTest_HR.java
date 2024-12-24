package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.ProjectTab;

public class ProjectTabTest_HR extends BaseTest {
	private ProjectTab projectTab;
	private Interactions interactions;

	@BeforeMethod
	public void setUp() {
		projectTab = new ProjectTab(driver);
		interactions = new Interactions(driver);
		
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)

	public void initiaTest() {
		
//		RoleSelection roleSelection = new RoleSelection(driver);
//
//		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//		nt.clickTeamsBtn();
//		nt.clickTimesheetBtn();
//		nt.clickTimesheetLink();
//		interactions.executeWithDelay(() -> roleSelection.iframeSwitch1());
//		interactions.executeWithDelay(() -> roleSelection.iframeSwitch2());
//		interactions.executeWithDelay(() -> roleSelection.selectRole("HR"));
		projectTab.SelectProjectTabHr();
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_032_SearchProject_HR() throws InterruptedException {
		String projectName = "Sample Project";
		initiaTest();
		projectTab.SearchProject(projectName);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.searchInputSelector),
		// "Project search functionality is not working as expected.");
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_033_RefreshProject_HR() throws InterruptedException {
		String projectName = "Sample Project";
		initiaTest();
		projectTab.RefreshProject(projectName);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.searchInputSelector),
		// "Project search functionality is not working as expected.");
	}

	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
}
