package utils;

import org.openqa.selenium.By;

public class EmployeesLocators {
	public By employeesTab_Viewer = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(6) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(5) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");
	
	public By employeesTab_HR = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");
	
	public By employeesTab_PL = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(5) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1)");
	
	public By employeesTab_Edtior = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(5) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1)");
	
	public By employeeClick = By.cssSelector("div:nth-of-type(3) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon");
	
	public By employeeClick_PL = By.cssSelector("div:nth-of-type(17) div[role='list']  .react-gallery-items-window > div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2)");
	
	public By search_Box = By.cssSelector(".appmagic-textbox > input[title='Search by Name or Email or Employee Number']");
	
	public By refreshIcon = By.cssSelector(".canvasContentDiv.container_3xibfv > div > div:nth-of-type(5)");
	
	public By currentStatus = By.cssSelector("div:nth-of-type(35) div[role='presentation'] > .appmagic-label-text");
	
	public By employeesTabAfterActiveEmployeeClick = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(7) > div > div > div:nth-child(6) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(5) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2)");
	
	public By employeesTabAfterInactiveEmployeeClick = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(7) > div > div > div:nth-child(6) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(5) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2)");
	
	public By employeesTabAfterRelievedEmployeeClick = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(7) > div > div > div:nth-child(6) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(5) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2)");
	
	public By inactiveTab = By.cssSelector("div[role='tablist'] > button:nth-of-type(2)");
	
	public By relievedTab = By.cssSelector("div[role='tablist'] > button:nth-of-type(3)");
	
	public By eyeIcon = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(37)");
	
	public By eyeIcon_Editor = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(39)");
	
	public By pencilIcon = By.cssSelector("div:nth-of-type(30) .powerapps-icon");
	
	public By leadName = By.cssSelector("div:nth-of-type(13) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-164");
	
	public By leadName_Editor = By.cssSelector("div:nth-of-type(13) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-167");
	
	public By leadName_PL = By.cssSelector("#Label\\ -\\ 3674-Label\\ -\\ 3674-LeadHistLeadNameLabel-component");
	
	public By effectiveFrom = By.cssSelector("div:nth-of-type(12) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-164");
	
	public By effectiveFrom_PL = By.cssSelector("div:nth-of-type(12) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-167");
	
	public By endDate = By.cssSelector("div:nth-of-type(10) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-164");
	
	public By endDate_PL = By.cssSelector("div:nth-of-type(10) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-167");
	
	public By requestedBy = By.cssSelector("div:nth-of-type(11) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-164");
	
	public By requestedBy_PL = By.cssSelector("div:nth-of-type(11) > div[role='presentation'] > div[role='presentation']  .ms-Label.root-167");
	
	public By pastAndPresentInfo = By.cssSelector(".ms-Label.root-163");
	
	public By pastAndPresentInfo_PL = By.cssSelector(".ms-Label.root-166");
	
	public By closeBtn = By.cssSelector(".canvasContentDiv.container_3xibfv > div > div:nth-of-type(16)");
	
	public By addBtn = By.cssSelector("div:nth-of-type(18) > .appmagic-borderfill-container");
	
	public By addEmployeeBtn = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(11) button");
	
	public By firstName = By.cssSelector(".appmagic-textbox > input[title='FirstName']");
	
	public By lastName = By.cssSelector(".appmagic-textbox > input[title='LastName']");
	
	public By employeeNumber = By.cssSelector(".appmagic-textbox > input[title='Please give input with care']");
	
	public By emailInput = By.cssSelector(".appmagic-textbox > input[title='Email']");
	
	public By leadMenu = By.cssSelector("div:nth-of-type(2) > div[role='presentation'] > div[role='presentation'] input[role='combobox']");
	
	public By modifyIcon_activeEmployee = By.cssSelector("div:nth-of-type(30) .powerapps-icon");
	
	public By modifyIcon_InactiveEmployee = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(30)");
	
	public By statusDropDown = By.cssSelector(".appmagic-typed-card.card_c5uw0h > div:nth-of-type(1)");
	
	public By selectRelievedStatus = By.cssSelector("ul[role='listbox'] > li:nth-of-type(2)");
	
	public By selectActiveStatus = By.cssSelector("ul[role='listbox'] > li:nth-of-type(1)");
	
	public By selectInActiveStatus = By.cssSelector("ul[role='listbox'] > li:nth-of-type(3)");
	
	public By saveBtn = By.cssSelector("div:nth-of-type(20) button");
	
	public By effectiveDate = By.cssSelector(".datepicker-textbox");
	
	public By leadDropdown = By.cssSelector("div:nth-of-type(21) > div[role='presentation'] > div[role='presentation'] input[role='combobox']");
	
	public By effectiveFrom_Editor = By.cssSelector(".datepicker-textbox");
	
	public By selectReasonDropdown_Editor = By.cssSelector("div:nth-of-type(19) > div[role='presentation'] > div[role='presentation'] input[role='combobox']");
}
