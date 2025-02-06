package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.EvalSettingLocators;
import helper.Interactions;

public class EvalSettingPage {
	private EvalSettingLocators MTlocators;
	private Interactions interaction;

	Actions actions;
	WebDriverWait wait;

	public EvalSettingPage(WebDriver driver) {
		this.MTlocators = new EvalSettingLocators();
		this.interaction = new Interactions(driver);
		this.actions = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	// Monalisha

	public void clickevaluationSettingtab() {
		this.interaction.click(MTlocators.evaluationSettingTab);
	}

	public void clickevaluationtab() {
		this.interaction.click(MTlocators.evaluationTab);
	}

	public void evaluationCategoriesTab() {
		this.interaction.click(MTlocators.evaluationCategoriesTab);
	}

	// tc191
	public void deleteIconCategory() {
		this.interaction.click(MTlocators.deleteIconCategory);
	}

	// tc192
	public void deleteArchiveBtn() {
		this.interaction.click(MTlocators.deleteArchiveBtn);
	}

	// tc193
	public void deleteButton() {
		this.interaction.click(MTlocators.evaCategorydeleteButton);
	}

	// tc194
	public void archiveButton() {
		this.interaction.click(MTlocators.archiveButton);
	}

	public void editArchiveCatbtn() {
		this.interaction.click(MTlocators.editarchiveButton);
	}

	public void archiveDescription(String description) {
		this.interaction.click(MTlocators.archiveDescription);
		this.interaction.sendingKeys(MTlocators.archiveDescription, description);
	}

	public void saveArchivebtn() {
		this.interaction.click(MTlocators.archiveSaveButton);
	}

	// tc195
	public void toggleArchive() {
		this.interaction.click(MTlocators.toggleButton);
	}

	// tc196
	public void search(String search) {
		this.interaction.click(MTlocators.search);
		this.interaction.sendingKeys(MTlocators.search, search);
	}

	// tc197
	public void refresh() {
		this.interaction.click(MTlocators.refresh);
	}

	// tc198
	public void deleteArchiveCategory() {
		this.interaction.click(MTlocators.deleteArchiveCategory);
	}

	public void selectEmployee() {
		this.interaction.click(MTlocators.selectEmployee);
	}

	public void clickMask() {
		this.interaction.click(MTlocators.masking);
	}

	// tc265
	public void selectstatusdropdown() {
		this.interaction.click(MTlocators.selectingStatus);

	}

	// Tc199
	public void evaEligibityTab() {
		this.interaction.click(MTlocators.EvaluationEligibilityTab);
	}

	// Tc200
	public void employeeFilter(String empName) {
		this.interaction.click(MTlocators.employeeInput);
		this.interaction.sendingKeys(MTlocators.employeeInput, empName + Keys.ENTER);
	}

	// tc201
	public void empReset() {
		this.interaction.click(MTlocators.empReset);
	}

	// tc202
	public void empRefresh() {
		this.interaction.click(MTlocators.empRefresh);
	}

	// Tc203
	public void createEmpCyc() {
		this.interaction.click(MTlocators.empCycBtn);

	}

	public void selectEmp(String empName) {
		this.interaction.click(MTlocators.FYselectEmployee);
		this.interaction.sendingKeys(MTlocators.FYselectEmployee, empName + Keys.ENTER);
	}

	public void selectQuaterscheckbox() {
		this.interaction.click(MTlocators.Q1);
		this.interaction.click(MTlocators.Q2);
		this.interaction.click(MTlocators.Q3);
		this.interaction.click(MTlocators.Q4);
	}

	public void saveCycle() {
		this.interaction.click(MTlocators.saveCycle);
	}

	// tc204
	public void FYdropdown() {
		this.interaction.click(MTlocators.FYdropdown);
	}

	public void FYdropdown2023() {
		this.interaction.click(MTlocators.FYdropdown);
		this.interaction.click(MTlocators.FY2023);
	}

	public void FYdropdown2024() {
		this.interaction.click(MTlocators.FYdropdown);
		this.interaction.click(MTlocators.FY2024);
	}

	// tc205
	public void pencilicon() {
		this.interaction.click(MTlocators.pencilIcon);
	}

	public void selectQuaterQ1() {
		this.interaction.click(MTlocators.Q1);
	}

	// tc207
	public void deleteIconEligibilty() {
		this.interaction.click(MTlocators.deleteIconEligibilty);
	}

	// tc265
	public void selectQuater(String FYquater) {
		this.interaction.click(MTlocators.quaterDrpDown);
		switch (FYquater) {
		case "2023 Q1":
			this.interaction.click(MTlocators.review2023Q1);
			break;
		case "2023 Q2":
			this.interaction.click(MTlocators.review2023Q2);
			break;
		case "2023 Q3":
			this.interaction.click(MTlocators.review2023Q3);
			break;
		case "2023 Q4":
			this.interaction.click(MTlocators.review2023Q4);
			break;
		case "2024 Q1":
			this.interaction.click(MTlocators.review2024Q1);
			break;
		case "2024 Q2":
			this.interaction.click(MTlocators.review2024Q2);
			break;
		case "2024 Q3":
			this.interaction.click(MTlocators.review2024Q3);
			break;
		default:
			this.interaction.click(MTlocators.quaterDrpDown);
			System.out.println("default year");
			break;
		}

	}

	public void selectStatusPL(String status) {
		if (!(status == "Evaluated")) {
			this.interaction.click(MTlocators.selectingStatus);
			String path = "//button[@title='" + status + "']";
			this.interaction.click(By.xpath(path));
		}
	}
	
	public void selectStatusRL(String status) {
		if (!(status == "Pending Lead Review")) {
			this.interaction.click(MTlocators.selectingStatus);
			String path = "//button[@title='" + status + "']";
			this.interaction.click(By.xpath(path));
		}
	}

	// tc266
	public void rejectButton() {
		this.interaction.click(MTlocators.rejectButton);
	}

	// tc271
	public void startReview() {
		this.interaction.click(MTlocators.startReview);
	}

	public void proposedBonusInt(int value) {
		this.interaction.click(MTlocators.proposedBonusPercentage);
		this.interaction.sendKeysInt(MTlocators.proposedBonusPercentage, value);
	}

	public void checkSaveButtonDisabled() {
		WebElement disBtn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[text()='Save']//ancestor::button[@disabled = 'true']")));
		if (disBtn.isDisplayed()) {
			return;
		}
	}
	
	
	public void checkSubmitButtonDisabled() {
		WebElement disBtn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[text()='Submit']//ancestor::button[@disabled = 'true']")));
		if (disBtn.isDisplayed()) {
			return;
		}
	}

	public void saveButtonReview() {
		this.interaction.click(MTlocators.savebutton);
	}

	// tc273
	public void toggleButton() {
		this.interaction.click(MTlocators.toggleButton);
	}

	// tc276

	public void yearFilter(String year) {
		this.interaction.click(MTlocators.yearReview);
		if (year == "2023") {
			this.interaction.click(MTlocators.year2023);
		}
		if (year == "2024") {
			this.interaction.click(MTlocators.yearReview);
		}

	}

	// tc277
	public void quaterFilter(String Quarter) {
		if (Quarter == "Q1") {
			this.interaction.click(MTlocators.filterQ1);
		}
		if (Quarter == "Q2") {
			this.interaction.click(MTlocators.filterQ2);
		}
		if (Quarter == "Q3") {
			this.interaction.click(MTlocators.filterQ3);
		}
		if (Quarter == "Q4") {
			this.interaction.click(MTlocators.filterQ4);
		}
	}

	// tc278
	public void scrolldown() {
		this.interaction.click(MTlocators.scrolldown);
	}

	// tc280
	public void contributionSummary(String Summary) {
		this.interaction.click(MTlocators.summary);
		this.interaction.sendingKeys(MTlocators.summary, Summary + Keys.ENTER);
	}

	// tc288
	public void rejectToRLBtn() {
		interaction.click(MTlocators.rejectToRL);
	}

	public void rejectToEmployeeBtn() {
		interaction.click(MTlocators.rejectToEmployee);
	}

	public void submitButton() {
		this.interaction.click(MTlocators.submitButton);
	}

	// =====================================================================================

	public String isEligibiltyPage() {
		return interaction.getInnerText(MTlocators.EvaluationEligibilityTabTitle);
	}

	public String PendingLeadstatus() {
		return interaction.getInnerText(MTlocators.pendingLeadStatus);
	}

	public String defaultstatus() {
		WebElement element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Pending Lead Review']")));
		return element.getAttribute("value"); // Extract 'Pending Lead Review'
	}

	public void refreshButton() {
		interaction.click(MTlocators.resetIcon);
	}

	public void SelectEmployee(String empName) {
		this.interaction.click(MTlocators.empDropdown);
		this.interaction.sendingKeys(MTlocators.empDropdown, empName + Keys.ENTER);
	}

	public void employeeFilterReset() {
		this.interaction.click(MTlocators.empFilterRefresh);
	}
	
	public void statusFilterReset() {
		this.interaction.click(MTlocators.statusFilterRefresh);
	}


	public void addCategory(String category, String def) {
		this.interaction.click(MTlocators.addCategoryBtn);
		this.interaction.sendingKeys(MTlocators.categoryName, category + Keys.ENTER);
		this.interaction.sendingKeys(MTlocators.categoryDefination, def + Keys.ENTER);
		this.interaction.clickElement(MTlocators.notMandatory);
		this.interaction.click(MTlocators.savebutton);

	}

	public void modifyCategory(String category, String modifydef) {
		this.interaction.sendingKeys(MTlocators.search, category + Keys.ENTER);
		this.interaction.executeWithDelay(() -> this.interaction.click(MTlocators.editIcon));
		this.interaction.sendingKeys(MTlocators.categoryDefination, modifydef + Keys.ENTER);
		this.interaction.clickElement(MTlocators.notMandatory);
		this.interaction.click(MTlocators.savebutton);

	}

	public void activeButton() {
		this.interaction.click(MTlocators.activeButton);
	}
	
	public void coloumnsVisibility() {
		String employeeCol = interaction.getInnerText(MTlocators.empCol);
		String leadCol = interaction.getInnerText(MTlocators.leadCol);
		Assert.assertEquals(employeeCol, "Employee Contribution");
		Assert.assertEquals(leadCol, "Lead Feedback");
	}
}