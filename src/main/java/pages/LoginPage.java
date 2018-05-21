package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;
import util.TestUtil;

public class LoginPage extends TestBase {
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "pwd")
	WebElement password;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public TimeTrackPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new TimeTrackPage();
	}
}
