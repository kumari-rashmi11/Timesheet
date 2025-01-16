package test.PracticeLead;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.NavigateToTimesheet;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ExportPage;

public class ExportTest_PL extends BaseTest {

	public void initialTest() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
//
//		NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//		nt.clickTeamsBtn();
//		nt.clickTimesheetBtn();
//		nt.clickTimesheetLink();
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
	  roleSelectionPage.timesheetNavigation(); 
      roleSelectionPage.iframeSwitch1();
      roleSelectionPage.iframeSwitch2();
      roleSelectionPage.PLRoleBtn();
  	
//
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch1());
//		interact.executeWithDelay(() -> roleSelectionPage.iframeSwitch2());
//		interact.executeWithDelay(() -> roleSelectionPage.selectRole("Editor"));
		interact.executeWithDelay(() -> ep.clickExportTab());
		interact.executeWithDelay(() -> ep.switchFrame());
		interact.executeWithDelay(() -> ep.clickSignInBtn());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_TC_099_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_of_Reportee_TC_100_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Abhigyan Majhi(1334)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_in_Date_Range_TC_101_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Submitted_Task_in_Date_Range_and_Reportee_TC_102__Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Abhigyan Majhi(1334)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Rejected_Task_TC_103_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Rejected_Task_of_Reportee_TC_104_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Aditya Dubey(1169)"));
//		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Rejected_Task_of_particular_Month_TC_105_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Rejected_Task_of_particular_Month_of_Reportee_TC_106_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Aditya Dubey(1169)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Rejected_Task_TC_107_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Rejected_Task_of_Reportee_TC_108_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_of_particular_Date_TC_109_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_of_particular_Date_of_Reportee_TC_110_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Aditya Dubey(1169)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_in_Date_Range_TC_111_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Rejected_Task_in_Date_Range_of_Reportee_TC_112_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Aditya Dubey(1169)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Draft_Task_TC_113_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void Yearly_Extract_Export_Draft_Task_of_Reportee_TC_114_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Parmita Saha(1342)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Draft_Task_of_particular_Month_TC_115_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void Monthly_Extract_Export_Draft_Task_of_particular_Month_of_Reportee_TC_116_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Rejected"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
		}

	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Draft_Task_TC_117_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void Weekly_Extract_Export_Draft_Task_of_Reportee_TC_118_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Parmita Saha(1342)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("02 Feb - 08 Feb, 2014"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 22, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_of_particular_Date_TC_119_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 23, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_of_particular_Date_of_Reportee_TC_120_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Kaushik Barman(1511)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 24, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_in_Date_Range_TC_121_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 25, retryAnalyzer = RetryAnalyzer.class)
	public void Datewise_Extract_Export_Draft_Task_in_Date_Range_of_Reportee_TC_122_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Draft"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Kaushik Barman(1511)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 26, retryAnalyzer = RetryAnalyzer.class)
	public void TC_148_Verification_of_Verification_of_last_refreshed_date_Editor() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.getTotalHours());
		interact.executeWithDelay(() -> ep.getTimeDate());

//		Assert.assertEquals(ep.getTotalHours(), "53073");
//		Assert.assertEquals(ep.getTimeDate(), "15-Jan-2025");
	}

	@Test(priority = 27, retryAnalyzer = RetryAnalyzer.class)
	public void TC_149_Verification_of_visibility_of_yearly_partially_approved_tasks_of_entire_team_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 28, retryAnalyzer = RetryAnalyzer.class)
	public void TC_150_Verification_of_visibility_of_yearly_partially_approved_tasks_of_a_particular_Reportee_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 29, retryAnalyzer = RetryAnalyzer.class)
	public void TC_151_vis_pat_particular_month_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 30, retryAnalyzer = RetryAnalyzer.class)
	public void TC_152_Verification_of_visibility_of_partially_approved_task_list_of_a_particular_month_of_a_particular_Reportee_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 31, retryAnalyzer = RetryAnalyzer.class)
	public void TC_153_vis_pat_weekly_exctract_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

//	
	@Test(priority = 32, retryAnalyzer = RetryAnalyzer.class)
	public void TC_154_Verification_of_visibility_of_exported__Weekly_partially_approved_tasks_of_a_particular_Reportee_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 34, retryAnalyzer = RetryAnalyzer.class)
	public void TC_155_visibility_of_yearly_partially_submitted_tasks_of_entire_team_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 35, retryAnalyzer = RetryAnalyzer.class)
	public void TC_156_Verification_of_visibility_of_yearly_partially_submitted_tasks_of_a_particular_Reportee_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 36, retryAnalyzer = RetryAnalyzer.class)
	public void TC_157_Verification_of_visibility_of_partially_submitted_task_list_of_a_particular_month_of_his_entire_team_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 37, retryAnalyzer = RetryAnalyzer.class)
	public void TC_158_Verification_of_visibility_of_partially_submitted_task_list_of_a_particular_month_of_a_particular_Reportee_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 38, retryAnalyzer = RetryAnalyzer.class)
	public void TC_159_Verification_of_visibility_of_exported_Weekly_partially_submitted_tasks_of_entire_team_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 39, retryAnalyzer = RetryAnalyzer.class)
	public void TC_357_verification_of_total_billable_non_billable_hours_in_export_screen_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
		interact.executeWithDelay(() -> ep.selectbillable("Yes"));
	}

	@Test(priority = 40, retryAnalyzer = RetryAnalyzer.class)
	public void TC_358_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
		interact.executeWithDelay(() -> ep.selectbillable("No"));
	}

	@Test(priority = 41, retryAnalyzer = RetryAnalyzer.class)
	public void TC_359_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_yearly_extract_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
//		interact.executeWithDelay(() -> ep.selectbillable("No"));
	}

	@Test(priority = 42, retryAnalyzer = RetryAnalyzer.class)
	public void TC_360_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_monthly_extract_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

//		interact.executeWithDelay(() -> ep.clickMonthDropdown());
//		interact.executeWithDelay(() -> ep.chooseMonth("April"));
//		interact.executeWithDelay(() -> ep.clickMonthDropdown());
//
		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
//		interact.executeWithDelay(() -> ep.selectbillable("No"));
	}

	@Test(priority = 43, retryAnalyzer = RetryAnalyzer.class)
	public void TC_361_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_weekly_extract_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
//		interact.executeWithDelay(() -> ep.selectbillable("No"));

	}

	@Test(priority = 44, retryAnalyzer = RetryAnalyzer.class)
	public void TC_362_verification_of_total_billable_non_billable_hours_in_export_screen_for_particular_user_on_the_basis_of_datewise_extract_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
//		interact.executeWithDelay(() -> ep.selectbillable("Yes"));

	}

	@Test(priority = 45, retryAnalyzer = RetryAnalyzer.class)
	public void TC_160_Verification_of_visibility_of_exported__Weekly_partially_submitted_tasks_of_a_particular_Reportee_Editor() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Partially Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 46, retryAnalyzer = RetryAnalyzer.class)
	public void TC_073_Editor_approve_list() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.billiabledd());
//		interact.executeWithDelay(() -> ep.selectbillable("Yes"));

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 47, retryAnalyzer = RetryAnalyzer.class)
	public void TC_074_Editor_export_year_task() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 48, retryAnalyzer = RetryAnalyzer.class)
	public void TC_075_Editor_approved_year_task() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 49, retryAnalyzer = RetryAnalyzer.class)
	public void TC_076_Editor_year_list_reportee() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 50, retryAnalyzer = RetryAnalyzer.class)
	public void TC_077_Editor_approve_month() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 51, retryAnalyzer = RetryAnalyzer.class)
	public void TC_078_Editor_approved_month_team() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 52, retryAnalyzer = RetryAnalyzer.class)
	public void TC_079_Editor_approve_month_reportee() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());
		
		interact.executeWithDelay(() -> ep.clickMonthDropdown());
		interact.executeWithDelay(() -> ep.chooseMonth("March"));
		interact.executeWithDelay(() -> ep.clickMonthDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Abhigyan Majhi(1334)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 53, retryAnalyzer = RetryAnalyzer.class)
	public void TC_080_Editor_list_month_reportee() throws InterruptedException {
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickMonthDropdown());
		interact.executeWithDelay(() -> ep.chooseMonth("March"));
		interact.executeWithDelay(() -> ep.clickMonthDropdown());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("Abhigyan Majhi(1334)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 54, retryAnalyzer = RetryAnalyzer.class)
	public void TC_081_Editor_week_team_approved() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("02 Mar - 08 Mar, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 55, retryAnalyzer = RetryAnalyzer.class)
	public void TC_082_Editor_week_team() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Aug - 07 Aug, 2021"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 56, retryAnalyzer = RetryAnalyzer.class)
	public void TC_083_Editor_approved_week_team() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("28 Apr - 04 May, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 57, retryAnalyzer = RetryAnalyzer.class)
	public void TC_084_Editor_week_reportee_task() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 58, retryAnalyzer = RetryAnalyzer.class)
	public void TC_085_Editor_date_approved_task() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 59, retryAnalyzer = RetryAnalyzer.class)
	public void TC_086_Editor_date_task() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 60, retryAnalyzer = RetryAnalyzer.class)
	public void TC_087_Editor_date_reportee() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 61, retryAnalyzer = RetryAnalyzer.class)
	public void TC_088_Editor_date_reportee_task() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 62, retryAnalyzer = RetryAnalyzer.class)
	public void TC_089_Editor_date_select_range_team() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 63, retryAnalyzer = RetryAnalyzer.class)
	public void TC_090_Editor_task_date_range() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 64, retryAnalyzer = RetryAnalyzer.class)
	public void TC_091_Editor_date_range_reportee() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Approved"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 65, retryAnalyzer = RetryAnalyzer.class)
	public void TC_092_Editor_date_reportee() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickDatewiseExtract());

		interact.executeWithDelay(() -> ep.sendWorkStartDate());
		interact.executeWithDelay(() -> ep.sendWorkEndDate());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());

	}

	@Test(priority = 66, retryAnalyzer = RetryAnalyzer.class)
	public void TC_093_Editor_submitted_team() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 67, retryAnalyzer = RetryAnalyzer.class)
	public void TC_094_Editor_year_task_reportee() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 68, retryAnalyzer = RetryAnalyzer.class)
	public void TC_095_Editor_month_task_team() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickMonthDropdown());
		interact.executeWithDelay(() -> ep.chooseMonth("April"));
		interact.executeWithDelay(() -> ep.clickMonthDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}

	@Test(priority = 69, retryAnalyzer = RetryAnalyzer.class)
	public void TC_096_Editor_submitted_month_task() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickMonthlyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickYearDropdown());
		interact.executeWithDelay(() -> ep.chooseYear("2014"));
		interact.executeWithDelay(() -> ep.clickYearDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickMonthDropdown());
		interact.executeWithDelay(() -> ep.chooseMonth("April"));
		interact.executeWithDelay(() -> ep.clickMonthDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
	}
	
	@Test(priority = 70, retryAnalyzer = RetryAnalyzer.class)
	public void TC_097_Editor_submitted_task_team() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
		}
	
	@Test(priority = 71, retryAnalyzer = RetryAnalyzer.class)
	public void TC_098_Editor_week_task_reportee() throws InterruptedException {
		initialTest();
		ExportPage ep = new ExportPage(driver);
		Interactions interact = new Interactions(driver);

		interact.executeWithDelay(() -> ep.clickWeeklyExtract());

		interact.executeWithDelay(() -> ep.clickReportee());
		interact.executeWithDelay(() -> ep.chooseReportee("A test(007)"));
		interact.executeWithDelay(() -> ep.clickReportee());
		
		interact.executeWithDelay(() -> ep.clickWeekDropdown());
		interact.executeWithDelay(() -> ep.chooseWeek("01 Dec - 07 Dec, 2024"));
		interact.executeWithDelay(() -> ep.clickWeekDropdown());

		interact.executeWithDelay(() -> ep.clickStatusDropdown());
		interact.executeWithDelay(() -> ep.chooseStatus("Submitted"));
		interact.executeWithDelay(() -> ep.clickStatusDropdown());

		interact.executeWithDelay(() -> ep.clickHoverElement());
		interact.executeWithDelay(() -> ep.clickThreeDots());
		interact.executeWithDelay(() -> ep.clickExportDataBtn());
		interact.executeWithDelay(() -> ep.clickExportBtn());
		}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}