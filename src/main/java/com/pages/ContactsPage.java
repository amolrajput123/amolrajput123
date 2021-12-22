package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.ObjectRepo.ContactsObjectRepo;

public class ContactsPage extends ContactsObjectRepo {
	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyList() {
		ArrayList<String>ExpectedHeaders=new ArrayList<String>();
		ExpectedHeaders.add("All Contacts");
		ExpectedHeaders.add("Lists");
		ExpectedHeaders.add("Create Contact");
		ExpectedHeaders.add("Create List");
		ExpectedHeaders.add("View Contact Map");
		ExpectedHeaders.add("Saved Maps");
	ArrayList<String>actualHeaders=new ArrayList<String>();
	java.util.List<WebElement>headers=driver.findElements(By.tagName("open"));
		for(WebElement element : headers ){
			String value =element.getText();
			actualHeaders.add(value); 
}
		return false;
		
	}

	public boolean createcontact() {
		String expTitle="Create Contact";
		String actTitle=driver.getTitle();
		if (actTitle.equals(expTitle))
			return true;
		else
			return false;
	
	}

	public boolean MoreTab() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkbox() {
		// TODO Auto-generated method stub
		return false;
	}

}
