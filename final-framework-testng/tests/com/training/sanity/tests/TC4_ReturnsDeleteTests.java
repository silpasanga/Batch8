package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMnew;
//import com.training.pom.TC2_RecurringOrdPOM;
import com.training.pom.TC3_ReturnsOrdPOM;
import com.training.pom.TC4_ReturnsDeletePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC4_ReturnsDeleteTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	//private TC2_RecurringOrdPOM RecurringOrdPOM;
	private TC3_ReturnsOrdPOM ReturnsOrdPOM;
	private TC4_ReturnsDeletePOM ReturnsDeletePOM;

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
		ReturnsDeletePOM = new TC4_ReturnsDeletePOM(driver);
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
	
	public void ReturnOrdDeleteTest() throws InterruptedException
	{
		loginPOMnew.sendUserName("admin");
		loginPOMnew.sendPassword("admin@123");
		loginPOMnew.clickLoginBtn(); 
		//screenShot.captureScreenShot("tc3_First");
		
		//selection option 
		  ReturnsDeletePOM.clicksalelog();
		  screenShot.captureScreenShot("tc4_1st");
		  
		  ReturnsDeletePOM.clickcheckboxReturns();
		  
		  ReturnsDeletePOM.clickDelete();
		  Thread.sleep(1000);
		  screenShot.captureScreenShot("tc4_2nd");
		  Thread.sleep(1000);
	}
}
		 		  
	
    





