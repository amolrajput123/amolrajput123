package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ObjectRepo.ServiceObjectRepo;

public class ServicePage extends ServiceObjectRepo{
		WebDriver driver;

	public ServicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle(WebDriver driver2) {
		String actTitle = driver.getTitle();
		String expTitle = "Service Cases";
  System.out.println("actTitlle");
}}