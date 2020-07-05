package manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
This class is used to initialise webdriver, JavascriptExecutor and Wait methods
*/

public class Base {
	

	
	public static WebDriver driver;
	public static JavascriptExecutor js; 
	public static WebDriverWait wait;
	
	/*
	method is used to set system property for chrome webdriver
	*/
	
	
	public static void systemproperty()
	{
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getFileReaderManager().getConfigFileReader().getDriverPath());
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	/*
	method is used to close the browser after scenarios steps are completed
	*/
	
	public static void closeBrowser()
	{
		 driver.quit();
		
	}
	
	/*
	java script executer method to scroll to element 
	*/
	
	
	public static void javascriptexecuter_ScrollIntoView(WebElement element)
	{
		js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	/*
	wait method until element is not clicked
	*/
	
	public static void waitUntilClickable(WebElement element)
	{
		wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	

}
