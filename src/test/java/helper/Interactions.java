package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Interactions {

	WebDriver driver;
	WebDriverWait wait;

	public Interactions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void verifyText(By element, String expectedText) {
   	 
        
        for (int attempts = 0; attempts < 3; attempts++) {
       	    try {
       	    	
       	    	WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      	         	String acutalText = inputField.getText();
      	         	System.out.println("Actual Text: " + acutalText);
      	         	Assert.assertEquals(acutalText, expectedText, "Text in did not match expected value.");

       	        // Break the loop if no exception is thrown
       	        break;
       	    } catch (StaleElementReferenceException e) {
       	        // Retry locating and interacting with the element
       	        System.out.println("StaleElementReferenceException encountered. Retrying...");
       	    }
       	}
   }
	
	public void click(By element) {
		int retryCount = 3; // Number of retries
		int attempts = 0;
		boolean clicked = false;

		while (attempts < retryCount && !clicked) {
			try {
				WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
				clickableElement.click();
				clicked = true; // Successfully clicked
				System.out.println("Element clicked successfully: " + element);
			} catch (Exception e) {
				attempts++;
				System.out.println("Attempt " + attempts + " to click on " + element + " failed: " + e.getMessage());
				if (attempts == retryCount) {
					System.out.println("Failed to click on the element after " + retryCount + " attempts.");
				}
			}
		}
	}

	public void clickElement(Object target) {
		WebElement element;
		if (target instanceof By) {
			element = wait.until(ExpectedConditions.elementToBeClickable((By) target));
		} else if (target instanceof WebElement) {
			element = (WebElement) target;
		} else {
			throw new IllegalArgumentException("\"Invalid argument type. Must be By or WebElement.\"");
		}
		elementClick(element);
	}

	public void elementClick(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("Failed to click the element. Error: " + e.getMessage());
		}
	}

	public void enterText(By element, String text) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputField.sendKeys(text);
        } catch (Exception e) {
            System.out.println("Error while entering text in the element: " + element + " - " + e.getMessage());
        }
    }
	
	public void clearTextAndEnterText(By element, String newText) {
		try {
			WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			inputField.clear();
			inputField.sendKeys(newText);
		} catch (Exception e) {
			System.out.println(
					"Error while clearing and entering text in the element: " + element + " - " + e.getMessage());
		}
	}

	public void switchToIframe(By locator) {
		WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		driver.switchTo().frame(iframe);
	}

	public Boolean elementVisibility(By element) {
		try {
			return (element != null);
		} catch (Exception e) {
			System.out.println("Error while checking visibility of the element: " + element + " - " + e.getMessage());
			return false; // Return false if an error occurs
		}
	}

	public WebElement visibilityEle(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void sendingKeys(By locator, String keyValue) {
		WebElement element = visibilityEle(locator);
		element.clear();
		element.sendKeys(keyValue);
	}

	public void executeWithDelay(Runnable action) {
		try {
			Thread.sleep(500);
			action.run();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Restore the interrupted status
			System.out.println("Thread was interrupted: " + e.getMessage());
		}
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
	
	public String getInnerText(By locator) {
		String tabTitle = driver.findElement(locator).getText();
		return tabTitle;
	}

	public void sendKeysInt(By locator, int number) {
		WebElement element = visibilityEle(locator);
		element.clear();
		element.sendKeys(String.valueOf(number));
		element.sendKeys(Keys.ENTER);
	}

	public void selectFromDropdown(By dropdownElement, By optionElement) {
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownElement));
		dropdown.click();
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionElement));
		option.click();
	}
	
	public void scroll(By element) {
   	 try {
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement elementToReach = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            js.executeScript("arguments[0].scrollIntoView(true);", elementToReach);
        } catch (Exception e) {
            e.printStackTrace();
        }
   }

	public WebDriver getDriver() {
	    return this.driver;
	}
}
