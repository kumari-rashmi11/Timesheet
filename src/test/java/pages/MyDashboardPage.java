package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.MyDashboardLocators;

public class MyDashboardPage {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	MyDashboardLocators locator;
    Interactions interact;
    public static Logger log = LogManager.getLogger(MyDashboardPage.class);;
    
    public MyDashboardPage(WebDriver driver) {
    	if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new MyDashboardLocators();
        this.interact = new Interactions(driver);
    }
    
    public void clickMyDashboardTab() {
		interact.clickElement(locator.MyDashboardTab);		
	}
    
    public void clickMyDashboardTab_PL() {
		interact.clickElement(locator.MyDashboardTab_PL);		
	}
    
    public void clickFinancialYearDiv() {
		interact.clickElement(locator.financialYearDiv);		
	}
    
    public void selectFinancialYear() {
		interact.clickElement(locator.selectFinancialYear);		
	}
    
    public String associatedClients_RL() {
    	return interact.getInnerText(locator.AssociatedClientsTitle_RL);
    }
    
    public String associatedClients_PL() {
    	return interact.getInnerText(locator.AssociatedClientsTitle_PL);
    }
    
    public String timesheetStatistics() {
    	return interact.getInnerText(locator.TimesheetStatisticsTitle);
    }
    
    public void requestFilter() {
    	interact.clickElement(locator.RequestFilter);
    }
    
    public void requestFilter_PL() {
    	interact.clickElement(locator.RequestFilter_PL);
    }
    
    public void chooseRequest() {
    	interact.clickElement(locator.chooseRequestOption);
    }
    
    public void chooseRequest_PL() {
    	interact.clickElement(locator.chooseRequestOption_after_Year_PL);
    }
    
    public void chooseRequestAfterYear() {
    	interact.clickElement(locator.chooseRequestAfterYear);
    }
    
    public void resetFilter() {
    	interact.clickElement(locator.resetRequestFilter);
    }
    
    public void resetFilter_PL() {
    	interact.clickElement(locator.resetRequestFilter_PL);
    }
    
    public void hourRequest() {
    	interact.clickElement(locator.HourRequest);
    	interact.clickElement(locator.cancelHourRequest);
    }
    
    public void hourRequest_Employee() {
    	interact.clickElement(locator.HourRequest_Employee);
//    	interact.clickElement(locator.cancelHourRequest_Employee);
    }
    
    public void cancelHourRequest_Employee() {
    	interact.clickElement(locator.cancelHourRequest_Employee);
    }
    
    public void taskExpired() {
        try {
            WebElement ele = interact.visibilityEle(locator.taskExpired);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed on task expired icon");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void taskExpired_Employee() {
        try {
            WebElement ele = interact.visibilityEle(locator.taskExpired_Employee);
            action.moveToElement(ele).perform();
            System.out.println("Hover action performed on task expired icon");
        } catch (Exception e) {
            System.out.println("Error during hover action: " + e.getMessage());
        }
    }
    
    public void clickLeadChange() {
    	interact.clickElement(locator.leadChangeIcon);
    }
    
    public void clickLeadChange_Employee() {
    	interact.clickElement(locator.leadChangeIcon_Employee);
    }
    
    public void checkLeadChangeIcon() {
    	WebElement icon = interact.visibilityEle(locator.leadChangeIcon);
    	if(!icon.isDisplayed()) {
    		log.info("Lead change icon is not visible");
    	}else {
    		log.info("Lead change icon is visible");
    		interact.clickElement(locator.leadChangeIcon);
    	}
    }
    
    public void checkLeadChangeIcon_Employee() {
    	WebElement icon = interact.visibilityEle(locator.leadChangeIcon_Employee);
    	if(!icon.isDisplayed()) {
    		log.info("Lead change icon is not visible");
    	} else {
    		log.info("Lead change icon is visible");
    		interact.clickElement(locator.leadChangeIcon_Employee);
    	}
    }
    
    public void clickUserLead() {
    	interact.clickElement(locator.userLead);
    }
    
    public void clickUserLead_Employee() {
    	interact.clickElement(locator.userLead_Employee);
    }
    
    public void selectLead() {
    	interact.clickElement(locator.selectLead);
    }
    
    public void selectReasonDiv() {
    	interact.clickElement(locator.selectReasonDiv);
    }
    
    public void selectReasonDiv_Employee() {
    	interact.clickElement(locator.selectReasonDiv_Employee);
    }
    
    public void chooseReason() {
    	interact.clickElement(locator.chooseReason);
    }
    
    public void chooseReason_Employee() {
    	interact.clickElement(locator.chooseReason_Employee);
    }
    
    public void cancelLeadChange() {
    	interact.clickElement(locator.cancelLeadChange);
    }
    
    public void cancelLeadChange_Employee() {
    	interact.clickElement(locator.cancelLeadChange_Employee);
    }
    
    public void submitLeadChange() {
    	interact.clickElement(locator.submitLeadChange);
    }
    
    public void submitLeadChange_Employee() {
    	interact.clickElement(locator.submitLeadChange_Employee);
    }
    
    public String VerifyDraftsTimesheet() {
    	return interact.getInnerText(locator.draftTimesheet);
    }
    
    public String VerifySubmittedTimesheet() {
    	return interact.getInnerText(locator.submittedTimesheet);
    }
    
    public String VerifyPartiallySubmittedTimesheet() {
    	return interact.getInnerText(locator.partiallySubmittedTimesheet);
    }
    
    public String VerifyApprovedTimesheet() {
    	return interact.getInnerText(locator.approvedTimesheet);
    }
    
    public String VerifyPartiallyApprovedTimesheet() {
    	return interact.getInnerText(locator.partiallyApprovedTimesheet);
    }
    
    public String VerifyRejectedTimesheet() {
    	return interact.getInnerText(locator.rejectedTimesheet);
    }
}
