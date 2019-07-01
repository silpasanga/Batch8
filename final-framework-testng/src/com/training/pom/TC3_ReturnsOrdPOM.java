package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC3_ReturnsOrdPOM {

private static WebDriver driver; 
	
	
		public TC3_ReturnsOrdPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement loginBtn; 
	
	

	@FindBy(css="i.fa.fa-shopping-cart.fa-fw")
	private WebElement sale;
	
	
	@FindBy(linkText="Returns")
	private WebElement Returns;
	
	@FindBy(id="input-return-id")
	private WebElement ReturnID;
	
	@FindBy(xpath="//*[@id=\"button-filter\"]")
	private WebElement filterBtn;
	
	@FindBy(xpath="//*[@name='filter_customer']")
	private WebElement CustomerID;
	
	
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
	//Selection option cart and then recurring
		
	public  void clicksalelog() throws InterruptedException {
	Actions action = new Actions(driver);
	
	action.moveToElement(this.sale).build().perform();
	Thread.sleep(2000);
	this.Returns.click();
 }
	public void sendReturnID(String ReturnID) {
		this.ReturnID.clear();
		this.ReturnID.sendKeys(ReturnID);
	}
	
	
	public void clickfiterBtn() {
		this.filterBtn.click(); 
	}
	public void sendCustomerID(String CustomerID) {
		this.CustomerID.clear();
		this.CustomerID.sendKeys(CustomerID);
	}
	public void clickfiterBtn2() {
		this.filterBtn.click(); 
	}
	public void clearReturnID() {
		this.ReturnID.clear();
	}
	
}


