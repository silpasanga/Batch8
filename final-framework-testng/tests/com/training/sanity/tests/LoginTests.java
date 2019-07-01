package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOMnew;
//import com.training.pom.TC2_RecurringOrdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	//private TC2_RecurringOrdPOM RecurringOrdPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	//private TC2_RecurringOrdPOM sales;
   // private TC2_RecurringOrdPOM RecurringOrd;

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
		screenShot.captureScreenShot("First");
		//loginPOMnew.clickview_more();
		loginPOMnew.ordercheckbox.click();
			
		loginPOMnew.pressDelete.click();	
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		Thread.sleep(5000);
		screenShot.captureScreenShot("Second");
					
	}
			
		
	//second TC2
	//public void RecurringOrdPOM() throws InterruptedException
	//{
		//TC2_RecurringOrdPOM.clickSaleslog();
		//Thread.sleep(5000);
		
	//}

	

}