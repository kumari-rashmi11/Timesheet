package test.PracticeLead;

import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ProjectTab;

public class ProjectTabTest_PL extends BaseTest {
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
		interactions.executeWithDelay(() -> roleSelection.selectRole("PL"));

	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_028_AddProject_PL() throws InterruptedException {
		initiaTest();
		String projectName = "Sample Project";
		String notes = "Project notes";
		String description = "Project description";
		projectTab.addProject(projectName, notes, description);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.ProjectNameInputText),
		// "Project was not added successfully.");
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_032_SearchProject_PL() throws InterruptedException {
		initiaTest();

		String projectName = "Sample Project";
		projectTab.SearchProject(projectName);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.searchInputSelector),
		// "Project search functionality is not working as expected.");
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_033_RefreshProject_PL() throws InterruptedException {
		initiaTest();

		String projectName = "Sample Project";

		projectTab.RefreshProject(projectName);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.searchInputSelector),
		// "Project search functionality is not working as expected.");
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_029_EditProject_PL() throws InterruptedException {
		initiaTest();

		String updatedDescription = "Updated project description";
		String updatedNotes = "Updated project notes";

		projectTab.EditProjectDetails(updatedDescription, updatedNotes);
		// Assert.assertTrue(interactions.isElementDisplayed(Project_Locators.ProjectNameInputText),
		// "Project edit functionality is not working as expected.");
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_031_DeleteProject_PL() throws InterruptedException {
		initiaTest();

		projectTab.DeleteProject();
		// Assert.assertFalse(interactions.isElementDisplayed(Project_Locators.ProjectNameInputText),
		// "Project delete functionality is not working as expected.");
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_030_AddChargeCode_PL() throws InterruptedException {
		initiaTest();

		projectTab.AddChargeCode("Charge Code Notes", "Charge Code Description");
		// Assert.assertTrue(interactions.isElementPresent(Project_Locators.Notes),
		// "Charge code added successfully");
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC_281_ActiveClientVisibility_PL() throws InterruptedException {
		initiaTest();
		projectTab.Activeclientvisibility();
		// Assert.assertTrue(interactions.isElementPresent(Project_Locators.Notes),
		// "Charge code added successfully");
	}
}
