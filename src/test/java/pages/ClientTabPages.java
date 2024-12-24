package pages;

import org.openqa.selenium.WebDriver;
import helper.Interactions;
import utils.ClientTabLocators;

public class ClientTabPages {
    private Interactions interactions;
    private ClientTabLocators locators;
    public ClientTabPages(WebDriver driver) {
        this.interactions = new Interactions(driver);
        this.locators = new ClientTabLocators();
    }

    public boolean TC_022_addClient_Editor(String clientName) {
        try {
        	interactions.click(this.locators.clientsTab);
            interactions.click(this.locators.addClientButton);
            interactions.enterText(this.locators.inputClientNameField, clientName);
            Thread.sleep(2000);
            interactions.click(this.locators.saveClientButton);
            System.out.println("Client added successfully: " + clientName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_023_editClientDetails_Editor(String newClientName, String status) {
        try {
        	interactions.click(this.locators.clientsTab);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.editClientButtonSelector);

            interactions.enterText(this.locators.editclientInputSelector, newClientName);

            interactions.click(this.locators.editstatusButtonSelector);
            if (status.equalsIgnoreCase("active")) {
                interactions.click(this.locators.editActiveSelector);
            } else {
                interactions.click(this.locators.editinActiveSelector);
            }

            interactions.click(this.locators.editSaveButtonSelector);
            System.out.println("Client details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing client details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_024_deleteClient_Editor(boolean confirmDelete, String clientName) {
    	//TC_025
        try {
        	TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.clientNameSelector);        
            interactions.click(this.locators.clientDeleteButton);

            if (confirmDelete) {
                interactions.click(this.locators.clientDeleteyesButtonSelector);
                System.out.println("Client successfully deleted: " + clientName);
            } else {
                interactions.click(this.locators.clientDeletenoButtonSelector);
                System.out.println("Client deletion canceled for: " + clientName);
            }
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while trying to delete the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_026_searchClientByName_Editor(String clientName) {
        try {
            interactions.click(this.locators.clientsTab);
            interactions.clearTextAndEnterText(this.locators.searchInputSelector, clientName);
            System.out.println("Client Searched"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while searching for the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_027_refreshButton_Editor(String clientName) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.refreshButton);
            System.out.println("Refresh button working"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while refreshing the client list.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_279_addProjectButtonVisibility_Editor(String clientName) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.elementVisibility(this.locators.addProjectButtonSelector);
            System.out.println("Add project button visibility"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while checking the visibility of the add project button.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_285_addProjectForClient(String clientName,String projectName, String description, String notes) {
        try {
        	 TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.addProjectButtonSelector);
            interactions.enterText(this.locators.projectNameInputSelector, projectName);
            interactions.enterText(this.locators.descriptionInputElement, description);
            interactions.enterText(this.locators.notesInputElement, notes);
            Thread.sleep(2000);
            interactions.click(this.locators.saveProjectButtonSelector);
            System.out.println("Project added successfully: " + projectName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the project: " + projectName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_286_editClientProjectTest_Editor(String newProjectName, String newDescription, String newNotes, String clientName, String newClientName) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.projectElement);

            interactions.click(this.locators.editButtonElement);
//            interactions.click(this.locators.clientDropdownList);
//            interactions.selectFromDropdown(this.locators.dropDownListOfclients, newClientName);

            interactions.enterText(this.locators.descriptionElement, newDescription);
            interactions.enterText(this.locators.notesElement, newNotes);

            interactions.click(this.locators.saveButtonElement);
            System.out.println("Project details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing the project details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_287_deleteProject_Editor(String clientName,char deleteFlag) {
        try {
        	 TC_026_searchClientByName_Editor(clientName);
             interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.deleteProjectButton);

            if (deleteFlag == 'N') {
                interactions.click(this.locators.deleteNoButton);
            } else {
                interactions.click(this.locators.deleteYesButton);
            }
            System.out.println("Project deletion action completed.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while deleting the project.");
            e.printStackTrace();
            return false;
        }
    }
    
    public void navigateToClientsTab_HR() {
    	try {
	    	this.interactions.click(this.locators.clientsTab_HR);
	    	Thread.sleep(3000);
	    	
    	}
    	catch(Exception e) {
    		System.err.println("Error while navigating to client tab");
            e.printStackTrace();
 
    	}
    }
    
    public boolean TC_026_searchClientByName_HR(String clientName) {
        try {
        	navigateToClientsTab_HR();
        	interactions.clearTextAndEnterText(this.locators.searchInputSelector, clientName);
            System.out.println("Client Searched"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while searching for the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean TC_027_refreshButton_HR(String clientName) {
        try {
            TC_026_searchClientByName_HR(clientName);
         
            interactions.click(this.locators.refreshButton);
            Thread.sleep(2000);
            System.out.println("Refresh button working"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while refreshing the client list.");
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean viewClientDetails_HR(String clientName) {
    	try{
    		 TC_026_searchClientByName_HR(clientName);
            interactions.click(this.locators.clientsDiv);
    		return true;
    	}catch(Exception e) {
    		 System.err.println("Error while viewing client details");
	            e.printStackTrace();
	            return false;
    	}
    }
    
    public boolean viewProjectDetails_HR(String clientName) {
        try {
        	viewClientDetails_HR(clientName);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.projectElement);	            
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while checking client details");
            e.printStackTrace();
            return false;
        }
    }
    
    public void navigateToClientTab_PL() {
    	try {
    		interactions.click(this.locators.clientTab_PL);
    	}
    	catch(Exception e) {
    		System.err.println(e.getMessage());
            e.printStackTrace();
    	}
    }
    
    public boolean TC_022_addClient_PL(String clientName) {
        try {
        	navigateToClientTab_PL();
        	interactions.click(this.locators.addClientButton);
        	interactions.enterText(this.locators.inputClientNameField, clientName);
            Thread.sleep(2000);
            interactions.click(this.locators.saveClientButton);
            System.out.println("Client added successfully: " + clientName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean TC_023_editClientDetails_PL(String newClientName, String status) {
        try {
        	navigateToClientTab_PL();
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.editClientButtonSelector);

            interactions.enterText(this.locators.editclientInputSelector, newClientName);

            interactions.click(this.locators.editstatusButtonSelector);
            if (status.equalsIgnoreCase("active")) {
                interactions.click(this.locators.editActiveSelector);
            } else {
                interactions.click(this.locators.editinActiveSelector);
            }

            interactions.click(this.locators.editSaveButtonSelector);
            System.out.println("Client details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing client details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_024_deleteClient_PL(boolean confirmDelete, String clientName) {
    	//TC_025
        try {
        	TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.clientNameSelector);        
            interactions.click(this.locators.clientDeleteButton);

            if (confirmDelete) {
                interactions.click(this.locators.clientDeleteyesButtonSelector);
                System.out.println("Client successfully deleted: " + clientName);
            } else {
                interactions.click(this.locators.clientDeletenoButtonSelector);
                System.out.println("Client deletion canceled for: " + clientName);
            }
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while trying to delete the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_026_searchClientByName_PL(String clientName) {
        try {
        	navigateToClientTab_PL();
            interactions.clearTextAndEnterText(this.locators.searchInputSelector, clientName);
            System.out.println("Client Searched"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while searching for the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_027_refreshButton_PL(String clientName) {
        try {
            TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.refreshButton);
            System.out.println("Refresh button working"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while refreshing the client list.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_279_addProjectButtonVisibility_PL(String clientName) {
        try {
            TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.elementVisibility(this.locators.addProjectButtonSelector);
            System.out.println("Add project button visibility"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while checking the visibility of the add project button.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_285_addProjectForClient_PL(String clientName,String projectName, String description, String notes) {
        try {
        	 TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.addProjectButtonSelector);
            interactions.enterText(this.locators.projectNameInputSelector, projectName);
            interactions.enterText(this.locators.descriptionInputElement, description);
            interactions.enterText(this.locators.notesInputElement, notes);
            Thread.sleep(2000);
            interactions.click(this.locators.saveProjectButtonSelector);
            System.out.println("Project added successfully: " + projectName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the project: " + projectName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_286_editClientProjectTest_PL(String newProjectName, String newDescription, String newNotes, String clientName, String newClientName) {
        try {
            TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.projectElement);

            interactions.click(this.locators.editButtonElement);
//            interactions.click(this.locators.clientDropdownList);
//            interactions.selectFromDropdown(this.locators.dropDownListOfclients, newClientName);

            interactions.enterText(this.locators.descriptionElement, newDescription);
            interactions.enterText(this.locators.notesElement, newNotes);

            interactions.click(this.locators.saveButtonElement);
            System.out.println("Project details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing the project details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_287_deleteProject_PL(String clientName,char deleteFlag) {
        try {
        	 TC_026_searchClientByName_PL(clientName);
             interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.deleteProjectButton);

            if (deleteFlag == 'N') {
                interactions.click(this.locators.deleteNoButton);
            } else {
                interactions.click(this.locators.deleteYesButton);
            }
            System.out.println("Project deletion action completed.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while deleting the project.");
            e.printStackTrace();
            return false;
        }
    }
}
