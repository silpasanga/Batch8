package com.training.sanity.tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMnew;
import com.training.pom.TC6_CustPlaceOrdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC6_CustPlaceOrdTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	private TC6_CustPlaceOrdPOM CustPlaceOrdPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOMnew = new LoginPOMnew(driver); 
		
		CustPlaceOrdPOM = new TC6_CustPlaceOrdPOM(driver);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test
	public void validLoginTest() throws InterruptedException 
	{
				
		loginPOMnew.sendUserName("admin");
	    loginPOMnew.sendPassword("admin@123");
		loginPOMnew.clickLoginBtn(); 
		
		
		screenShot.captureScreenShot("tc6_First");
		loginPOMnew.clicksalelog();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		CustPlaceOrdPOM.clickedit();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		//Thread.sleep(1000);
		CustPlaceOrdPOM.clickcontinue();
		Thread.sleep(10000);
		
		screenShot.captureScreenShot("tc6_2nd");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		CustPlaceOrdPOM.clickRemove();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		
		screenShot.captureScreenShot("tc6_3rd");
		
		Thread.sleep(2000);
		
		CustPlaceOrdPOM.chooseproduct("GIRLS BLAZER(9TH-12TH STD)");
		
		Thread.sleep(2000);
		
		screenShot.captureScreenShot("tc6_3rd");
		
		CustPlaceOrdPOM.enterQnty("2");
		
		screenShot.captureScreenShot("tc6_4rd");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		Thread.sleep(2000);
	   CustPlaceOrdPOM.addprd();
	
	   screenShot.captureScreenShot("tc6_5th");
	   
	   CustPlaceOrdPOM.presscountine2();
	   
	   CustPlaceOrdPOM.presscountinue3();
	   
	   CustPlaceOrdPOM.clicksave();
	}
}
	
	//this code is fpr user login and add product
	/*public void Loginpage() throws Exception
	{
		
				
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		CustPlaceOrdPOM.addtocartt();
		CustPlaceOrdPOM.choosesize();
		//CustPlaceOrdPOM.addtocart2nd();
		
		/*CustPlaceOrdPOM.addtocartt();
		
		CustPlaceOrdPOM.choosesize();
		Thread.sleep(1000);
		
		CustPlaceOrdPOM.addtocart2nd();
		
		CustPlaceOrdPOM.login();
		screenShot.captureScreenShot("TC6_First");
			
		CustPlaceOrdPOM.enteremail("abc123@gmail.com");
		CustPlaceOrdPOM.enterPassword("admin@123");
		CustPlaceOrdPOM.clickLoginBtn();	*/	
						
	//	screenShot.captureScreenShot("TC6_2nd");
		
			
	//	Thread.sleep(1000);
		
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
				
		//Thread.sleep(1000);
		//screenShot.captureScreenShot("TC_Second");
					
	//}


	
	//}*/
			
	
	


