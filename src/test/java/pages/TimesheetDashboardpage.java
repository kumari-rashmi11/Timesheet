package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimesheetDashboardpage {


    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public TimesheetDashboardpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }
    

    public void navigateToDashboard() {
    	
    	WebElement dashboard = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[4]/div/div/div[9]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button\r\n"
    			)));
    			
    	dashboard.click();
    }
    	
    	
    
    public void toggleBetweenThisMonthAndThisWeek() {
        // Locator for the toggle button
        By toggleButtonLocator = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[4]/div/div/div[8]/div/div/div/div/div/div/div/div/div/div/div/div[6]/div/div/div/div/div[2]/div[3]"); 

        // Click on "This Month"
        WebElement thisMonthButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(6) > div > div > div > div > div.appmagic-toggleSwitch.no-focus-outline.left > div.appmagic-toggleSwitch-on")));
        thisMonthButton.click();
        
        // Click on "This Week"
        WebElement thisWeekButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(8) > div > div > div > div > div > div > div > div > div > div > div > div:nth-child(6) > div > div > div > div > div.appmagic-toggleSwitch.no-focus-outline.left > div.appmagic-toggleSwitch-off")));
        thisWeekButton.click();
        
    }
    
    public void testNotificationIcon() {
        // Locator for the notification icon button
        By notificationIconLocator = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(7)"); 

        // Wait for the notification icon button to be clickable
        WebElement notificationIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(7)")));
        
        // Click the notification icon
        notificationIcon.click();
        

    }
    
}
