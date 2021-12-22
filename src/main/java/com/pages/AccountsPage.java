package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.ObjectRepo.AccountsObjectRepo;
import com.Utility.Actionutility;

public class AccountsPage extends AccountsObjectRepo {
	WebDriver driver;
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean verifyTitle() {
		String actTitle = driver.getTitle();
		String expTitle = "x2-gridview-page-title";
		if (actTitle.equals(expTitle))
			return true;
		else
			return false;
	}
	public  void verifyAccountList(WebDriver driver) {
		ArrayList<String>ExpectedHeaders=new ArrayList<String>();
		ExpectedHeaders.add("Create Account");
		ExpectedHeaders.add("Lists");
		ExpectedHeaders.add("Create List");
		ExpectedHeaders.add("Accounts Report");
	ArrayList<String>actualHeaders=new ArrayList<String>();
	java.util.List<WebElement>headers=driver.findElements(By.tagName("open"));
		for(WebElement element : headers ){
			String value =element.getText();
			actualHeaders.add(value); 
}
}}