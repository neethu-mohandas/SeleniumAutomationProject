package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(home).build().perform(); //contextClick - method for right click
		
		
	}

	public static void main(String[] args) {

		HandlingActions actionhandle=new HandlingActions();
		actionhandle.initialiseBrowser();
		actionhandle.verifyRightClick();
		
	}

}
