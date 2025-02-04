package utils;

import org.openqa.selenium.By;

public class EmployeesLocators {	
	public By employeesTab = By.xpath("(//div[contains(text(), 'Employees')]//ancestor::div[@class='container_1f0sgyp']//child::div)[1]");
	
	public By employeesTab_after_Search = By.xpath("(//div[@data-control-name='Background_selection_btn' and @data-control-id='45'])[5]");
	
	public By employeeClick = By.xpath("(//div[@data-control-name='Icon10']//descendant::div[@class='powerapps-icon no-focus-outline'])[1]");

	
	public By search_Box = By.xpath("//input[@placeholder='Search here']");
	
	public By refreshIcon = By.xpath("(//div[@data-container-name='Employees-container']//child::div[position()=5])[1]");
	
	public By currentStatus_Inactive = By.xpath("//div[text()='Inactive']");
	
	public By currentStatus_Relieved = By.xpath("//div[text()='Relieved']");
	
	public By currentStatus_Active = By.xpath("//div[text()='Active']");
	
	public By employeesTabEmployeeClick = By.xpath("(//div[@data-control-name='Background_selection_btn' and @data-control-id='45'])[5]");
	
	public By inactiveTab = By.xpath("//span[text() = 'Inactive']//parent::button");
	
	public By relievedTab = By.xpath("//span[text() = 'Relieved']//parent::button");
	
	public By eyeIcon = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(37)");
	
	public By eyeIcon_Editor = By.xpath("//div[@data-control-name='LeadHistoryViewIcon_1']");
	
	public By pencilIcon = By.xpath("//div[@data-control-name='EmpEditIcon_1']");
	
	public By leadName = By.xpath("//div[text()='Lead Name']");
	
	public By effectiveFrom = By.xpath("//div[text()='Effective From']");
	
	public By endDate = By.xpath("//div[text()='End Date']");
	
	public By requestedBy = By.xpath("//div[text()='Requested By']");
	
	public By pastAndPresentInfo = By.xpath("//div[text()='Past and Present lead Info']");
	
	public By closeBtn = By.xpath("//span[text()='Close']//ancestor::div[@data-control-name='LeadHistoryCloseBtn']");
	
	public By addBtn = By.xpath("//div[normalize-space(text()) = 'Add']//ancestor::button");
	
	public By PracticeLead = By.xpath("//label[@value='Yes']");
	
	public By firstName = By.xpath("//input[@title = 'FirstName']");
	
	public By lastName = By.xpath("//input[@title = 'LastName']");
	
	public By employeeNumber = By.xpath("//input[@title = 'Please give input with care']");
	
	public By emailInput = By.xpath("//input[@title = 'Email']");
	
	public By leadMenu = By.xpath("//div[@data-control-name = 'Lead_DataCard1']//descendant::input[@role='combobox']");
	
	public By statusDropDown = By.xpath("//div[@data-control-name='EmployeeStatusDropdown']");
	
	public By selectRelievedStatus = By.xpath("//span[contains(text(), 'Relieved')]//ancestor::li");
	
	public By selectActiveStatus = By.xpath("//span[contains(text(), 'Active')]//ancestor::li");
	
	public By selectInActiveStatus = By.xpath("//span[contains(text(), 'Inactive')]//ancestor::li");
	
	public By saveBtn = By.xpath("//div[contains(text(), 'Save')]//ancestor::button");
	
//	public By leadDropdown = By.xpath("//input[@id='PAPrefix0ee7fe8d392a5afield-3__control']");
	
	public By selectLeadDropdown = By.xpath("//input[@placeholder='Find lead name']");
	
	public By effectiveFromDate = By.xpath("//input[@class='datepicker-textbox']");
	
	public By selectReasonDropdown = By.xpath("//input[@placeholder='Select Reason']");
}