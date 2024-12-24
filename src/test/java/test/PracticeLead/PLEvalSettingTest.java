package test.PracticeLead;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.EvalSettingLocators;
import helper.BaseTest;
import helper.Interactions;
import helper.RoleSelection;
import pages.EvalSettingPage;
import helper.RetryAnalyzer;

public class PLEvalSettingTest extends BaseTest {
	
	public void initiaTest() {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.selectRole("PL");
	}
	
	@Test(priority=1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_165_PL() {

		System.out.println("TC-165");
		evaluationSettings_PL();

	}
	
	@Test(priority=2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_166_PL() {
		
		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-166");
		evaluationSettings_PL();
		tabSwitch.switchEvalTab_PL();
		tabSwitch.switchEvalCategoryTab_PL();

	}
	
	@Test(priority=3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_167_PL() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		
		System.out.println("TC-167");
		evaluationSettings_PL();
		tabSwitch.switchEvalEligibilityTab_PL();

	}
	
	@Test(priority=4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_168_PL() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);
		
		System.out.println("TC-168");
		evaluationSettings_PL();
		tabSwitch.clickRefreshBtn_PL();

	}
	
	@Test(priority=5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_169_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-169");
		evaluationSettings_PL();
		evalPageSelect.employeeFieldInput_PL();
		evalPageSelect.employeeDropDown_PL();
		evalPageSelect.employeeSelectionFromDropDown_PL();

	}

	@Test(priority=6,retryAnalyzer = RetryAnalyzer.class)
	public void TC_170_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-170");
		evaluationSettings_PL();
		evalPageSelect.employeeFieldInput_PL();
		evalPageSelect.employeeDropDown_PL();
		evalPageSelect.employeeSelectionFromDropDown_PL();
		evalPageSelect.employeeSelectionRefreshButton_PL();

	}
	
	@Test(priority=7,retryAnalyzer = RetryAnalyzer.class)
	public void TC_171_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-171");
		evaluationSettings_PL();
		evalPageSelect.reviewPeriod_PL();
		evalPageSelect.reviewPeriodSelect_PL();
		//evalPageSelect.reviewPeriodVerifyEmpDiv();	
	}
	
	
	@Test(priority=8,retryAnalyzer = RetryAnalyzer.class)
	public void TC_172_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-172");
		evaluationSettings_PL();
		evalPageSelect.verifyStatusClick_PL();
		
	}
	
	@Test(priority=9,retryAnalyzer = RetryAnalyzer.class)
	public void TC_173_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-173");
		evaluationSettings_PL();
		
	}
	
	@Test(priority=10,retryAnalyzer = RetryAnalyzer.class)
	public void TC_175_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-175");
		evaluationSettings_PL();
		evalPageSelect.statusFieldSelect_PL();
		evalPageSelect.statusFieldDropDown_PL();
		evalPageSelect.statusFieldAll_PL();

		
	}
	
	
	@Test(priority=11,retryAnalyzer = RetryAnalyzer.class)
	public void TC_176_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-176");
		evaluationSettings_PL();
		evalPageSelect.statusFieldSelect_PL();
		evalPageSelect.statusFieldDropDown_PL();
		evalPageSelect.statusFieldAll_PL();
		evalPageSelect.statusReset_PL();

		
	}
//	//
	@Test(priority=12,retryAnalyzer = RetryAnalyzer.class)
	public void TC_178_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-178");
		evaluationSettings_PL();
//		evalPageSelect.resumeReview();
//		evalPageSelect.testCategoryPLClick();
//		evalPageSelect.testCategoryPL("xxxx");
//		evalPageSelect.testingpLClick();
//		evalPageSelect.testingpL("a");
//		evalPageSelect.summaryPLClick();
//		evalPageSelect.summaryPL("a");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		evalPageSelect.savebuttonClick();


	}
	
	@Test(priority=13,retryAnalyzer = RetryAnalyzer.class)
	public void TC_181_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-181");
		evaluationSettings_PL();
//		evalPageSelect.verifyPLRText("Pending Practice Lead Review");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		evalPageSelect.resumeReview();
//		evalPageSelect.proposedBonusPercentageClick();
//		evalPageSelect.proposedBonusPercentage("11");
//		evalPageSelect.summaryPLClick();
//		//evalPageSelect.summaryPL("a");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		evalPageSelect.savebuttonClick();
//		evalPageSelect.submitbuttonClick();
//		evaluationSettings();



		
	}
	
	
	@Test(priority=14,retryAnalyzer = RetryAnalyzer.class)
	public void TC_182_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-182");
		evaluationSettings_PL();
//		evalPageSelect.resumeReview();

		
	}
	@Test(priority=15,retryAnalyzer = RetryAnalyzer.class)
	public void TC_183_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-183");
		evaluationSettings_PL();
//		evalPageSelect.resumeReview();
//		evalPageSelect.proposedBonusPercentageClick();
//		evalPageSelect.proposedBonusPercentage("11");
//		evalPageSelect.summaryPLClick();
//		//evalPageSelect.summaryPL("a");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		evalPageSelect.savebuttonClick();
//		evalPageSelect.submitbuttonClick();
//		evaluationSettings();

	}
	

	//
	@Test(priority=16, retryAnalyzer = RetryAnalyzer.class)
	public void TC_185_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-185");
		evaluationSettings_PL();
		evalPageSelect.switchEvalCategoryTab_PL();
		evalPageSelect.addCategoryClick_PL();
		evalPageSelect.enterCategory_PL("aaa");
		evalPageSelect.enterCategoryDefination_PL("aaa");
		evalPageSelect.yesButtonClick_PL(driver);
		evalPageSelect.saveAddCategoryButtonClick_PL();


	}
	
	@Test(priority=17, retryAnalyzer = RetryAnalyzer.class)
	public void TC_186_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-186");
		evaluationSettings_PL();
		tabSwitch.switchEvalTab_PL();
		tabSwitch.switchEvalCategoryTab_PL();
		tabSwitch.clickActiveBtn_PL();


	}

	@Test(priority=18, retryAnalyzer = RetryAnalyzer.class)
	public void TC_187_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-187");
		evaluationSettings_PL();
		tabSwitch.switchEvalTab_PL();
		tabSwitch.switchEvalCategoryTab_PL();
		tabSwitch.clickArchivedBtn_PL();


	}
	
	@Test(priority=19, retryAnalyzer = RetryAnalyzer.class)
	public void TC_188_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-188");
		evaluationSettings_PL();
//		evalPageSelect.clickExport();


	}
	@Test(priority=20, retryAnalyzer = RetryAnalyzer.class)
	public void TC_189_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-189");
		evaluationSettings_PL();
		tabSwitch.switchEvalTab_PL();
		tabSwitch.switchEvalCategoryTab_PL();
		tabSwitch.clickCategoryRefreshBtn_PL();


	}
	
	@Test(priority=21, retryAnalyzer = RetryAnalyzer.class)
	public void TC_190_PL() {
		
		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-190");
		evaluationSettings_PL();
		tabSwitch.switchEvalTab_PL();
		tabSwitch.switchEvalCategoryTab_PL();
		tabSwitch.clickCategorySearch_PL();
		tabSwitch.enterCategorySearch_PL("abc");


	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC199_PL_eligibility() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC200_PL_employefilter() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.employeeFilter("rashmi");
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC201_PL_empReset() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.employeeFilter("rashmi");
		EvalSettingPage.empReset();

	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC202_PL_empRefresh() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.empRefresh();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC203_PL_createEmpCycle() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.createEmpCyc();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC204_PL_verifyFY() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.createEmpCyc();
		EvalSettingPage.FYdropdown();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC205_PL_editEmpCycle() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.employeeFilter("virat kohli");
		EvalSettingPage.penciliconPL23();
		interactions.executeWithDelay(() -> EvalSettingPage.selectQuaterQ1pl());
		interactions.executeWithDelay(() -> EvalSettingPage.saveButton());
	}

	//////////// need to create 2023 quater list////

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC207_PL_deleteEmpCycle() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaEligibityTab();
		EvalSettingPage.employeeFilter("virat kohli");
		interactions.executeWithDelay(() -> EvalSettingPage.deleteIcon());
	}

	//////////// evaluation category /////////////////////////

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC196_PL_SearchingarchivedCategory() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.searchArchive("search");
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC197_PL_RefreshArchivedCategory() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.searchArchive("search");
		EvalSettingPage.refreshArchive();
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC191_PL_deleteOfactiveCatagory() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.searchArchive("delete icon");
		interactions.executeWithDelay(() -> EvalSettingPage.deleteIconCategory());
	}

	// there should be a category to archive
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC192_PL_deleteOfactiveCatagoryarchive() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.searchArchive("archive");
		interactions.executeWithDelay(() -> EvalSettingPage.deleteIconCategory());
		interactions.executeWithDelay(() -> EvalSettingPage.deleteArchiveBtnPL());
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void TC194_PL_modifyArchiveCat() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.archiveButton();
		EvalSettingPage.searchArchive("archive");
		EvalSettingPage.editArchiveCatbtn();
		EvalSettingPage.archiveDescription("this is a test for PL role");
		interactions.executeWithDelay(() -> EvalSettingPage.saveArchivebtn());

	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void TC195_PL_modifyArchiveCat() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.archiveButton();
		EvalSettingPage.searchArchive("archive");
		interactions.executeWithDelay(() -> EvalSettingPage.toggleArchive());
	}

	// there should be a category to delete
	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void TC193_PL_deleteOfactiveCatagoryarchive() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.searchArchive("Test Delete");
		interactions.executeWithDelay(() -> EvalSettingPage.deleteIconCategory());
		interactions.executeWithDelay(() -> EvalSettingPage.deleteButton());
	}

	// there should be a category to delete in archive
	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void TC198_PL_deleteArchivedCategory() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.evaluationCategoriesTab();
		EvalSettingPage.searchArchive("new");
		EvalSettingPage.archiveButton();
		interactions.executeWithDelay(() -> EvalSettingPage.deleteArchiveCategory());
	}

	////////////////// EVALUATION TAB////////////////////////

	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void TC284_PL_Click_on_Reportee() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectstatusdropdownPL();
		EvalSettingPage.evaluatedStatus();
		EvalSettingPage.selectQuaterFilter23Q1PL();
		EvalSettingPage.selectEmployee();
	}

	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void TC275_PL_percentage_not_vissible() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectstatusdropdownPL();
		EvalSettingPage.allStatus();
	}

	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void TC273_TC274_PL_percentage_evaluated() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectstatusdropdownPL();
		EvalSettingPage.allStatus();
		EvalSettingPage.selectQuaterFilter23Q1PL();
		interactions.executeWithDelay(() -> EvalSettingPage.toggleButton());
	}

	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void TC271_PL_providing_feedback() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.proposedBonusIntPL_23Q3(0);
	}

	// contribution should be available for the current quarter to start the review

	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void TC279_PL_per_more_than_999() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.proposedBonusIntPL_23Q3(1000);
	}

	@Test(priority = 22, retryAnalyzer = RetryAnalyzer.class)
	public void TC272_PL_providing_feedback_1_999() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.proposedBonusIntPL_23Q3(234);
		EvalSettingPage.saveButtonReview();
	}

	@Test(priority = 23, retryAnalyzer = RetryAnalyzer.class)
	public void TC276_PL_YEARfilter() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectstatusdropdownPL();
		EvalSettingPage.evaluatedStatus();
		EvalSettingPage.selectEmployee();
		EvalSettingPage.yearReviewDD();
		EvalSettingPage.select2023year();

	}

	@Test(priority = 24, retryAnalyzer = RetryAnalyzer.class)
	public void TC277_PL_q1filter() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.q1review();

	}

	@Test(priority = 25, retryAnalyzer = RetryAnalyzer.class)
	public void TC278_TC291_PL_scrolldown() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		interactions.executeWithDelay(() -> EvalSettingPage.scrolldown());

	}

	@Test(priority = 26, retryAnalyzer = RetryAnalyzer.class)
	public void TC280_PL_contributionSummary() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.contributionSummary("this is test summary");
	}

	@Test(priority = 27, retryAnalyzer = RetryAnalyzer.class)
	public void TC281_PL_saveButtonReview() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.contributionSummary("this is test summary 123");
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
	}

	@Test(priority = 28, retryAnalyzer = RetryAnalyzer.class)
	public void TC266_TC283_TC287_PL_rejectionProcess() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q3PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.contributionSummary("this is test summary for rejection");
		EvalSettingPage.proposedBonusIntPL_23Q3(509);
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
		interactions.executeWithDelay(() -> EvalSettingPage.rejectButton());
	}

	// new test cases//

	@Test(priority = 29)
	public void TC288_PL_reject_to_RL() throws InterruptedException {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		EvalSettingPage.selectQuaterFilter23Q1PL();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.proposedBonusIntPL_23Q1(509);
		EvalSettingPage.contributionSummaryPL("this is test for reject to RL");
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
		interactions.executeWithDelay(() -> EvalSettingPage.rejectButton());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> EvalSettingPage.rejectToRLBtn());

	}

	@Test(priority = 30)
	public void TC289_PL_reject_to_Employee() throws InterruptedException {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationSettingtab();
		interactions.executeWithDelay(() -> EvalSettingPage.startReview());
		EvalSettingPage.proposedBonusIntPL_24Q3(509);
		EvalSettingPage.contributionSummaryPL("this is test for reject to Employee");
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
		interactions.executeWithDelay(() -> EvalSettingPage.rejectButton());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> EvalSettingPage.rejectToEmployeeBtn());

	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void roleSelectPL() {

    	RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.selectRole("PL");
	}
	
	public void evaluationSettings_PL() {
		
		EvalSettingLocators evalSettingTab = new EvalSettingLocators(driver);
		roleSelectPL();
		evalSettingTab.test_PL();
	}
	
}
