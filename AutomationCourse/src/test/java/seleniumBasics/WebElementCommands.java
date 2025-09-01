package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{

	public void verifyWebElements() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("Neethu"); //sendKeys accepts only String input
		
		WebElement showbutton=driver.findElement(By.id("button-one"));
		
		System.out.println(showbutton.isDisplayed()); // output will be true(boolean)
		System.out.println(showbutton.isEnabled()); // output will be true(boolean)
		
        showbutton.click(); //to click
		
		WebElement msgdisplay=driver.findElement(By.id("message-one"));
		System.out.println(msgdisplay.getText()); // print text in console
		
		messagebox.clear(); //to clear
		
		System.out.println(showbutton.getTagName()); //print HTML tag
		
		System.out.println(messagebox.getCssValue("border-color")); //print css property value
		
	}
	
	public static void main(String[] args) {

		WebElementCommands commands= new WebElementCommands();
		commands.initialiseBrowser();
		commands.verifyWebElements();
		
	}

}
