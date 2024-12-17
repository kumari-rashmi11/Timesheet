	package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Interactions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void clickEle(Object target) {
		WebElement element;
		if(target instanceof By) {
			element = wait.until(ExpectedConditions.elementToBeClickable((By) target));
		} else if (target instanceof WebElement) {
			element = (WebElement) target;
		}else {
			throw new IllegalArgumentException("\"Invalid argument type. Must be By or WebElement.\"");
		}
		clickElement(element);
	}
	
	
	public void clickElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("Failed to click the element. Error: " + e.getMessage());
		}
	}
	
	public void switchToIframe(By locator) {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.switchTo().frame(iframe);
    }
	
	public WebElement visibilityEle(By locator) {
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void sendingKeys(By locator, String keyValue) {
	    WebElement element = visibilityEle(locator);
	    element.sendKeys(keyValue);
	}
	
	public String getText(By element) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return inputField.getText();
        } catch (Exception e) {
            System.out.println("Error while retrieving text from the element: " + element + " - " + e.getMessage());
            return null; // Returning null in case of an error
        }
    }
	
	public void dropdownSelector(By element) {
	
		WebElement selectedItem = wait.until(ExpectedConditions.elementToBeClickable(element));
        selectedItem.click();
	}
	
	public void executeWithDelay(Runnable action) {
        try {
            Thread.sleep(2000);
            action.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	
}
