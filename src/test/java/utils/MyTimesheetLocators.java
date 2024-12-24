package utils;

import org.openqa.selenium.By;

public class MyTimesheetLocators {

	public By myTimesheetTab = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(6) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1)");
	public By addTimesheetButton = By
			.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[25]//button/div");
	public By myTimesheetTabRL = By.cssSelector(
			"div:nth-of-type(6) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	public By myTimesheetTabPL = By.cssSelector("div:nth-of-type(12) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
	
	// finacial year dropdown
	public By FYdropdown = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[15]//div[@class='react-knockout-control']/div/div/div[@role='button']");

	// FY years
	public By FY21_22 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[1]");
	public By FY22_23 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[2]");
	public By FY23_24 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[3]");
	public By FY24_25 = By
			.xpath("//div[@class='drop-content']/div[@class='appmagic-dropdownFlyout']/div[@role='listbox']/div[4]");

	// search
	public By searchBox = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[5]//div[@class='react-knockout-control']/div[@class='appmagic-textbox']/input[@title='Search by Week or Status']");
	// refresh
	public By refreshButton = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[8]//div[@class='react-knockout-control']/div");

	// select a draft
	public By selectingSheet = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div[@class='container_1f0sgyp-o_O-containerFullSize_5t8a34']/div[24]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[4]//div[@class='react-knockout-control']/div");

	// notebox
	public By noteBoxcss = By.cssSelector(
			"div:nth-of-type(11) .react-knockout-control > .appmagic-textbox > textarea[title='Character limit is 200. Your character count is 0']");
	public By noteBox = By.cssSelector(
			".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(11) > .appmagic-borderfill-container");
	public By timeBox = By.cssSelector(
			"div:nth-of-type(4) .react-knockout-control > .appmagic-textbox > .appmagic-text.block-undo-redo.mousetrap");
	public By updateNoteBox=By.cssSelector("[data-control-id='1436'] [data-control-part]");
	// savebutton
	public By saveButton = By.cssSelector("[data-control-id='1464'] button");
	public By newTMsaveBtn = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(27) > div > div > div > div > button");
	public By newTMsubmitBtn = By.cssSelector("[data-control-id='1462'] button");
	public By partialSubmitEmp = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-163");
	public By partialSubmitRL = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-170");
	public By partialsubmitPL = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-163");
	
	// submit button
	public By submitButton = By
			.cssSelector("div:nth-of-type(34) button > .appmagic-button.center.middle > .appmagic-button-label");
	public By finalSubmitBtn = By.cssSelector(".ms-Button.ms-Button--primary.root-167 .label-165.ms-Button-label");
	public By finalSubmitBtnRL = By.cssSelector("div:nth-of-type(33) > div[role='presentation'] > div[role='presentation']"); 
	public By partialSubmitBtn = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-163");
	
	
	public By RejectedsubmitButton = By.xpath(
			"//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[6]/div/div/div[36]//div[@class='appmagic-button-wrapper']");
	public By RejectedFinalSubmitBtn = By.xpath(
			"//div[@id='publishedCanvas']//div[@class='app-canvas']/div[6]/div/div/div[35]/div[@role='presentation']/div[@role='presentation']/button[@type='button']/span");

	// export button
	public By exportAsPDF = By.cssSelector("div[title='Export as PDF'] > .icon-svg-container");
	public By exportButton = By.cssSelector("[data-control-id='1468'] button");

	// hover element
	public By holidayMarking = By.cssSelector(
			"div:nth-of-type(29) div[role='presentation'] > .appmagic-label-text div[title='Optional Holiday: Guru Nanak Jayanti']");

	public By sendAttachment = By.cssSelector(
			"#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(24) > div > div > div > div > div > div.actions_3hmsj-o_O-actions_178wtdc > div > div");
	public By nextWeekBtn = By.cssSelector("div > div:nth-of-type(19)");
	public By nextWeekBtn2 = By.cssSelector("div > div:nth-of-type(20)");
}
