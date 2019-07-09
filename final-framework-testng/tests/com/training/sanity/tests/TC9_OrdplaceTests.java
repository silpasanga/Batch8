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
import com.training.pom.TC3_ReturnsOrdPOM;
import com.training.pom.TC9_OrdplacePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC9_OrdplaceTests {

	
		private WebDriver driver;
		private String baseUrl;
		private LoginPOMnew loginPOMnew;
		
		private static Properties properties;
		private ScreenShot screenShot;
		//private TC2_RecurringOrdPOM RecurringOrdPOM;
		private TC3_ReturnsOrdPOM ReturnsOrdPOM;
		private TC9_OrdplacePOM OrdPOM;

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
			OrdPOM = new TC9_OrdplacePOM(driver);
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
			screenShot.captureScreenShot("tc9_First");
			
			//selection option 
			  ReturnsOrdPOM.clicksalelog();
			  Thread.sleep(1000);
			  OrdPOM.clickAddNew();
			  Thread.sleep(1000);
			  OrdPOM.enterOrdIDtextbox("25");
			  Thread.sleep(1000);
			  OrdPOM.enterCustname("Niti s");
			  Thread.sleep(1000);

			  OrdPOM.enterFirstname("Niti");
			  Thread.sleep(1000);
			  
			  OrdPOM.enterLastname("s");
			  Thread.sleep(1000);
			  
			  OrdPOM.enteremail("fatherf1212@gmail.com");
			  Thread.sleep(1000);
			  
			  OrdPOM.enterTelephone("08050341151");
			  Thread.sleep(1000);
			  
			  OrdPOM.enterProdtextbox("Blazer Girls(7-8)");
			  Thread.sleep(1000);
			  
			  OrdPOM.enterModelTextboc("BLG-112");
			 // OrdPOM.clicksavebtn();
			  Thread.sleep(3000);
			  OrdPOM.clicksavebtn();
			  
			  
			  Thread.sleep(1000);
			  System.out.println("click on save");
			  
			  OrdPOM.clickcheckbox();
			  Thread.sleep(1000);
			  OrdPOM.clickDelete();
			  
			  Alert alert = driver.switchTo().alert();
				alert.accept();
				Thread.sleep(1000);
				
				 System.out.println("click on ok after delete");
				 
				 Thread.sleep(3000);
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(0,250)");
				 Thread.sleep(3000);
				
}
}
	
