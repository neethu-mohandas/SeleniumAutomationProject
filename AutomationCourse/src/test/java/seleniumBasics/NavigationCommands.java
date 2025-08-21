package seleniumBasics;

public class NavigationCommands extends Base{
	
	public void verifyCommands() {
		
		driver.navigate().to("https://www.amazon.in/");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {

		NavigationCommands ncommand= new NavigationCommands();
		ncommand.initialiseBrowser();
		ncommand.verifyCommands();
		
	}

}
