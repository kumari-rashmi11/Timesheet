package pages;

import org.openqa.selenium.WebDriver;

import helper.Interactions;
import utils.DashboardLocators;

public class DashboardPage {
	private Interactions clickingHelper;
	private DashboardLocators locator;
    
    // Constructor
    public DashboardPage(WebDriver driver) {
        this.clickingHelper = new Interactions(driver);
        this.locator = new DashboardLocators();
    }

    // Methods to navigate to the Dashboard for HR
    public void navigateToDashboard_HR() {
        clickingHelper.clickElement(this.locator.dashboardButton);
    }

    public void clickGreenRlButton_HR() {
        clickingHelper.clickElement(this.locator.greenrl);
    }

    public void clickPurplePlButton_HR() {
        clickingHelper.clickElement(this.locator.purplepl);
    }

    public void clickBlackUserButton_HR() {
        clickingHelper.clickElement(this.locator.blackuser);
    }
    
    
    
    // Methods to navigate to the PL Dashboard
    public void navigateToDashboard_PL() {
        clickingHelper.clickElement(this.locator.Leaddb);
    }	
    
    public void clickreportee_PL() {
        clickingHelper.clickElement(this.locator.edreportee);
    }
    
    public void reportee_PL() {
        clickingHelper.clickElement(this.locator.reporteePL);
    }
    
    public void switchoff_PL() {
        clickingHelper.clickElement(this.locator.switchoffPL);
    }
    
    public void switchon_PL() {
        clickingHelper.clickElement(this.locator.switchonPL);
    }
    public void clickyeardd_PL() {
    	  clickingHelper.clickElement(this.locator.yeardropdown);
      }
    public void rightarrow_PL() {
   	 clickingHelper.clickElement(this.locator.rightarrowPL);
    }
   
    public void approvebtn_PL() {
   	 clickingHelper.clickElement(this.locator.approvebtnPL);
    }
    public void repdd_PL() {
      	 clickingHelper.clickElement(this.locator.repddPL);
    }

    public void repname_PL() {
     	 clickingHelper.clickElement(this.locator.repnamePL);
   }
    
    public void filterbtn_PL() {
        clickingHelper.clickElement(this.locator.filterbtnPL);
    }
       
    public void notstartedyet_PL() {
    	 System.out.println(clickingHelper.getText(this.locator.notstartedyet));
    }
    public void consumedhrs_PL() {
   	 System.out.println(clickingHelper.getText(this.locator.consumedhrs));
   }
    
    
    
    // Methods to navigate to the Viewer Dashboard
    public void navigateToDashboard_Viewer() {
        clickingHelper.clickElement(this.locator.adminViewer);
    }

    public void clickreportee_Viewer() {
        clickingHelper.clickElement(this.locator.clickreporteeViewer);
    }
//    public void clickreporteeViewer_Viewer() {
//        clickingHelper.clickElement(this.locator.clickreporteeViewer);
//    }
    
    public void clickGreenRlButton_Viewer() {
        clickingHelper.clickElement(this.locator.greenrl);
    }

    public void clickPurplePlButton_Viewer() {
        clickingHelper.clickElement(this.locator.purplepl);
    }

    public void blackuser_Viewer() {
        clickingHelper.clickElement(this.locator.blackuserViewer);
    }
    
    public void switchoff_Viewer() {
        clickingHelper.clickElement(this.locator.switchoffViewer);
    }
    
    public void switchon_Viewer() {
        clickingHelper.clickElement(this.locator.switchonViewer);
    }
    
    public void allclients_Viewer() {
	 	System.out.println(clickingHelper.getText(this.locator.allclients));
    }
    
    public void claimedtask_Viewer() {
	 	System.out.println(clickingHelper.getText(this.locator.claimedtask));
    }

    public void clickyeardd_Viewer() {
  	  clickingHelper.clickElement(this.locator.yeardropdown_Viewer);
    }
    
    public void chooseyear_Viewer() {
    	  clickingHelper.clickElement(this.locator.chooseyear);
      }
    
    
    public void repdd_Viewer() {
   	 clickingHelper.clickElement(this.locator.repddViewer);
    }

    public void repname_Viewer() {
   	 clickingHelper.clickElement(this.locator.repnameViewer);
    }
    
    public void filterbtn_Viewer() {
      	 clickingHelper.clickElement(this.locator.filterbtn);
    }
    
    public void notstartedyet_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.notstartedyetViewer));
   }
    
    public void draft_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.draft));
   }
    
    public void Submitted_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.Submitted));
   }
    
    public void Partially_Submitted_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.Partially_Submitted));
   }
    
    public void Approved_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.Approved));
   }
    
    public void Partially_Approved_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.Partially_Approved));
   }
    
    public void Rejected_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.Rejected));
   }
    
    public void submittedtimesheet_Viewer() {
   	 	System.out.println(clickingHelper.getText(this.locator.submittedtimesheet));
   }
    
    
    // Method to navigate to the Editor Dashboard
    public void navigateToDashboard_Editor() {
        clickingHelper.clickElement(this.locator.admindb);
    }

    public void clickreportee_Editor() {
        clickingHelper.clickElement(this.locator.edreportee);
    }
    
    public void clickGreenRlButton_Editor() {
        clickingHelper.clickElement(this.locator.greenrl);
    }

    public void clickPurplePlButton_Editor() {
        clickingHelper.clickElement(this.locator.purplepl);
    }

    public void clickBlackUserButton_Editor() {
        clickingHelper.clickElement(this.locator.blackuser);
    }
    
    public void clickswitchon_Editor() {
        clickingHelper.clickElement(this.locator.switchon);
    }
    
    public void clickswitchoff_Editor() {
        clickingHelper.clickElement(this.locator.switchoff);
    }
    
     public void clickyeardd_Editor() {
    	  clickingHelper.clickElement(this.locator.yeardropdown);
      }
     
     public void rightarr_Editor() {
    	 clickingHelper.clickElement(this.locator.rightarrow);
     }
    
     public void approvbtn_Editor() {
    	 clickingHelper.clickElement(this.locator.approvebtn);
     }
    
     public void reporteedd_Editor() {
    	 clickingHelper.clickElement(this.locator.repdd);
     }

     public void reporteename_Editor() {
    	 clickingHelper.clickElement(this.locator.repname);
     }
     
     public void reporteefilter_Editor() {
    	 clickingHelper.clickElement(this.locator.filter);
     }
     
     public void notification_Editor() {
    	 clickingHelper.clickElement(this.locator.notify);
     }
     
     public void refreshh_Editor() {
    	 clickingHelper.clickElement(this.locator.refresh);
     }
     
     public void aprovnotify_Editor() {
    	 clickingHelper.clickElement(this.locator.approvenotify);
     }
     
     public void reject_Editor() {
    	 clickingHelper.clickElement(this.locator.rejectbtn);
     }
     
     public void closebtn_Editor() {
    	 clickingHelper.clickElement(this.locator.close);
     }
     
     public void reporteeydd_Editor() {
    	 clickingHelper.clickElement(this.locator.repyy);
     }
     
     public void notstartedyet_Editor() {
    	 	System.out.println(clickingHelper.getText(this.locator.notstartedyet));
    }
     
    public void repdd_Editor() {
       	 clickingHelper.clickElement(this.locator.repddViewer);
    }

    public void repname_Editor() {
       	 clickingHelper.clickElement(this.locator.repnameViewer);
    }
    
    
    // Methods to navigate to the RL Dashboard
       public void navigateToDashboard_RL() {
    	   clickingHelper.clickElement(this.locator.admindb);
       }
	    public void clickswitchon_RL() {
	        clickingHelper.clickElement(this.locator.switchonRL);
	    }
	    
	    public void clickswitchoff_RL() {
	        clickingHelper.clickElement(this.locator.switchoffRL);
	    }
	    
	    public void clickyeardd_RL() {
	  	  clickingHelper.clickElement(this.locator.yeardropdown);
	    }
	  public void rightarrow_RL() {
	 	 clickingHelper.clickElement(this.locator.rightarrowPL);
	  }
	 
	  public void approvebtn_RL() {
	 	 clickingHelper.clickElement(this.locator.approvebtnPL);
	  }
	  public void repdd_RL() {
	    	 clickingHelper.clickElement(this.locator.repddPL);
	  }
	
	  public void repname_RL() {
	   	 clickingHelper.clickElement(this.locator.repnamePL);
	 }
	  
	  public void filterbtn_RL() {
	      clickingHelper.clickElement(this.locator.filterbtnPL);
	  }
	     
	  public void notstartedyet_RL() {
	  	 System.out.println(clickingHelper.getText(this.locator.notstartedyet));
	  }
	  public void consumedhrs_RL() {
	 	 System.out.println(clickingHelper.getText(this.locator.consumedhrs));
	 }
	  
	  public void financialdd_RL() {
	      clickingHelper.clickElement(this.locator.finandd);
	  }
	  
	  public void yearr_RL() {
	      clickingHelper.clickElement(this.locator.year);
	  }
	  
	  public void calculate_RL() {
	      clickingHelper.clickElement(this.locator.calculatebtn);
	  }
	  public void approvbtn_RL() {
	    	 clickingHelper.clickElement(this.locator.approvebtn);
	     }

	  public void reporteename_RL() {
	    	 clickingHelper.clickElement(this.locator.repname);
	     }
	  
	  public void reporteeydd_RL() {
	    	 clickingHelper.clickElement(this.locator.repyy);
	     }
}
