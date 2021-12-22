package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import com.Base.BaseClass;
import com.pages.ActionsPage;
import com.pages.ServicePage;

public class ServicePageTest extends BaseClass {
	WebDriver driver;
	public ServicePage sp;

	@BeforeSuite
	public Object setUp() {
		driver = initialization();
		sp = new ServicePage(driver);
		log.info("Driver is initialised");
		log.info(" ServicePage is Displayed");
		sp=new ServicePage(driver).verifyTitle(driver).navigateToServicePage();
				return null;
}
}