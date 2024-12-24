package test.Editor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.EvalSettingLocators;

import helper.BaseTest;
import helper.Interactions;
import helper.RoleSelection;
import pages.EvalSettingPage;
import helper.RetryAnalyzer;

public class EditorEvalSettingTest extends BaseTest {
	
	private EvalSettingPage evaluationTab;

	public void initiaTest() {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.selectRole("Editor");

	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_165_Editor() {

		System.out.println("TC-165");
		evaluationSettings();

	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_166_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-166");
		evaluationSettings();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();

	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_167_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-167");
		evaluationSettings();
		tabSwitch.switchEvalEligibilityTab_editor();

	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_168_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-168");
		evaluationSettings();
		tabSwitch.clickRefreshBtn_editor();

	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_169_Editor() {

		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-169");
		evaluationSettings();
		evalPageSelect.employeeFieldInput_editor();
		evalPageSelect.employeeDropDown_editor();
		evalPageSelect.employeeSelectionFromDropDown_editor();

	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_170_Editor() {

		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-170");
		evaluationSettings();
		evalPageSelect.employeeFieldInput_editor();
		evalPageSelect.employeeDropDown_editor();
		evalPageSelect.employeeSelectionFromDropDown_editor();
		evalPageSelect.employeeSelectionRefreshButton_editor();

	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_171_Editor() {

		EvalSettingPage evalPageSelect = new EvalSettingPage(driver);

		System.out.println("TC-171");
		evaluationSettings();
		evalPageSelect.reviewPeriod_editor();
		evalPageSelect.reviewPeriodSelect_editor();
		// evalPageSelect.reviewPeriodVerifyEmpDiv();
	}

	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void TC_186_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-186");
		evaluationSettings();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickActiveBtn_editor();

	}

	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void TC_187_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-187");
		evaluationSettings();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickArchivedBtn_editor();

	}

	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void TC_189_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-189");
		evaluationSettings();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickCategoryRefreshBtn_editor();

	}

	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void TC_190_Editor() {

		EvalSettingPage tabSwitch = new EvalSettingPage(driver);

		System.out.println("TC-190");
		evaluationSettings();
		tabSwitch.switchEvalTab_editor();
		tabSwitch.switchEvalCategoryTab_editor();
		tabSwitch.clickCategorySearch_editor();
		tabSwitch.enterCategorySearch_editor("abc");

	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC196_Editor_SearchingarchivedCategory() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.searchArchive("search");
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC197_Editor_RefreshArchivedCategory() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.searchArchive("search");
		evaluationSettingPage.refreshArchive();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC191_Editor_deleteOfactiveCatagory() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.searchArchive("delete icon");
		evaluationSettingPage.deleteIconCategory();
	}

	// there should be a category to archive
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC192_Editor_deleteOfactiveCatagoryarchive() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.searchArchive("archive");
		evaluationSettingPage.deleteIconCategory();
		evaluationSettingPage.deleteArchiveBtn();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC194_Editor_modifyArchiveCat() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.archiveButton();
		evaluationSettingPage.searchArchive("archive");
		evaluationSettingPage.editArchiveCatbtn();
		evaluationSettingPage.archiveDescriptionEditor("this is a test for editor role");
		evaluationSettingPage.saveArchivebtnEditor();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC195_Editor_modifyArchiveCat() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.archiveButton();
		evaluationSettingPage.searchArchive("archive");
		interactions.executeWithDelay(() -> evaluationSettingPage.toggleArchiveEditor());
	}

	// there should be a category to delete
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC193_Editor_deleteOfactiveCatagory() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.searchArchive("Test Delete");
		evaluationSettingPage.deleteIconCategory();
		evaluationSettingPage.deleteButtonEditor();
	}

	// precondition : there should be a category to delete in archive
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC198_Editor_deleteArchivedCategory() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaluationCategoriesTab();
		evaluationSettingPage.archiveButton();
		evaluationSettingPage.searchArchive("new");
		interactions.executeWithDelay(() -> evaluationSettingPage.deleteArchiveCategory());
	}

	//////////////////// evaluation eligibility//////////////////////////

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC199_Editor_eligibility() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC200_Editor_employefilter() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.employeeFilter("sahil");
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC201_Editor_empReset() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.employeeFilter("kaushik");
		evaluationSettingPage.empReset();

	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC202_Editor_empRefresh() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.empRefresh();
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void TC203_Editor_createEmpCycle() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.createEmpCyc();
	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void TC204_Editor_verifyFY() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.createEmpCyc();
		evaluationSettingPage.FYdropdownEditor();
	}

	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void TC205_Editor_editEmpCycle() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.employeeFilter("Sahil");
		interactions.executeWithDelay(() -> evaluationSettingPage.penciliconEditor());
		interactions.executeWithDelay(() -> evaluationSettingPage.selectQuaterQ1());
		evaluationSettingPage.saveButtonEditor();
	}

	// precondition : There delete button should be applicable for the specific
	// person to be deleted//

	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void TC207_Editor_deleteEmpCycle() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.evaEligibityTab();
		evaluationSettingPage.employeeFilter("virat kohli");
		evaluationSettingPage.deleteIcon();
	}

	////////////////// EVALUATION TAB////////////////////////

	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void TC275_Editor_percentagenotvissible() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.selectstatusdropdown();
		evaluationSettingPage.allStatus();
	}

	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void TC273_TC274_Editor_percentageEvaluated() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.selectQuaterFilter23Q2();
		interactions.executeWithDelay(() -> evaluationSettingPage.toggleButtonEditor());
	}

	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void TC264_Editor_statusFilteration() {
		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.selectstatusdropdown();
	}

	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void TC265_Editor_statusQuaterFilter() {

		initiaTest();
		EvalSettingPage evaluationSettingPage = new EvalSettingPage(driver);
		evaluationSettingPage.clickevaluationSettingtab();
		evaluationSettingPage.selectQuaterFilter23Q1();
		evaluationSettingPage.selectallstatus();
	}

	// Vivek

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_206_modificationofemployeeCycle_Editor() throws InterruptedException {
		initiaTest();
		evaluationTab.modificationofemployeeCycle();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_253_visibilityofStatusChangeBtn_Editor() throws InterruptedException {
		initiaTest();
		evaluationTab.visibilityofStatusChangeBtn();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_254_StatusChanged_Editor() throws InterruptedException {
		initiaTest();
		// evaluationTab.StatusChanged();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_264_statusVisibility_Editor() throws InterruptedException {
		initiaTest();
		evaluationTab.statusVisibility();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_265_selectallStatus_Editor() throws InterruptedException {
		initiaTest();
		evaluationTab.selectallStatus();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();
	}

	public void roleSelectEditor() {

		RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.selectRole("Editor");
	}

	public void evaluationSettings() {

		EvalSettingLocators evalSettingTab = new EvalSettingLocators(driver);
		roleSelectEditor();
		evalSettingTab.test_editor();
	}

}
