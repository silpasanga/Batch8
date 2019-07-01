package com.training.sanity.tests;
  
    // import org.apache.log4j.Logger;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMnew;
//import com.training.pom.TC2_RecurringOrdPOM;
import com.training.pom.TC3_ReturnsOrdPOM;
import com.training.pom.TC5_CustomerPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import common.Logger;

//

public class TC5_CustomerTests {
	//log4j
    static final Logger Log = Logger.getLogger(TC5_CustomerTests.class); 
	//Logger Log = Logger.getLogger(TC5_CustomerTests.class.getName());
	
	
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	//private TC2_RecurringOrdPOM RecurringOrdPOM;
	private TC3_ReturnsOrdPOM ReturnsOrdPOM;
    private TC5_CustomerPOM CustomerPOM;
    
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
		CustomerPOM = new TC5_CustomerPOM(driver);
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
	
	public void CustomerTest() throws InterruptedException
	{
		//logger.log
		loginPOMnew.sendUserName("admin");
		loginPOMnew.sendPassword("admin@123");
		loginPOMnew.clickLoginBtn(); 
		//screenShot.captureScreenShot("tc5_First");
		
		//selection option 
		CustomerPOM.clickCustomerlog();
		  
		 screenShot.captureScreenShot("tc5_second");
		  
		  CustomerPOM.sendCustomer("abc abc");
		  
		  Log.info("Customer name details entered");
		  
		  CustomerPOM.clickfilterBtn();
		  Thread.sleep(3000);
		  
		  screenShot.captureScreenShot("tc5_third");

		  
		  CustomerPOM.clearCustomer_Name();
		  Thread.sleep(3000);
		  screenShot.captureScreenShot("tc5_four");
		  
		 
		  CustomerPOM.sendCustomerEmailID("admin@gmail.com");
		  
		  CustomerPOM.clickfilterBtn();
		  
		  Thread.sleep(3000);
		  
		  screenShot.captureScreenShot("tc5_four");

		   
		  
		
				  
	}
    
}




