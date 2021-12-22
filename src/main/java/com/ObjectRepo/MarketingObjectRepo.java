package com.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketingObjectRepo {
	@FindBy(xpath = "//*[@id=module-action-menu]/a")
	public WebElement moreTab;

	@FindBy(xpath = "//*[@id=module-action-menu]/ul/li[1]/a")
	public WebElement actionLink;

}
