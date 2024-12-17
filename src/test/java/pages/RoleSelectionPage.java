package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RoleSelectionPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By iframeLocator = By.id("fullscreen-app-host");
   
    
    //ROLES SELECTORS
    
//  private By roleHRButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button");
           
//    private By rolePLButton = By.cssSelector("//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/button");
    
//    private By roleEditorButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/button");

//  private By roleViewerButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button");
      
  public By roleRLButton = By.cssSelector("//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/button");
    
    private By timeSheet_QA = By.cssSelector("#\\31 9\\:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1\\@thread\\.tacv2 > span > div > div > div.fui-Flex.___qj3tpe0.f22iagw.f1a3p1vp");
    
    private By timeSheetGeneral = By.xpath("//*[@id=\"channel-19:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1@thread.tacv2-19:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1@thread.tacv2\"]/a");
    
    private By timeSheetTab = By.xpath("//*[@id=\"tab::b4f5eb53-5d7d-47e6-87da-dae0338d347c\"]/span[1]/div/div");
    
    public RoleSelectionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    

    public void switchToIframe() {
    	
    	WebElement teams = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"2a84919f-59d8-4441-a975-2a8c2643b741\"]")));
        teams.click();
        
        if(wait.until(ExpectedConditions.presenceOfElementLocated(timeSheetGeneral)) != null) {
       	 WebElement general = wait.until(ExpectedConditions.presenceOfElementLocated(timeSheetGeneral));
            general.click();
        }
        else {
       	 WebElement timesheetQA = wait.until(ExpectedConditions.presenceOfElementLocated(timeSheet_QA));
            timesheetQA.click();
            
            WebElement general = wait.until(ExpectedConditions.presenceOfElementLocated(timeSheetGeneral));
            general.click();
        }
       
        
        WebElement timesheetTab = wait.until(ExpectedConditions.elementToBeClickable(timeSheetTab));
        timesheetTab.click();
   	 WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cacheable-iframe:a6b63365-31a4-4f43-92ec-710b71557af9")));
        driver.switchTo().frame(iframe);

        WebElement iframe2 = wait.until(ExpectedConditions.presenceOfElementLocated(iframeLocator));
        driver.switchTo().frame(iframe2);

    }
    
    
    public void iframeSwitch1() {
    	WebElement iframe1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cacheable-iframe:a6b63365-31a4-4f43-92ec-710b71557af9")));
         driver.switchTo().frame(iframe1);
    }
    public void iframeSwitch2() {
    	WebElement iframe2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fullscreen-app-host")));
         driver.switchTo().frame(iframe2);
    }
    
    //METHODS FOR ROLES SELECTORS
    
//    public void selectHRRole() {
//        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(roleHRButton));
//        clickElement(button);
//    }
    
//    	public void selectPLRole() {
//    		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(rolePLButton));
//    		clickElement(button);
//    	}
//    
//	    public void selectEditorRole() {
//			WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(roleEditorButton));
//		clickElement(button);
//		}
	    
//	    public void selectViewerRole() {
//			WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(roleViewerButton));
//		clickElement(button);
//		}
    
	    public void selectRLRole() {
			WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(roleRLButton));
		clickElement(button);
		}
	
    
    
    
    //end
    
    private void clickElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            System.out.println("Failed to click the button. Error: " + e.getMessage());
        }
    }
}
