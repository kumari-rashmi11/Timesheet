package test.Editor;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ExportPage;

public class ExportTest_Editor extends BaseTest {
	
	public void initialTest() {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		
        NavigateToTimesheet nt = new NavigateToTimesheet(driver);
    	nt.clickTeamsBtn();
    	nt.clickTimesheetBtn();
    	nt.clickTimesheetLink();
		
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Editor"));
		interact.executeWithDelay(() -> ep.clickExportTab());
		interact.executeWithDelay(() -> ep.switchFrame());
		interact.executeWithDelay(() -> ep.clickSignInBtn());
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_TC_099_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusSubmitted());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsDateWiseExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_of_Reportee_TC_100_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusSubmitted());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeDateWise());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsDateWiseExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_in_Date_Range_TC_101_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusSubmitted());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsDateWiseExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_in_Date_Range_and_Reportee_TC_102_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusSubmitted());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeDateWise());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsDateWiseExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Rejected_Task_TC_103_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Rejected_Task_of_Reportee_TC_104_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee());
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Rejected_Task_of_particular_Month_TC_105_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickYearDropdownMonthlyExtract());
		interact.executeWithDelay(() -> ep.chooseYear());
		interact.executeWithDelay(() -> ep.clickYearDropdownMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsMonthlyExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Rejected_Task_of_particular_Month_of_Reportee_TC_106_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsMonthlyExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Rejected_Task_TC_107_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Rejected_Task_of_Reportee_TC_108_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek());
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_of_particular_Date_TC_109_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());

		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_of_particular_Date_of_Reportee_TC_110_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeDateWise());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_in_Date_Range_TC_111_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_in_Date_Range_of_Reportee_TC_112_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusRejected());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeDateWise());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Draft_Task_TC_113_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickYearDropdownYearlyExtract());
		interact.executeWithDelay(() -> ep.chooseYear());
		interact.executeWithDelay(() -> ep.clickYearDropdownYearlyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Draft_Task_of_Reportee_TC_114_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickYearDropdownYearlyExtract());
		interact.executeWithDelay(() -> ep.chooseYear());
		interact.executeWithDelay(() -> ep.clickYearDropdownYearlyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Draft_Task_of_particular_Month_TC_115_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickMonthDropdownMonthlyExtract());
		interact.executeWithDelay(() -> ep.chooseMonth());
		interact.executeWithDelay(() -> ep.clickMonthDropdownMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickYearDropdownMonthlyExtract());
		interact.executeWithDelay(() -> ep.chooseYear());
		interact.executeWithDelay(() -> ep.clickYearDropdownMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsMonthlyExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Draft_Task_of_particular_Month_of_Reportee_TC_116_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickMonthDropdownMonthlyExtract());
		interact.executeWithDelay(() -> ep.chooseMonth());
		interact.executeWithDelay(() -> ep.clickMonthDropdownMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickYearDropdownMonthlyExtract());
		interact.executeWithDelay(() -> ep.chooseYear());
		interact.executeWithDelay(() -> ep.clickYearDropdownMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickReporteeDropdownMonthlyExtract());
		interact.executeWithDelay(() -> ep.chooseReportee());
		interact.executeWithDelay(() -> ep.clickReporteeDropdownMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDotsMonthlyExtract());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Draft_Task_TC_117_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());
		
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek());
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Draft_Task_of_Reportee_TC_118_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeWeeklyExtract());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek());
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 22, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_of_particular_Date_TC_119_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 23, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_of_particular_Date_of_Reportee_TC_120_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeDateWise());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 24, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_in_Date_Range_TC_121_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 25, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_in_Date_Range_of_Reportee_TC_122_Editor() {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		
		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());
		
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		interact.executeWithDelay(() -> ep.chooseStatusDraft());
		interact.executeWithDelay(() -> ep.clickStatusDropdownDateWise());
		
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReporteeDateWise());
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 26, retryAnalyzer = RetryAnalyzer.class)
	public void TC_073_Editor_approve_list() {
			initialTest();
			ExportPage eT = new ExportPage(driver);
			eT.clickYearDropdownYearlyExtract();
			eT.chooseYear();
			eT.clickStatusDropdown();
			eT.chooseStatus();
			eT.clickBillable();
			eT.chooseBillable();
			eT.clickHoverElement();
			eT.clickThreeDots();
			eT.clickExportDataBtn();
			eT.clickExportBtn();
		}
	
	@Test(priority = 27, retryAnalyzer = RetryAnalyzer.class)
	public void TC_074_Editor_export_year_task() {
			initialTest();
			ExportPage eT = new ExportPage(driver);
			eT.clickYearDropdownYearlyExtract();
			eT.chooseYear();
			eT.clickHoverElement();
			eT.clickThreeDots();
			eT.clickExportDataBtn();
			eT.clickExportBtn();
		}
	
	@Test(priority = 28, retryAnalyzer = RetryAnalyzer.class)
	public void TC_075_Editor_approved_year_task() {
			initialTest();
			ExportPage eT = new ExportPage(driver);
			eT.clickReportee();
			eT.chooseReportee();
			eT.clickYearDropdownYearlyExtract();
			eT.chooseYear();
			eT.clickStatusDropdown();
			eT.chooseStatus();
			eT.clickHoverElement();
			eT.clickThreeDots();
			eT.clickExportDataBtn();
			eT.clickExportBtn();
		}
	
	@Test(priority = 29, retryAnalyzer = RetryAnalyzer.class)
	public void TC_076_Editor_year_list_reportee() {
			initialTest();
			ExportPage eT = new ExportPage(driver);
			eT.clickReportee();
			eT.chooseReportee();
			eT.clickYearDropdownYearlyExtract();
			eT.chooseYear();
			eT.clickHoverElement();
			eT.clickThreeDots();
			eT.clickExportDataBtn();
			eT.clickExportBtn();
		}
	
	@Test(priority = 30, retryAnalyzer = RetryAnalyzer.class)
	public void TC_077_Editor_approve_month() {
			initialTest();
			ExportPage eT = new ExportPage(driver);
			eT.clickYearDropdownYearlyExtract();
			eT.chooseYear();
			eT.clickStatusDropdown();
			eT.chooseStatus();
			eT.clickMonthlyExtract();
			eT.monthDropdownMonthlyExtract();
			eT.chooseMonth();
			eT.clickHoverElement();
			eT.clickThreeDotsAfterMonthlyExtract();
			eT.clickExportDataBtn();
			eT.clickExportBtn();
		}
	
	@Test(priority = 31, retryAnalyzer = RetryAnalyzer.class)
	public void TC_078_Editor_approve_month_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickMonthlyExtract();
		eT.monthDropdownMonthlyExtract();
		eT.chooseMonth();
		eT.clickHoverElement();
		eT.clickThreeDotsAfterMonthlyExtract();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 32, retryAnalyzer = RetryAnalyzer.class)
	public void TC_079_Editor_approve_month_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickMonthlyExtract();
		eT.monthDropdownMonthlyExtract();
		eT.chooseMonth();
		eT.clickHoverElement();
		eT.clickThreeDotsAfterMonthlyExtract();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 33, retryAnalyzer = RetryAnalyzer.class)
	public void TC_080_Editor_list_month_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickMonthlyExtract();
		eT.monthDropdownMonthlyExtract();
		eT.chooseMonth();
		eT.clickHoverElement();
		eT.clickThreeDotsAfterMonthlyExtract();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 34, retryAnalyzer = RetryAnalyzer.class)
	public void TC_081_Editor_week_team_approved() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickStatusDropdown();
		eT.chooseStatus();
		eT.clickWeeklyExtract();
		eT.clickWeekDropdownWeekExtract();
		eT.clickWeekChooseWeekExtract();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 35, retryAnalyzer = RetryAnalyzer.class)
	public void TC_082_Editor_week_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickWeeklyExtract();
		eT.clickWeekDropdownWeekExtract();
		eT.clickWeekChooseWeekExtract();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 36, retryAnalyzer = RetryAnalyzer.class)
	public void TC_083_Editor_approved_week_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickStatusDropdown();
		eT.chooseStatus();
		eT.clickWeeklyExtract();
		eT.clickWeekDropdownWeekExtract();
		eT.clickWeekChooseWeekExtract();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 37, retryAnalyzer = RetryAnalyzer.class)
	public void TC_084_Editor_week_reportee_task() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickWeeklyExtract();
		eT.clickWeekDropdownWeekExtract();
		eT.clickWeekChooseWeekExtract();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		}
	
	@Test(priority = 38, retryAnalyzer = RetryAnalyzer.class)
	public void TC_085_Editor_date_approved_task() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickStatusDropdown();
		eT.chooseStatus();
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 39, retryAnalyzer = RetryAnalyzer.class)
	public void TC_086_Editor_date_task() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 40, retryAnalyzer = RetryAnalyzer.class)
	public void TC_087_Editor_date_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickStatusDropdown();
		eT.chooseStatus();
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 41, retryAnalyzer = RetryAnalyzer.class)
	public void TC_088_Editor_date_reportee_task() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 42, retryAnalyzer = RetryAnalyzer.class)
	public void TC_089_Editor_date_select_range_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickStatusDropdown();
		eT.chooseStatus();
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 43, retryAnalyzer = RetryAnalyzer.class)
	public void TC_090_Editor_task_date_range() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 44, retryAnalyzer = RetryAnalyzer.class)
	public void TC_091_Editor_date_range_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickStatusDropdown();
		eT.chooseStatus();
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 45, retryAnalyzer = RetryAnalyzer.class)
	public void TC_092_Editor_date_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.dateWiseExtract();
		eT.dateStartSelectButton();
		eT.dateSelectStart();
		eT.dateEndSelectbutton();
		eT.dateSelectEnd();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		
		}
	
	@Test(priority = 46, retryAnalyzer = RetryAnalyzer.class)
	public void TC_093_Editor_submitted_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickStatusDropdown();
		eT.chooseStatusSubmitted();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		}
	
	@Test(priority = 47, retryAnalyzer = RetryAnalyzer.class)
	public void TC_094_Editor_year_task_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickStatusDropdown();
		eT.chooseStatusSubmitted();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		}
	
	@Test(priority = 48, retryAnalyzer = RetryAnalyzer.class)
	public void TC_095_Editor_month_task_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickStatusDropdown();
		eT.chooseStatusSubmitted();
		eT.clickMonthlyExtract();
		eT.monthDropdownMonthlyExtract();
		eT.chooseMonth();
		eT.clickHoverElement();
		eT.clickThreeDotsAfterMonthlyExtract();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		}
	
	@Test(priority = 49, retryAnalyzer = RetryAnalyzer.class)
	public void TC_096_Editor_submitted_month_task() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickYearDropdownYearlyExtract();
		eT.chooseYear();
		eT.clickStatusDropdown();
		eT.chooseStatusSubmitted();
		eT.clickMonthlyExtract();
		eT.monthDropdownMonthlyExtract();
		eT.chooseMonth();
		eT.clickHoverElement();
		eT.clickThreeDotsAfterMonthlyExtract();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		}
	
	@Test(priority = 50, retryAnalyzer = RetryAnalyzer.class)
	public void TC_097_Editor_submitted_task_team() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickStatusDropdown();
		eT.chooseStatusSubmitted();
		eT.clickWeeklyExtract();
		eT.clickWeekDropdownWeekExtract();
		eT.clickWeekChooseWeekExtract();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
		}
	
	@Test(priority = 51, retryAnalyzer = RetryAnalyzer.class)
	public void TC_098_Editor_week_task_reportee() {
		initialTest();
		ExportPage eT = new ExportPage(driver);
		eT.clickReportee();
		eT.chooseReportee();
		eT.clickYearDropdownYearlyExtract();
		eT.clickStatusDropdown();
		eT.chooseStatusSubmitted();
		eT.clickWeeklyExtract();
		eT.clickWeekDropdownWeekExtract();
		eT.clickWeekChooseWeekExtract();
		eT.clickHoverElement();
		eT.clickThreeDots();
		eT.clickExportDataBtn();
		eT.clickExportBtn();
	}
	
	@Test(priority = 52, retryAnalyzer = RetryAnalyzer.class)
	public void TC_149_Verification_of_visibility_of_yearly_partially_approved_tasks_of_entire_team_Editor() {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.yeardropdown());
		interact.executeWithDelay(() -> ep.selectYear());
		interact.executeWithDelay(() -> ep.status());
		interact.executeWithDelay(() -> ep.selectstatus());
		interact.executeWithDelay(() -> ep.hoverele());
		interact.executeWithDelay(() -> ep.threedots());
		interact.executeWithDelay(() -> ep.exportdata());
		interact.executeWithDelay(() -> ep.exportbutton());
	}
		@Test(priority = 53, retryAnalyzer = RetryAnalyzer.class)
		public void TC_150_Verification_of_visibility_of_yearly_partially_approved_tasks_of_a_particular_Reportee_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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


		@Test(priority = 54, retryAnalyzer = RetryAnalyzer.class)
		public void TC_151_vis_pat_particular_month_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 55, retryAnalyzer = RetryAnalyzer.class)
		public void TC_152_Verification_of_visibility_of_partially_approved_task_list_of_a_particular_month_of_a_particular_Reportee_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 56, retryAnalyzer = RetryAnalyzer.class)
		public void TC_153_vis_pat_weekly_exctract_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			
			
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
		
		
		
		@Test(priority = 57, retryAnalyzer = RetryAnalyzer.class)
		public void TC_155_visibility_of_yearly_partially_submitted_tasks_of_entire_team_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.selectPartiallysubmit());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.threedots());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
				
		}
		@Test(priority = 58, retryAnalyzer = RetryAnalyzer.class)
		public void TC_156_Verification_of_visibility_of_yearly_partially_submitted_tasks_of_a_particular_Reportee_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 59, retryAnalyzer = RetryAnalyzer.class)
		public void TC_157_Verification_of_visibility_of_partially_submitted_task_list_of_a_particular_month_of_his_entire_team_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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

		
		@Test(priority = 60, retryAnalyzer = RetryAnalyzer.class)
		public void TC_158_Verification_of_visibility_of_partially_submitted_task_list_of_a_particular_month_of_a_particular_Reportee_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 61, retryAnalyzer = RetryAnalyzer.class)
		public void TC_159_Verification_of_visibility_of_exported_Weekly_partially_submitted_tasks_of_entire_team_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 62, retryAnalyzer = RetryAnalyzer.class)
		public void TC_357_verification_of_total_billable_non_billable_hours_in_export_screen_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbilliable());	
		}
		
		@Test(priority = 63, retryAnalyzer = RetryAnalyzer.class)
		public void TC_358_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbillyes());	
		}
		
		@Test(priority = 64, retryAnalyzer = RetryAnalyzer.class)
		public void TC_359_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_yearly_extract_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.yeardropdown());
			interact.executeWithDelay(() -> ep.selectYear());
			interact.executeWithDelay(() -> ep.status());
			interact.executeWithDelay(() -> ep.approvedstatus());
			interact.executeWithDelay(() -> ep.billiabledd());
			interact.executeWithDelay(() -> ep.selectbillyes());	
		}
		
		@Test(priority = 65, retryAnalyzer = RetryAnalyzer.class)
		public void TC_360_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_monthly_extract_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 66, retryAnalyzer = RetryAnalyzer.class)
		public void TC_361_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_weekly_extract_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
		
		@Test(priority = 67, retryAnalyzer = RetryAnalyzer.class)
		public void TC_362_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_datewise_extract_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			interact.executeWithDelay(() -> ep.dateWiseExtract());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chosreportee());
			interact.executeWithDelay(() -> ep.dwstatus());
			interact.executeWithDelay(() -> ep.dwstatusselect());
			interact.executeWithDelay(() -> ep.dwbilliable());
			interact.executeWithDelay(() -> ep.selectbillyes());
	
		}
		
		@Test(priority = 68, retryAnalyzer = RetryAnalyzer.class)
		public void TC_154_Verification_of_visibility_of_exported__Weekly_partially_approved_tasks_of_a_particular_Reportee_Editor() {
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
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
 
		@Test(priority = 69, retryAnalyzer = RetryAnalyzer.class)
		public void TC_160_Verification_of_visibility_of_exported__Weekly_partially_submitted_tasks_of_a_particular_Reportee_Editor(){
			ExportPage ep = new ExportPage(driver);
			Interactions interact = new Interactions(driver);
			initialTest();
			interact.executeWithDelay(() -> ep.weekextract());
			interact.executeWithDelay(() -> ep.clickReportee());
			interact.executeWithDelay(() -> ep.chooseReportee());
			interact.executeWithDelay(() -> ep.weekdropdown());
			interact.executeWithDelay(() -> ep.selectweekk());
			interact.executeWithDelay(() -> ep.statusalldd());
			interact.executeWithDelay(() -> ep.selectweekstatus());
			interact.executeWithDelay(() -> ep.hoverele());
			interact.executeWithDelay(() -> ep.thrdots());
			interact.executeWithDelay(() -> ep.exportdata());
			interact.executeWithDelay(() -> ep.exportbutton());
			
		}
		
		@Test(priority = 70, retryAnalyzer = RetryAnalyzer.class)
		public void TC_148_Verification_of_Verification_of_last_refreshed_date_Editor(){
			ExportPage ep = new ExportPage(driver);
			initialTest();
			Assert.assertEquals(ep.getTotalHours(), "50145");
			Assert.assertEquals(ep.getTimeDate(), "11-Dec-2024");
		}
 
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
