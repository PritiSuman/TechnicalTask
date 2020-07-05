package manager;

import org.openqa.selenium.WebDriver;

import pageObject.Cart_Page;
import pageObject.CheckoutOverview_Page;
import pageObject.Checkout_Page;
import pageObject.Finish_Page;
import pageObject.Home_Page;
import pageObject.Login_Page;
import pageObject.Product_Page;
/*
This class is used to return object of pageObject classes
*/
public class PageObjectManager extends Base {
	private Login_Page loginPage;
	private Home_Page homePage;
	private Product_Page productPage;
	private Cart_Page cartPage;
	private Checkout_Page checkoutPage;
	private CheckoutOverview_Page checkoutOverviewPage;
	private Finish_Page finishPage;


	public  PageObjectManager(WebDriver driver)
	{
		Base.driver = driver;
	}
	
	
	public Login_Page getLoginPage()
	{
		return (loginPage == null) ?  loginPage = new Login_Page(driver): loginPage;
	}
	
	public Home_Page getHomePage()
	{
		return (homePage == null) ?  homePage = new Home_Page(driver): homePage;
	}
	
	
	public Product_Page getProductPage()
	{
		return (productPage == null) ?  productPage = new Product_Page(driver): productPage;
	}
	
	public Cart_Page getCartPage()
	{
		return (cartPage == null) ?  cartPage = new Cart_Page(driver): cartPage;
	}
	
	public Checkout_Page getCheckoutPage()
	{
		return (checkoutPage == null) ?  checkoutPage = new Checkout_Page(driver): checkoutPage;
	}
	
	public CheckoutOverview_Page getCheckoutOverview_Page()
	{
		return (checkoutOverviewPage == null) ?  checkoutOverviewPage = new CheckoutOverview_Page(driver): checkoutOverviewPage;
	}
	
	public Finish_Page getfinishPage()
	{
		return (finishPage == null) ?  finishPage = new Finish_Page(driver): finishPage;
	}
}

