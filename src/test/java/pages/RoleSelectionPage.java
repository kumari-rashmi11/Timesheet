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
   
    private By roleHRButton = By.xpath(
            "//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button");

    public RoleSelectionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToIframe() {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(iframeLocator));
        driver.switchTo().frame(iframe);
    }

    public void selectHRRole() {
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(roleHRButton));
        clickElement(button);
    }

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
