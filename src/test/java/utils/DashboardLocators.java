package utils;

import org.openqa.selenium.By;

public class DashboardLocators {
	
	//Locators for HR dashboard_tab
	public By dashboardButton = By.xpath("//div[@class='appmagic-content-control-name appmagic-control-view canvasContentDiv _vst_']//div[text()='Timesheet Dashboard']");
//    public By dashboardButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button");
    public By greenrl = By.xpath("//div[text()='Amisha Sen']");
    public By purplepl = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(43) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(9) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1) > div > div > div > div > div");
    public By blackuser = By.xpath("//div[text()='A test']");
	
	
	//Locators for PL dashboard_tab
    public By Leaddb = By.cssSelector(".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) button > .appmagic-button.center.middle");
	public By reporteePL = By.cssSelector("[data-control-id='2021'] .appmagic-label-text");
	public By rightarrowPL = By.cssSelector("div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(6) .powerapps-icon");
	public By approvebtnPL = By.cssSelector("div:nth-of-type(32) button > .appmagic-button.center.middle");
	public By repddPL = By.cssSelector("div:nth-of-type(50) .appmagic-dropdown");
//	public By repnamePL = By.id("appmagic-dropdownFlyoutdropdown_siena_799876570590a9f_1");
	public By repnamePL = By.cssSelector("div[role='listbox'] > div:nth-of-type(2)");
	public By switchoffPL = By.cssSelector("div[role='switch'] > .appmagic-toggleSwitch-off");
	public By switchonPL = By.cssSelector("div[role='switch'] > .appmagic-toggleSwitch-on");
	
	
	public By filterbtnPL = By.cssSelector("div:nth-of-type(51) .powerapps-icon");
	public By notstartedyet = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(15) div[role='presentation'] > .appmagic-label-text");
	public By consumedhrs = By.cssSelector(".canvasContentDiv.container_1vt1y2p  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(1) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(4) div[role='presentation'] > .appmagic-label-text");
	
	
	
	//Locators for Editor dashboard_tab
	public By admindb = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button");
	public By edreportee = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(43) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1) > div > div > div > div");
	public By switchoff = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(6) > div > div > div > div > div.appmagic-toggleSwitch.no-focus-outline.left > div.appmagic-toggleSwitch-off");
	public By switchon = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(6) > div > div > div > div > div.appmagic-toggleSwitch.no-focus-outline.left > div.appmagic-toggleSwitch-on");
	public By yeardropdown = By.cssSelector(".appmagic-card.card_c5uw0h > div:nth-of-type(51)");
	public By rightarrow = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(63) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(4) > div > div > div > div");
	public By approvebtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(32) > div > div > div > div > button");
	public By repdd = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(56)");
	public By repname = By.cssSelector("div[role='listbox'] > div:nth-of-type(1)");
	public By filter = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(55)");
	public By notify = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(7) > div > div > div > div");
	public By refresh = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(6) > div > div > div > div");
	public By approvenotify = By.cssSelector("div:nth-of-type(7) > div[role='presentation'] > div[role='presentation'] > .ms-Button.ms-Button--primary.root-171");
	public By rejectbtn = By.cssSelector(".ms-Button.ms-Button--primary.root-170 .label-160.ms-Button-label");
	public By close = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-164");
	public By repyy = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(51)");
			
	
	//Locators for RL dashboard_tab
	public By teamsdb = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[5]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button");
	public By finandd = By.cssSelector(".appmagic-dropdownLabel.drop-target.dropdown_siena_405fd3b5aeea915 > .appmagic-dropdownLabelArrow");
	public By year = By.cssSelector("div[role='listbox'] > div:nth-of-type(3)");
	public By calculatebtn = By.cssSelector("div[role='presentation'] > .ms-Button.ms-Button--primary.root-158");
	public By switchoffRL = By.cssSelector("div[role='switch'] > .appmagic-toggleSwitch-off");
	public By switchonRL = By.cssSelector("div[role='switch'] > .appmagic-toggleSwitch-on");
	
	
	
	//Locators for Viewer dashboard_tab
	public By adminViewer = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'react-gallery-items-window')]//ancestor::div[contains(@class, 'canvasContentDiv')]//div[position()=2]//button//div");
	public By clickreporteeViewer = By.xpath("(//div[contains(text(), 'A test')]//ancestor::div[@class='container_1f0sgyp']//child::div)[1]");
	public By blackuserViewer = By.xpath("(//div[contains(text(), 'A test')]//ancestor::div[@class='container_1f0sgyp']//child::div)[1]");
	public By switchoffViewer = By.cssSelector("div[role='switch'] > .appmagic-toggleSwitch-off");
	public By switchonViewer = By.cssSelector("div[role='switch'] > .appmagic-toggleSwitch-on");
	public By allclients = By.xpath("//div[text()='All Clients']");
	public By claimedtask = By.xpath("//div[text()='Claimed Task']");
	public By yeardropdown_Viewer = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[51]");
	public By chooseyear = By.xpath("//div[contains(@class, 'appmagic-dropdownFlyout')]//div[@role='listbox']//div[position()=3]");
	
	
	public By repddViewer = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=56]//div[contains(@class, 'react-knockout-control')]//div");
	public By repnameViewer = By.xpath("//div[contains(@class, 'drop-content')]//div[contains(@class, 'appmagic-dropdownFlyout')]//div[@role='listbox']//div[position()=8]");
	public By filterbtn = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=55]//div[contains(@class, 'react-knockout-control')]//div");
	
	public By notstartedyetViewer = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=15]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");
	public By draft = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=16]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");
	public By Submitted = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=17]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");
	public By Partially_Submitted = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=18]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");
	public By Approved = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=19]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");
	public By Partially_Approved = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=20]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");
	public By Rejected = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'scrollContainer') and contains(@class, 'scrollbar')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=21]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");

	public By submittedtimesheet = By.xpath("//div[@id='publishedCanvas']//div[contains(@class, 'app-canvas')]//div[contains(@class, 'appmagic-borderfill-container')]//div[contains(@class, 'appmagic-border-inner')]//div[contains(@class, 'appmagic-fluidGrid')]//div[contains(@class, 'scrollContent')]//div[contains(@class, 'appmagic-card') and contains(@class, 'card')]//div[position()=63]//div[@role='list']//div[@role='listitem']//div[contains(@class, 'canvasContentDiv') and contains(@class, 'container')]//div[position()=2]//div[@role='presentation']//div[contains(@class, 'appmagic-label-text')]");




}


