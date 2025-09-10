package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	// Constructor
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	 // Locators
	@FindBy(id="user-name") private WebElement username;
	@FindBy(id="password") private WebElement password ;
	@FindBy(id="login-button") private WebElement login ;
	
	// Actions
	public void enterUsernameOnUsernameField(String usernameValue) {
		username.sendKeys(usernameValue);
	}
	
    public void enterPasswordOnPasswordField(String passwordValue) {	
	password.sendKeys(passwordValue);
	}
	
	 public void clickOnLoginButton() {
		login.click();
	}
	  
}
