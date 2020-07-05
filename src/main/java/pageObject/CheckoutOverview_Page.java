package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import manager.Base;

/*
This class is used for managing checkout overview page web element and user action on them 
*/
public class CheckoutOverview_Page extends Base {
	
		public CheckoutOverview_Page (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how = How.LINK_TEXT, using = "FINISH")
		private  WebElement link_FINISH;
		
		
		@FindBy(how = How.XPATH, using = "//*[@class='inventory_item_price']")
		private  List<WebElement> productPriceOnChekoutOveriewPage;
		
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'Checkout: Overview')]")
		private  WebElement element_SubheaderOfCheckoutOverviewPage;
		
		
		/*
		 * This method is used to click on Finish link at checkout overview page
		 */
		public void clk_link_FINISH()
		{
			link_FINISH.click();
		}

		/*
		 * This method is used to get number of products added in cart before payment
		 */
		public int numberOfproductOnCheckoutOverviewPage()
		{
			return productPriceOnChekoutOveriewPage.size();
		}
		
		/*
		 * This method is used to get sub header of checkout overview page
		 */
		public String getSubheaderOfCheckoutOverviewPage()
		{
			return element_SubheaderOfCheckoutOverviewPage.getText();
		}

		
}
