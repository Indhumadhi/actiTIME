package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TimeTrackPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	TimeTrackPage timeTrackPage;
	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void initialize() {
		setup();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitletest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "actiTIME - Login");
	}
	
	@Test(priority=2)
	public void loginTest() {
		timeTrackPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
