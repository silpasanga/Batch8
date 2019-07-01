package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC5_CustomerPOM {

	private static WebDriver driver; 
	
	
	public TC5_CustomerPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}


@FindBy(id="input-username")
private WebElement userName; 

@FindBy(id="input-password")
private WebElement password;


@FindBy(xpath="//button[contains(text(),'Login')]")
private WebElement loginBtn; 


@FindBy(xpath="//*[@id=\"customer\"]/a")
private WebElement Customericon;


@FindBy(linkText="Customers")
private WebElement Customerstab;


@FindBy(xpath="//*[@id=\"input-name\"]")
private WebElement Customer_Name;


@FindBy(xpath="//*[@id=\"button-filter\"]")
private WebElement filterBtn;

@FindBy(xpath="//*[@id=\"input-email\"]")
private WebElement Email;



public void sendUserName(String userName) {
	this.userName.clear();
	this.userName.sendKeys(userName);
}

public void sendPassword(String password) {
	this.password.clear(); 
	this.password.sendKeys(password); 
}

public void clickLoginBtn() {
	this.loginBtn.click(); 
}
//Selection option Customer and Customers
	
public  void clickCustomerlog() throws InterruptedException {
Actions action = new Actions(driver);
action.moveToElement(this.Customericon).build().perform();
Thread.sleep(2000);
this.Customerstab.click();
}
public void sendCustomer(String Customers_Name) {
	this.Customer_Name.clear();
	this.Customer_Name.sendKeys(Customers_Name);
}

public void clickfilterBtn() {
	this.filterBtn.click(); 
}

public void sendCustomerEmailID(String Email) {
	this.Email.clear();
	this.Email.sendKeys(Email);
}
public void clickfiterBtn2() {
	this.filterBtn.click(); 
}


public void clearCustomer_Name() {
	this.Customer_Name.clear();
}
}
