package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.TaskAllocationLocators;

public class TasksAllocationPage {
	WebDriver driver;
	WebDriverWait wait;
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
    }

	
	public void clickTasksAllocationTab_RL() {
		interact.clickElement(locator.tasksAllocationTab_RL);
	}
	
	public void clickTasksAllocationTab_Editor() {
		interact.clickElement(locator.tasksAllocationTab_Editor);
	}
	
	public void clickTasksAllocationTab_Viewer() {
		interact.clickElement(locator.tasksAllocationTab_Viewer);
	}
	
	public void clickTasksAllocationTab_HR() {
		interact.clickElement(locator.tasksAllocationTab_HR);
	}
	
	public void clickTasksAllocationTab_PL() {
		interact.clickElement(locator.tasksAllocationTab_PL);
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
		interact.clickElement(locator.chooseProject_Editor);
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
	
	public void estimateHouse() {    	
		interact.sendingKeys(locator.enterEstimateHours, "153");
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
	
	public void enterEndDate() {
    	interact.sendingKeys(locator.endDate, "30-Nov-2024");
    }
	
	public void searchEmployee() {
    	interact.sendingKeys(locator.searchBox, "Aarav");
    }
    
	public void clickCreateBtn() {
    	interact.clickElement(locator.createBtn);
    }
    
    public void alertIconHover_RL() {
        try {
            WebElement ele = interact.visibilityEle(locator.alertIcon_RL);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void alertIconHover_Editor() {
        try {
            WebElement ele = interact.visibilityEle(locator.alertIcon_Editor);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void alertIconHover_Viewer() {
        try {
            WebElement ele = interact.visibilityEle(locator.alertIcon_Viewer);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void alertIconHover_HR() {
        try {
            WebElement ele = interact.visibilityEle(locator.alertIcon_HR);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void alertIconHover_PL() {
        try {
            WebElement ele = interact.visibilityEle(locator.alertIcon_PL);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void refreshEmployeelist() {
    	interact.clickElement(locator.refreshBtn);
    }

    public void clickSelectTask() {
    	interact.clickElement(locator.selectTask);
    }
    
    public void clickSelectTask_PL() {
    	interact.clickElement(locator.selectTask_PL);
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
    	interact.clickElement(locator.deleteConfirm);
    }
    
    public void clickreallocBtn_RL() {
    	interact.clickElement(locator.reallocBtn_RL);
    }
    
    public void clickreallocBtn_Editor() {
    	interact.clickElement(locator.reallocBtn_Editor);
    }
    
    public void clickreallocBtn_PL() {
    	interact.clickElement(locator.reallocBtn_PL);
    }
    
    public void clickAssignBtn() {
    	interact.clickElement(locator.assignBtn);
    }
    
    public void reClickAssignBtn() {
    	interact.clickElement(locator.reClickAssignBtn);
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
