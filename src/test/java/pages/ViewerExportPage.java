package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.EditorLocators;

public class ViewerExportPage {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;
    Interactions interact;
    EditorLocators locators;
    
    public ViewerExportPage(WebDriver driver) {
    	if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.locators = new EditorLocators();
        this.action = new Actions(driver);
        this.interact = new Interactions(driver);
    }
    
    public void clickExportTab() {
    	interact.clickEle(locators.ExportTabPL);
    }
    
    public void switchFrame() {
    	interact.switchToIframe(locators.exportIframeViewer);
    }
    public void clickSignInBtn() {
    	interact.clickEle(locators.signInBtn);
    }

    public void clickReportee() {
    	interact.clickEle(locators.selectReportee);
    }
    
    public void chooseReportee() {
    	interact.clickEle(locators.chooseReportee);
    }
    
    public void yeardropdown() {
    	interact.clickEle(locators.yeardd);
    }
    public void selectYear() {
    	interact.clickEle(locators.selectyear);
    }
    public void status() {
    	interact.clickEle(locators.statusdd);
    }
    public void selectstatus() {
    	interact.clickEle(locators.selectstatus);
    }
    public void hoverele() {
    	interact.clickEle(locators.hoverElement);
    }
    public void threedots() {
    	interact.clickEle(locators.threeDots);
    }
    public void exportdata() {
    	interact.clickEle(locators.exportdata);
    }
    public void exportbutton() {
    	interact.clickEle(locators.exportbtn);
    }
    public void monthyextract() {
    	interact.clickEle(locators.monthlyExtract);
    }
    public void monthydropdown() {
    	interact.clickEle(locators.monthdd);
    }
    public void clickmonth() {
    	interact.clickEle(locators.selectmonth);
    }
    public void threeedos() {
    	interact.clickEle(locators.thrdots);
    }
    public void weekextract() {
    	interact.clickEle(locators.weeklyExtract);
    }
    public void rep() {
    	interact.clickEle(locators.reportee);
    }
    public void selectrep() {
    	interact.clickEle(locators.selectrepor);
    }
    public void weekdd() {
    	interact.clickEle(locators.wekdd);
    }
    public void selectweek() {
    	interact.clickEle(locators.selweek);
    }
    
    public void selectPartiallysubmit() {
    	interact.clickEle(locators.partsubmitted);
    }
    public void reporteedropdown() {
    	interact.clickEle(locators.reporteedd);
    }
    public void selectreporteee() {
    	interact.clickEle(locators.selectrepname);
    }
    public void threedotsss() {
    	interact.clickEle(locators.threedotsss);
    }
    public void monreportee() {
    	interact.clickEle(locators.monreportee);
    }
    public void selectmonrep() {
    	interact.clickEle(locators.selectmonrep);
    }
    public void weekdropdown() {
    	interact.clickEle(locators.weekdropdown);
    }
    public void selectweekk() {
    	interact.clickEle(locators.selectweek);
    }
    public void statusalldd() {
    	interact.clickEle(locators.statusalldd);
    }
    public void selectweekstatus() {
    	interact.clickEle(locators.selectweekstatus);
    }
    public void thrdots() {
    	interact.clickEle(locators.thrdots);
    }
    public void billiabledd() {
    	interact.clickEle(locators.billdd);
    }
    public void selectbilliable() {
    	interact.clickEle(locators.selectbill);
    }
    public void approvedstatus() {
    	interact.clickEle(locators.approvedstatus);
    }
    public void selectbillyes() {
    	interact.clickEle(locators.selectbillyes);
    }
    public void selectmonthdd() {
    	interact.clickEle(locators.selectmonthdd);
    }
    public void selectmonthh() {
    	interact.clickEle(locators.selectmonthh);
    }
    public void week() {
    	interact.clickEle(locators.week);
    }
    public void selectweekkk() {
    	interact.clickEle(locators.selectweekk);
    }
    public void dateWiseExtract() {
    	interact.clickEle(locators.dateWiseExtract);
    }
    public void dwstatus() {
    	interact.clickEle(locators.dwstatus);
    }
    public void dwstatusselect() {
    	interact.clickEle(locators.dwstatusselect);
    }
    public void dwbilliable() {
    	interact.clickEle(locators.dwbilliable);
    }
    public void dwselectbill() {
    	interact.clickEle(locators.dwselectbill);
    }
    public void monnrep() {
    	interact.clickEle(locators.monnrep);
    }
    public void selectmonnrep() {
    	interact.clickEle(locators.selectmonnrep);
    }
    public void weeekextract() {
    	interact.clickEle(locators.weeeekextract);
    }
    public void chosreportee() {
    	interact.clickEle(locators.chosreportee);
    }
}
