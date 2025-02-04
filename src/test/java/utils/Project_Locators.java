package utils;

import org.openqa.selenium.By;

public class Project_Locators {

   
	public static By ProjectTabBtn_PL = By.xpath("//div[text()='Projects']");
    
	public static By ProjectTabBtn_Editor = By.xpath("//div[@data-control-name='Navigation_Gallery']//div[@aria-posinset='3']");
    
	public static By AddProjectButton_Editor = By.xpath("//div[contains(text(), 'Add')]//ancestor::button");
    
	public static By ProjectNameInputText_Editor = By.xpath("//input[@appmagic-control='ProjectAddProjtextbox']");
    
	public static By SelectClient_Editor = By.xpath("//div[@role='button']/div[2]");
    
	public static By NotesInputText_Editor = By.xpath("//input[@title='Notes']");

	public static By DescriptionInputText_Editor = By.xpath("//textarea[@title='Description']");

	public static By SaveProjectBtn_Editor = By.xpath("//div[contains(text(), 'Add')]//ancestor::button");
    
    public static By searchInputSelector_Editor_Hr = By.xpath("//input[@title='Search by Name']");
    
	public static By clearButtonSelector_Editor_Hr = By.xpath("//div[@data-control-name='Icon16_3']");	
	
    public static By SelectProject1_Editor = By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='Icon12']");
    ////div[@data-control-name='Icon12']
    public static By SelectPencil_Editor = By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='Icon1_16']");    
   
    public static By EditProjectDescription = By.xpath("//input[@title='Description']");
    
    public static By EditPojectNotes = By.xpath("//input[@title='Notes']");
    
    public static By SaveEditProject = By.xpath("//div[contains(text(), 'Save')]//ancestor::button");
        
	public static By SelectDeleteProjectBtn=By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='Icon3_9']");
     
	public static By SelectChargeCodeBtn= By.xpath("//div[contains(text(), 'Create Charge code')]//ancestor::button");
	
	public static By SelectChargeType= By.xpath("//div[2]//div[@class='appmagic-typed-card card_c5uw0h']/div[3]//div[@role='button']");
	
	public static By SelectActivityType= By.xpath("//div[3]//div[@class='appmagic-typed-card card_c5uw0h']/div[3]//div[@role='button']"); 
	
	public static By SelectTask= By.xpath("//div[4]//div[@class='appmagic-typed-card card_c5uw0h']/div[3]//div[@role='button']");
		
	public static By Notes= By.xpath("//input[@title='Note']");
	
	public static By Description= By.xpath("//textarea[@title='Description']");
	
	public static By ClickSaveBtn= By.xpath("//div[contains(text(), 'Save')]//ancestor::button");
	
	public static By Projecttabhr= By.xpath("//div[@data-control-name='Navigation_Gallery']//div[@aria-posinset='4']");

	//public static By SelecteditchargeProject= By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[16]/div[@class='appmagic-borderfill-container']//div[@role='list']//div[@class='react-gallery-items-window']/div[5]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[2]//div[@class='react-knockout-control']/div");
    
	///public static By SelectDeleteChargeProject= By.xpath("//div[@id='publishedCanvas']/div/div[@class='app-canvas']/div[5]/div/div/div[16]/div[@class='appmagic-borderfill-container']//div[@role='list']//div[@class='react-gallery-items-window']/div[6]/div[@class='canvasContentDiv container_1vt1y2p']/div/div[2]//div[@class='react-knockout-control']/div");
	
	public static By ConfirmYesBtn_Editor=By.xpath("//div[contains(text(), 'Yes')]//ancestor::button");
	
    public static By ConfirmNoBtn_Editor=By.xpath("//div[contains(text(), 'No')]//ancestor::button");
	
	//public static By backBtn_Editor=By.xpath("//div[@data-control-id='285']");

	public static By editClient_Editor=By.xpath("//div[@role='button']/div[2]");

}