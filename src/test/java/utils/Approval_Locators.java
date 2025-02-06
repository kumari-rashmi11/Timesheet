package utils;

import org.openqa.selenium.By;

public class Approval_Locators {
	
	
	public static By SelectApprovalsButtonRl = By.xpath("//div[@data-control-name='Navigation_Gallery']//div[@aria-posinset='7']");
  
	public static By SelectApprovalsButtonPl = By.xpath("//div[@data-control-name='Navigation_Gallery']//div[@aria-posinset='8']");
    
    public static By SelectApprovalsButtonEditor = By.xpath("//div[@data-control-name='Navigation_Gallery']//div[@aria-posinset='8']");
    
    public static By SelectApprovalsButtonHr = By.xpath("//div[@data-control-name='Navigation_Gallery']//div[@aria-posinset='8']");

	public static By SelectReportees = By.xpath("//input[@type='text' and ancestor::div[@role='presentation']]");
	
	public static By ConfirmReportee = By.xpath("//div[@id='combobox-canvas-listbox']/div[@role='option']");
  
    public static By SelectStatus = By.xpath("//div[@role='presentation']//span[contains(text(), 'Submitted')]");
      
    public static By SelectWeeks = By.xpath("//div[@data-control-name='ApprovalWeekDropdown_2']//div[@class='appmagic-dropdownLabelArrow']");
       
    public static By SelectRigthArrow = By.xpath("(//div[@data-control-name='NextScreenNavIcon_3']//div[@touch-action='pan-x pan-y'])[1]");
    
    public static By SelectApproveBtn = By.xpath("//div[contains(text(), 'Approve')]//ancestor::button");
   
    public static By SelectTextBox = By.xpath("//textarea[@placeholder='Notes here']");
    
    public static By Selectcontinuebtn = By.xpath("//div[contains(text(), 'Continue')]//ancestor::button");
  
    public static By Selectallbtn = By.xpath("//label[contains(text(), 'Select all')]");
    
    public static By FilterCount = By.xpath("//div[@data-control-name='ApprovalsCount']");

    public static By Bulkapprovedbtn = By.xpath("//div[contains(text(), 'BulkApproval')]//ancestor::button");
    
    public static By RejectBtn = By.xpath("//div[contains(text(), 'Reject')]//ancestor::button");
   
    public static By Allstatus = By.xpath("//button[@data-index='{index}']");
   
   // public static By Holidayweek = By.cssSelector("div[role='listbox'] > div:nth-of-type(43)");
    
    public static By selctholidaydate = By.cssSelector("div:nth-of-type(23) div[role='presentation'] > .appmagic-label-text");
    
    public static By SelectRefreshBtn= By.xpath("//div[@data-control-name='ResetIcon_5']");
    
    public static By FyFilterBtn= By.xpath("//div[@data-control-name='YearFilterDropdown_3']//div[@class='appmagic-dropdownLabelArrow']");
   
    public static By SelectFyFilterBtn= By.xpath("//div[contains(text(), '2024')]");
    
    public static By SelectbackBtn= By.xpath("//div[@data-control-name='Icon2_43']");
    
    public static By SelectAttachement= By.xpath("//div[@class='appmagic-image no-focus-outline']");
    
    public static By SelectPL= By.xpath("(//div[@class='react-knockout-control']/div/div/div[@class='appmagic-dropdownLabelArrow'])[3]");
    
    public static By ChoosePL= By.xpath("//div[@role='listbox']/child::div[1]");
    
    public static By reporteeInput = By.xpath("//input[@aria-controls=\"combobox-canvas-listbox\"]");

}