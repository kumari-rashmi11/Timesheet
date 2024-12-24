package utils;


import org.openqa.selenium.By;

public class ClientTabLocators {
	
	public By clientsTab_HR = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[4]/div/div/div[9]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/button");
	public By clientTab_PL = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(5) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1) > div > div > div > div > button");

	
	public By clientsTab = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[4]/div/div/div[9]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/button");
	public By addClientButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(15) > div > div > div > div > button");
    public By inputClientNameField = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(6) > div > div > div > div > div.scrollContainer_1iqg5j7-o_O-scrollbar_1te65uz > div > div > div > div:nth-child(1) > div > div > div > div:nth-child(3) > div > div > div > div > input");
    public By saveClientButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(10) > div > div > div > div > button > div");
    public By clientNameSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[14]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div");
    public By deleteProjectButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(22) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(4) > div > div > div > div");
    public By deleteYesButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[22]/div/div/div/div/button");
    public By deleteNoButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[21]/div/div/div/div/button");
    
    public By clientsDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(14) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div");
    
	public By refreshButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[8]/div/div/div/div");

    public By projectElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[22]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div");
	
	public By editButtonElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[7]/div/div/div[11]/div/div/div/div");
	
	public By projectNameInput = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[9]/div/div/div[6]/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/input");
	
	public By clientDropdownList = By.xpath("//*[@id=\"react-combobox-view-0\"]/div[2]");
	
	public By searcherClientName = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(14) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(3) > div > div > div > div");
	
	public By descriptionElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[9]/div/div/div[6]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/input");
	
	public By notesElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[9]/div/div/div[6]/div/div/div/div/div[1]/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div/input");
	
	public By saveButtonElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[9]/div/div/div[10]/div/div/div/div/button");
	
	public By searchInputSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[5]/div/div/div/div/input");

	public By clearButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[8]/div/div/div/div");
	
	public By addProjectButtonSelector = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(17) > div > div > div > div > button");
	
	public By projectNameInputSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[17]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/input");
	
	public By descriptionInputElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[17]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/input");
	
	public By notesInputElement = By.xpath("/html/body/div[1]/div/div/div/div[1]/div[6]/div/div/div[17]/div/div/div/div/div[1]/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div/input");
	
	public By saveProjectButtonSelector = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(28) > div > div > div > div > button");

	public By clientDeleteButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(6) > div > div > div:nth-child(9) > div > div > div > div");
											
	public By clientDeleteyesButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[22]/div/div/div/div/button");
	
	public By clientDeletenoButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[21]/div/div/div/div/button");
	
	public By editClientButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[11]/div/div/div/div");
	
	public By editclientInputSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[7]/div/div/div[6]/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/input");
	
	public By editstatusButtonSelector = By.xpath("//*[@id=\"react-combobox-view-0\"]/div[1]");
	
	public By editinActiveSelector = By.xpath("//ul[@class='appmagic-combobox-itemlist itemsContainer_14xc3ab']//li[.//span[text()='Inactive']]");
	
	public By editActiveSelector = By.xpath("//ul[@class='appmagic-combobox-itemlist itemsContainer_14xc3ab']//li[.//span[text()='Active']]");

	public By editSaveButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[7]/div/div/div[10]/div/div/div/div/button");
	
	public By dropDownListOfclients = By.cssSelector("#powerapps-flyout-react-combobox-view-1 > div > ul");

	
}