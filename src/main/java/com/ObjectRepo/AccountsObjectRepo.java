package com.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsObjectRepo {
	
	@FindBy(xpath = "//span[text()='More']")
	public WebElement moreTab;

	@FindBy(xpath = "//ul[@class='open']//a[text()='Accounts']")
	public WebElement accountsLink;
	
	@FindBy(xpath ="//*[@id=module-action-menu]/ul/li[2]/a")
	public WebElement AccountCreate;
	
}
