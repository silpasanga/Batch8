package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMnew;
//import com.training.pom.TC2_RecurringOrdPOM;
import com.training.pom.TC3_ReturnsOrdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC3_ReturnsOrdTests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	//private TC2_RecurringOrdPOM RecurringOrdPOM;
	private TC3_ReturnsOrdPOM ReturnsOrdPOM;

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
		ReturnsOrdPOM = new TC3_ReturnsOrdPOM(driver);
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
	
	public void ReturnOrdTest() throws InterruptedException
	{
		loginPOMnew.sendUserName("admin");
		loginPOMnew.sendPassword("admin@123");
		loginPOMnew.clickLoginBtn(); 
		screenShot.captureScreenShot("tc3_First");
		
		//selection option 
		  ReturnsOrdPOM.clicksalelog();
		  screenShot.captureScreenShot("tc3_second");
		  ReturnsOrdPOM.sendReturnID("164");
		  
		 
		  screenShot.captureScreenShot("tc3_third");
		  Thread.sleep(3000);;	
		  ReturnsOrdPOM.clickfiterBtn();
		  System.out.println("click on filter");
		  screenShot.captureScreenShot("tc3_four");
		   
		  ReturnsOrdPOM.clearReturnID();
		 
		  
		  ReturnsOrdPOM.sendCustomerID("silpa pobaku");
		  ReturnsOrdPOM.clickfiterBtn2();
		  screenShot.captureScreenShot("tc3_five");
		
				  
	}
    
}


