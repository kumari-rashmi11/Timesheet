package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.ExportLocators;

public class ExportPage {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
    Interactions interact;
    ExportLocators locators;
    
    public ExportPage(WebDriver driver) {
    	if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.locators = new ExportLocators();
        this.action = new Actions(driver);
        this.interact = new Interactions(driver);
    }
    
    public void clickExportTab() {
    	interact.clickElement(locators.ExportTab);
    }
    
    public void clickExportTab_PL() {
    	interact.clickElement(locators.ExportTab_PL);
    }
    
    public void clickExportTab_Viewer() {
    	interact.clickElement(locators.ExportTab_Viewer);
    }
    
    public void switchFrame() {
    	interact.switchToIframe(locators.exportIframe);
    }
    
    public void clickSignInBtn() {
    	interact.clickElement(locators.signInBtn);
    }
    
    public String getTotalHours() {
    	return interact.getInnerText(locators.totalHours);
    }
    
    public String getTimeDate() {
    	return interact.getInnerText(locators.timeDate);
    }
    
    public void clickYearDropdownYearlyExtract() {
    	interact.clickElement(locators.yearDropdownYearlyExtract);
    }
    
    public void chooseYear() {
    	interact.clickElement(locators.chooseYear);
    }
    
    public void clickStatusDropdown() {
    	interact.clickElement(locators.statusDropdown);
    }
    
    public void clickStatusDropdownDateWise() {
    	interact.clickElement(locators.statusDropdownDateWise);
    }
    
    public void chooseStatusRejected() {
    	interact.clickElement(locators.chooseStatusRejected);
    }
    
    public void chooseStatusDraft() {
    	interact.clickElement(locators.chooseStatusDraft);
    }
    
    public void chooseStatusSubmitted() {
    	interact.clickElement(locators.chooseStatusSubmitted);
    }
    
    public void clickThreeDots() {
    	interact.clickElement(locators.threeDots);
    }
    
    public void clickThreeDotsMonthlyExtract() {
    	interact.clickElement(locators.threeDotsMonthlyExtract);
    }
    
    public void clickThreeDotsDateWiseExtract() {
    	interact.clickElement(locators.threeDotsDateWiseExtract);
    }
    
    public void clickHoverElement() {
    	interact.clickElement(locators.hoverElement);
    }
    
    public void clickExportDataBtn() {
    	interact.clickElement(locators.exportDataBtn);
    }
    
    public void clickExportBtn() {
    	interact.clickElement(locators.exportBtn);
    }
    
    public void clickReportee() {
    	interact.clickElement(locators.selectReportee);
    }
    
    public void chooseReportee() {
    	interact.clickElement(locators.chooseReportee);
    }
    
    public void chooseReporteeWeeklyExtract() {
    	interact.clickElement(locators.chooseReporteeWeeklyExtract);
    }

    public void chooseReporteeDateWise() {
    	interact.clickElement(locators.chooseReporteeDateWise);
    }
    
    public void clickMonthlyExtract() {
    	interact.clickElement(locators.monthlyExtract);
    }
    
    public void clickMonthDropdown() {
    	interact.clickElement(locators.monthDropdown);
    }
    
    public void chooseMonth() {
    	interact.clickElement(locators.chooseMonth);
    }
    
    public void clickYearDropdownMonthlyExtract() {
    	interact.clickElement(locators.yearDropdownMonthlyExtract);
    }
    
    public void clickMonthDropdownMonthlyExtract() {
    	interact.clickElement(locators.monthDropdownMonthlyExtract);
    }
    
    public void clickReporteeDropdownMonthlyExtract() {
    	interact.clickElement(locators.selectReporteeMonthlyExtract);
    }
    
    public void clickWeeklyExtract() {
    	interact.clickElement(locators.weeklyExtract);
//    	WebElement weeklyExtractBtn = driver.findElement(locators.weeklyExtract);
//    	weeklyExtractBtn.click();
    }
    
    public void clickWeekDropdown() {
    	interact.clickElement(locators.weekDropdown);
    }
    
    public void chooseWeek() {
    	interact.clickElement(locators.chooseWeek);
    }
    
    public void clickDatewiseExtract() {
    	interact.clickElement(locators.datewiseExtract);
    }
    
    public void sendWorkEndDate() {
    	interact.sendingKeys(locators.workEndDate, "4/10/2024");
    }
    
    public void sendWorkStartDate() {
    	interact.sendingKeys(locators.workStartDate, "9/11/2020");
    }
    
    public void chooseStatus() {
    	interact.clickElement(locators.chooseStatus);
    }
    
    public void clickBillable() {
    	interact.clickElement(locators.billableDropdown);
    }
    public void chooseBillable() {
    	interact.clickElement(locators.chooseBillable);
    }

    public void clickThreeDotsAfterMonthlyExtract() {
    	interact.clickElement(locators.threeDotsAfterMonthlyExtract);
    }

    public void monthDropdownMonthlyExtract() {
    	interact.clickElement(locators.monthDropdownMonthlyExtract);
    }

    public void clickWeekDropdownWeekExtract() {
    	interact.clickElement(locators.WeekDropdownWeekExtract);
    }
    public void clickWeekChooseWeekExtract() {
    	interact.clickElement(locators.weekChoose);
    }
    public void dateStartSelectButton() {
    	interact.clickElement(locators.dateStartSelectButton);
    }
    public void dateSelectStart() {
    	interact.clickElement(locators.dateSelectStart);
    }
    public void dateEndSelectbutton() {
    	interact.clickElement(locators.dateEndSelectbutton);
    }
    public void dateSelectEnd() {
    	interact.clickElement(locators.dateSelectEnd);
    }
    
    public void yeardropdown() {
    	interact.clickElement(locators.yeardd);
    }
    public void selectYear() {
    	interact.clickElement(locators.selectyear);
    }
    public void status() {
    	interact.clickElement(locators.statusdd);
    }
    public void selectstatus() {
    	interact.clickElement(locators.selectstatus);
    }
    public void hoverele() {
    	interact.clickElement(locators.hoverElement);
    }
    public void threedots() {
    	interact.clickElement(locators.threeDots);
    }
    public void exportdata() {
    	interact.clickElement(locators.exportdata);
    }
    public void exportbutton() {
    	interact.clickElement(locators.exportbtn);
    }
    public void monthyextract() {
    	interact.clickElement(locators.monthlyExtract);
    }
    public void monthydropdown() {
    	interact.clickElement(locators.monthdd);
    }
    public void clickmonth() {
    	interact.clickElement(locators.selectmonth);
    }
    public void threeedos() {
    	interact.clickElement(locators.thrdots);
    }
    public void weekextract() {
    	interact.clickElement(locators.weeklyExtract);
    }
    public void rep() {
    	interact.clickElement(locators.reportee);
    }
    public void selectrep() {
    	interact.clickElement(locators.selectrepor);
    }
    public void weekdd() {
    	interact.clickElement(locators.wekdd);
    }
    public void selectweek() {
    	interact.clickElement(locators.selweek);
    }
    
    public void selectPartiallysubmit() {
    	interact.clickElement(locators.partsubmitted);
    }
    public void reporteedropdown() {
    	interact.clickElement(locators.reporteedd);
    }
    public void selectreporteee() {
    	interact.clickElement(locators.selectrepname);
    }
    public void threedotsss() {
    	interact.clickElement(locators.threedotsss);
    }
    public void monreportee() {
    	interact.clickElement(locators.monreportee);
    }
    public void selectmonrep() {
    	interact.clickElement(locators.selectmonrep);
    }
    public void weekdropdown() {
    	interact.clickElement(locators.weekdropdown);
    }
    public void selectweekk() {
    	interact.clickElement(locators.selectweek);
    }
    public void statusalldd() {
    	interact.clickElement(locators.statusalldd);
    }
    public void selectweekstatus() {
    	interact.clickElement(locators.selectweekstatus);
    }
    public void thrdots() {
    	interact.clickElement(locators.thrdots);
    }
    public void billiabledd() {
    	interact.clickElement(locators.billdd);
    }
    public void selectbilliable() {
    	interact.clickElement(locators.selectbill);
    }
    public void approvedstatus() {
    	interact.clickElement(locators.approvedstatus);
    }
    public void selectbillyes() {
    	interact.clickElement(locators.selectbillyes);
    }
    public void selectmonthdd() {
    	interact.clickElement(locators.selectmonthdd);
    }
    public void selectmonthh() {
    	interact.clickElement(locators.selectmonthh);
    }
    public void week() {
    	interact.clickElement(locators.week);
    }
    public void selectweekkk() {
    	interact.clickElement(locators.selectweekk);
    }
    public void dateWiseExtract() {
    	interact.clickElement(locators.dateWiseExtract);
    }
    public void dwstatus() {
    	interact.clickElement(locators.dwstatus);
    }
    public void dwstatusselect() {
    	interact.clickElement(locators.dwstatusselect);
    }
    public void dwbilliable() {
    	interact.clickElement(locators.dwbilliable);
    }
    public void dwselectbill() {
    	interact.clickElement(locators.dwselectbill);
    }
    public void monnrep() {
    	interact.clickElement(locators.monnrep);
    }
    public void selectmonnrep() {
    	interact.clickElement(locators.selectmonnrep);
    }
    public void weeekextract() {
    	interact.clickElement(locators.weeeekextract);
    }
    public void chosreportee() {
    	interact.clickElement(locators.chosreportee);
    }
    
}
