package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrame() {
		
		driver.navigate().to("https://demoqa.com/frames");
		
	List <WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size()); //total number of frames on the page
		
		WebElement framesingle=driver.findElement(By.id("frame1"));
	
		driver.switchTo().frame(framesingle); //driver control switch to a specific frame
		WebElement frametext=driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText()); //print text from the above selected frame
		
		driver.switchTo().defaultContent(); //driver control switch back to page
		
	}

	public static void main(String[] args) {

		HandlingFrames frame= new HandlingFrames();
		frame.initialiseBrowser();
		frame.verifyFrame();
	}

}
