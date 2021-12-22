package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ObjectRepo.LoginObjectRepo;
import com.Utility.Actionutility;

public class LoginPage extends LoginObjectRepo {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String verifyBrowserTitle() {
		return driver.getTitle();

	}
	public ViewProfilePage verifyValidLogin(WebDriver driver) {
		Actionutility.clearText(userEmail);
		Actionutility.clearText(userPass);
		Actionutility.typeIn(userEmail, "admin");
		Actionutility.typeIn(userPass, "pass");
		Actionutility.click(btn);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actionutility.click(btn);
		return new ViewProfilePage(driver);
	}
	
}
