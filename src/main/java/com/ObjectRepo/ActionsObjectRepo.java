package com.ObjectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionsObjectRepo {
	@FindBy(xpath = "//span[text()='More']")
	public WebElement moreTab;

	@FindBy(xpath = "//ul[@class='open']//a[text()='Actions']")
	public WebElement actionLink;

	@FindBy(xpath = "//a[@title='Clear Filters']")
	public WebElement clearFilter;

	@FindBy(xpath = "//a[@title='Columns']")
	public WebElement columns;

	@FindBy(xpath = "//a[@title='Auto-resize columns']")
	public WebElement autoResizeColumn;

	@FindBy(xpath = "//a[text()='Switch to List']")
	public WebElement switchToList;

	@FindBy(xpath = "//div[@class='portlet-content']//a[text()='All My Actions']")
	public WebElement allMyActionsLink;

	@FindBy(xpath = "//div[@class='portlet-content']//a[text()='Create Action']")
	public WebElement createActionLink;

	@FindBy(xpath = "//select[@id='dropdown-show-actions']")
	public WebElement showActionsDropDown;

	@FindBy(xpath = "//tr//td[10]")
	public List<WebElement> completeList;

	@FindBy(xpath = "//tr//td[11]")
	public List<WebElement> assignedTo;

	@FindBy(xpath = "//input[@title='Subject']")
	public WebElement subjectInput;

	@FindBy(xpath = "//textarea[@title='Description']")
	public WebElement actionDescription;

	@FindBy(xpath = "//select[@id='Actions_associationType']")
	public WebElement assocationType;

	@FindBy(xpath = "//select[@title='Assigned To']")
	public WebElement assignedToList;

	@FindBy(xpath = "//input[@title='Due Date']")
	public WebElement dueDate;

	@FindBy(xpath = "//input[@class='checkbox-column-checkbox']")
	public List<WebElement> checkbox;

	@FindBy(xpath = "//input[@title='Due Date']")
	public WebElement dueDate4;

	@FindBy(xpath = "//input[@title='Due Date']")
	public WebElement dueDate5;

	@FindBy(xpath = "dyutyu")
	public List<WebElement> d7;
}
