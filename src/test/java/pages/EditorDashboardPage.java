package pages;

import org.openqa.selenium.WebDriver;

import utils.DashboardLocators;
import helper.Interactions;

public class EditorDashboardPage {
	private Interactions clickingHelper;
	private DashboardLocators locator;
    

    // Constructor
    public EditorDashboardPage(WebDriver driver) {
        this.clickingHelper = new Interactions(driver);
        this.locator = new DashboardLocators();
    }

     // Method to navigate to the Timesheet Dashboard
        public void navigateToDashboard() {
            clickingHelper.clickEle(this.locator.admindb);
        }

        public void clickreportee() {
            clickingHelper.clickEle(this.locator.edreportee);
        }
//        
//        public void clickGreenRlButton() {
//            clickingHelper.clickEle(this.locator.greenrl);
//        }

//        public void clickPurplePlButton() {
//            clickingHelper.clickEle(this.locator.purplepl);
//        }
//
//        public void clickBlackUserButton() {
//            clickingHelper.clickEle(this.locator.blackuser);
//        }
        
        public void clickswitchon() {
            clickingHelper.clickEle(this.locator.switchon);
        }
        
        public void clickswitchoff() {
            clickingHelper.clickEle(this.locator.switchoff);
        }
        
         public void clickyeardd() {
        	  clickingHelper.clickEle(this.locator.yeardropdown);
          }
         
         public void rightarr() {
        	 clickingHelper.clickEle(this.locator.rightarrow);
         }
        
         public void approvbtn() {
        	 clickingHelper.clickEle(this.locator.approvebtn);
         }
        
         public void reporteedd() {
        	 clickingHelper.clickEle(this.locator.repdd);
         }

         public void reporteename() {
        	 clickingHelper.clickEle(this.locator.repname);
         }
         
         public void reporteefilter() {
        	 clickingHelper.clickEle(this.locator.filter);
         }
         
         public void notification() {
        	 clickingHelper.clickEle(this.locator.notify);
         }
         
         public void refreshh() {
        	 clickingHelper.clickEle(this.locator.refresh);
         }
         
         public void aprovnotify() {
        	 clickingHelper.clickEle(this.locator.approvenotify);
         }
         
         public void reject() {
        	 clickingHelper.clickEle(this.locator.rejectbtn);
         }
         
         public void closebtn() {
        	 clickingHelper.clickEle(this.locator.close);
         }
         
         public void reporteeydd() {
        	 clickingHelper.clickEle(this.locator.repyy);
         }
}
