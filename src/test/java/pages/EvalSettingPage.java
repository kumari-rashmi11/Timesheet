package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.EvalSettingLocators;
import helper.Interactions;

public class EvalSettingPage {
	private Interactions clickingHelper_Editor;
	private EvalSettingLocators evalSettingTab_Editor;
	private Interactions clickingHelper_HR;
	private EvalSettingLocators evalSettingTab_HR;
	private Interactions clickingHelper;
	private EvalSettingLocators evalSettingTab;
	private Interactions clickingHelper_Viewer;
	private EvalSettingLocators evalSettingTab_Viewer;
	private EvalSettingLocators MTlocators;
	private Interactions interaction;
	Actions actions;

	public EvalSettingPage(WebDriver driver) {
		this.clickingHelper_Editor = new Interactions(driver);
		this.evalSettingTab_Editor = new EvalSettingLocators(driver);
		this.clickingHelper_HR = new Interactions(driver);
		this.evalSettingTab_HR = new EvalSettingLocators(driver);
		this.clickingHelper = new Interactions(driver);
		this.evalSettingTab = new EvalSettingLocators(driver);
		this.clickingHelper_Viewer = new Interactions(driver);
		this.evalSettingTab_Viewer = new EvalSettingLocators(driver);
		this.MTlocators = new EvalSettingLocators(driver);
		this.interaction = new Interactions(driver);
		this.actions = new Actions(driver);
	}

	// vivek

	public void modificationofemployeeCycle() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTab);
		interaction.click(EvalSettingLocators.SelectEvaluationEligibility);
		interaction.click(EvalSettingLocators.SelectPencilBtn);
		interaction.click(EvalSettingLocators.SelectQuarter);
		interaction.click(EvalSettingLocators.SelectSaveBtn);

	}

	public void visibilityofStatusChangeBtn() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTab);
		interaction.click(EvalSettingLocators.SelectEvaluetedEmployee);
		interaction.click(EvalSettingLocators.SelectChangeStatusBtn);

	}

	public void StatusChanged() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTab);
		interaction.click(EvalSettingLocators.SelectEvaluetedEmployee);
		interaction.click(EvalSettingLocators.SelectChangeStatusBtn);
		interaction.click(EvalSettingLocators.SelectStatusDropdown);
		interaction.click(EvalSettingLocators.ChooseStatus);
		interaction.enterText(EvalSettingLocators.Textbox, "need to improvement");
		interaction.click(EvalSettingLocators.SaveBtn);

	}

	public void statusVisibility() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTab);
		interaction.click(EvalSettingLocators.SelectStatus);
	}

	public void selectallStatus() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTab);
		interaction.click(EvalSettingLocators.SelectStatus);
		interaction.click(EvalSettingLocators.SelectAllStatus);

	}

	public void submitfeedback() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTab);
		interaction.click(EvalSettingLocators.SelectPencilBtn);
		interaction.click(EvalSettingLocators.SelectQuarter);
		interaction.click(EvalSettingLocators.SelectSaveBtn);

	}

	public void feedbackbyRL() throws InterruptedException {
		interaction.click(EvalSettingLocators.SelectEvaluationTabRL);
		interaction.click(EvalSettingLocators.SelectReviewPeriod);
		interaction.click(EvalSettingLocators.ChooseReviewPeriodRL);
		interaction.click(EvalSettingLocators.ResumeReview);
	}

	public void switchEvalTab_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.evaluationTab_editor);
	}

	public void switchEvalCategoryTab_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.evaluationCategoriesTab_editor);
	}

	public void switchEvalEligibilityTab_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.EvaluationEligibilityTab_editor);
	}

	public void employeeFieldInput_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.employeeFieldInputSelect_editor);
	}

	public void employeeDropDown_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.employeeDropDownButton_editor);
	}

	public void employeeSelectionFromDropDown_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.employeeSelectionFromDropDown_editor);
	}

	public void employeeSelectionRefreshButton_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.employeeSelectionRefreshButton_editor);
	}

	public void reviewPeriod_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.reviewPreiodButton_editor);
	}

	public void reviewPeriodSelect_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.reviewPeriodSelect_editor);
	}

	public void reviewPeriodVerifyEmpDiv_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.VerifyEmpDivSelect_editor);
	}

	public void reviewPeriodVerifyEmp_editor(String expectedText) {
		clickingHelper_Editor.verifyText(this.evalSettingTab_Editor.reviewPeriodSelect_editor, expectedText);
	}

	public void verifyStatusClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.verifyStatusDefault_editor);
	}

	public void verifyStatus_editor(String expectedText) {
		clickingHelper_Editor.verifyText(this.evalSettingTab_Editor.statusFieldSelect_editor, expectedText);
	}

	public void statusFieldSelect_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.statusFieldInputSelect_editor);
	}

	public void statusFieldDropDown_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.statusDropDownButton_editor);
	}

	public void statusFieldAll_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.statusAll_editor);
	}

	public void statusReset_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.statusReset_editor);
	}

	public void resumeReview_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.resumeReview_editor);
	}

	public void testCategoryPLClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.testCategoryPL_editor);
	}

	public void testCategoryPL_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.testCategoryPL_editor, value);
	}

	public void testingpLClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.testingpL_editor);
	}

	public void testingpL_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.testingpL_editor, value);

	}

	public void summaryPLClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.summaryPL_editor);
	}

	public void summaryPL_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.summaryPL_editor, value);
	}

	public void savebuttonClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.savebutton_editor);

	}

	// TC-181
	public void verifyPLRText_editor(String expectedText) {
		clickingHelper_Editor.verifyText(this.evalSettingTab_Editor.verifyPLRText_editor, expectedText);

	}

	public void proposedBonusPercentageClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.proposedBonusPercentage_editor);
	}

	public void proposedBonusPercentage_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.proposedBonusPercentage_editor, value);
	}

	public void submitbuttonClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.submitButton_editor);

	}

	// TC-185
	public void addCategoryClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.addCategory_editor);

	}

	public void enterCategory_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.inputCategory_editor, value);

	}

	public void enterCategoryDefination_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.inputDefination_editor, value);

	}

	public void yesButtonClick_editor(WebDriver driver) {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.yesButton_editor);
//    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.evalSettingTab.yesButton);

	}

	public void saveAddCategoryButtonClick_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.saveAddCategoryButton_editor);

	}

	public void clickExport_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.export_editor);

	}

	public void clickRefreshBtn_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.refreshButton_editor);

	}

	public void clickActiveBtn_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.refreshButton_editor);

	}

	public void clickArchivedBtn_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.refreshButton_editor);

	}

	public void clickCategoryRefreshBtn_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.categoryRefresh_editor);

	}

	public void clickCategorySearch_editor() {
		clickingHelper_Editor.click(this.evalSettingTab_Editor.categorySearch_editor);

	}

	public void enterCategorySearch_editor(String value) {
		clickingHelper_Editor.enterText(this.evalSettingTab_Editor.categorySearch_editor, value);

	}

	public void switchEvalTab_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.evaluationTab_HR);
	}

	public void switchEvalCategoryTab_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.evaluationCategoriesTab_HR);
	}

	public void switchEvalEligibilityTab_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.EvaluationEligibilityTab_HR);
	}

	public void employeeFieldInput_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.employeeFieldInputSelect_HR);
	}

	public void employeeDropDown_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.employeeDropDownButton_HR);
	}

	public void employeeSelectionFromDropDown_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.employeeSelectionFromDropDown_HR);
	}

	public void employeeSelectionRefreshButton_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.employeeSelectionRefreshButton_HR);
	}

	public void reviewPeriod_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.reviewPreiodButton_HR);
	}

	public void reviewPeriodSelect_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.reviewPeriodSelect_HR);
	}

	public void reviewPeriodVerifyEmpDiv_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.VerifyEmpDivSelect_HR);
	}

	public void reviewPeriodVerifyEmp_HR(String expectedText) {
		clickingHelper_HR.verifyText(this.evalSettingTab_HR.reviewPeriodSelect_HR, expectedText);
	}

	public void verifyStatusClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.verifyStatusDefault_HR);
	}

	public void verifyStatus_HR(String expectedText) {
		clickingHelper_HR.verifyText(this.evalSettingTab_HR.statusFieldSelect_HR, expectedText);
	}

	public void statusFieldSelect_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.statusFieldInputSelect_HR);
	}

	public void statusFieldDropDown_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.statusDropDownButton_HR);
	}

	public void statusFieldAll_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.statusAll_HR);
	}

	public void statusReset_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.statusReset_HR);
	}

	public void resumeReview_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.resumeReview_HR);
	}

	public void testCategoryPLClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.testCategoryPL_HR);
	}

	public void testCategoryPL_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.testCategoryPL_HR, value);
	}

	public void testingpLClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.testingpL_HR);
	}

	public void testingpL_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.testingpL_HR, value);

	}

	public void summaryPLClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.summaryPL_HR);
	}

	public void summaryPL_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.summaryPL_HR, value);
	}

	public void savebuttonClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.savebutton_HR);

	}

	// TC-181
	public void verifyPLRText_HR(String expectedText) {
		clickingHelper_HR.verifyText(this.evalSettingTab_HR.verifyPLRText_HR, expectedText);

	}

	public void proposedBonusPercentageClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.proposedBonusPercentage_HR);
	}

	public void proposedBonusPercentage_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.proposedBonusPercentage_HR, value);
	}

	public void submitbuttonClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.submitButton_HR);

	}

	// TC-185
	public void addCategoryClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.addCategory_HR);

	}

	public void enterCategory_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.inputCategory_HR, value);

	}

	public void enterCategoryDefination_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.inputDefination_HR, value);

	}

	public void yesButtonClick_HR(WebDriver driver) {
		clickingHelper_HR.click(this.evalSettingTab_HR.yesButton_HR);
//    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.evalSettingTab.yesButton);

	}

	public void saveAddCategoryButtonClick_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.saveAddCategoryButton_HR);

	}

	public void clickExport_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.export_HR);

	}

	public void clickRefreshBtn_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.refreshButton_HR);

	}

	public void clickActiveBtn_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.refreshButton_HR);

	}

	public void clickArchivedBtn_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.refreshButton_HR);

	}

	public void clickCategoryRefreshBtn_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.categoryRefresh_HR);

	}

	public void clickCategorySearch_HR() {
		clickingHelper_HR.click(this.evalSettingTab_HR.categorySearch_HR);

	}

	public void enterCategorySearch_HR(String value) {
		clickingHelper_HR.enterText(this.evalSettingTab_HR.categorySearch_HR, value);

	}

	public void switchEvalTab_PL() {
		clickingHelper.click(this.evalSettingTab.evaluationTab_PL);
	}

	public void switchEvalCategoryTab_PL() {
		clickingHelper.click(this.evalSettingTab.evaluationCategoriesTab_PL);
	}

	public void switchEvalEligibilityTab_PL() {
		clickingHelper.click(this.evalSettingTab.EvaluationEligibilityTab_PL);
	}

	public void employeeFieldInput_PL() {
		clickingHelper.click(this.evalSettingTab.employeeFieldInputSelect_PL);
	}

	public void employeeDropDown_PL() {
		clickingHelper.click(this.evalSettingTab.employeeDropDownButton_PL);
	}

	public void employeeSelectionFromDropDown_PL() {
		clickingHelper.click(this.evalSettingTab.employeeSelectionFromDropDown_PL);
	}

	public void employeeSelectionRefreshButton_PL() {
		clickingHelper.click(this.evalSettingTab.employeeSelectionRefreshButton_PL);
	}

	public void reviewPeriod_PL() {
		clickingHelper.click(this.evalSettingTab.reviewPreiodButton_PL);
	}

	public void reviewPeriodSelect_PL() {
		clickingHelper.click(this.evalSettingTab.reviewPeriodSelect_PL);
	}

	public void reviewPeriodVerifyEmpDiv_PL() {
		clickingHelper.click(this.evalSettingTab.VerifyEmpDivSelect_PL);
	}

	public void reviewPeriodVerifyEmp_PL(String expectedText) {
		clickingHelper.verifyText(this.evalSettingTab.reviewPeriodSelect_PL, expectedText);
	}

	public void verifyStatusClick_PL() {
		clickingHelper.click(this.evalSettingTab.verifyStatusDefault_PL);
	}

	public void verifyStatus_PL(String expectedText) {
		clickingHelper.verifyText(this.evalSettingTab.statusFieldSelect_PL, expectedText);
	}

	public void statusFieldSelect_PL() {
		clickingHelper.click(this.evalSettingTab.statusFieldInputSelect_PL);
	}

	public void statusFieldDropDown_PL() {
		clickingHelper.click(this.evalSettingTab.statusDropDownButton_PL);
	}

	public void statusFieldAll_PL() {
		clickingHelper.click(this.evalSettingTab.statusAll_PL);
	}

	public void statusReset_PL() {
		clickingHelper.click(this.evalSettingTab.statusReset_PL);
	}

	public void resumeReview_PL() {
		clickingHelper.click(this.evalSettingTab.resumeReview_PL);
	}

	public void testCategoryPLClick_PL() {
		clickingHelper.click(this.evalSettingTab.testCategoryPL_PL);
	}

	public void testCategoryPL_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.testCategoryPL_PL, value);
	}

	public void testingpLClick_PL() {
		clickingHelper.click(this.evalSettingTab.testingpL_PL);
	}

	public void testingpL_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.testingpL_PL, value);

	}

	public void summaryPLClick_PL() {
		clickingHelper.click(this.evalSettingTab.summaryPL_PL);
	}

	public void summaryPL_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.summaryPL_PL, value);
	}

	public void savebuttonClick_PL() {
		clickingHelper.click(this.evalSettingTab.savebutton_PL);

	}

	// TC-181
	public void verifyPLRText_PL(String expectedText) {
		clickingHelper.verifyText(this.evalSettingTab.verifyPLRText_PL, expectedText);

	}

	public void proposedBonusPercentageClick_PL() {
		clickingHelper.click(this.evalSettingTab.proposedBonusPercentage_PL);
	}

	public void proposedBonusPercentage_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.proposedBonusPercentage_PL, value);
	}

	public void submitbuttonClick_PL() {
		clickingHelper.click(this.evalSettingTab.submitButton_PL);

	}

	// TC-185
	public void addCategoryClick_PL() {
		clickingHelper.click(this.evalSettingTab.addCategory_PL);

	}

	public void enterCategory_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.inputCategory_PL, value);

	}

	public void enterCategoryDefination_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.inputDefination_PL, value);

	}

	public void yesButtonClick_PL(WebDriver driver) {
		clickingHelper.click(this.evalSettingTab.yesButton_PL);
//    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.evalSettingTab.yesButton);

	}

	public void saveAddCategoryButtonClick_PL() {
		clickingHelper.click(this.evalSettingTab.saveAddCategoryButton_PL);

	}

	public void clickExport_PL() {
		clickingHelper.click(this.evalSettingTab.export_PL);

	}

	public void clickRefreshBtn_PL() {
		clickingHelper.click(this.evalSettingTab.refreshButton_PL);

	}

	public void clickActiveBtn_PL() {
		clickingHelper.click(this.evalSettingTab.refreshButton_PL);

	}

	public void clickArchivedBtn_PL() {
		clickingHelper.click(this.evalSettingTab.refreshButton_PL);

	}

	public void clickCategoryRefreshBtn_PL() {
		clickingHelper.click(this.evalSettingTab.categoryRefresh_PL);

	}

	public void clickCategorySearch_PL() {
		clickingHelper.click(this.evalSettingTab.categorySearch_PL);

	}

	public void enterCategorySearch_PL(String value) {
		clickingHelper.enterText(this.evalSettingTab.categorySearch_PL, value);

	}

	public void switchEvalTab_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.evaluationTab_Viewer);
	}

	public void switchEvalCategoryTab_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.evaluationCategoriesTab_Viewer);
	}

	public void switchEvalEligibilityTab_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.EvaluationEligibilityTab_Viewer);
	}

	public void employeeFieldInput_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.employeeFieldInputSelect_Viewer);
	}

	public void employeeDropDown_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.employeeDropDownButton_Viewer);
	}

	public void employeeSelectionFromDropDown_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.employeeSelectionFromDropDown_Viewer);
	}

	public void employeeSelectionRefreshButton_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.employeeSelectionRefreshButton_Viewer);
	}

	public void reviewPeriod_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.reviewPreiodButton_Viewer);
	}

	public void reviewPeriodSelect_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.reviewPeriodSelect_Viewer);
	}

	public void reviewPeriodVerifyEmpDiv_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.VerifyEmpDivSelect_Viewer);
	}

	public void reviewPeriodVerifyEmp_Viewer(String expectedText) {
		clickingHelper_Viewer.verifyText(this.evalSettingTab_Viewer.reviewPeriodSelect_Viewer, expectedText);
	}

	public void verifyStatusClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.verifyStatusDefault_Viewer);
	}

	public void verifyStatus_Viewer(String expectedText) {
		clickingHelper_Viewer.verifyText(this.evalSettingTab_Viewer.statusFieldSelect_Viewer, expectedText);
	}

	public void statusFieldSelect_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.statusFieldInputSelect_Viewer);
	}

	public void statusFieldDropDown_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.statusDropDownButton_Viewer);
	}

	public void statusFieldAll_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.statusAll_Viewer);
	}

	public void statusReset_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.statusReset_Viewer);
	}

	public void resumeReview_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.resumeReview_Viewer);
	}

	public void testCategoryPLClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.testCategoryPL_Viewer);
	}

	public void testCategoryPL_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.testCategoryPL_Viewer, value);
	}

	public void testingpLClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.testingpL_Viewer);
	}

	public void testingpL_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.testingpL_Viewer, value);

	}

	public void summaryPLClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.summaryPL_Viewer);
	}

	public void summaryPL_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.summaryPL_Viewer, value);
	}

	public void savebuttonClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.savebutton_Viewer);

	}

	// TC-181
	public void verifyPLRText_Viewer(String expectedText) {
		clickingHelper_Viewer.verifyText(this.evalSettingTab_Viewer.verifyPLRText_Viewer, expectedText);

	}

	public void proposedBonusPercentageClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.proposedBonusPercentage_Viewer);
	}

	public void proposedBonusPercentage_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.proposedBonusPercentage_Viewer, value);
	}

	public void submitbuttonClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.submitButton_Viewer);

	}

	// TC-185
	public void addCategoryClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.addCategory_Viewer);

	}

	public void enterCategory_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.inputCategory_Viewer, value);

	}

	public void enterCategoryDefination_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.inputDefination_Viewer, value);

	}

	public void yesButtonClick_Viewer(WebDriver driver) {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.yesButton_Viewer);
//    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.evalSettingTab.yesButton);

	}

	public void saveAddCategoryButtonClick_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.saveAddCategoryButton_Viewer);

	}

	public void clickExpor_Viewert() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.export_Viewer);

	}

	public void clickRefreshBtn_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.refreshButton_Viewer);

	}

	public void clickActiveBtn_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.refreshButton_Viewer);

	}

	public void clickArchivedBtn_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.refreshButton_Viewer);

	}

	public void clickCategoryRefreshBtn_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.categoryRefresh_Viewer);

	}

	public void clickCategorySearch_Viewer() {
		clickingHelper_Viewer.click(this.evalSettingTab_Viewer.categorySearch_Viewer);

	}

	public void enterCategorySearch_Viewer(String value) {
		clickingHelper_Viewer.enterText(this.evalSettingTab_Viewer.categorySearch_Viewer, value);

	}

	// Monalisha
	public void clickevaluationSettingtab() {
		this.interaction.clickElement(MTlocators.evaluationSettingTab);
	}

	public void clickevaluationtab() {
		this.interaction.clickElement(MTlocators.evaluationTab);
	}

	public void evaluationCategoriesTab() {
		this.interaction.clickElement(MTlocators.evaluationCategoriesTab);
	}

	// tc191
	public void deleteIconCategory() {
		this.interaction.clickElement(MTlocators.deleteIconCategory);
	}

	public void deleteIconCategoryPL() {
		this.interaction.clickElement(MTlocators.deleteIconCategoryPL);
	}

	// tc192
	public void deleteArchiveBtn() {
		this.interaction.clickElement(MTlocators.deleteArchiveBtn);
	}

	public void deleteArchiveBtnPL() {
		this.interaction.clickElement(MTlocators.deleteArchiveBtnPL);
	}

	// tc193
	public void deleteButton() {
		this.interaction.clickElement(MTlocators.evaCategorydeleteButton);
	}

	public void deleteButtonEditor() {
		this.interaction.clickElement(MTlocators.evaCategorydeleteButtonEditor);
	}

	// tc194
	public void archiveButton() {
		this.interaction.clickElement(MTlocators.archiveButton);
	}

	public void editArchiveCatbtn() {
		this.interaction.clickElement(MTlocators.editarchiveButton);
	}

	public void archiveDescription(String description) {
		this.interaction.clickElement(MTlocators.archiveDescription);
		this.interaction.sendingKeys(MTlocators.archiveDescription, description);
	}

	public void archiveDescriptionEditor(String description) {
		this.interaction.clickElement(MTlocators.archiveDescriptionEditor);
		this.interaction.sendingKeys(MTlocators.archiveDescriptionEditor, description);
	}

	public void saveArchivebtn() {
		this.interaction.clickElement(MTlocators.archiveSaveBtn);
	}

	public void saveArchivebtnEditor() {
		this.interaction.clickElement(MTlocators.archiveSaveBtnEditor);
	}

	// tc195
	public void toggleArchive() {
		this.interaction.clickElement(MTlocators.toggleArchiveBtn);
	}

	public void toggleArchiveEditor() {
		this.interaction.clickElement(MTlocators.toggleArchiveBtnEditor);
	}

	// tc196
	public void searchArchive(String search) {
		this.interaction.clickElement(MTlocators.searchArchive);
		this.interaction.sendingKeys(MTlocators.searchArchive, search);
	}

	// tc197
	public void refreshArchive() {
		this.interaction.clickElement(MTlocators.refreshArchive);
	}

	// tc198
	public void deleteArchiveCategory() {
		this.interaction.clickElement(MTlocators.deleteArchiveCategory);
	}

	// tc284
	public void selectstatus() {
		this.interaction.clickElement(MTlocators.selectingStatus);
//		this.interaction.sendingKeys(MTlocators.writingstatus, "evaluated");
		this.interaction.clickElement(MTlocators.evaluatedStatus);
	}

	public void selectEmployee() {
		this.interaction.clickElement(MTlocators.selectEmployee);
	}

	public void selectEmployeePL() {
		this.interaction.clickElement(MTlocators.selectEmployeePL);
	}

	// tc265
	public void selectstatusdropdown() {
		this.interaction.clickElement(MTlocators.selectingStatus);

	}

	public void selectstatusdropdownPL() {
		this.interaction.clickElement(MTlocators.selectingStatusPL);

	}

	// Tc199
	public void evaEligibityTab() {
		this.interaction.clickElement(MTlocators.EvaluationEligibilityTab);
	}

	// Tc200
	public void employeeFilter(String empName) {
		this.interaction.clickElement(MTlocators.employeeInput);
		this.interaction.sendingKeys(MTlocators.employeeInput, empName + Keys.ENTER);
	}

	// tc201
	public void empReset() {
		this.interaction.clickElement(MTlocators.empReset);
	}

	// tc202
	public void empRefresh() {
		this.interaction.clickElement(MTlocators.empRefresh);
	}

	// Tc203
	public void createEmpCyc() {
		this.interaction.clickElement(MTlocators.empCycBtn);

	}

	// tc204
	public void FYdropdown() {
		this.interaction.clickElement(MTlocators.FYdropdown);
	}

	public void FYdropdownEditor() {
		this.interaction.clickElement(MTlocators.FYdropdownEditor);
	}

	// tc205
	public void pencilicon() {
		this.interaction.clickElement(MTlocators.pencilIcon);
	}

	public void penciliconPL23() {
		this.interaction.clickElement(MTlocators.pencilIconPL23);
	}

	public void penciliconEditor() {
		this.interaction.clickElement(MTlocators.pencilIconEditor);
	}

	public void saveButton() {
		this.interaction.clickElement(MTlocators.saveButton);
	}

	public void saveButtonEditor() {
		this.interaction.clickElement(MTlocators.saveButtonEditor);
	}

	public void selectQuater() {
		this.interaction.clickElement(MTlocators.selectquater);
	}

	public void selectQuaterQ1() {
		this.interaction.clickElement(MTlocators.selectquaterQ1);
	}

	public void selectQuaterQ1pl() {
		this.interaction.clickElement(MTlocators.selectquaterQ1pl);
	}

	// tc207
	public void deleteIcon() {
		this.interaction.clickElement(MTlocators.deleteButtonUp);
	}

	// tc265
	public void selectQuaterFilter23Q1() {
		this.interaction.clickElement(MTlocators.quaterDrpDown);
		this.interaction.clickElement(MTlocators.review2023Q1);
	}

	public void selectQuaterFilter23Q1PL() {
		this.interaction.clickElement(MTlocators.quaterDrpDownPL);
		this.interaction.clickElement(MTlocators.review2023Q1);
	}

	public void selectQuaterFilter23Q2() {
		this.interaction.clickElement(MTlocators.quaterDrpDown);
		this.interaction.clickElement(MTlocators.review2023Q2);
	}

	public void selectQuaterFilter23Q2PL() {
		this.interaction.clickElement(MTlocators.quaterDrpDownPL);
		this.interaction.clickElement(MTlocators.review2023Q2);
	}

	public void selectQuaterFilter23Q3() {
		this.interaction.clickElement(MTlocators.quaterDrpDown);
		this.interaction.clickElement(MTlocators.review2023Q3);
	}

	public void selectQuaterFilter23Q3PL() {
		this.interaction.clickElement(MTlocators.quaterDrpDownPL);
		this.interaction.clickElement(MTlocators.review2023Q3);
	}

	public void selectQuaterFilter23Q4() {
		this.interaction.clickElement(MTlocators.quaterDrpDown);
		this.interaction.clickElement(MTlocators.review2023Q4);
	}

	public void selectQuaterFilter23Q4PL() {
		this.interaction.clickElement(MTlocators.quaterDrpDownPL);
		this.interaction.clickElement(MTlocators.review2023Q4);
	}

	public void selectQuaterFilter24Q1() {
		this.interaction.clickElement(MTlocators.quaterDrpDown);
		this.interaction.clickElement(MTlocators.review2024Q1);
	}

	public void selectQuaterFilter24Q3() {
		this.interaction.clickElement(MTlocators.quaterDrpDown);
		this.interaction.clickElement(MTlocators.review2024Q3);
	}

	public void selectallstatus() {
		this.interaction.clickElement(MTlocators.selectingStatus);
		this.interaction.clickElement(MTlocators.statusAll);
	}

	public void allStatus() {
		this.interaction.clickElement(MTlocators.statusAll);
	}

	public void rejecttoRLStatus() {
		this.interaction.clickElement(MTlocators.rejecttoRLStatus);
	}

	// tc266
	public void rejectButton() {
		this.interaction.clickElement(MTlocators.rejectButton);
	}

	// tc271
	public void startReview() {
		this.interaction.clickElement(MTlocators.startReview);
	}

	public void startReviewRL() {
		this.interaction.clickElement(MTlocators.startReviewRL);
	}

	public void proposedBonus() {
		this.interaction.clickElement(MTlocators.proposedBonusPercentage);
		this.interaction.sendingKeys(MTlocators.proposedBonusPercentage, "0");
	}

	public void proposedBonusInt(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentage);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentage, value);
	}

	public void proposedBonusIntPL_23Q3(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentagePL_23Q3);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentagePL_23Q3, value);
	}

	public void proposedBonusIntPL_23Q1(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentagePL_23Q1);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentagePL_23Q1, value);
	}

	public void proposedBonusIntRL_23Q4(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentageRL);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentageRL, value);
	}

	public void proposedBonusIntPL_23Q4(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentagePL_23Q4);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentagePL_23Q4, value);
	}

	public void proposedBonusIntRL_23Q2(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentageRL_23Q2);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentageRL_23Q2, value);
	}

	public void proposedBonusIntRL_23Q1(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentageRL_23Q1);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentageRL_23Q1, value);
	}

	public void proposedBonusIntPL_24Q3(int value) {
		this.interaction.clickElement(MTlocators.proposedBonusPercentagePL_24Q3);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentagePL_24Q3, value);
	}

	// tc272
	public void proposedBonus1_100() {
		this.interaction.clickElement(MTlocators.proposedBonusPercentage);
		this.interaction.sendingKeys(MTlocators.proposedBonusPercentage, "10" + Keys.ENTER);
	}

	public void saveButtonReview() {
		this.interaction.clickElement(MTlocators.savebutton);
	}

	// tc273
	public void evaluatedStatus() {
		this.interaction.clickElement(MTlocators.evaluatedStatus);
	}

	public void review2024Q1() {
		this.interaction.clickElement(MTlocators.reviewDropDown);
	}

	public void toggleButton() {
		this.interaction.clickElement(MTlocators.togglePercnButton);
	}

	public void toggleButtonEditor() {
		this.interaction.clickElement(MTlocators.togglePercnButtonEditor);
	}

	// tc276
	public void yearReviewDD() {
		this.interaction.clickElement(MTlocators.yearReview);
	}

	public void select2023year() {
		this.interaction.clickElement(MTlocators.year2023);
	}

	// tc277
	public void q1review() {
		this.interaction.clickElement(MTlocators.quaterQ1review);
	}

	public void q3review() {
		this.interaction.clickElement(MTlocators.quaterQ3review);
	}

	// tc278
	public void scrolldown() {
		this.interaction.clickElement(MTlocators.scrolldown);
	}

	// tc280
	public void contributionSummary(String Summary) {
		this.interaction.clickElement(MTlocators.summary);
		this.interaction.sendingKeys(MTlocators.summary, Summary + Keys.ENTER);
	}

	public void contributionSummaryPL(String Summary) {
		this.interaction.clickElement(MTlocators.summary_PL);
		this.interaction.sendingKeys(MTlocators.summary_PL, Summary + Keys.ENTER);
	}

	public void contributionSummaryRL(String Summary) {
		this.interaction.clickElement(MTlocators.summaryRL);
		this.interaction.sendingKeys(MTlocators.summaryRL, Summary + Keys.ENTER);
	}

	// tc288
	public void rejectToRLBtn() {
		interaction.clickElement(MTlocators.rejectToRL);
	}

	public void rejectToEmployeeBtn() {
		interaction.clickElement(MTlocators.rejectToEmployee);
	}

}
