package utils;

import org.openqa.selenium.By;

public class TimesheetSettingLocators {
	// Locators for various elements on the Timesheet Setting Page
    public By timesheetSettingTab = By.xpath("(//div[contains(text(), 'Timesheet Setting')]//ancestor::div[@class='container_1f0sgyp']//child::div[position()=1])[1]");
    
    public By TimesheetSettingPageTitle = By.xpath("//div[text() ='Project Timesheet']");
    
    public By isAddEmployeePage = By.xpath("//div[text() ='Timesheet Setting']");
    
    public By ReclicktimesheetSettingTab = By.xpath("//div[@aria-posinset='4']");
    
    public By employeeSelect = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(17) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div");
    public By addEmployee = By.xpath("//div[contains(text(), 'Add')]//ancestor::button");
    
    public By enterName = By.xpath("//div[@title='EmployeeId']");
    public By selectName = By.xpath("//span[contains(text(), 'Timezone  test2')]//parent::div");
    public By clientType = By.xpath("//div[@data-control-name='ClientNameCB']");
    public By clientcategory = By.xpath("//span[contains(text(), 'American Express')]//parent::div");
    
    public By Selectlocation = By.xpath("//div[@title='Location']");
    public By chooseLocation = By.xpath("//span[contains(text(), 'Shillong')]//parent::div");
    
    public By giveNotes = By.xpath("//input[@title='Note']");
    
    public By periodStart = By.xpath("//input[@title='periodStart']");
    
    public By periodEnd = By.xpath("//input[@title='periodEnd']");
    
    public By cancelButton = By.xpath("//div[contains(text(), 'Cancel')]//ancestor::button");
    
    public By saveBtn = By.xpath("//div[contains(text(), 'Save')]//ancestor::div[@data-control-name='Emp-Client-AssociationSaveBTN']");
    
    public By selectNewEmployee = By.xpath("//div[@data-control-name='TSEmployeNavIcon']");
    
    public By editNewEmployeeBtn = By.xpath("//div[@data-control-name='Icon1_19']");
    
    public By deleteEmployee = By.xpath("//div[@data-control-name='Icon1_19']");
    public By confirmEmploye = By.xpath("//div[contains(text(), 'Yes')]//ancestor::button");
    
    public By searchBox = By.xpath("//input[@title='Search by Client or Employee']");
    
    public By refreshBtn = By.xpath("//div[@data-control-name='TSResetIcon']");
}