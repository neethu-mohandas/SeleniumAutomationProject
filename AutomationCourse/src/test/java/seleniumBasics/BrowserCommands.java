package seleniumBasics;

public class BrowserCommands extends Base {
	
	public void verifyCommands() {
		
		String title= driver.getTitle(); // to get title of the tab
	    System.out.println(title);
	    
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	    String handleID= driver.getWindowHandle();
	    System.out.println(handleID);
	    
	    String source=driver.getPageSource();
	    System.out.println(source);
	}

	public static void main(String[] args) {
		
		BrowserCommands command =new BrowserCommands();
		command.initialiseBrowser();
		command.verifyCommands();

	}

}
