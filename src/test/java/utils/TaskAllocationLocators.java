package utils;

import org.openqa.selenium.By;

public class TaskAllocationLocators {
	public By tasksAllocationTab_RL = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(5)");
	
	public By tasksAllocationTab_Editor = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(7)");
	
	public By tasksAllocationTab_Viewer = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(7)");
	
	public By tasksAllocationTab_HR = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(7)");
	
	public By tasksAllocationTab_PL = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(7) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1)");
	
	public By TasksAllocationTabTitle = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
	public By AddTaskTabTitle = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(8) div[role='presentation'] > .appmagic-label-text");
	public By createTask = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(19) > div > div > div > div > button");
	public By employeeDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(16)");
	public By chooseEmployee = By.cssSelector("body > div.drop.drop-element.drop-enabled.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open.drop-open-transitionend.drop-after-open");
	public By clientDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(15)");
	public By chooseClient = By.cssSelector("body > div.drop.drop-element.drop-abutted.drop-abutted-left.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open-transitionend.drop-enabled.drop-open.drop-after-open");
	public By projectDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(17)");
	public By chooseProject = By.cssSelector("div[role='listbox'] > div:nth-of-type(3)");
	
	public By chooseProject_Editor = By.cssSelector("body > div:nth-child(13) > div > div > div > div:nth-child(2)");
	
	public By chargeCodeDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(25)");
	public By choosechargeCode = By.cssSelector("body > div.drop.drop-element.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open-transitionend.drop-enabled.drop-open.drop-after-open");
	public By ActivityTypeDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(26)");
	public By chooseActivityType = By.cssSelector("body > div.drop.drop-element.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open-transitionend.drop-enabled.drop-open.drop-after-open");
	public By TaskDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(41)");
	public By chooseTask = By.cssSelector("body > div.drop.drop-element.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open-transitionend.drop-enabled.drop-open.drop-after-open");
	public By enterEstimateHours = By.cssSelector(".appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");
	public By BillableDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(34)");
	public By BillableOption = By.cssSelector(".appmagic-dropdownFlyout > div[role='listbox']");
	public By confirmBill = By.cssSelector("body > div.drop.drop-element.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open-transitionend.drop-enabled.drop-open.drop-after-open");
	
	public By notesTextbox = By.cssSelector(".appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
public By searchBox = By.cssSelector(".appmagic-textbox > input[title='Search by Task Name or Employee Name']");
    public By refreshBtn = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(8) .powerapps-icon");
    
    public By alertIcon_RL = By.cssSelector("div:nth-of-type(7) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8) div[title^='Alert! Few hours left to consume. Please increase them if ne']");
    
    public By alertIcon_Editor = By.cssSelector("div:nth-of-type(6) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8) div[title^='Alert! Few hours left to consume. Please increase them if ne']");
    
    public By alertIcon_Viewer = By.cssSelector("div:nth-of-type(6) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8) div[title^='Alert! Few hours left to consume. Please increase them if ne']");
    
    public By alertIcon_HR = By.cssSelector("div:nth-of-type(6) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8) div[title^='Alert! Few hours left to consume. Please increase them if ne']");
    
    public By alertIcon_PL = By.cssSelector("div:nth-of-type(4) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8) div[title^='Alert! Few hours left to consume. Please increase them if ne']");
    
    public By createBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(43) > div > div > div > div > button");
    
    public By endDate = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(36) > div > div > div > div > input");
    
    public By selectTask = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) div[title='Non-Billable Task']");
    
    public By selectTask_PL = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) div[title='Billable Task']");
    
    public By editTaskIcon = By.xpath("//div[@data-control-name=\"Icon1_18\"]");
    
    public By deleteTaskIcon = By.xpath("//div[@data-control-name=\"Icon3_3\"]");
    public By deleteConfirm = By.xpath("//div[@data-control-name=\"Button2_40\"]");
    
    public By estHoursEdit = By.cssSelector(".appmagic-textbox > input[title='EstimatedHoursAllocated']");
    
    public By editSaveBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(7) > div > div > div:nth-child(11) > div > div > div > div > button > div");
    
    public By addNotesEdit = By.cssSelector(".appmagic-textbox > input[title='Notes']");
    
    public By reallocBtn_RL = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8)");
    
    public By reallocBtn_Editor = By.cssSelector("div:nth-of-type(4) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8)");
    
    public By reallocBtn_PL = By.cssSelector("div:nth-of-type(4) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(9)");
    
    public By assignBtn = By.cssSelector(".canvasContentDiv.container_15kk9bh > div > div:nth-of-type(10) button > .appmagic-button.center.middle");
    
    public By reClickAssignBtn = By.cssSelector(".canvasContentDiv.container_15kk9bh > div > div:nth-of-type(12)");
    
    public By assignEmployeeDiv = By.cssSelector(".canvasContentDiv.container_15kk9bh > div > div:nth-of-type(13)");
    
    public By allocateHrs = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(21) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(5) > div > div > div > div > input");
	
    public By validateBtn = By.cssSelector("div:nth-of-type(24) button > .appmagic-button.center.middle");
    
    public By continueAssignBtn = By.cssSelector("div:nth-of-type(23) button > .appmagic-button.center.middle > .appmagic-button-label");
    
    public By deleteReallocTask = By.cssSelector("div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(9)");
    
    public By reallocateTask = By.cssSelector("div:nth-of-type(25) button > .appmagic-button.center.middle > .appmagic-button-label");
    
    public By pencilIcon = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(9)");
    
    public By allocateHrsToMainEmployee = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(5) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");
}
