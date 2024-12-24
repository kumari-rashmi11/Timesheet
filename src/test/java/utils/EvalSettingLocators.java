package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EvalSettingLocators {
	private WebDriverWait wait;

	public By evalSettingTab_editor = By.cssSelector(
			"div:nth-of-type(9) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	public By evaluationTab_editor = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationCategoriesTab_editor = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[2]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By EvaluationEligibilityTab_editor = By.cssSelector(
			"div:nth-of-type(7) div[role='list']  .react-gallery-items-window > div:nth-of-type(3) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");

	public By employeeFieldInputSelect_editor = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By employeeDropDownButton_editor = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By employeeSelectionFromDropDown_editor = By.cssSelector("[role] [role='option']:nth-of-type(1)");

	public By statusFieldInputSelect_editor = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");

	public By employeeSelectionRefreshButton_editor = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[15]//div[@class='react-knockout-control']/div");

	public By reviewPreiodButton_editor = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[9]//div[@class='react-knockout-control']/div/div/div[@role='button']");
	public By reviewPeriodSelect_editor = By
			.xpath("/html//div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[5]");

//    public By verifyReviewPeriodEmployee = By.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//div[@role='presentation']/div[@class='appmagic-label-text']");
	public By verifyReviewPeriodEmployee_editor = By.cssSelector("[data-control-id='2342'] .appmagic-label-text");
	public By VerifyEmpDivSelect_editor = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']");

	public By verifyStatusDefault_editor = By.cssSelector(
			"div:nth-of-type(11) > div[role='presentation'] > div[role='presentation'] > .css-155.ms-ComboBox-container > .css-156.ms-ComboBox > input[role='combobox']	");

	// public By statusFieldSelect =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By statusFieldSelect1_editor = By.id("pac-combobox-6-input");
	public By statusFieldSelect_editor = By.cssSelector("ms-ComboBox-Input css-157");

	// public By statusDropDownButton =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By statusDropDownButton_editor = By.cssSelector(".ms-ComboBox-CaretDown-button");

	public By statusAll_editor = By.xpath("//div[@id='pac-combobox-1-list']/button[1]");

	public By statusReset_editor = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[14]//div[@class='react-knockout-control']/div");

	public By resumeReview_editor = By.cssSelector(".ms-Button.ms-Button--default.root-174");

	public By testCategoryPL_editor = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By testingpL_editor = By.cssSelector(
			"div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summaryPL_editor = By.cssSelector(
			"div:nth-of-type(15) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	// public By savebutton = By.cssSelector("[data-control-id='2775']");
	public By savebutton_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(15) > div > div > div > div > button");

	// TC-181
	public By verifyPLRText_editor = By.cssSelector(
			".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
	public By proposedBonusPercentage_editor = By.cssSelector(
			"div:nth-of-type(12) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");

	public By submitButton_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(16) > div > div > div > div > button");

	// TC-185
	public By addCategory_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(24) > div > div > div > div > button");

	public By inputCategory_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(39) > div > div > div > div > input");
	public By inputDefination_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(41) > div > div > div > div > textarea");
	public By yesButton_editor = By.xpath("//div[@data-control-name='MandatoryRadio']//label[@value='Yes']");
	public By saveAddCategoryButton_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(44) > div > div > div > div > button");

	public By export_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(10) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");

	public By refreshButton_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div");

	public By activeCategory_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");
	public By archivedCategory_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");

	public By categoryRefresh_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(6) > div");
	public By categorySearch_editor = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > input");

	public By evalSettingTab_HR = By.cssSelector(
			"div:nth-of-type(9) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	public By evaluationTab_HR = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationCategoriesTab_HR = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[2]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By EvaluationEligibilityTab_HR = By.cssSelector(
			"div:nth-of-type(7) div[role='list']  .react-gallery-items-window > div:nth-of-type(3) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");

	public By employeeFieldInputSelect_HR = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By employeeDropDownButton_HR = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By employeeSelectionFromDropDown_HR = By.cssSelector("[role] [role='option']:nth-of-type(1)");

	public By statusFieldInputSelect_HR = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");

	public By employeeSelectionRefreshButton_HR = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[15]//div[@class='react-knockout-control']/div");

	public By reviewPreiodButton_HR = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[9]//div[@class='react-knockout-control']/div/div/div[@role='button']");
	public By reviewPeriodSelect_HR = By
			.xpath("/html//div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[5]");

//    public By verifyReviewPeriodEmployee = By.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//div[@role='presentation']/div[@class='appmagic-label-text']");
	public By verifyReviewPeriodEmployee_HR = By.cssSelector("[data-control-id='2342'] .appmagic-label-text");
	public By VerifyEmpDivSelect_HR = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']");

	public By verifyStatusDefault_HR = By.cssSelector(
			"div:nth-of-type(11) > div[role='presentation'] > div[role='presentation'] > .css-155.ms-ComboBox-container > .css-156.ms-ComboBox > input[role='combobox']	");

	// public By statusFieldSelect =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By statusFieldSelect1_HR = By.id("pac-combobox-6-input");
	public By statusFieldSelect_HR = By.cssSelector("ms-ComboBox-Input css-157");

	// public By statusDropDownButton =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By statusDropDownButton_HR = By.cssSelector(".ms-ComboBox-CaretDown-button");

	public By statusAll_HR = By.xpath("//div[@id='pac-combobox-1-list']/button[1]");

	public By statusReset_HR = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[14]//div[@class='react-knockout-control']/div");

	public By resumeReview_HR = By.cssSelector(".ms-Button.ms-Button--default.root-174");

	public By testCategoryPL_HR = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By testingpL_HR = By.cssSelector(
			"div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summaryPL_HR = By.cssSelector(
			"div:nth-of-type(15) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	// public By savebutton = By.cssSelector("[data-control-id='2775']");
	public By savebutton_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(15) > div > div > div > div > button");

	// TC-181
	public By verifyPLRText_HR = By.cssSelector(
			".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
	public By proposedBonusPercentage_HR = By.cssSelector(
			"div:nth-of-type(12) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");

	public By submitButton_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(16) > div > div > div > div > button");

	// TC-185
	public By addCategory_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(24) > div > div > div > div > button");

	public By inputCategory_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(39) > div > div > div > div > input");
	public By inputDefination_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(41) > div > div > div > div > textarea");
	public By yesButton_HR = By.xpath("//div[@data-control-name='MandatoryRadio']//label[@value='Yes']");
	public By saveAddCategoryButton_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(44) > div > div > div > div > button");

	public By export_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(10) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");

	public By refreshButton_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div");

	public By activeCategory_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");
	public By archivedCategory_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");

	public By categoryRefresh_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(6) > div");
	public By categorySearch_HR = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > input");

	public By evalSettingTab_PL = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[4]/div/div/div[5]/div/div[@class='appmagic-border-inner']/div/div/div[2]//div[@role='list']//div[@class='react-gallery-items-window']/div[9]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationTab_PL = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationCategoriesTab_PL = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[2]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By EvaluationEligibilityTab_PL = By.cssSelector(
			"div:nth-of-type(7) div[role='list']  .react-gallery-items-window > div:nth-of-type(3) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");

	public By employeeFieldInputSelect_PL = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By employeeDropDownButton_PL = By.cssSelector("[class='ms-ComboBox css-174'] button");
	public By employeeSelectionFromDropDown_PL = By.cssSelector("[role] [role='option']:nth-of-type(1)");

	public By statusFieldInputSelect_PL = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");

	public By employeeSelectionRefreshButton_PL = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[15]//div[@class='react-knockout-control']/div");

	public By reviewPreiodButton_PL = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[9]//div[@class='react-knockout-control']/div/div/div[@role='button']");
	public By reviewPeriodSelect_PL = By
			.xpath("/html//div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[5]");

//    public By verifyReviewPeriodEmployee = By.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//div[@role='presentation']/div[@class='appmagic-label-text']");
	public By verifyReviewPeriodEmployee_PL = By.cssSelector("[data-control-id='2342'] .appmagic-label-text");
	public By VerifyEmpDivSelect_PL = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']");

	public By verifyStatusDefault_PL = By.cssSelector(
			"div:nth-of-type(11) > div[role='presentation'] > div[role='presentation'] > .css-155.ms-ComboBox-container > .css-156.ms-ComboBox > input[role='combobox']	");

	// public By statusFieldSelect =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By statusFieldSelect1_PL = By.id("pac-combobox-6-input");
	public By statusFieldSelect_PL = By.cssSelector("ms-ComboBox-Input css-157");

	// public By statusDropDownButton =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By statusDropDownButton_PL = By.cssSelector(".ms-ComboBox-CaretDown-button");

	public By statusAll_PL = By.xpath("//div[@id='pac-combobox-1-list']/button[1]");

	public By statusReset_PL = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[14]//div[@class='react-knockout-control']/div");

	public By resumeReview_PL = By.cssSelector(".ms-Button.ms-Button--default.root-174");

	public By testCategoryPL_PL = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By testingpL_PL = By.cssSelector(
			"div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summaryPL_PL = By.cssSelector(
			"div:nth-of-type(15) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	// public By savebutton = By.cssSelector("[data-control-id='2775']");
	public By savebutton_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(15) > div > div > div > div > button");

	// TC-181
	public By verifyPLRText_PL = By.cssSelector(
			".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
	public By proposedBonusPercentage_PL = By.cssSelector(
			"div:nth-of-type(12) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");

	public By submitButton_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(16) > div > div > div > div > button");

	// TC-185
	public By addCategory_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(24) > div > div > div > div > button");

	public By inputCategory_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(39) > div > div > div > div > input");
	public By inputDefination_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(41) > div > div > div > div > textarea");
	public By yesButton_PL = By.xpath("//div[@data-control-name='MandatoryRadio']//label[@value='Yes']");
	public By saveAddCategoryButton_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(44) > div > div > div > div > button");

	public By export_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(10) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");

	public By refreshButton_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div");

	public By activeCategory_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");
	public By archivedCategory_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");

	public By categoryRefresh_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(6) > div");
	public By categorySearch_PL = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > input");

	public By evalSettingTab_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[8]/div/div/div[9]/div/div[@class='appmagic-border-inner']/div/div/div[2]//div[@role='list']//div[@class='react-gallery-items-window']/div[9]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationTab_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationCategoriesTab_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[2]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By EvaluationEligibilityTab_Viewer = By.cssSelector(
			"div:nth-of-type(7) div[role='list']  .react-gallery-items-window > div:nth-of-type(3) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");

	public By employeeFieldInputSelect_Viewer = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By employeeDropDownButton_Viewer = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[13]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By employeeSelectionFromDropDown_Viewer = By.cssSelector("[role] [role='option']:nth-of-type(1)");

	public By statusFieldInputSelect_Viewer = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");

	public By employeeSelectionRefreshButton_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[15]//div[@class='react-knockout-control']/div");

	public By reviewPreiodButton_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[9]//div[@class='react-knockout-control']/div/div/div[@role='button']");
	public By reviewPeriodSelect_Viewer = By
			.xpath("/html//div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[5]");

//    public By verifyReviewPeriodEmployee = By.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//div[@role='presentation']/div[@class='appmagic-label-text']");
	public By verifyReviewPeriodEmployee_Viewer = By.cssSelector("[data-control-id='2342'] .appmagic-label-text");
	public By VerifyEmpDivSelect_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']");

	public By verifyStatusDefault_Viewer = By.cssSelector(
			"div:nth-of-type(11) > div[role='presentation'] > div[role='presentation'] > .css-155.ms-ComboBox-container > .css-156.ms-ComboBox > input[role='combobox']	");

	// public By statusFieldSelect =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By statusFieldSelect1_Viewer = By.id("pac-combobox-6-input");
	public By statusFieldSelect_Viewer = By.cssSelector("ms-ComboBox-Input css-157");

	// public By statusDropDownButton =
	// By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By statusDropDownButton_Viewer = By.cssSelector(".ms-ComboBox-CaretDown-button");

	public By statusAll_Viewer = By.xpath("//div[@id='pac-combobox-1-list']/button[1]");

	public By statusReset_Viewer = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[14]//div[@class='react-knockout-control']/div");

	public By resumeReview_Viewer = By.cssSelector(".ms-Button.ms-Button--default.root-174");

	public By testCategoryPL_Viewer = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By testingpL_Viewer = By.cssSelector(
			"div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summaryPL_Viewer = By.cssSelector(
			"div:nth-of-type(15) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	// public By savebutton = By.cssSelector("[data-control-id='2775']");
	public By savebutton_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(15) > div > div > div > div > button");

	// TC-181
	public By verifyPLRText_Viewer = By.cssSelector(
			".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
	public By proposedBonusPercentage_Viewer = By.cssSelector(
			"div:nth-of-type(12) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");

	public By submitButton_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(16) > div > div > div > div > button");

	// TC-185
	public By addCategory_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(24) > div > div > div > div > button");

	public By inputCategory_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(39) > div > div > div > div > input");
	public By inputDefination_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(41) > div > div > div > div > textarea");
	public By yesButton_Viewer = By.xpath("//div[@data-control-name='MandatoryRadio']//label[@value='Yes']");
	public By saveAddCategoryButton_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(44) > div > div > div > div > button");

	public By export_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(10) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");

	public By refreshButton_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div");

	public By activeCategory_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");
	public By archivedCategory_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div > div > div > div > div > button");

	public By categoryRefresh_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(6) > div");
	public By categorySearch_Viewer = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(5) > div > div > div > div > input");

	public EvalSettingLocators(WebDriver driver) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void test_editor() {
		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_editor));
		eval.click();
	}

	public void test_HR() {
		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_HR));
		eval.click();
	}

	public void test_PL() {
		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_PL));
		eval.click();
	}

	public void test_Viewer() {
		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_Viewer));
		eval.click();
	}

	// Monalisha

	public By evaluationSettingTab = By
			.cssSelector("div:nth-of-type(9) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1)");
	public By evaluationCategoriesTab = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[2]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button/div");
	public By evaluationTab = By
			.cssSelector("div:nth-of-type(8) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1)");

	// tc584
	public By selectingStatus = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public By selectingStatusPL = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[8]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");

	public By writingstatus = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/input[@role='combobox']");
	public By selectEmployee = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(23) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");
	public By selectEmployeePL = By.cssSelector(
			".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) div[role='presentation'] > .appmagic-label-text");
	public By evaluatedStatus = By.xpath("//div[@id='pac-combobox-1-list']/button[5]");

	// tc191
	public By deleteIconCategory = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(6) .powerapps-icon");
	public By deleteIconCategoryPL = By.cssSelector(
			"div:nth-of-type(49) div[role='list'] div[role='listitem'] > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(6) .powerapps-icon > .icon-svg-container");

	// tc192
	public By deleteArchiveBtn = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[37]/div[@role='presentation']/div[@role='presentation']/button[@type='button']");
	public By deleteArchiveBtnPL = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[38]/div[@role='presentation']/div[@role='presentation']/button[@type='button']");

	// tc193
	public By evaCategorydeleteButton = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[37]/div[@role='presentation']/div[@role='presentation']/button[@type='button']");
	public By evaCategorydeleteButtonEditor = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[36]/div[@role='presentation']/div[@role='presentation']/button[@type='button']");
	// tc194
	public By archiveButton = By.cssSelector(
			"div:nth-of-type(18) div[role='list']  .react-gallery-items-window > div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p  ._vst_.appmagic-content-control-name.appmagic-control-view.canvasContentDiv button > .appmagic-button.center.middle > .appmagic-button-label");
	public By editarchiveButton = By
			.cssSelector(".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(6) .powerapps-icon");

	public By archiveDescription = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[47]//div[@class='react-knockout-control']/div[@class='appmagic-textbox']/textarea");
	public By archiveDescriptionEditor = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[46]//div[@class='react-knockout-control']/div[@class='appmagic-textbox']/textarea");

	public By archiveSaveBtn = By
			.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[50]//button");
	public By archiveSaveBtnEditor = By
			.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[49]//button");

	// tc195
	public By toggleArchiveBtn = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[38]//div[@role='list']//div[@role='listitem']/div[@class='canvasContentDiv container_1vt1y2p']/div/div[4]/div[@role='presentation']/div[@role='presentation']//button[@role='switch']");
	public By toggleArchiveBtnEditor = By.cssSelector("button[role='switch']");

	// tc196
	public By searchArchive = By.cssSelector(".appmagic-textbox > input[title='Search by Category Name']");

	// 197
	public By refreshArchive = By
			.cssSelector(".canvasContentDiv.container_1jfocdq > div > div:nth-of-type(6) .powerapps-icon");

	// 198
	public By deleteArchiveCategory = By.cssSelector("[data-control-id='2390'] [touch-action]");

	// Tc199

	public By EvaluationEligibilityTab = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[3]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[1]//button");
	// tc200
	public By employeeInput = By.cssSelector("#pac-combobox-3-input");

	// tc201
	public By empReset = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[19]/div");

	// tc202
	public By empRefresh = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[5]//div[@class='react-knockout-control']/div/div[@class='icon-svg-container']");
	// tc203
	public By empCycBtn = By.cssSelector("[data-control-id='2304'] button");

	// tc204
	public By FYdropdown = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[43]//div[@class='react-knockout-control']/div/div/div[@role='button']");
	public By FYdropdownEditor = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[42]//div[@class='react-knockout-control']/div/div/div[@role='button']");
	// tc205
	public By pencilIcon = By.cssSelector(
			"div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(4) .powerapps-icon > .icon-svg-container");
	public By pencilIconEditor = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7) .powerapps-icon > .icon-svg-container");
	public By pencilIconPL = By
			.cssSelector(".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(5) .powerapps-icon");
	public By pencilIconPL23 = By
			.cssSelector(".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(6) .powerapps-icon");
	public By saveButton = By
			.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[51]//button");
	public By saveButtonEditor = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[50]//button/div/div[.='Save']");
	public By selectquater = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[50]/div[@role='presentation']/div[@role='presentation']//label/div/i[.='']");
	public By selectquaterQ1 = By
			.cssSelector("div:nth-of-type(46) > div[role='presentation'] > div[role='presentation'] > div");
	public By selectquaterQ1pl = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[47]/div[@role='presentation']/div[@role='presentation']//label/div");
	// tc207
	public By deleteButton = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) div[role='list']  .react-gallery-items-window > div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(8)");
	public By deleteButtonUp = By
			.cssSelector("div[title='This user doesn\\27t have any contribution in this year'] > .icon-svg-container");

	// 265
	public By quaterDrpDown = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[9]//div[@class='react-knockout-control']/div/div/div[@class='appmagic-dropdownLabelArrow']");
	public By quaterDrpDownPL = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[10]//div[@class='react-knockout-control']/div/div/div[@class='appmagic-dropdownLabelArrow']");

	public By statusAll = By.xpath("//div[@id='pac-combobox-1-list']/button[1]");
	public By rejecttoRLStatus = By.xpath("//div[@id='pac-combobox-1-list']/button[7]");

	public By review2023Q1 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[1]");
	public By review2023Q1PL = By.cssSelector("div[role='listbox'] > div:nth-of-type(1)");
	public By review2023Q2 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[2]");
	public By review2023Q3 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[3]");
	public By review2023Q4 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[4]");
	public By review2024Q1 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[5]");
	public By review2024Q3 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[7]");

	// 266
	public By rejectButton = By
			.xpath("/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[6]/div/div/div[17]//button");
	// tc271
	public By startReview = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--default.root-174");
	public By startReviewRL = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--default.root-181");

	public By proposedBonusPercentage = By.cssSelector(
			"div:nth-of-type(12) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");
	public By proposedBonusPercentageRL = By.cssSelector("[data-control-id='2846'] input");
	public By proposedBonusPercentageRL_23Q2 = By.cssSelector("[data-control-id='2840'] input");
	public By proposedBonusPercentageRL_23Q1 = By.cssSelector("[data-control-id='2840'] input");

	public By proposedBonusPercentagePL_23Q4 = By.cssSelector("[data-control-id='2847'] input");
	public By proposedBonusPercentagePL_23Q1 = By.cssSelector("[data-control-id='2847'] input");
	public By proposedBonusPercentagePL_24Q3 = By.cssSelector("[data-control-id='2845'] input");

	public By proposedBonusPercentagePL = By.cssSelector("[data-control-id='2844'] input");
	public By proposedBonusPercentagePL_23Q3 = By.cssSelector("[data-control-id='2842'] input");

	public By rejectToRL = By.xpath("//*[@id=\"Button - 911-Button - 911-ms_core_controls_button\"]/button");
	public By rejectToEmployee = By.xpath("//*[@id=\"Button - 880-Button - 880-ms_core_controls_button\"]/button");

	public By submitButton = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(16) > div > div > div > div > button");
	public By testCategoryPL = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By testingpL = By.cssSelector(
			"div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(3) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summary = By.cssSelector(
			"div:nth-of-type(11) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summary_PL = By.cssSelector(
			"div:nth-of-type(15) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");
	public By summaryRL = By.cssSelector(
			"div:nth-of-type(11) .react-knockout-control > .appmagic-textbox > .appmagic-textarea.block-undo-redo.mousetrap");

	public By savebutton = By.cssSelector("[data-control-id='2781'] button");

	// 273
	public By reviewDropDown = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[12]//div[@class='react-knockout-control']/div//div[@role='button']");

	// toggle button
	public By togglePercnButton = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@role='listitem']/div[@class='canvasContentDiv container_1vt1y2p']/div/div[6]/div[@role='presentation']/div[@role='presentation']//button[@role='switch']");
	public By togglePercnButtonEditor = By.cssSelector("button[role='switch']");

	// 276
	public By yearReview = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[6]/div/div/div[14]//div[@class='react-knockout-control']/div//div[@role='button']");
	public By year2023 = By.xpath("/html//div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[1]");

	// 277
	public By quaterQ1review = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[6]/div/div/div[7]/div[@role='presentation']/div[@role='presentation']//label/div");
	public By quaterQ3review = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[6]/div/div/div[9]/div[@role='presentation']/div[@role='presentation']//label/div");

	// 278
	public By scrolldown = By.xpath(
			"/html//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[6]/div/div/div[24]//div[@class='react-knockout-control']/div");

	public static By SelectEvaluationTabRL = By.cssSelector(
			"div:nth-of-type(8) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	public static By SelectEvaluationTab = By.cssSelector(
			"div:nth-of-type(9) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	public static By SelectEvaluationEligibility = By.cssSelector(
			"div:nth-of-type(7) div[role='list']  .react-gallery-items-window > div:nth-of-type(3) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle > .appmagic-button-label");
	public static By SelectPencilBtn = By.cssSelector(
			"div:nth-of-type(4) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) div[role='list'] div[role='listitem'] > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7) .powerapps-icon");
	public static By SelectQuarter = By.cssSelector("[for='pac-checkbox-2']");
	public static By SelectSaveBtn = By
			.cssSelector("div:nth-of-type(50) button > .appmagic-button.center.middle > .appmagic-button-label");
	public static By SelectEvaluetedEmployee = By.cssSelector(
			"div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) div[role='presentation']");
	public static By SelectChangeStatusBtn = By.cssSelector("[data-control-id='2772']");
	public static By SelectStatusDropdown = By.cssSelector("div > div:nth-of-type(22)");
	public static By ChooseStatus = By.cssSelector("div[role='listbox'] > div:nth-of-type(3)");
	public static By Textbox = By.cssSelector("[data-control-id='2887'] [data-control-part]");
	public static By SaveBtn = By.cssSelector("div > div:nth-of-type(26)");
	public static By SelectStatus = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[11]/div[@role='presentation']/div[@role='presentation']/div/div/button[@role='presentation']");
	public static By SelectAllStatus = By.cssSelector("[role] [role='option']:nth-of-type(1)");
	public static By SelectReviewPeriod = By
			.cssSelector(".canvasContentDiv.container_1jfocdq > div > div:nth-of-type(10)");
	public static By ChooseReviewPeriod = By.cssSelector("div[role='listbox'] > div:nth-of-type(3)");
	public static By ResumeReview = By.xpath(
			"/html//div[@id='publishedCanvas']//div[@class='app-canvas']/div[5]/div/div/div[23]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[5]/div[@role='presentation']/div[@role='presentation']/button[@type='button']/span");
	public static By ChooseReviewPeriodRL = By.cssSelector("div[role='listbox'] > div:nth-of-type(5)");

}