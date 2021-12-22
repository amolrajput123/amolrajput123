package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.Base.BaseClass;
import com.pages.ActionsPage;
import com.pages.LoginPage;

public class ActionsPageTest extends BaseClass {
	WebDriver driver;
	public ActionsPage ap;

	@BeforeSuite
	public void setUp() {
		driver = initialization();
		ap = new ActionsPage(driver);
		log.info("Driver is initialised");
		log.info("Login Page is Displayed");
		ap=new ActionsPage(driver).verifyTitle(driver).navigateToActionpage(driver);
	
		}

	@AfterSuite
	public void closebrswer() {
		driver.close();
		log.info("Driver closed");
	}
	@Test(priority=1)
	public void verfiyTitle(){
		Assert.assertTrue(ap.verifyTitle());
	}
	@Test(priority=2)
	public void verfiyCountOfSA(){
		Assert.assertTrue(ap.countAssignedToBySA());
	}
	@Test(priority=3)
	public void verfiyCompltedAction(){
		Assert.assertTrue(ap.countCompletedAction());
	}
}
