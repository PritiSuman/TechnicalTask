package pageObject;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import manager.Base;

/*
This class is used for managing cart page web element and user action on them 
*/
public class Cart_Page extends Base{
	
	public Cart_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@class='shopping_cart_container']")
	private  WebElement cart_Link;
	
	@FindBy(how = How.XPATH, using = "//*[@class='inventory_item_price']")
	private  List<WebElement> product_Prices_addedIn_cart;
	
	@FindBy(how = How.LINK_TEXT, using = "CHECKOUT")
	private  WebElement Link_CheckOut;
	
	public WebElement getCartLinkElement()
	{
		return cart_Link;
		
	}
	
	/*
	 * This method is used to click on cart link
	 */
	public void clkCartLink()
	{
		cart_Link.click();
	}
	
	/*
	 * This method is used to get count of number of products added to the cart
	 */
	public int getnumberOfProductAddedinCart()
	{
		return product_Prices_addedIn_cart.size();
	}
	
	
	/*
	 * This method is used to click on Checkout link
	 */
	public void clkLinkCheckOut()
	{
		Link_CheckOut.click();
	}
	

}
