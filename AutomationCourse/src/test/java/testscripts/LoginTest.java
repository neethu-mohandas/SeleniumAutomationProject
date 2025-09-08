package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase{
	
	@Test
	public void verifyLoginWithValidCredentials() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

	@Test
   public void verifyLoginWithInvalidUsernameAndValidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("testone");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	
	@Test
    public void verifyLoginWithValidUsernameAndInvalidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("testpassword");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	
	@Test
   public void verifyLoginWithInvalidCredentials() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("testuser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("testuserpassword");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	
}
