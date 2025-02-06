package utils;

import org.openqa.selenium.By;
public class EvalSettingLocators {

	// Monalisha

	public By evaluationSettingTab = By.xpath(
			"(//div[contains(text(), 'Evaluation Setting')]//ancestor::div[@class='container_1f0sgyp']//child::div[position()=1])[1]");
	public By evaluationCategoriesTab = By.xpath("//div[contains(text(), 'Evaluation Categories')]//ancestor::button");
	public By evaluationTab = By.xpath(
			"(//div[contains(text(), 'Evaluation')]//ancestor::div[@class='container_1f0sgyp']//child::div[position()=1])[1]");
	// tc584
	public By selectingStatus = By.xpath("//div[@data-control-name='EvaluationStatusCombo']//child::button");
	public By selectEmployee = By.xpath("//div[contains(@data-control-name,'ReporteesValue')]");
	public By masking = By.xpath("//div[@data-control-name=\"PCTMask\"]");
	// tc191
	public By deleteIconCategory = By.xpath("//div[@data-control-name='ActiveCategoryDelete']");
	// tc192
	public By deleteArchiveBtn = By.xpath("//span[text()='Archive']//ancestor::button");
	// tc193
	public By evaCategorydeleteButton = By.xpath("//span[text()='Delete']//ancestor::button");
	// tc194
	public By archiveButton = By.xpath("//div[text()='Archived']//ancestor::button");
	public By editarchiveButton = By.xpath("//div[@data-control-name='Edit_Icon_1']");
	public By archiveDescription = By.xpath("//textarea[@data-control-part='text']");
	public By archiveSaveButton = By.xpath("//div[text()='Save']//ancestor::button");
	// tc195
	public By toggleButton = By.xpath("(//button[@role='switch'])[1]");
	// tc196
	public By search = By.xpath("//input[@placeholder='Search here' and @title='Search by Category Name']");
	// 197
	public By refresh = By.xpath("//div[@data-control-name='ResetIcon_2']");
	// 198
	public By deleteArchiveCategory = By.xpath("//div[@data-control-name='ArchivedDeleteIcon']");
	// Tc199
	public By EvaluationEligibilityTab = By
			.xpath("//div[contains(text(), 'Evaluation Eligibility')]//ancestor::button");
	// tc200
	public By employeeInput = By.xpath("//input[@id=\"pac-combobox-3-input\"]");
	// tc201
	public By empReset = By.xpath("//div[@data-control-name=\"RstIco\"]");
	// tc202
	public By empRefresh = By.xpath("//div[@data-control-name=\"ResetIcon_2\"]");
	// tc203
	public By empCycBtn = By.xpath("//div[text()='Create Employee Cycle']//ancestor::button");
	public By FYselectEmployee = By.xpath("//input[@id='pac-combobox-4-input']");

	public By filterQ1 = By.xpath("//div[contains(@data-control-name,'Q1_Checkbox')]");
	public By filterQ2 = By.xpath("//div[contains(@data-control-name,'Q2_Checkbox')]");
	public By filterQ3 = By.xpath("//div[contains(@data-control-name,'Q3_Checkbox')]");
	public By filterQ4 = By.xpath("//div[contains(@data-control-name,'Q4_Checkbox')]");

	public By Q1 = By.xpath("//div[contains(@data-control-name,'Q1CB')]");
	public By Q2 = By.xpath("//div[contains(@data-control-name,'Q2CB')]");
	public By Q3 = By.xpath("//div[contains(@data-control-name,'Q3CB')]");
	public By Q4 = By.xpath("//div[contains(@data-control-name,'Q4CB')]");

	public By saveCycle = By.xpath("//div[text()='Save']//ancestor::button");

	// tc204
	public By FYdropdown = By.xpath("//div[@data-control-name=\"FinancialYrEligibility\"]");
	public By FY2023 = By.xpath("//div[@class=\"item0 appmagic-dropdownListItem\"]");
	public By FY2024 = By.xpath("//div[@class=\"item1 appmagic-dropdownListItem\"]");

	// tc205
	public By pencilIcon = By.xpath("//div[@data-control-name='Edit_Icon_2']");
	// tc207
	public By deleteIconEligibilty = By.xpath("//div[@data-control-name='DeleteEligibilityICO']");
	// 265
	public By quaterDrpDown = By.xpath("//div[@data-control-name='ReviewPeriodDB']");

	public By review2023Q1 = By.xpath("//div[@class='item0 appmagic-dropdownListItem']");
	public By review2023Q2 = By.xpath("//div[@class='item1 appmagic-dropdownListItem']");
	public By review2023Q3 = By.xpath("//div[@class='item2 appmagic-dropdownListItem']");
	public By review2023Q4 = By.xpath("//div[@class='item3 appmagic-dropdownListItem']");
	public By review2024Q1 = By.xpath("//div[@class='item4 appmagic-dropdownListItem']");
	public By review2024Q2 = By.xpath("//div[@class='item5 appmagic-dropdownListItem']");
	public By review2024Q3 = By.xpath("//div[@class='item6 appmagic-dropdownListItem']");
	public By review2024Q4 = By.xpath("//div[@class='item7 appmagic-dropdownListItem']");

	// 266
	public By rejectButton = By.xpath("//div[text()='Reject']//ancestor::button");
	// tc271
	public By startReview = By.xpath("//div[@data-control-name='StartReview_Button']//child::button");
	public By proposedBonusPercentage = By
			.xpath("//input[@inputmode='decimal' and @class='appmagic-text mousetrap block-undo-redo']");
	public By rejectToRL = By.xpath("//span[text()='Reject to RL']//ancestor::button");
	public By rejectToEmployee = By.xpath("//span[text()='Reject to Employee']//ancestor::button");
	public By submitButton = By.xpath("//div[text()='Submit']//ancestor::button");
	public By summary = By.xpath(
			"//div[contains(@data-control-name, 'SummaryLFQ') and contains(@data-control-name, '_Value_Txtipt')]//child::textarea");
	public By savebutton = By.xpath("//div[text()='Save']//ancestor::button");

	// 276
	public By yearReview = By.xpath("//div[@data-control-name='Year_Drpdwn']");
	public By year2023 = By.xpath("//div[@class='item0 appmagic-dropdownListItem']");

	// 277
	public By checkboxQ1 = By.xpath("(//input[@type='checkbox'])[1]");
	public By checkboxQ2 = By.xpath("(//input[@type='checkbox'])[2]");
	public By checkboxQ3 = By.xpath("(//input[@type='checkbox'])[3]");
	public By checkboxQ4 = By.xpath("(//input[@type='checkbox'])[4]");

	// 278
	public By scrolldown = By.xpath("//div[@data-control-name='Icon7_2']");

//	================================================================================================
	
	public By EvaluationEligibilityTabTitle = By.xpath("//div[text()='Evaluation Eligibility']");
	public By resetIcon = By.xpath("//div[@data-control-name='ResetIcon_2']");
	public By empDropdown = By.xpath("//input[@id='pac-combobox-2-input']");
	public By empFilterRefresh = By.xpath("//div[@data-control-name='EvaluationEmpComboReset']");
	public By addCategoryBtn = By.xpath("//div[text()='Add Category']//ancestor::button");
	public By categoryName = By.xpath("//div[@data-control-name='Category_Textinput']//child::input");
	public By categoryDefination = By.xpath("//div[@data-control-name='Definition_Textinput']//child::textarea");
	public By notMandatory = By.xpath("//input[@type='radio' and @value='No']//parent::label");
	public By activeButton = By.xpath("//div[text()='Active']//ancestor::button");
	public By editIcon= By.xpath("//div[@data-control-name='Edit_Icon']");
	public By statusFilterRefresh = By.xpath("//div[@data-control-name='RstIco_2']");
	public By pendingLeadStatus = By.xpath("//div[text()='Pending Practice Lead Review']");
	public By empCol = By.xpath("//div[text()='Employee Contribution']");
	public By leadCol = By.xpath("//div[text()='Lead Feedback']");
	

	
	
	
	
	
}