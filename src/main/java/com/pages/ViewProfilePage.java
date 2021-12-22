package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ObjectRepo.ViewProfilePageObjectRepo;
import com.Utility.Actionutility;
import com.Utility.DriverUtility;



public class ViewProfilePage  extends ViewProfilePageObjectRepo{
	WebDriver driver;
	public ViewProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AccountsPage navigateToAccountsPage(WebDriver driver) {
		Actionutility.moveAndClickElement(moreTab);
		DriverUtility.elementToBeClickable(actionLink);
		actionLink.click();
		return new AccountsPage(driver);
	}
	
	public ActionsPage navigateToActionsPage(WebDriver driver) {
		Actionutility.moveAndClickElement(moreTab);
		DriverUtility.elementToBeClickable(actionLink);
		actionLink.click();
		return new ActionsPage(driver);
	}
	

}
