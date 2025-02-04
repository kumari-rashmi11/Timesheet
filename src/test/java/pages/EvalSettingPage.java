package pages;
 
import org.openqa.selenium.WebDriver;
 
import utils.EvalSettingLocators;
import helper.Interactions;
 
public class EvalSettingPage{
    private Interactions clickingHelper_Editor;
    private EvalSettingLocators evalSettingTab_Editor;
//    private Interactions clickingHelper_HR;
//    private EvalSettingLocators evalSettingTab_HR;
//    private Interactions clickingHelper;
//    private EvalSettingLocators evalSettingTab;
//    private Interactions clickingHelper_Viewer;
//    private EvalSettingLocators evalSettingTab_Viewer;
    public EvalSettingPage(WebDriver driver) {
        this.clickingHelper_Editor = new Interactions(driver);
        this.evalSettingTab_Editor = new EvalSettingLocators(driver);
//        this.clickingHelper_HR = new Interactions(driver);
//        this.evalSettingTab_HR = new EvalSettingLocators(driver);
//        this.clickingHelper = new Interactions(driver);
//        this.evalSettingTab = new EvalSettingLocators(driver);
//        this.clickingHelper_Viewer = new Interactions(driver);
//        this.evalSettingTab_Viewer = new EvalSettingLocators(driver);
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
 
    public void clickRefreshBtn_editor() {
    	clickingHelper_Editor.click(this.evalSettingTab_Editor.refreshButton_editor);
 
    }
    public void clickActiveBtn_editor() {
    	clickingHelper_Editor.click(this.evalSettingTab_Editor.activeCategory_editor);
 
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
    	clickingHelper_Editor.enterText(this.evalSettingTab_Editor.categorySearch_editor,value);
 
    }

 
    	
}