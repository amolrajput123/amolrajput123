package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.ObjectRepo.ContactsObjectRepo;
import com.pages.AccountsPage;
import com.pages.ContactsPage;
import com.pages.LoginPage;

public class ContactsPageTest extends BaseClass{
	WebDriver driver;
	 public ContactsPage cp;
	@BeforeSuite
	public void setUp() {
		driver = initialization();
		cp = new ContactsPage(driver);
		log.info("Driver is initialised");
		log.info("contact page is Displayed");
        cp=new ContactsPage(driver).createcontact(driver).
		return;
		}

	@AfterSuite
	public void closebrswer() {
		driver.close();
		log.info("Driver closed");
	}
	@Test(priority=1)
	public void moretab(){
		Assert.assertTrue(cp.MoreTab());
	}
	@Test(priority=2)
	public void verfiycheckboxclick(){
		Assert.assertTrue(cp.checkbox());
	}
	@Test(priority=3)
	public void verfiyList(){
		Assert.assertTrue(cp.verifyList());
	}

}
