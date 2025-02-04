package utils;

import org.openqa.selenium.By;

public class ExportLocators {

	public By ExportTab = By.xpath(
			"//div[contains(text(), 'Export')]//ancestor::div[@class='container_1f0sgyp']//child::div[position()=1]");
	
	public By exportIframe = By.xpath("//iframe[@aria-label='Power BI tile']");

	public By signInBtn = By.xpath("//button[contains(text(), 'Sign in')]");

	
	public By totalHours = By.cssSelector("visual-container:nth-of-type(2) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern .value > tspan");
	
	public By timeDate = By.cssSelector("visual-container:nth-of-type(6) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern  .card  .value > tspan:nth-of-type(1)");
	
	public By yearDropdownYearlyExtract = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(8) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper");

	public By yearDropdown = By.xpath("//div[@aria-label='Year']//parent::div[@class='slicer-content-wrapper']");

	public By chooseYear = By.cssSelector(
			"div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(1)");

	public By statusDropdown = By.xpath("//div[@aria-label='Status']");

	public By chooseStatusRejected = By.cssSelector(
			"div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div[role='none'] > div > div:nth-of-type(6) > div[role='option']");

	public By chooseStatusSubmitted = By.xpath("//div[@title='Submitted']");

	public By chooseStatusDraft = By.cssSelector(
			"div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div[role='none'] > div > div:nth-of-type(3) > div[role='option']");

	public By threeDots = By.xpath("//button[@class='vcMenuBtn']");

	public By hoverElement = By.xpath("(//div[@role='grid']//div[@aria-rowindex=\"1\"])[2]");

	public By exportDataBtn = By.xpath("//button[@title=\"Export data\"]");

	public By exportBtn = By.xpath("//button[text() ='Export']");

	public By selectReportee = By.xpath("//div[@aria-label='Reportee(s)']");

	public By chooseReportee = By.cssSelector(
			"div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(2)");

	public By chooseReporteeWeeklyExtract = By.cssSelector(
			"div:nth-of-type(12) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(4)");

	public By chooseReporteeDateWise = By.cssSelector(
			"div:nth-of-type(12) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3)");

	public By selectReporteeMonthlyExtract = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(10) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper");

	public By yearlyExtract = By.cssSelector("div[role='row'] > div:nth-of-type(1)");
	
	public By monthlyExtract = By.xpath("//div[contains(text(), 'Monthly Extract')]//ancestor::div[@class='small-multiples-grid-cell']");

	public By weeklyExtract = By.xpath("//div[contains(text(), 'Weekly Extract')]//ancestor::div[@class='small-multiples-grid-cell']");

	public By weekDropdown = By.xpath("//div[@aria-label='Week']//parent::div[@class=\"slicer-content-wrapper\"]");

	public By chooseWeek = By.cssSelector(
			"div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3)");

//	public By datewiseExtract = By.xpath("//div[@class='small-multiples-grid-row']//descendant::div[contains(text(), 'Datewise Extract')]");
	
	public By datewiseExtract = By.xpath("(//div[@role='gridcell' and @aria-colindex='4'])[1]");

	public By chooseMonth = By.cssSelector("div:nth-of-type(1) > div[role='option']");

	public By monthDropdown = By.cssSelector(
//			"//div[@aria-label='Year']//parent::div[@class='slicer-content-wrapper']");
			"visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	
	public By workStartDate = By.xpath(
			"//input[@aria-label='Start date. Available input range 9/6/2009 to 2/15/2025']");

	public By workEndDate = By.xpath(
			"//input[@aria-label='End date. Available input range 9/6/2009 to 2/15/2025']");

	public By chooseStatus = By.cssSelector(
			"div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div[role='none'] > div > div:nth-of-type(2) > div[role='option']");

	public By billableDropdown = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(4) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper > div");

	public By chooseBillable = By.cssSelector(
			"div:nth-of-type(10) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option']");

	public By threeDotsAfterMonthlyExtract = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(11) > transform > div > visual-container-header > div > div > div > visual-container-options-menu > visual-header-item-container > div > button");

	public By WeekDropdownWeekExtract = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(8) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper > div > div");

	public By weekChoose = By.cssSelector("div[role='row'] > div:nth-of-type(3)");

	public By dateWiseExtract = By.cssSelector("div[role='row'] > div:nth-of-type(4)");

	public By dateStartSelectButton = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(7) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper > div > div.date-slicer-head.wrap > div > div:nth-child(1) > div > button");

	public By dateSelectStart = By.cssSelector("div:nth-of-type(3) > div:nth-of-type(2) > .date-cell");

	public By dateEndSelectbutton = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(7) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper > div > div.date-slicer-head.wrap > div > div:nth-child(2) > div > button");

	public By dateSelectEnd = By.cssSelector("div:nth-of-type(5) > div:nth-of-type(6) > .date-cell");

	public By yeardd = By.cssSelector(
			"visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selectyear = By.cssSelector("div:nth-of-type(4) > div[role='option']");
	public By statusdd = By.cssSelector(
			"visual-container:nth-of-type(7) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectstatus = By.cssSelector("div:nth-of-type(4) > div[role='option'] > .slicerText");

	public By exportdata = By.cssSelector("button:nth-of-type(1) > .pbi-menu-item-text-container > span");
	public By exportbtn = By.cssSelector(
			".mat-mdc-dialog-actions.mdc-dialog__actions > .exportButton.mat-button.mat-button-base.pbi-modern-button.primaryBtn");

	public By monthdd = By.cssSelector(
			"visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selectmonth = By.cssSelector("div:nth-of-type(4) > div[role='option'] > .slicerText");
	public By thrdots = By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more");

	public By reportee = By.cssSelector(
			"visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selectrepor = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");

	public By wekrep = By.cssSelector(
			"visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selrep = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");
	public By wekdd = By.cssSelector(
			"visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selweek = By.cssSelector(
			"div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By partsubmitted = By.cssSelector(
			"div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(5) > div[role='option'] > .slicerText");
	public By reporteedd = By.cssSelector(
			"visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectrepname = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By threedotsss = By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more");

	public By monreportee = By.cssSelector(
			"visual-container:nth-of-type(10) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectmonrep = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By weekdropdown = By.cssSelector(
			"visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectweek = By.cssSelector(
			"div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");
	public By statusalldd = By.cssSelector(
			"visual-container:nth-of-type(7) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectweekstatus = By.cssSelector(
			"div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(5) > div[role='option'] > .slicerText");
	public By thredots = By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more");
	public By billdd = By.xpath("//div[@aria-label='Billable']");
	public By selectbill = By.cssSelector(
			"div:nth-of-type(10) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");
	public By approvedstatus = By.cssSelector(
			"div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(2) > div[role='option'] > .slicerText");
	public By selectbillyes = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By selectmonthdd = By.cssSelector(
			"visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectmonthh = By.cssSelector(
			"div:nth-of-type(14) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By week = By.cssSelector(
			"visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectweekk = By.cssSelector(
			"div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By dwstatus = By.cssSelector(
			"visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By dwstatusselect = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");
	public By dwbilliable = By.cssSelector(
			"visual-container:nth-of-type(4) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By dwselectbill = By.cssSelector(
			"div:nth-of-type(10) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By monnrep = By.cssSelector(
			"visual-container:nth-of-type(10) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectmonnrep = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");
	public By weeeekextract = By.cssSelector("div[role='row'] > div:nth-of-type(3)");

	public By chosreportee = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");

	public By Refresheddate = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(6) > transform > div > div.visualContent > div > div > visual-modern > div > svg > g:nth-child(1) > text > tspan:nth-child(1)");
	public By Refreshedtime = By.cssSelector(
			"#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(6) > transform > div > div.visualContent > div > div > visual-modern > div > svg > g:nth-child(1) > text > tspan:nth-child(2)");

}