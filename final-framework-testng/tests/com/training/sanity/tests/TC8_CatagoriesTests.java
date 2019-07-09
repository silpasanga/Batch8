package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMnew;
import com.training.pom.TC6_CustPlaceOrdPOM;
import com.training.pom.TC7_DateCalendarPOM;
import com.training.pom.TC8_CatagoriesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC8_CatagoriesTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	private TC6_CustPlaceOrdPOM CustPlaceOrdPOM;
	private TC7_DateCalendarPOM DateCalenderPOM;
	private TC8_CatagoriesPOM CatagoriesPOM;

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
		
		DateCalenderPOM = new TC7_DateCalendarPOM(driver);
		
		CatagoriesPOM = new TC8_CatagoriesPOM(driver);
		
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
		
		
		screenShot.captureScreenShot("tc7_First");
		
		CatagoriesPOM.clickCatagorylog();
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		System.out.println("click on cat");
		
		CatagoriesPOM.clickAddcat();
		CatagoriesPOM.entercategoryname("Sports Uniform");
		
		Thread.sleep(3000);
		
		
		CatagoriesPOM.enterNotesondescription("Uniform for Sports");
		Thread.sleep(3000);
		CatagoriesPOM.enterMetatagTitle("Sports Uniform");
		Thread.sleep(3000);
		
		CatagoriesPOM.enterMetatagdiscription("Uniform for Sports");
		System.out.println("enter metatagdiscription");
		Thread.sleep(1000);
		CatagoriesPOM.clickonDatatab();
		Thread.sleep(1000);
		CatagoriesPOM.clickonDesingtab();
		Thread.sleep(1000);
		CatagoriesPOM.clickonsave();
		Thread.sleep(1000);
		CatagoriesPOM.clickCartlog();
		Thread.sleep(1000);
		CatagoriesPOM.clickAddnewPrd();
		Thread.sleep(1000);
		CatagoriesPOM.clickProductName("Sports Wear");
		Thread.sleep(1000);
		CatagoriesPOM.enterMetatagtitleprd("Sports Wear (8-10)");
		Thread.sleep(1000);
		CatagoriesPOM.clickonDatatabprd();
		Thread.sleep(1000);
		CatagoriesPOM.enterModelname("SPU-03");
		Thread.sleep(1000);
		CatagoriesPOM.clickLinkstab();
		System.out.println("click on links");
		Thread.sleep(1000);
		System.out.println("click on catagories");
		CatagoriesPOM.entercategories("Sports Uniform");
		
		Thread.sleep(1000);
		CatagoriesPOM.clickAttribute();
		Thread.sleep(1000);
		CatagoriesPOM.clickoptions();
		Thread.sleep(1000);
		CatagoriesPOM.clickRecurring();
		Thread.sleep(1000);
		CatagoriesPOM.clickDiscount();
		Thread.sleep(1000);
		CatagoriesPOM.clickSpecial();
		Thread.sleep(1000);
		CatagoriesPOM.clickImage();
		Thread.sleep(1000);
		CatagoriesPOM.clickRewardpoints();
		Thread.sleep(1000);
		CatagoriesPOM.clickDESING();
		Thread.sleep(1000);
		CatagoriesPOM.clickSavePrd();
}
}