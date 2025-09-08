package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavaScript extends Base {
	
	public void verifyJavaScript() {
        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));	
  // Cast the WebDriver instance driver to JavascriptExecutor to execute JavaScript commands
  // Create a JavaScriptExecutor object by casting the WebDriver instance 
		JavascriptExecutor js = (JavascriptExecutor)driver;  // casting (driver control given to JavaScript executor)	
  // Use JavaScript to click the button (instead of using the regular click() method)
		js.executeScript("arguments[0].click();", showMessageButton);
		
      // Scroll down the page by 350 pixels on the Y-axis
		js.executeScript("window.scrollBy(0,350)", "");  //scroll vertically since value in y axis(350)
		
      // Scroll back up the page by 350 pixels on the Y-axis
		js.executeScript("window.scrollBy(0,-350)", "");
		
	}

	public static void main(String[] args) {

		HandlingJavaScript javascript = new HandlingJavaScript();
		javascript.initialiseBrowser();
		javascript.verifyJavaScript();
	}

}
