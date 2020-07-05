package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
This class is used for managing confirmation page web element and user action on them 
*/
public class Finish_Page {
	
	public Finish_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'THANK YOU FOR YOUR ORDER')]")
	private  WebElement element_completionTextOnFinishPage;
	
	
	/*
	 * This method is used to get completion text from finish page
	 */
	public String getcompletionTextOnFinishPage()
	{
		return element_completionTextOnFinishPage.getText();
	}

}


