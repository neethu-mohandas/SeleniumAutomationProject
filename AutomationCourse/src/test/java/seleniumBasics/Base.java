package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
  
	//webdriver initialisation
	public WebDriver driver;
	
	//webbrowser launch
	public void initialiseBrowser() {
		
		driver= new ChromeDriver(); //Initialize ChromeDriver
		
		//driver= new FirefoxDriver(); //Initialize FirefoxDriver
		
		//Setup EdgeDriver using WebDriverManager
	     // WebDriverManager.edgedriver().setup();
		 // driver= new EdgeDriver();
		
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize(); // Maximize the browser window	
	}
	
	public void browserClose() {
	//	driver.close();
	//	driver.quit();
	}
	
	public static void main(String[] args) {

		Base base=new Base();
		base.initialiseBrowser();
		base.browserClose();
	}

}
