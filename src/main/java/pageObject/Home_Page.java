package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import manager.Base;
import manager.FileReaderManager;

/*
This class is used for managing Home  page web element and user action on them 
*/
public class Home_Page extends Base {
	
	
	public Home_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * This method is used to navigate to homepage of AUT
	 */
	public void navigate_to_HomePage()
	{
		driver.get(FileReaderManager.getFileReaderManager().getConfigFileReader().getApplicationURL());
	}

}
