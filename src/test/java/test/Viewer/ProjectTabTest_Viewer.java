package test.Viewer;

import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;

import pages.ProjectTab;

public class ProjectTabTest_Viewer extends BaseTest {
	private ProjectTab projectTab;
	private Interactions interactions;

	public void setUp() {
		projectTab = new ProjectTab(driver);
		interactions = new Interactions(driver);
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)

	public void initiaTest() {
		RoleSelection roleSelection = new RoleSelection(driver);
		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();
		interactions.executeWithDelay(() -> roleSelection.iframeSwitch1());
		interactions.executeWithDelay(() -> roleSelection.iframeSwitch2());
		interactions.executeWithDelay(() -> roleSelection.selectRole("Viewer"));
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_032_SearchProject_Viewer() throws InterruptedException {
		initiaTest();
		String projectName = "Sample Project";
		Thread.sleep(5000);
		projectTab.SearchProject(projectName);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.searchInputSelector),
		// "Project search functionality is not working as expected.");
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_033_RefreshProject_Viewer() throws InterruptedException {
		initiaTest();

		String projectName = "Sample Project";

		projectTab.RefreshProject(projectName);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.searchInputSelector),
		// "Project search functionality is not working as expected.");
	}
//    

}
