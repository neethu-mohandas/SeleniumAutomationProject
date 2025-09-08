package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
    //right click-> contextClick method (Performs a right-click on the specified element to open context menus)
	public void verifyRightClick() {
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action=new Actions(driver);
		action.contextClick(home).build().perform(); 
	}
	
	//mouse hover-> moveToElement
	public void verifyMouseHover() {
		
      WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	  Actions action=new Actions(driver);
	  action.moveToElement(home).build().perform();	
	}

	//drag and drop-> dragAndDrop
	public void verifyDragAndDrop() {
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	//keyboard action-> Robot class
	public void verifyKeyboardAction() throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); //control key
		r.keyPress(KeyEvent.VK_T);       //new tab (Ctrl+T open new tab)
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	}
		
	public static void main(String[] args) {

		HandlingActions actionhandle=new HandlingActions();
		actionhandle.initialiseBrowser();
		
		//actionhandle.verifyRightClick();
		//actionhandle.verifyMouseHover();
		//actionhandle.verifyDragAndDrop();
		
		try {
			actionhandle.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
