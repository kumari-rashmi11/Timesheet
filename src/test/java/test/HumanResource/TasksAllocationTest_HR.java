package test.HumanResource;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TasksAllocationPage;

public class TasksAllocationTest_HR extends BaseTest {
	public void initialTestFor_HR() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("HR"));
		interact.executeWithDelay(() -> tasks.clickTasksAllocationTab_HR());
		Assert.assertEquals(tasks.isTasksAllocationPage(), "Tasks");
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Remaining_hours_alert_icon_TC_295_HR() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_HR();
		interact.executeWithDelay(() -> tasks.alertIconHover_HR());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Search_Operation_TC_044_HR() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_HR();
		interact.executeWithDelay(() -> tasks.searchEmployee());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_Reset_Operation_TC_045_HR() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_HR();
		interact.executeWithDelay(() -> tasks.searchEmployee());
		interact.executeWithDelay(() -> tasks.refreshEmployeelist());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
