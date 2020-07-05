package stepDefinitions;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import manager.Base;
import manager.FileReaderManager;
import manager.PageObjectManager;
import pageObject.Cart_Page;
import pageObject.CheckoutOverview_Page;
import pageObject.Checkout_Page;
import pageObject.Finish_Page;
import pageObject.Home_Page;
import pageObject.Login_Page;
import pageObject.Product_Page;

/*
This class is used for managing glue code of end to end test
*/
public class StepDefn_EndToEndTest extends Base {
	
	Login_Page loginPage;
	Home_Page homePage;
	Product_Page productPage;
	Cart_Page cartPage;
    Checkout_Page checkoutPage;
	CheckoutOverview_Page checkoutOverviewPage;
	Finish_Page finishPage; 
	PageObjectManager pageObjectmanager;
	
	
	
	@Before
	public void setup()
	{
		Base.systemproperty();
	}
	
	@After 
	public void afterStpes()
	{
		Base.closeBrowser();
	}
	
	
	
	@Given("^user naviagte to the website of saucedemo\\.com$")
	public void user_naviagte_to_the_website_of_saucedemo_com() throws Throwable {
		pageObjectmanager = new PageObjectManager(driver);
		homePage = pageObjectmanager.getHomePage();
		homePage.navigate_to_HomePage();
	    
	}

	@When("^user provide username as \"([^\"]*)\" and password as \"([^\"]*)\" in through Login Window$")
	public void user_provide_username_as_and_password_as_in_through_Login_Window(String userName, String password) throws Throwable {
	  
		loginPage =pageObjectmanager.getLoginPage();
		userName = FileReaderManager.getFileReaderManager().getConfigFileReader().getUserName();
		password = FileReaderManager.getFileReaderManager().getConfigFileReader().getPassword();
		
		loginPage.type_UserName(userName);
		loginPage.type_Password(password);
		
		
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	
		loginPage.click_btn_Login();
	}

	@Then("^Login must be successful$")
	public void login_must_be_successful() throws Throwable {
		
		 productPage = pageObjectmanager.getProductPage();
		String actualProductLabel= productPage.getProductsLabel();
		String expectedProductLabel = "Products";
		
		junit.framework.Assert.assertEquals(actualProductLabel, expectedProductLabel);
	
	  
	}
	

       @Then("^user is on product page$")
       public void user_is_on_product_page() throws Throwable {
    
	
          }

@When("^user sort out the price from high to low$")
public void user_sort_out_the_price_from_high_to_low() throws Throwable {
	
	productPage.selectDropDownPriceForHighToLow();
   
}


@Then("^prices for product must be in high to low$")
public void prices_for_product_must_be_in_high_to_low() throws Throwable {

	Assert.assertEquals(productPage.getProductPrices(), productPage.getSortedProductPrices());
   
}

@When("^user add cheapest and second costaliest price product to cart$")
public void user_add_cheapest_and_second_costaliest_price_product_to_cart() throws Throwable {
	

	productPage.clkOnAddCartButtonOfSecondCostliestproduct();
	Base.javascriptexecuter_ScrollIntoView(productPage.getAddToCartLinkOfChespestPriceProductElement());
	Base.waitUntilClickable(productPage.getAddToCartLinkOfChespestPriceProductElement());
	
	productPage.clkOnAddcartButtonOfCheapestproduct();
	
    
}

@Given("^user navigate to cart page$")
public void user_navigate_to_cart_page() throws Throwable {
	cartPage = pageObjectmanager.getCartPage();
	
	Base.javascriptexecuter_ScrollIntoView(cartPage.getCartLinkElement());
	
	cartPage.clkCartLink();
    
}


@Then("^products should be added to the cart$")
public void products_should_be_added_to_the_cart() throws Throwable {
	
	int expectedNumberOfProductsInCart = 2;
	int actualNumberOfProductsInCart = cartPage.getnumberOfProductAddedinCart();
	Assert.assertEquals(actualNumberOfProductsInCart, expectedNumberOfProductsInCart);
   
}


@When("^click on Checkout link$")
public void click_on_Checkout_link() throws Throwable {
	

	
	cartPage.clkLinkCheckOut();
    
}

@Then("^user must naviagte to checkout page$")
public void user_must_naviagte_to_checkout_page() throws Throwable {
checkoutPage = pageObjectmanager.getCheckoutPage();
	
	String expectedHeaderText = "Checkout: Your Information";
	
	String actualHeaderText = checkoutPage.getHeaderText();
	Assert.assertEquals(actualHeaderText, expectedHeaderText );
			
    
}

@When("^user provide details for first name, LastName and postal Code as \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\"$")
public void user_provide_details_for_first_name_LastName_and_postal_Code_as(String firstName, String lastName, String postalCode) throws Throwable {
	checkoutPage.type_FirstName(firstName);
	checkoutPage.type_LastName(lastName);
	checkoutPage.type_PostalCode(postalCode);
}

@When("^click on Continue link at checkout page$")
public void click_on_Continue_link_at_checkout_page() throws Throwable {
	
	checkoutPage.clk_btn_Continue();
}

@Then("^user must navigate Checkout OverView Page$")
public void user_must_navigate_Checkout_OverView_Page() throws Throwable {
	 checkoutOverviewPage = pageObjectmanager.getCheckoutOverview_Page();
	 String expectedsubHeader = "Checkout: Overview";
	 String actualsubHeader   =  checkoutOverviewPage.getSubheaderOfCheckoutOverviewPage();
	 Assert.assertEquals(actualsubHeader, expectedsubHeader);
    
}

@Then("^added products should be visisble at checkout page$")
public void added_products_should_be_visisble_at_checkout_page() throws Throwable {
      
	int expectedNumberOfProducts = 2;
	int actualNumberOfProducts = checkoutOverviewPage.numberOfproductOnCheckoutOverviewPage();
	Assert.assertEquals(actualNumberOfProducts, expectedNumberOfProducts);
}

@When("^user click on Finsih button at checkout overview page$")
public void user_click_on_Finsih_button_at_checkout_overview_page() throws Throwable {
	
	checkoutOverviewPage.clk_link_FINISH();
}

@Then("^order must be completed$")
public void order_must_be_completed() throws Throwable {
   finishPage = pageObjectmanager.getfinishPage();
	 String expectedcompletionText = "THANK YOU FOR YOUR ORDER";
	 String actualcompletionText   =  finishPage.getcompletionTextOnFinishPage();
	 Assert.assertEquals(actualcompletionText, expectedcompletionText);
   
 
}

	



}
