package test.Viewer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TasksAllocationPage;

public class TasksAllocationTest_Viewer extends BaseTest {
	public void initialTestFor_Viewer() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Viewer"));
		interact.executeWithDelay(() -> tasks.clickTasksAllocationTab_Viewer());
		Assert.assertEquals(tasks.isTasksAllocationPage(), "Tasks");
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Remaining_hours_alert_icon_TC_295_Viewer() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_Viewer();
		interact.executeWithDelay(() -> tasks.alertIconHover_Viewer());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Search_Operation_TC_044_Viewer() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_Viewer();
		interact.executeWithDelay(() -> tasks.searchEmployee());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_Reset_Operation_TC_045_Viewer() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_Viewer();
		interact.executeWithDelay(() -> tasks.searchEmployee());
		interact.executeWithDelay(() -> tasks.refreshEmployeelist());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
