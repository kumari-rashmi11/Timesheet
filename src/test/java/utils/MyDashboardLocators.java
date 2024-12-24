package utils;

import org.openqa.selenium.By;

public class MyDashboardLocators {
	
	public By MyDashboardTab = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(6) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");
	
	public By MyDashboardTab_PL = By.cssSelector("div:nth-of-type(11) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	
	public By financialYearDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(4)");
	
	public By selectFinancialYear = By.cssSelector("body > div.drop.drop-element.drop-abutted.drop-abutted-left.drop-element-attached-top.drop-element-attached-left.drop-target-attached-bottom.drop-target-attached-left.drop-open-transitionend.drop-enabled.drop-open.drop-after-open > div > div > div > div:nth-of-type(2)");
	
	public By AssociatedClientsTitle_RL = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(55) > div > div > div > div > div");
	
	public By AssociatedClientsTitle_PL = By.cssSelector("[data-control-id='810'] .appmagic-label-text");
	
	public By TimesheetStatisticsTitle = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(3) > div > div > div > div > div");
	
	public By RequestFilter = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(59)");
	
	public By RequestFilter_PL = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(58)");
	
	public By chooseRequestOption = By.cssSelector("div[role='listbox'] > div:nth-of-type(3)");
	
	public By chooseRequestOption_after_Year_PL = By.cssSelector("body > div:nth-child(10) > div > div > div > div:nth-child(3)");
	
	public By chooseRequestAfterYear = By.cssSelector("div[role='listbox'] > div:nth-of-type(6)");
	
	public By resetRequestFilter = By.cssSelector("div:nth-of-type(61) .powerapps-icon");
	
	public By resetRequestFilter_PL = By.cssSelector("div:nth-of-type(60) .powerapps-icon");
	
	public By HourRequest = By.cssSelector("div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7)");
	
	public By HourRequest_Employee = By.cssSelector("div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7)");
	
	public By cancelHourRequest = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-170");
	
	public By cancelHourRequest_Employee = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-163");
	
	public By confirmHourRequest_Employee = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-167");
	
	public By confirmHourRequest = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-172");
	
	public By taskExpired = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7) div[title='This task has expired']");
	
	public By taskExpired_Employee = By.cssSelector("div:nth-of-type(5) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7) div[title='This task has expired']");
	
	public By leadChangeIcon = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(37)");
	
	public By leadChangeIcon_Employee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(37)");
	
	public By userLead = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(12)");
	
	public By userLead_Employee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(12)");
	
	public By selectLead = By.cssSelector("div[role='listbox'] > div:nth-of-type(8)");
	
	public By selectReasonDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(16)");
	
	public By selectReasonDiv_Employee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(16)");
	
	public By chooseReason = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(4)");
	
	public By chooseReason_Employee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(4)");
	
	public By cancelLeadChange = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(17)");
	
	public By cancelLeadChange_Employee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(17)");
	
	public By submitLeadChange = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18)");
	
	public By submitLeadChange_Employee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(18)");
	
	public By draftTimesheet = By.cssSelector("div:nth-of-type(13) div[role='presentation'] > .appmagic-label-text");
	
	public By submittedTimesheet = By.cssSelector("div:nth-of-type(14) div[role='presentation'] > .appmagic-label-text");
	
	public By partiallySubmittedTimesheet = By.cssSelector("div:nth-of-type(15) div[role='presentation'] > .appmagic-label-text");
	
	public By approvedTimesheet = By.cssSelector("div:nth-of-type(16) div[role='presentation'] > .appmagic-label-text");
	
	public By partiallyApprovedTimesheet = By.cssSelector("div:nth-of-type(17) div[role='presentation'] > .appmagic-label-text");
	
	public By rejectedTimesheet = By.cssSelector("div:nth-of-type(18) div[role='presentation'] > .appmagic-label-text");
}
