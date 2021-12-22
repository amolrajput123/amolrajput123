 package com.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsObjectRepo {
 
	@FindBy(xpath = "//*[@id='module-action-menu']/ul/li[1]/a")
	public WebElement moreTab;

	@FindBy(xpath = "//*[@id='contactsgridC_gvCheckbox_1']")
	public WebElement checkbox;

	@FindBy(xpath = "//*[@id=marketinggridC_gvCheckbox_0]")
	public WebElement lists;

}
