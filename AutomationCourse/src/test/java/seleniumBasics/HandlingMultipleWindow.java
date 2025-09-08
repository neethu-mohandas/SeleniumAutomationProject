package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base{
	
	public void verifyMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow); // get current (parent) window handle
		
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click(); // now new window is opened
		
		Set <String> handleids = driver.getWindowHandles();
		System.out.println(handleids); // get all the window handles
		
		Iterator<String> it = handleids.iterator(); //iterator to loop through the window handles
		while(it.hasNext())
		{
			String currentId = it.next();
			if(!currentId.equals(parentwindow)) // Check if the current window is not the parent window
			{
				driver.switchTo().window(currentId);
				WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("test@gmail.com");
				WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();			
			}
		}
		
	}

	public static void main(String[] args) {

		HandlingMultipleWindow window=new HandlingMultipleWindow();
		window.initialiseBrowser();
		window.verifyMultipleWindow();	
	}
}
