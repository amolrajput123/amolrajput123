package com.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceObjectRepo {
	@FindBy(xpath = "//*[@id=module-action-menu]/a")
	public WebElement ServiceTab;
	@FindBy(xpath = "//*[@id=x2-gridview-page-title]/h2")
	public WebElement ServicePage;
	
}
