package pageObject;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import manager.Base;

/*
This class is used for managing Product page web element and user action on them 
*/
public class Product_Page extends Base {
	
	// Initialise costliest, second costliest price  and element Index for product
	int costliest_price=0, elementIndex =0;
	int second_CostliestPrice =0;
	
	public Product_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@class='product_label']")
	private  WebElement Label_productPage;
	
	@FindBy(how = How.CLASS_NAME, using  = "product_sort_container")
	private WebElement DropDownContainer;
	
	@FindBy(how = How.CLASS_NAME, using  = "inventory_item_price")
	private  List<WebElement> Products_Price;
	
	@FindBy(how = How.XPATH, using  = "//*[@class='btn_primary btn_inventory']")
	private  List<WebElement> Btn_AddToCart;
	
	
	/*
	 * This method is used to get label text on product page
	 */
	public String  getProductsLabel()
	{
		return Label_productPage.getText();
	}
	
	/*
	 * This method is used to select prices from high to low
	 */
	public void selectDropDownPriceForHighToLow()
	{
		Select select = new Select(DropDownContainer);
		select.selectByValue("hilo");
	}
	
	
	/*
	 * This method is used to get list of all prices listed on product page
	 */

	public List<Integer> getProductPrices()
	{
		List <Integer> prices = new ArrayList<Integer>();
		for (WebElement price: Products_Price)
		{
			String priceOfProduct = price.getText();
			int length =priceOfProduct.length();
			String priceOfProductAfterReplacement = priceOfProduct.substring(1, length);
			priceOfProductAfterReplacement =  priceOfProductAfterReplacement .replaceAll("[^0-9]", "");
			int intValueforPriceOfProduct = Integer.parseInt(priceOfProductAfterReplacement);
			prices.add(intValueforPriceOfProduct);
					
		}
		
		return prices;
	}
	
	/*
	 * This method is used to get index of second costliest price of product 
	 */
	
	public int getIndexOfSecondCostliestPriceOfProduct()
	{
		for (int i=0; i<getProductPrices().size(); i++)
		{
		 if (getProductPrices().get(i)>costliest_price)
		 {
			 second_CostliestPrice =costliest_price;
			 costliest_price = getProductPrices().get(i);
		
			 
		 }
		 
		 if (getProductPrices().get(i)>second_CostliestPrice && getProductPrices().get(i) !=costliest_price)
		 {
			 second_CostliestPrice= getProductPrices().get(i);
			 elementIndex=i;
		 }
		 
	
		
	}
		
		return elementIndex;

}
	
	/*
	 * This method is used to click on second costliest product
	 */
	
	public void clkOnAddCartButtonOfSecondCostliestproduct()
	{
		Btn_AddToCart.get(getIndexOfSecondCostliestPriceOfProduct()).click();
	}
	
	
	/*
	 * This method is used to get webelement for cheapest
	 */
	
	public WebElement getAddToCartLinkOfChespestPriceProductElement()
	{
		int totalNumberOfproducts = Products_Price.size();
		
		return Btn_AddToCart.get(totalNumberOfproducts-2);
	}
	
	/*
	 * This method is used to click on cheapest product
	 */
	public void clkOnAddcartButtonOfCheapestproduct()
	{
		int totalNumberOfproducts = Products_Price.size()-2;
		Btn_AddToCart.get(totalNumberOfproducts).click();
	}
	
	/*
	 * This method is used to sort the price in descending order
	 */
	public List<Integer> getSortedProductPrices()
	{
		
		ArrayList<Integer> sortedPrices = new ArrayList<Integer>( getProductPrices());
		Collections.sort(sortedPrices, Collections.reverseOrder());
		
		return sortedPrices;
		
	}
	
	
	
	
}
