package com.Tests;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import com.Base.BaseClass;
import com.pages.AccountsPage;
import com.pages.ActionsPage;
import com.pages.LoginPage;

public class AccountsPageTest extends BaseClass{
	WebDriver driver;
	public AccountsPage ap;

	@BeforeSuite
	public void setUp() {
		driver = initialization();
		ap = new AccountsPage(driver);
		log.info("Driver is initialised");
		log.info("Login Page is Displayed");
		ap=new LoginPage(driver).verifyBrowserTitle().navigateToAccountsPage();
		reportInit();
		}
}
