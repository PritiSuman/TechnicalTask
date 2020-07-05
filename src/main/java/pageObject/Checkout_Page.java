package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import manager.Base;

/*
This class is used for managing Checkout page web element and user action on them 
*/
public class Checkout_Page extends Base{
	
	public Checkout_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "first-name")
	private  WebElement txbx_FirstName;
	
	@FindBy(how = How.ID, using = "last-name")
	private  WebElement txbx_LastName;
	
	
	@FindBy(how = How.ID, using = "postal-code")
	private  WebElement txbx_Postalcode;
	
	
	@FindBy(how = How.XPATH , using = "//*[@class= 'btn_primary cart_button']")
	private  WebElement btn_Continue;
	
	@FindBy(how = How.XPATH , using = "//*[contains(text(), 'Checkout: Your Information')]")
	private  WebElement element_SubHeader;
	
	/*
	 * This method is used to type first name at checkout page
	 */
	public void type_FirstName(String firstName)
	{
		txbx_FirstName.sendKeys(firstName);
	}
	
	
	/*
	 * This method is used to type last name at checkout page
	 */
	public void type_LastName(String lastName)
	{
		txbx_LastName.sendKeys(lastName);
	}
	
	
	/*
	 * This method is used to type postal code at checkout page
	 */
	public void type_PostalCode(String postalCode)
	{
		txbx_Postalcode.sendKeys(postalCode);
	}
	
	
	/*
	 * This method is used to click on continue button at checkout page
	 */
	public void clk_btn_Continue()
	{
		btn_Continue.click();
	}
	
	
	/*
	 * This method is used get header text of checkout page
	 */
	public String getHeaderText()
	{
		return element_SubHeader.getText();
		
	}
}
