package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMnew;
//import com.training.pom.TC2_RecurringOrdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC1_OrdersTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	private static Properties properties;
	private ScreenShot screenShot;
	//private LoginPOMnew TC1_OrdersPOMS;

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
		//screenShot.captureScreenShot("First");
		
		screenShot.captureScreenShot("tc1_First");
		loginPOMnew.clicksalelog();
		Thread.sleep(3000);
		
		
		loginPOMnew.ordercheckbox.click();
		screenShot.captureScreenShot("tc1_second");
		Thread.sleep(3000);
		loginPOMnew.pressDelete();	
		System.out.println("after press delete");
		screenShot.captureScreenShot("tc1_third");
		
		
		Thread.sleep(1000);
		
		screenShot.captureScreenShot("tc1_four");
					
	}
			
		
}
