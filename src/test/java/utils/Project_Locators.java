package utils;

import org.openqa.selenium.By;

public class Project_Locators {
	 // Add Project Locators
    public static By ProjectTabBtn_Editor = By.cssSelector(".canvasContentDiv.container_1g5unre  .appmagic-content-control-name.appmagic-control-view.canvasContentDiv div[role='list']  .react-gallery-items-window > div:nth-of-type(3)");

    public static By AddProjectButton = By.cssSelector("div:nth-of-type(17) button");
    public static By ProjectNameInputText = By.cssSelector(".appmagic-textbox > input[title='Project Name']");
    public static By SelectClient = By.cssSelector("[tabindex='22']");
    public static By clientcategory = By.cssSelector("ul[role='listbox'] > li:nth-of-type(5)");
    public static By NotesInputText = By.cssSelector(".appmagic-textbox > input[title='Notes']");
    public static By DescriptionInputText = By.cssSelector(".appmagic-textbox > textarea[title='Description']");
    public static By SaveProjectBtn = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(10) button > .appmagic-button.center.middle");
    public static By searchInputSelector = By.cssSelector(".appmagic-textbox > input[title='Search by Name']");
	public static By clearButtonSelector = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(8) .powerapps-icon");
    public static By SelectProject = By.cssSelector("div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon");
    public static By SelectPencil = By.cssSelector(".canvasContentDiv.container_15kk9bh > div > div:nth-of-type(11) .powerapps-icon");    public static By EditSelectProjectName = By.cssSelector(".appmagic-textbox > input[title='Project Name']");
    public static By EditProjectDescription = By.cssSelector(".appmagic-textbox > input[title='Description']");
    public static By EditPojectNotes = By.cssSelector(".appmagic-textbox > input[title='Notes']");
    public static By SaveEditProject = By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(10) button > .appmagic-button.center.middle");
    public static By SelectDeleteProject= By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[16]/div[@class='appmagic-borderfill-container']//div[@role='list']//div[@class='react-gallery-items-window']/div[6]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[2]//div[@class='react-knockout-control']/div");
	public static By SelectDeleteProjectBtn=By.cssSelector(".canvasContentDiv.container_15kk9bh > div > div:nth-of-type(9) .powerapps-icon");
	public static By YesDeleteProjectBtn=By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[6]/div/div/div[33]//button/div");
    public static By NoDeleteProjectBtn=By.cssSelector("div:nth-of-type(32) > .appmagic-borderfill-container");
    public static By SelectchargeProject= By.cssSelector("div:nth-of-type(2) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon");
    public static By SelectChargeCodeBtn= By.cssSelector("div:nth-of-type(21) button > .appmagic-button.center.middle");
	public static By SelectChargeType= By.cssSelector("div:nth-of-type(2) > .appmagic-borderfill-container  .appmagic-typed-card.card_c5uw0h > div:nth-of-type(3) div[role='button']");
	public static By ChooseChargeType= By.cssSelector("li:nth-of-type(2) > .itemTemplateContainer_595lsy > .itemTemplateLabel_dqr75c");
	public static By SelectActivityType= By.cssSelector("div:nth-of-type(3) > .appmagic-borderfill-container  .appmagic-typed-card.card_c5uw0h > div:nth-of-type(3) div[role='button']");
    public static By ChooseActivityType=By.cssSelector("li:nth-of-type(2) > .itemTemplateContainer_595lsy > .itemTemplateLabel_dqr75c");
	public static By SelectTask= By.cssSelector("div:nth-of-type(4) > .appmagic-borderfill-container  .appmagic-typed-card.card_c5uw0h > div:nth-of-type(3) div[role='button']");
	public static By ChooseTask= By.cssSelector("li:nth-of-type(2) > .itemTemplateContainer_595lsy > .itemTemplateLabel_dqr75c");
	public static By Notes= By.cssSelector(".appmagic-textbox > input[title='Note']");
	public static By Description= By.cssSelector(".appmagic-textbox > textarea[title='Description']");
	public static By ClickSaveBtn= By.cssSelector("div:nth-of-type(35) button > .appmagic-button.center.middle");
	public static By Projecttabhr= By.cssSelector("div:nth-of-type(4) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");

	
	public static By SelecteditchargeProject= By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[16]/div[@class='appmagic-borderfill-container']//div[@role='list']//div[@class='react-gallery-items-window']/div[5]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[2]//div[@class='react-knockout-control']/div");
	public static By SelectChargeCode =By.cssSelector(".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon");
	public static By SelectEditPencil= By.cssSelector(".canvasContentDiv.container_15kk9bh > div > div:nth-of-type(12) .powerapps-icon");
	public static By SelectActivity= By.cssSelector("div:nth-of-type(3) > .appmagic-borderfill-container  .appmagic-typed-card.card_c5uw0h > div:nth-of-type(3) div[role='button'] > div:nth-of-type(1)");
	public static By ChooseEditActivityType= By.cssSelector("li:nth-of-type(4) > .itemTemplateContainer_595lsy");
	public static By SelectEditTask= By.cssSelector("div:nth-of-type(4) > .appmagic-borderfill-container  .appmagic-typed-card.card_c5uw0h > div:nth-of-type(3) div[role='button'] > div:nth-of-type(1)");
	public static By ChooseTaskType= By.cssSelector("li:nth-of-type(3) > .itemTemplateContainer_595lsy > .itemTemplateLabel_dqr75c");
	public static By SelectDescription= By.cssSelector(".appmagic-textbox > textarea[title='Description']");
	public static By SelectNotes= By.cssSelector(".appmagic-textbox > textarea[title='Note']");
	public static By SelectSaveBtn= By.cssSelector("[data-control-id='625'] [touch-action]");
	public static By SelectCancelBtn= By.cssSelector(".canvasContentDiv.container_gfluoe > div > div:nth-of-type(9) button > .appmagic-button.center.middle");

	public static By SelectDeleteChargeProject= By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[16]/div[@class='appmagic-borderfill-container']//div[@role='list']//div[@class='react-gallery-items-window']/div[6]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[2]//div[@class='react-knockout-control']/div");
	public static By SelectDeleteChargeCodeBtn= By.cssSelector(".canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(7) .powerapps-icon");
	public static By ConfirmYesBtn=By.cssSelector("[data-control-id='1117'] [touch-action]");
	public static By ConfirmNoBtn=By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[7]/div/div/div[37]//button/div");
	 

}
