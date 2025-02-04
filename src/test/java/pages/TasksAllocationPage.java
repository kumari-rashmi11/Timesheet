package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.TaskAllocationLocators;

public class TasksAllocationPage {
	WebDriver driver;
	WebDriverWait wait;
	WebDriverWait shortwait;
	Actions action;
	TaskAllocationLocators locator;
	Interactions interact;

	public TasksAllocationPage(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("Driver must be set");
		}
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.action = new Actions(driver);
		this.locator = new TaskAllocationLocators();
		this.interact = new Interactions(driver);
		this.shortwait = new WebDriverWait(driver, Duration.ofSeconds(2));
	}

	public void clickTasksAllocationTab() {
		interact.clickElement(locator.tasksAllocationTab);
	}

	public String isTasksAllocationPage() {
		return interact.getInnerText(locator.TasksAllocationTabTitle);
	}

	public void clickCreateTaskBtn() {
		interact.clickElement(locator.createTask);
	}

	public String isAddTasksPage() {
		return interact.getInnerText(locator.AddTaskTabTitle);
	}

	public void selectEmployeeDiv() {
		interact.clickElement(locator.employeeDiv);
	}

	public void chooseFromEmployee() {
		interact.clickElement(locator.chooseEmployee);
	}

	public void selectClientDiv() {
		interact.clickElement(locator.clientDiv);
	}

	public void chooseFromClient() {
		interact.clickElement(locator.chooseClient);
	}

	public void selectProjectDiv() {
		interact.clickElement(locator.projectDiv);
	}

	public void chooseFromProject() {
		interact.clickElement(locator.chooseProject);
	}

	public void selectChargeCodeDiv() {
		interact.clickElement(locator.chargeCodeDiv);
	}

	public void chooseChargeCode() {
		interact.clickElement(locator.choosechargeCode);
	}

	public void selectActivityType() {
		interact.clickElement(locator.ActivityTypeDiv);
	}

	public void chooseActivityType() {
		interact.clickElement(locator.chooseActivityType);
	}

	public void selectTask() {
		interact.clickElement(locator.TaskDiv);
	}

	public void chooseTask() {
		interact.clickElement(locator.chooseTask);
	}

	public void estimateHours() {
		interact.sendingKeys(locator.enterEstimateHours, "1153");
	}

	public void selectBillableDiv() {
		interact.clickElement(locator.BillableDiv);
	}

	public void confirmBillOption() {
		interact.clickElement(locator.confirmBill);
	}

	public void enterNotes() {
		interact.sendingKeys(locator.notesTextbox, "Testing to verify");
	}

	public void enterStartDate() {
		interact.sendingKeys(locator.startDate, "01-Jan-2025");
	}

	public void enterEndDate() {
		interact.sendingKeys(locator.endDate, "30-Jan-2025");
	}

	public void searchEmployee() {
		interact.sendingKeys(locator.search_Box, "Aarav");
	}

	public void clickCreateBtn() {
		interact.clickElement(locator.createBtn);
	}

	public void alertIconHover() {
		try {
			WebElement ele = interact.visibilityEle(locator.alertIcon);
			action.moveToElement(ele).perform();
			System.out.println("Hover action performed");
		} catch (TimeoutException e) {
			System.out.println("No alert icon found: " + e.getMessage());
		}
	}

	public void refreshEmployeelist() {
		interact.clickElement(locator.refreshIcon);
	}

	public void clickSelectTask() {
		interact.clickElement(locator.selectTask);
	}

	public void clickTaskAndEditIcon() {
		WebElement editIcon = null;
		for (int i = 6; i <= 10; i++) {
			try {
				WebElement selectTask = shortwait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//div[contains(@title, 'Billable') and @aria-hidden='true'])[" + (i + 1) + "]")));
				interact.clickElement(selectTask);
				try {
					editIcon = shortwait.until(ExpectedConditions.visibilityOfElementLocated(locator.editTaskIcon));
					if (editIcon.isDisplayed()) {
						interact.clickElement(editIcon);
						break;
					}
				} catch (TimeoutException e) {
					interact.clickElement(locator.tasksAllocationTab);
				}
			} catch (TimeoutException e) {
				i = i + 0;
			}
		}
	}

	public void clickTaskAndDeleteIcon() {
		WebElement deleteIcon = null;
		for (int i = 0; i <= 10; i++) {
			try {
				WebElement selectTask = shortwait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//div[contains(@title, 'Billable') and @aria-hidden='true'])[" + (i + 1) + "]")));
				interact.clickElement(selectTask);
				try {
					deleteIcon = shortwait.until(ExpectedConditions.visibilityOfElementLocated(locator.deleteTaskIcon));
					if (deleteIcon.isDisplayed()) {
						interact.clickElement(deleteIcon);
						break;
					}
				} catch (TimeoutException e) {
					interact.clickElement(locator.tasksAllocationTabafterSelectTask);
				}
			} catch (TimeoutException e) {
				i = i + 0;
			}
		}
	}

	public void clickEditTaskIcon() {
		interact.clickElement(locator.editTaskIcon);
	}

	public void estHourEdit() {
		interact.sendingKeys(locator.estHoursEdit, "1349");
	}

	public void addNoteEdit() {
		interact.sendingKeys(locator.addNotesEdit, "Editing for testing");
	}

	public void saveEditedTask() {
		interact.clickElement(locator.editSaveBtn);
	}

	public void clickDeleteTaskIcon() {
		interact.clickElement(locator.deleteTaskIcon);
	}

	public void clickDeleteConfirm() {
		try {
			interact.clickElement(locator.deleteConfirm);
		} catch (TimeoutException e) {
			return;
		}
	}

	public void clickreallocBtn() {
		try {
			interact.clickElement(locator.reallocBtn);
		} catch (TimeoutException e) {
			return;
		}
	}

	public void clickAssignBtn() {
		interact.clickElement(locator.assignBtn);
	}
	
	public void selectEmployeeAssign() {
		interact.clickElement(locator.selectEmployeeAssign);
	}

	public void clickAssignEmployeeDiv() {
		interact.clickElement(locator.assignEmployeeDiv);
	}

	public void clickContinueAssignBtn() {
		interact.clickElement(locator.continueAssignBtn);
	}

	public void clickDeleteReallocTask() {
		interact.clickElement(locator.deleteReallocTask);
	}

	public void allocateHours() {
		interact.clickElement(locator.allocateHrs);
		interact.sendingKeys(locator.allocateHrs, "500");
	}

	public void clickPencilIcon() {
		interact.clickElement(locator.pencilIcon);
	}

	public void allocateHrsToMainEmployee() {
		interact.clickElement(locator.allocateHrsToMainEmployee);
		interact.sendingKeys(locator.allocateHrsToMainEmployee, "1500");
	}

	public void clickValidateBtn() {
		interact.clickElement(locator.validateBtn);
	}

	public void clickReallocateTask() {
		interact.clickElement(locator.reallocateTask);
	}

}