package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.Base.BaseClass;
import com.pages.MarketingPage;

public class MarketingPageTest extends BaseClass{
	WebDriver driver;
	public MarketingPage mp;

	@BeforeSuite
	public void setUp() {
		driver = initialization();
		mp = new MarketingPage(driver);
		log.info("Driver is initialised");
		log.info("marketing is Displayed");
		mp=new MarketingPage(driver).verifyMarketingList().navigateToMarketingPage(driver);
		}

	@AfterSuite
	public void closebrswer() {
		driver.close();
		log.info("Driver closed");
	}
	@Test(priority=1)
	public void verifyTitle(){
		Assert.assertTrue(mp.verifyBrowserTitle());
	}
	@Test(priority=1)
	public void verifyMarketingList(){
		Assert.assertFalse(mp.verifyMarketingList());
	}}