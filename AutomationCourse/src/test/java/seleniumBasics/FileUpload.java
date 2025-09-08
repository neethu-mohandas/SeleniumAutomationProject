package seleniumBasics;

import java.awt.AWTException; // Exception class for Robot class
import java.awt.Robot;  // Robot class to simulate keyboard/mouse actions
import java.awt.Toolkit; // Used to get system clipboard
import java.awt.datatransfer.StringSelection; // Used to copy text (file path) to clipboard
import java.awt.event.KeyEvent; // Used to simulate key presses

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public WebDriver driver;
	
    //Upload file using sendKeys()
	public void sendkeysForFileUpload() {
		
		driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement choosebutton=driver.findElement(By.id("file-upload"));
		//choosebutton.click(); //click not needed when using sendKeys
		choosebutton.sendKeys("C:\\Users\\DELL\\OneDrive\\Documents\\Obsqura\\codeconventions.pdf");
		
	}
	
    //Upload file using Robot class
	public void roboclassForFileUpload() throws AWTException{
		
		driver =new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		WebElement selectpdf=driver.findElement(By.id("pickfiles"));
		selectpdf.click();
		
		StringSelection stringselect= new StringSelection("C:\\Users\\DELL\\OneDrive\\Documents\\Obsqura\\codeconventions.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null); //copy filepath into system clipboard
	
		Robot robot=new Robot();
		robot.delay(1000); //pauses the execution for 1000 milliseconds
	//Simulate pressing Ctrl + V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	//Simulate press and release Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException {

		FileUpload fileupload=new FileUpload();
		//fileupload.sendkeysForFileUpload();
		fileupload.roboclassForFileUpload();
	}

}
