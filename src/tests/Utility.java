package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	private static WebDriver driver;//restricting the access of 
									//the driver variable, later have exposed 
									//using a public method.
	
	public static void launchBrowser() {
		//Don't forget to set the environment variable for Chrome driver
		System.setProperty("webdriver.chrome.driver","K:\\my-trainings\\pallav\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	public static void navigateToHomePage(){
		getDriverInstance().get("http://www.google.com");
	}
	
	//driver is exposed using a public method
	public static WebDriver getDriverInstance(){
		return driver;
	}	
	
	public static void closeBrowser(){
		getDriverInstance().close();
	}
	
	public static void killBrowser(){
		getDriverInstance().quit();
	}

}
