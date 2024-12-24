package test.Editor;

import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;

import pages.ProjectTab;

public class ProjectTabTest_Editor extends BaseTest {

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
		interactions.executeWithDelay(() -> roleSelection.selectRole("Editor"));

	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_028_AddProject_Editor() throws InterruptedException {
		initiaTest();
		String projectName = "Sample Project";
		String notes = "Project notes";
		String description = "Project description";
		projectTab.addProject(projectName, notes, description);
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_032_SearchProject_Editor() throws InterruptedException {
		String projectName = "Sample Project";
		initiaTest();

		projectTab.SearchProject(projectName);
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_033_RefreshProject_Editor() throws InterruptedException {
		String projectName = "Sample Project";
		initiaTest();

		projectTab.RefreshProject(projectName);
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_029_EditProject_Editor() throws InterruptedException {
		String updatedDescription = "Updated project description";
		String updatedNotes = "Updated project notes";
		initiaTest();

		projectTab.EditProjectDetails(updatedDescription, updatedNotes);
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_031_DeleteProject_Editor() throws InterruptedException {
		initiaTest();

		projectTab.DeleteProject();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_030_AddChargeCode_Editor() throws InterruptedException {
		initiaTest();

		ProjectTab projectTab = new ProjectTab(driver);
		projectTab.AddChargeCode("Charge Code Notes", "Charge Code Description");
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC_281_ActiveClientVisibility_Editor() throws InterruptedException {
		initiaTest();
		projectTab.Activeclientvisibility();
		System.out.println("Done");
	}

}
