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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC7_DateCalendarTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	private TC6_CustPlaceOrdPOM CustPlaceOrdPOM;
	private TC7_DateCalendarPOM DateCalenderPOM;

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
		
		loginPOMnew.clicksalelog();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		System.out.println("enter Ord text");
		DateCalenderPOM.enterOrdIDtextbox("42");
		screenShot.captureScreenShot("tc7_2nd");
		
		DateCalenderPOM.clickfilter();
		Thread.sleep(5000);
		DateCalenderPOM.Orderstatustextbox();
		Thread.sleep(5000);
		DateCalenderPOM.clickfilter();
		Thread.sleep(3000);
		
		DateCalenderPOM.clickAddDate();
		Thread.sleep(3000);

		DateCalenderPOM.ClickcurrentAddDate();
		
		DateCalenderPOM.clickfilter();
		Thread.sleep(3000);
		DateCalenderPOM.EnterCustomername("abc abc");
		DateCalenderPOM.clickfilter();
		Thread.sleep(3000);
		System.out.println("enter customer name");
		DateCalenderPOM.clickfilter();
		Thread.sleep(3000);
		DateCalenderPOM.EnterTotalnoofprd("3");
		DateCalenderPOM.clickfilter();
		Thread.sleep(3000);
		
		DateCalenderPOM.ClickModifyDate();
		Thread.sleep(3000);
		DateCalenderPOM.ClickCurrentModifyDate();
		Thread.sleep(3000);
		DateCalenderPOM.clickfilter();
		Thread.sleep(3000);
	}

	/*public void DateCalendar() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	DateCalenderPOM.enterOrdtext("42");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	//DateCalenderPOM.vieword();
	
	DateCalenderPOM.clickfilter();
		
	
	
    } */
	
	
}
