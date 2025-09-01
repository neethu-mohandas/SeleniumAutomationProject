package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{

	public void verifyTablehandling() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		//fetch full table data
		WebElement table=driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		
		//fetch single row data
		WebElement firstrow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(firstrow.getText());
		
	}
	
	public static void main(String[] args) {
		
		HandlingTable tablehandle= new HandlingTable();
		tablehandle.initialiseBrowser();
		tablehandle.verifyTablehandling();
		
	}

}
