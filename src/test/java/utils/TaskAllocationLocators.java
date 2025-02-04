package utils;

import org.openqa.selenium.By;

public class TaskAllocationLocators {
	public By tasksAllocationTab = By.xpath("//div[contains(text(), 'Tasks Allocation')]//ancestor::div[@class='container_1f0sgyp']//child::div[position()=1]");
	
	public By tasksAllocationTabafterSelectTask = By.xpath("(//div[contains(text(), 'Tasks Allocation')]//ancestor::div[@class='container_1f0sgyp']//child::div)[4]");
	
	public By TasksAllocationTabTitle = By.xpath("//div[@data-control-name='ScreenNameLbl']//descendant::div[text()='Tasks']");
	
	public By AddTaskTabTitle = By.xpath("//div[text()='Create Task ']");
	
	public By createTask = By.xpath("//div[text()='Create Task']//ancestor::button");
	
	public By employeeDiv = By.xpath("//div[@data-control-name='DropdownEmp']");
	
	public By chooseEmployee = By.xpath("//div[contains(text(), 'Abhigyan')]");
	
	public By clientDiv = By.xpath("//div[@data-control-name='DropdownClient']");
	
	public By chooseClient = By.xpath("//div[contains(text(), 'Alpha')]");
	
	public By projectDiv = By.xpath("//div[@data-control-name='DropdownProject']");
	
	public By chooseProject = By.xpath("//div[contains(text(), 'abcd')]");
	
	public By chargeCodeDiv = By.xpath("//div[@data-control-name='DropdownChargeCode']");
	
	public By choosechargeCode = By.xpath("//div[contains(text(), 'SETUDS14')]");
	
	public By ActivityTypeDiv = By.xpath("//div[@data-control-name='DropdownActivity']");
	
	public By chooseActivityType = By.xpath("//div[contains(text(), 'Planning')]");
	
	public By TaskDiv = By.xpath("//div[@data-control-name='Dropdowntask']");
	
	public By chooseTask = By.xpath("//div[contains(text(), 'Enhancement-SET')]");
	
	public By enterEstimateHours = By.xpath("//div[@data-control-name='EstimateHours']//descendant::input");
	
	public By BillableDiv = By.xpath("//div[@data-control-name='DropdownBillable']");
	
	public By BillableOption = By.xpath("//div[text() = 'Yes']");
	
	public By confirmBill = By.xpath("//div[text() = 'Yes']");
	
	public By notesTextbox = By.xpath("//div[@data-control-name='AreaNotes']//descendant::textarea");
	
	public By search_Box = By.xpath("//input[@placeholder='Search here']");
	
	public By refreshIcon = By.xpath("//div[@data-control-name='TasksResetIcon']");
    
    public By alertIcon = By.xpath("//div[@title='Alert! Few hours left to consume. Please increase them if ne']");
    
    public By createBtn = By.xpath("//div[text()='Create']//ancestor::button");
    
    public By startDate = By.xpath("//div[@data-control-name='StartDateInp']//descendant::input");
    
    public By endDate = By.xpath("//div[@data-control-name='EndDateInp']//descendant::input");
    
    public By selectTask = By.xpath("//div[contains(@title, 'Billable') and @aria-hidden='true']");
     
    public By editTaskIcon = By.xpath("//div[@data-control-name=\"Icon1_18\"]");
    
    public By deleteTaskIcon = By.xpath("//div[@data-control-name=\"Icon3_3\"]");
    public By deleteConfirm = By.xpath("//div[@data-control-name=\"Button2_40\"]");
    
    public By estHoursEdit = By.xpath("//input[@title='EstimatedHoursAllocated']");
    
    public By editSaveBtn = By.xpath("//div[text() = 'Save']//ancestor::button");
    
    public By addNotesEdit = By.xpath("//input[@title='Notes']");
    
    public By reallocBtn = By.xpath("(//div[text()='Realloc'])[1]");
    
    public By assignBtn = By.xpath("//div[text()='Assign']//ancestor::button");
    
    public By selectEmployeeAssign = By.xpath("(//div[@role='listbox']//div[@role='option'])[3]");
    
    public By assignEmployeeDiv = By.xpath("//div[@data-control-name='empname']");
    
    public By allocateHrs = By.xpath("//div[@aria-posinset='2']//input[@appmagic-control='TextInput2_1textbox']");
	
    public By validateBtn = By.xpath("//div[text()='Validate']//ancestor::button");
    
    public By continueAssignBtn = By.xpath("//div[text()='Continue']//ancestor::button");
    
    public By deleteReallocTask = By.xpath("//div[@data-control-name='Icon2_4']");
    
    public By reallocateTask = By.xpath("//div[text()='Reallocate']//ancestor::button");
    
    public By pencilIcon = By.xpath("//div[@data-control-name='Icon2']");
    
    public By allocateHrsToMainEmployee = By.xpath("//div[@aria-posinset='1']//input[@appmagic-control='TextInput2_1textbox']");
}