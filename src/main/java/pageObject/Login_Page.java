package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import manager.Base;

/*
This class is used for managing Login page web element and user action on them 
*/
public class Login_Page extends Base {
	
	public Login_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "user-name")
	private  WebElement txbx_UserName;
	
	@FindBy(how = How.ID, using = "password")
	private  WebElement txbx_Password;
	
	@FindBy(how = How.CLASS_NAME , using = "btn_action")
	private WebElement btn_Login;
	
	
	/*
	 * This method is used to type username
	 */
	public void  type_UserName(String userName)
	{
		txbx_UserName.sendKeys(userName);
	}
	

	/*
	 * This method is used to type password
	 */
	public void  type_Password(String password)
	{
		txbx_Password.sendKeys(password);
	}
	
	/*
	 * This method is used to click on login button
	 */
	public void  click_btn_Login()
	{
		btn_Login.click();
	}
	
	

}
