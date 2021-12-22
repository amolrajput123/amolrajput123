package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ObjectRepo.MarketingObjectRepo;

public class MarketingPage extends MarketingObjectRepo{
	WebDriver driver;
	public MarketingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String verifyBrowserTitle() {
		return driver.getTitle();

}
	public void verifyMarketingList(){
		ArrayList<String>ExpectedHeaders=new ArrayList<String>();
		ExpectedHeaders.add("Create Campaign");
		ExpectedHeaders.add("Web Lead Form");
		ExpectedHeaders.add("Web Tracker");
		ExpectedHeaders.add("Anonymous Contacts");
		ExpectedHeaders.add("Fingerprints");
	ArrayList<String>actualHeaders=new ArrayList<String>();
	java.util.List<WebElement>headers=driver.findElements(By.tagName("open"));
		for(WebElement element : headers ){
			String value =element.getText();
			actualHeaders.add(value); 
	}

	}}