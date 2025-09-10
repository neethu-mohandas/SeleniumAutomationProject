package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;
import utilities.ExcelUtility;

public class LoginTest extends DemoBase{
	
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernameValue= ExcelUtility.readStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnLoginButton();
	}

	@Test
   public void verifyLoginWithInvalidUsernameAndValidPassword() throws IOException {
		
		String usernameValue= ExcelUtility.readStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnLoginButton();
	}
	
	@Test
    public void verifyLoginWithValidUsernameAndInvalidPassword() throws IOException {
		
		String usernameValue= ExcelUtility.readStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.readStringData(2, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnLoginButton();
	}
	
	@Test
   public void verifyLoginWithInvalidCredentials() throws IOException {
		
		String usernameValue= ExcelUtility.readStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.readStringData(3, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnLoginButton();
	}
	
}
