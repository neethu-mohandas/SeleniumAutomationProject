package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	
	//DROPDOWN
	public void verifyDropdown() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown= driver.findElement(By.id("dropdowm-menu-1"));
		
		Select select =new Select(dropdown);
		//select.selectByIndex(2);
		
		//select.selectByValue("sql");
		
		select.selectByVisibleText("C#");	
	}
	
	//CHECKBOX
	public void verifyCheckbox() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox.click();
		
		System.out.println(checkbox.isSelected()); // output will be true	
	}

	//RADIO BUTTON
	public void verifyRadiobutton() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio= driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
	}
	
	
	public static void main(String[] args) {
		HandlingDropdown dropdownhandle= new HandlingDropdown();
		dropdownhandle.initialiseBrowser();
		//dropdownhandle.verifyDropdown();
		dropdownhandle.verifyCheckbox();
		//dropdownhandle.verifyRadiobutton();
		
	}

}
