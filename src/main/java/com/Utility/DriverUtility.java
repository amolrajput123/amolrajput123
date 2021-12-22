package com.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Base.BaseClass;

public class DriverUtility extends BaseClass {

	public void waitForElement(WebElement element) {
		log.info("waiting for an element");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void elementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForTitleVisible(String string) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(string));
	}

	public void switchToFrameById(String id) {
		driver.switchTo().frame(id);
	}

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToWindow(String id) {
		driver.switchTo().window(id);
	}
}
