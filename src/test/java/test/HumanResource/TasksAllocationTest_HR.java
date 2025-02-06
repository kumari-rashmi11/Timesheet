package test.HumanResource;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.TaskAllocationDataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TasksAllocationPage;

public class TasksAllocationTest_HR extends BaseTest {
	public void initialTestFor_HR() throws InterruptedException {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
////      roleSelectionPage.switchToIframe();
//      // Select the desired role 
//		roleSelectionPage.timesheetNavigation(); 
//		roleSelectionPage.iframeSwitch1();
//		roleSelectionPage.iframeSwitch2();
//		roleSelectionPage.HRRoleBtn();
	
		interact.executeWithDelay(() -> tasks.clickTasksAllocationTab());
		Assert.assertEquals(tasks.isTasksAllocationPage(), "Tasks");
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Remaining_hours_alert_icon_TC_295_HR() throws InterruptedException {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_HR();
		interact.executeWithDelay(() -> tasks.alertIconHover());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class,dataProvider = "search", dataProviderClass = TaskAllocationDataProvider.class)
	public void Search_Operation_TC_044_HR(String search) throws InterruptedException {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_HR();
		interact.executeWithDelay(() -> tasks.searchEmployee(search));
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class, dataProvider = "search", dataProviderClass = TaskAllocationDataProvider.class)
	public void Search_and_Reset_Operation_TC_045_HR(String search) throws InterruptedException {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestFor_HR();
		interact.executeWithDelay(() -> tasks.searchEmployee(search));
		interact.executeWithDelay(() -> tasks.refreshEmployeelist());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}