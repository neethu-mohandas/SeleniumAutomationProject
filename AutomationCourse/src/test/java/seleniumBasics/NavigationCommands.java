package seleniumBasics;

public class NavigationCommands extends Base{
	
	public void verifyCommands() {
		
		driver.navigate().to("https://www.amazon.in/");	//navigate from obsqura(given in Base class) to amazon application
		driver.navigate().back(); //navigate back to obsqura
		driver.navigate().forward(); //navigate to amazon
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {

		NavigationCommands ncommand= new NavigationCommands();
		ncommand.initialiseBrowser();
		ncommand.verifyCommands();
		
	}

}
