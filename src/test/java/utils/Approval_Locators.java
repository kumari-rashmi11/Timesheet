package utils;

import org.openqa.selenium.By;

public class Approval_Locators {
	
	//partially approved  timesheet locators
    public static By SelectApprovalsButton = By.cssSelector("div:nth-of-type(8) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
    public static By SelectApprovalsButtonRl = By.cssSelector("div:nth-of-type(7) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
    public static By SelectApprovalsButtonPl = By.cssSelector("div:nth-of-type(8) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
    public static By SelectApprovalsButtonEditor = By.cssSelector("div:nth-of-type(8) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
    public static By SelectApprovalsButtonHr = By.cssSelector("div:nth-of-type(8) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");

	public static By SelectReportees = By.cssSelector("input[role='combobox']");
    public static By ChooseReportees = By.cssSelector("div#combobox-canvas-listbox > div[role='option']");
    public static By SelectStatus = By.cssSelector("span#pac-combobox-1-option");
    public static By ChooseStatus = By.cssSelector("[data-index='5']");
    public static By SelectWeeks = By.xpath("/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[8]");
    public static By ChooseWeeks = By.cssSelector("div[role='listbox'] > div:nth-of-type(45)");
    public static By SelectRigthArrow = By.cssSelector("[data-control-id='2740']");
    public static By SelectApproveBtn = By.cssSelector("div:nth-of-type(32) button > .appmagic-button.center.middle");
    public static By SelectTextBox = By.xpath("/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[6]/div/div/div[29]//div[@class='react-knockout-control']/div[@class='appmagic-textbox']/textarea[@placeholder='Notes here']");
    public static By Selectcontinuebtn = By.cssSelector("div:nth-of-type(31) button > .appmagic-button.center.middle");
    public static By Selectallbtn = By.cssSelector(".___1x19vml.f1729es6.f1l02sjl.f1r2dosr.f22iagw.f3p8bqa.fium13f.fly5x3f.fui-Checkbox.r10zo65y");
    public static By Bulkapprovedbtn = By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[29]/div[@role='presentation']/div[@role='presentation']//button[@type='button']/span[.='Bulk Approval']");
    public static By SelectBulkWeeks = By.cssSelector("[data-control-id='2708'] .appmagic-borderfill-container");
    public static By ChooseBulkWeeks = By.cssSelector("div[role='listbox'] > div:nth-of-type(44)");
    public static By RejectBtn = By.cssSelector("div:nth-of-type(33) button > .appmagic-button.center.middle");
    public static By Allstatus = By.cssSelector("[data-index='0'] [data-automationid]");
    public static By Holidayweek = By.cssSelector("div[role='listbox'] > div:nth-of-type(43)");
    public static By selctholidaydate = By.cssSelector("div:nth-of-type(23) div[role='presentation'] > .appmagic-label-text");
    public static By SelectRefreshBtn= By.cssSelector(".canvasContentDiv.container_uoq1r7 > div > div:nth-of-type(6) .powerapps-icon");
    public static By FyFilterBtn= By.cssSelector("div[role='listbox'] > div:nth-of-type(3)");
    public static By SelectFyFilterBtn= By.xpath("/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[4]//div[@class='react-knockout-control']/div/div/div[@role='button']");
    public static By SelectbackBtn= By.cssSelector("[data-control-id='1481'] [touch-action]");
    public static By SelectAttachement= By.cssSelector(".canvasContentDiv.container_1vt1y2p  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window");
    public static By SelectPL= By.xpath("/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[9]//div[@class='react-knockout-control']/div/div/div[@class='appmagic-dropdownLabelArrow']");
    public static By ChoosePL= By.cssSelector("div[role='listbox'] > div:nth-of-type(1)");

}
