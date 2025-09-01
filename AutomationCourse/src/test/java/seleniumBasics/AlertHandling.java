package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simplebutton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simplebutton.click();
		
		Alert alert=driver.switchTo().alert(); // switch to alert
		
		String text = alert.getText(); //print the text msg present in alert
		System.out.println(text);
		
		alert.accept(); //click OK button
	}
	
   public void confirmationAlert() {
	   driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmbutton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmbutton.click();
		
		Alert alert=driver.switchTo().alert();
		
		//alert.accept(); //click OK button
		alert.dismiss();  //click Cancel button
	}
   
   public void promptAlert() {
	   driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptbutton=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptbutton.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("neethu");   //for inputting into textfield
		alert.accept();   //click OK button
		//alert.dismiss();   //click Cancel button
		
}

	public static void main(String[] args) {
		
		AlertHandling handlealert=new AlertHandling();
		handlealert.initialiseBrowser();
		//handlealert.simpleAlert();
		//handlealert.confirmationAlert();
		handlealert.promptAlert();
	}

}
