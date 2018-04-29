package tests;

import javax.swing.text.Utilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest {
	
	
	@BeforeClass
	public static void setup() throws Exception{
		Utility.launchBrowser();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public static void teardown() throws InterruptedException{
		Utility.killBrowser();
		Thread.sleep(2000);
	}
	
	
//	@After
//	public void executeAfterEachTest(){
//		//Utility.navigateToHomePage();
//		//System.out.println("executeAfterEachTest");
//		//Utility.closeBrowser();
//		//Utility.killBrowser();
//	}
	
	@Before
	public void executeBeforeEachTest() throws InterruptedException{
		//Utility.launchBrowser();
		Utility.navigateToHomePage();
		Thread.sleep(2000);
		//System.out.println("executeBeforeEachTest");
	}
	
	
	
	
	@Test
	public void loginTest() throws InterruptedException{
		Utility.getDriverInstance().findElement(By.className("gsfi")).sendKeys("SATYABRATA");
		Thread.sleep(2000);
		//System.out.println("loginTest");
	}
	
	@Test
	public void logoutTest() throws InterruptedException{
		Utility.getDriverInstance().findElement(By.className("gsfi")).sendKeys("PALLAV");
		Thread.sleep(2000);
		//System.out.println("logoutTest");
	}
	
	@Test
	public void paymentTest() throws InterruptedException{
		Utility.getDriverInstance().findElement(By.className("gsfi")).sendKeys("SELENIUM");
		Thread.sleep(2000);
		//System.out.println("paymentTest");
	}

}
