package utils;

import org.openqa.selenium.By;
	
public class EditorLocators {
	
	
	//For Editor
	public By ExportTab = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(10) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");
	public By exportIframe = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(6) > div > div > div > div > div > iframe");
	public By signInBtn = By.cssSelector("section#promptForLogin > div > button");
	
	public By yeardd = By.cssSelector("visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selectyear = By.cssSelector("div:nth-of-type(4) > div[role='option']");
	public By statusdd = By.cssSelector("visual-container:nth-of-type(7) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectstatus = By.cssSelector("div:nth-of-type(4) > div[role='option'] > .slicerText");
	public By hoverElement = By.cssSelector("div[role='document'] > div[role='grid'] > div:nth-of-type(1)");
	public By threeDots = By.cssSelector("#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(10) > transform > div > visual-container-header > div > div > div > visual-container-options-menu > visual-header-item-container > div > button");	
	public By exportdata = By.cssSelector("button:nth-of-type(1) > .pbi-menu-item-text-container > span");
	public By exportbtn = By.cssSelector(".mat-mdc-dialog-actions.mdc-dialog__actions > .exportButton.mat-button.mat-button-base.pbi-modern-button.primaryBtn");
	
	public By selectReportee = By.cssSelector("#pvExplorationHost > div > div > exploration > div > explore-canvas > div > div.canvasFlexBox > div > div.displayArea.disableAnimations.fitToPage > div.visualContainerHost.visualContainerOutOfFocus > visual-container-repeat > visual-container:nth-child(9) > transform > div > div.visualContent > div > div > visual-modern > div > div > div.slicer-content-wrapper");
	public By chooseReportee = By.cssSelector("div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(2)");

	public By monthlyExtract = By.cssSelector("div[role='row'] > div:nth-of-type(2)");
	
	public By monthdd = By.cssSelector("visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selectmonth = By.cssSelector("div:nth-of-type(4) > div[role='option'] > .slicerText");
	public By thrdots = By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more");
	
	public By reportee = By.cssSelector("visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selectrepor = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");
	
	public By weeklyExtract = By.cssSelector("div[role='row'] > div:nth-of-type(3)");
	public By wekrep = By.cssSelector("visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selrep = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");
	public By wekdd = By.cssSelector("visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .chevron-down.dropdown-chevron.powervisuals-glyph");
	public By selweek = By.cssSelector("div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");

	
	public By partsubmitted = By.cssSelector("div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(5) > div[role='option'] > .slicerText");
	public By reporteedd = By.cssSelector("visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectrepname = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By threedotsss = By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more");
	
	public By monreportee = By.cssSelector("visual-container:nth-of-type(10) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectmonrep = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By weekdropdown = By.cssSelector("visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectweek = By.cssSelector("div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");
	public By statusalldd = By.cssSelector("visual-container:nth-of-type(7) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectweekstatus = By.cssSelector("div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(5) > div[role='option'] > .slicerText");
	public By thredots = By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more");
	public By billdd = By.cssSelector("visual-container:nth-of-type(4) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectbill = By.cssSelector("div:nth-of-type(10) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");
	public By approvedstatus = By.cssSelector("div:nth-of-type(11) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(2) > div[role='option'] > .slicerText");
	public By selectbillyes = By.cssSelector("div:nth-of-type(3) > div[role='option'] > .slicerText");
	
	public By selectmonthdd = By.cssSelector("visual-container:nth-of-type(9) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectmonthh = By.cssSelector("div:nth-of-type(14) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");
	
	public By week = By.cssSelector("visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectweekk = By.cssSelector("div:nth-of-type(13) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");

	public By dateWiseExtract = By.cssSelector("div[role='row'] > div:nth-of-type(4)");
	public By dwstatus = By.cssSelector("visual-container:nth-of-type(8) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By dwstatusselect = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");
	public By dwbilliable = By.cssSelector("visual-container:nth-of-type(4) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By dwselectbill = By.cssSelector("div:nth-of-type(10) div[role='listbox'] > div[role='none'] > div[role='none'] > div > div[role='none'] > div:nth-of-type(3) > div[role='option'] > .slicerText");
	

	public By monnrep = By.cssSelector("visual-container:nth-of-type(10) > .bringToFront > div[role='group']  .sub-selectable.themableBackgroundColor.themableBorderColorSolid.vcBody  visual-modern div[role='combobox'] > .slicer-restatement");
	public By selectmonnrep = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");
	public By weeeekextract = By.cssSelector("div[role='row'] > div:nth-of-type(3)");
	
	public By chosreportee = By.cssSelector("div:nth-of-type(2) > div[role='option'] > .slicerText");

	//For PL
	public By ExportTabPL = By.cssSelector("div:nth-of-type(10) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	public By exportIframePL =By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(6) > div > div > div > div > div > iframe");

	//For Viewer
	public By exportIframeViewer =By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(6) > div > div > div > div > div > iframe");


}
