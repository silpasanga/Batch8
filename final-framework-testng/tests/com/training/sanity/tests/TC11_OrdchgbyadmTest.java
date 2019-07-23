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
import com.training.pom.TC10_RewardPOM;
import com.training.pom.TC3_ReturnsOrdPOM;
import com.training.pom.TC9_OrdplacePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC11_OrdchgbyadmTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMnew loginPOMnew;
	
	private static Properties properties;
	private ScreenShot screenShot;
	//private TC2_RecurringOrdPOM RecurringOrdPOM;
	private TC3_ReturnsOrdPOM ReturnsOrdPOM;
	private TC9_OrdplacePOM OrdPOM;
	private TC10_RewardPOM RewardPOM;

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
		//OrdPOM = new TC9_OrdplacePOM(driver);
		
		RewardPOM = new TC10_RewardPOM(driver);
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
	
	public void RewardTest() throws InterruptedException
	{
		loginPOMnew.sendUserName("admin");
		loginPOMnew.sendPassword("admin@123");
		loginPOMnew.clickLoginBtn(); 
		screenShot.captureScreenShot("tc9_First");
		
		//selection option 
		//  ReturnsOrdPOM.clicksalelog();
		RewardPOM.clickcustomerslog();
		
		RewardPOM.clickeditbtn();
		Thread.sleep(1000);
		RewardPOM.enterfirstname("abc");
		Thread.sleep(1000);
		RewardPOM.enteraddress1tab();
		Thread.sleep(1000);
		RewardPOM.enterpostcode("521325");
		Thread.sleep(1000);
		RewardPOM.clickrewardpointstab();
		Thread.sleep(2000);
		RewardPOM.enterpoints("20");
		Thread.sleep(2000);
		RewardPOM.clickRewardpointstab();
		Thread.sleep(2000);
		RewardPOM.cilcksavebutton();
		Thread.sleep(2000);
		
}
	
}


