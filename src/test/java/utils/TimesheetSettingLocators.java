package utils;

import org.openqa.selenium.By;

public class TimesheetSettingLocators {
	// Locators for various elements on the Timesheet Setting Page
    public By timesheetSettingTab_RL = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(4)");
    
    public By timesheetSettingTab_Editor = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(6)");
    
    public By timesheetSettingTab_PL = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(6)");
    
    public By timesheetSettingTab_Viewer = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(6)");
    
    public By timesheetSettingTab_HR = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(6)");
    
    public By TimesheetSettingPageTitle = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
    
    public By isAddEmployeePage = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(8) div[role='presentation'] > .appmagic-label-text");
    
    public By ReclicktimesheetSettingTab = By.cssSelector("div.react-gallery-items-window > div.virtualized-gallery-item:nth-child(4)");
    
    public By employeeSelect = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(17) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div");
    public By addEmployee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > button");   
    public By enterName = By.cssSelector("#react-combobox-view-0");
    public By selectName = By.cssSelector("#powerapps-flyout-react-combobox-view-0 > div > ul > li > div");
    public By clientType = By.cssSelector("#react-combobox-view-1");
    public By clientcategory = By.cssSelector("#powerapps-flyout-react-combobox-view-1 > div > ul > li:nth-child(2) > div");
    public By Selectlocation = By.cssSelector("#react-combobox-view-2");
    public By chooseLocation = By.cssSelector("#powerapps-flyout-react-combobox-view-2 > div > ul > li:nth-child(3) > div");
    
    public By giveNotes = By.cssSelector(".appmagic-textbox > input[title='Note']");
    
    public By cancelButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(7) > div > div > div:nth-child(10) > div > div > div > div > button > div");
    
    public By saveBtn = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(11)");
    
    public By selectNewEmployee = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon");
    
    
    public By editNewEmployeeBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(11) > div > div > div > div");
    public By selectNewEmployeeLocation = By.cssSelector("div:nth-of-type(3) .appmagic-typed-card.card_c5uw0h > div:nth-of-type(3)");
    public By chooseEditedLocation = By.cssSelector("ul[role='listbox'] > li:nth-of-type(4)");
    
    public By deleteEmployee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(9) > div > div > div > div");
    public By confirmEmploye = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(23) > div > div > div > div > button > div");
    
    public By searchBox = By.cssSelector(".appmagic-textbox > input[title='Search by Client or Employee']");
    
    public By refreshBtn = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(8) .powerapps-icon");
}
