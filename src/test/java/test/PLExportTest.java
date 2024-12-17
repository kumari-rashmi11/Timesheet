package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import pages.PLExportPage;

public class PLExportTest extends BaseTest {

	@Test(priority = 1)
	public void TC_149_Verification_of_visibility_of_yearly_partially_approved_tasks_of_entire_team() {
		PLExportPage ep = new PLExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickExportTab());
		interact.executeWithDelay(() -> ep.switchFrame());
		interact.executeWithDelay(() -> ep.clickSignInBtn());
		interact.executeWithDelay(() -> ep.yeardropdown());
		interact.executeWithDelay(() -> ep.selectYear());
		interact.executeWithDelay(() -> ep.status());
		interact.executeWithDelay(() -> ep.selectstatus());
		interact.executeWithDelay(() -> ep.hoverele());
		interact.executeWithDelay(() -> ep.threedots());
		interact.executeWithDelay(() -> ep.exportdata());
		interact.executeWithDelay(() -> ep.exportbutton());
	}
		@Test(priority = 2)
		public void TC_150_Verification_of_visibility_of_yearly_partially_approved_tasks_of_a_particular_Reportee() {
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectstatus());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threedots());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
	}


		@Test(priority = 3)
		public void TC_151_vis_pat_particular_month() {
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.monthyextract());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.monthydropdown());
			interact.executeWithDelay(() -> ep.clickmonth());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectstatus());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threeedos());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
	}
		
		@Test(priority = 4)
		public void TC_152_Verification_of_visibility_of_partially_approved_task_list_of_a_particular_month_of_a_particular_Reportee() {
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.monthyextract());
			interact.executeWithDelay(() -> ep.monnrep());
			interact.executeWithDelay(() -> ep.selectmonnrep());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.monthydropdown());
			interact.executeWithDelay(() -> ep.clickmonth());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectstatus());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threeedos());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
	}
		
		@Test(priority = 5)
		public void TC_153_vis_pat_weekly_exctract() {
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			
			
			interact.executeWithDelay(() -> ep.weekextract());
			interact.executeWithDelay(() -> ep.rep());
			interact.executeWithDelay(() -> ep.selectrep());
			interact.executeWithDelay(() -> ep.weekdd());
			interact.executeWithDelay(() -> ep.selectweek());
			
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectstatus());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threeedos());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
	}

//		
		
		
		
		@Test(priority = 6)
		public void TC_155_visibility_of_yearly_partially_submitted_tasks_of_entire_team() {
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectPartiallysubmit());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threedots());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
				
		}
		@Test(priority = 7)
		public void TC_156_Verification_of_visibility_of_yearly_partially_submitted_tasks_of_a_particular_Reportee() {
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.reporteedropdown());
			interact.executeWithDelay(() -> ep.selectreporteee());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectPartiallysubmit());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threedots());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
			
		}
		
		@Test(priority = 8)
		public void TC_157_Verification_of_visibility_of_partially_submitted_task_list_of_a_particular_month_of_his_entire_team(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.monthyextract());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectPartiallysubmit());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threedotsss());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());

		}

		
		@Test(priority = 9)
		public void TC_158_Verification_of_visibility_of_partially_submitted_task_list_of_a_particular_month_of_a_particular_Reportee(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.monthyextract());
			interact.executeWithDelay(() -> ep.monreportee());
			interact.executeWithDelay(() -> ep.selectmonrep());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectPartiallysubmit());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threedotsss());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());

}
		
		@Test(priority = 10)
		public void TC_159_Verification_of_visibility_of_exported_Weekly_partially_submitted_tasks_of_entire_team(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.weekextract());
			interact.executeWithDelay(() -> ep.weekdropdown());
			interact.executeWithDelay(() -> ep.selectweekk());
			interact.executeWithDelay(() -> ep.statusalldd());
			interact.executeWithDelay(() -> ep.selectweekstatus());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.thrdots());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
			
		}
		
		@Test(priority = 11)
		public void TC_357_verification_of_total_billable_non_billable_hours_in_export_screen(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbilliable());	
		}
		
		@Test(priority = 12)
		public void TC_358_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbillyes());	
		}
		
		@Test(priority = 13)
		public void TC_359_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_yearly_extract(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbillyes());	
		}
		
		@Test(priority = 14)
		public void TC_360_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_monthly_extract(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.monthyextract());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.selectmonthdd());
			interact.executeWithDelay(() -> ep.selectmonthh());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbillyes());		
		}
		
		@Test(priority = 15)
		public void TC_361_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_weekly_extract(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.weeekextract());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chosreportee());
			interact.executeWithDelay(() -> ep.week());
			interact.executeWithDelay(() -> ep.selectweekkk());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbillyes());
			
		}
		
		@Test(priority = 16)
		public void TC_362_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_datewise_extract(){
			PLExportPage ep = new PLExportPage(driver);
			Interactions interact = new Interactions(driver);
			interact.executeWithDelay(() -> ep.clickExportTab());
			interact.executeWithDelay(() -> ep.switchFrame());
			interact.executeWithDelay(() -> ep.clickSignInBtn());
			interact.executeWithDelay(() -> ep.dateWiseExtract());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chosreportee());
			interact.executeWithDelay(() -> ep.dwstatus());
			interact.executeWithDelay(() -> ep.dwstatusselect());
			interact.executeWithDelay(() -> ep.dwbilliable());
			interact.executeWithDelay(() -> ep.selectbillyes());
	
		}
		
		@AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	 }  
}
