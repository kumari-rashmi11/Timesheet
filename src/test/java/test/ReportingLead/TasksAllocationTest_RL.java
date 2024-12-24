package test.ReportingLead;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.TasksAllocationPage;

public class TasksAllocationTest_RL extends BaseTest {

	public void initialTestForRL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);

		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
		nt.clickTeamsBtn();
		nt.clickTimesheetBtn();
		nt.clickTimesheetLink();

		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("RL"));
		interact.executeWithDelay(() -> tasks.clickTasksAllocationTab_RL());
		Assert.assertEquals(tasks.isTasksAllocationPage(), "Tasks");
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Remaining_hours_alert_icon_TC_295_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.alertIconHover_RL());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Create_New_Task_TC_041_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickCreateTaskBtn());
		Assert.assertEquals(tasks.isAddTasksPage(), "Create Task ");
		interact.executeWithDelay(() -> tasks.selectEmployeeDiv());
		interact.executeWithDelay(() -> tasks.chooseFromEmployee());
		interact.executeWithDelay(() -> tasks.selectClientDiv());
		interact.executeWithDelay(() -> tasks.chooseFromClient());
		interact.executeWithDelay(() -> tasks.selectProjectDiv());
		interact.executeWithDelay(() -> tasks.chooseFromProject());
		interact.executeWithDelay(() -> tasks.selectChargeCodeDiv());
		interact.executeWithDelay(() -> tasks.chooseChargeCode());
		interact.executeWithDelay(() -> tasks.selectActivityType());
		interact.executeWithDelay(() -> tasks.chooseActivityType());
		interact.executeWithDelay(() -> tasks.estimateHouse());
		interact.executeWithDelay(() -> tasks.selectBillableDiv());
		interact.executeWithDelay(() -> tasks.confirmBillOption());
		interact.executeWithDelay(() -> tasks.enterEndDate());
		interact.executeWithDelay(() -> tasks.enterNotes());
		interact.executeWithDelay(() -> tasks.selectTask());
		interact.executeWithDelay(() -> tasks.chooseTask());
//		interact.executeWithDelay(() -> tasks.clickCreateBtn());

	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Edit_Task_TC_042_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickSelectTask());
		interact.executeWithDelay(() -> tasks.clickEditTaskIcon());
		interact.executeWithDelay(() -> tasks.estHourEdit());
		interact.executeWithDelay(() -> tasks.addNoteEdit());
		interact.executeWithDelay(() -> tasks.saveEditedTask());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Delete_Task_TC_043_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickSelectTask());
		interact.executeWithDelay(() -> tasks.clickDeleteTaskIcon());
//		interact.executeWithDelay(() -> tasks.clickDeleteConfirm());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Search_Operation_TC_044_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.searchEmployee());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_Reset_Operation_TC_045_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.searchEmployee());
		interact.executeWithDelay(() -> tasks.refreshEmployeelist());
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Only_Active_Employee_Visibility_for_Reallocation_Task_TC_282_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickreallocBtn_RL());
		interact.executeWithDelay(() -> tasks.clickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickAssignEmployeeDiv());
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Task_Reallocation_Operation_TC_132_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickreallocBtn_RL());
		interact.executeWithDelay(() -> tasks.clickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.allocateHours());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
		interact.executeWithDelay(() -> tasks.reClickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
//		interact.executeWithDelay(()-> tasks.clickReallocateTask());
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Modification_of_Reallocated_Task_TC_133_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickreallocBtn_RL());
		interact.executeWithDelay(() -> tasks.clickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.allocateHours());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
		interact.executeWithDelay(() -> tasks.reClickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
//		interact.executeWithDelay(()-> tasks.clickReallocateTask());
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Delete_operation_of_reallocation_task_TC_134_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickreallocBtn_RL());
		interact.executeWithDelay(() -> tasks.clickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.clickDeleteReallocTask());
	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void Cannot_Allocate_hours_above_consumed_TC_164_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickreallocBtn_RL());
		interact.executeWithDelay(() -> tasks.clickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.clickPencilIcon());
		interact.executeWithDelay(() -> tasks.allocateHrsToMainEmployee());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void Only_Active_Employee_Visibility_for_Task_Allocation_TC_278_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickCreateTaskBtn());
		Assert.assertEquals(tasks.isAddTasksPage(), "Create Task ");
		interact.executeWithDelay(() -> tasks.selectEmployeeDiv());
	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void Saving_Reallocated_Task_after_Edit_TC_135_RL() {
		TasksAllocationPage tasks = new TasksAllocationPage(driver);
		Interactions interact = new Interactions(driver);
		initialTestForRL();
		interact.executeWithDelay(() -> tasks.clickreallocBtn_RL());
		interact.executeWithDelay(() -> tasks.clickAssignBtn());
		interact.executeWithDelay(() -> tasks.clickContinueAssignBtn());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
		interact.executeWithDelay(() -> tasks.allocateHours());
		interact.executeWithDelay(() -> tasks.clickValidateBtn());
//		interact.executeWithDelay(()-> tasks.clickReallocateTask());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
