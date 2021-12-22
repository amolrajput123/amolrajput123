package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.ObjectRepo.AccountsObjectRepo;
import com.ObjectRepo.ActionsObjectRepo;
import com.Utility.DriverUtility;
import com.Utility.SelectUtility;

public class ActionsPage extends ActionsObjectRepo {
	WebDriver driver;

	public ActionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyTitle(WebDriver driver2) {
		String actTitle = driver.getTitle();
		String expTitle = "CRM Tech - Actions";
		if (actTitle.equals(expTitle))
			return true;
		else
			return false;
	}

	public boolean countAssignedToBySA() {
		List<WebElement> actList = assignedTo;
		int count = 0;
		for (WebElement list : actList) {
			if (list.getText().equals("System Administrator"))
				count++;
		}
		System.out.println(count);
		if (count == 1)
			return true;
		else
			return false;
	}

	public boolean countCompletedAction(WebDriver driver2) {
		allMyActionsLink.click();
		SelectUtility.selectbyText("Complete", showActionsDropDown);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = completeList.size();
		count = count - 1;
		System.out.println(count);
		if (count == 2)
			return true;
		else
			return false;
	}
	
	public boolean createNewActionAndVerify(){
		List<String>values= new ArrayList<String>();
		values.add("System Administrator");
		createActionLink.click();
		subjectInput.sendKeys("Create New Action Automation ");
		actionDescription.sendKeys("This is New purchase order  ");
		SelectUtility.selectbyText("None", assocationType);
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.CONTROL).build().perform();
		SelectUtility.selectMultipleValueByText(assignedToList, values);
		acts.release().build().perform();
		return false;
	}

	
	}

