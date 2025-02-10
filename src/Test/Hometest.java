package Test;
 
import org.testng.annotations.Test;

import Page.Homepage;
 
 
public class Hometest {
    
    @Test(priority = 1)
    public void printMessage() {
    	Homepage obj = new Homepage();
        obj.printMessage();
    }
}

 
