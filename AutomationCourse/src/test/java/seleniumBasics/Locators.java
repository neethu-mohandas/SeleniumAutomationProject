package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocators() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//using id
		driver.findElement(By.id("single-input-field"));
		
		//using className
		driver.findElement(By.className("form-control"));
		
		//using tagName
		driver.findElement(By.tagName("input"));
		
		//using name
		driver.findElement(By.name("description"));
		
		//using linkText
		driver.findElement(By.linkText("Radio Buttons Demo"));
		//using partialLinkText if linkText is lengthy
		driver.findElement(By.partialLinkText("Radio"));
		
		//css selector syntax->tagname[attribute='attribute value']
		driver.findElement(By.cssSelector("button[id='button-one']"));
		
		// xpath
		// Absolute xpath -not used
	    //   /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
	       
		// Relative xpath syntax->//tagname[@attribute='attributevalue']
		driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//xpath using text and xpath using starts-with if text is lengthy 
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		
		//xpath using and operator
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		
		//xpath using or operator
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		
	}

	public static void main(String[] args) {
		Locators locator=new Locators();
		locator.initialiseBrowser();
		locator.verifyLocators();
		
	}

}
