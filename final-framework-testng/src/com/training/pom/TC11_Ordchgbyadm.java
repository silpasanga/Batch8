package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC11_Ordchgbyadm {

private static WebDriver driver; 
	
	
	public TC11_Ordchgbyadm(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}


@FindBy(id="input-username")
private WebElement userName; 

@FindBy(id="input-password")
private WebElement password;


@FindBy(xpath="//button[contains(text(),'Login')]")
private WebElement loginBtn; 



//@FindBy(css="i.fa.fa-shopping-cart.fa-fw")
//private WebElement sale;

@FindBy(xpath="//*[@id=\"customer\"]/a/i")
private WebElement Customericon;

@FindBy(linkText="Customers")
private WebElement Customers;

@FindBy(xpath="(//a[contains(@class,'btn btn-primary')])[2]")
private WebElement Editbtn;

@FindBy(xpath="//*[@id=\"input-firstname\"]")
private WebElement Firstname;

@FindBy(xpath="//*[@id=\"address\"]/li[2]/a")
private WebElement Address1tab;

@FindBy(xpath="//*[@id=\"input-postcode1\"]")
private WebElement Postcode;

@FindBy(xpath="//*[@id=\"form-customer\"]/ul/li[4]/a")
private WebElement Rewardpoints;

@FindBy(xpath="//*[@id=\"input-points\"]")
private WebElement points;

@FindBy(xpath="//*[@id=\"button-reward\"]")
private WebElement AddRewardPointstab;

@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
private WebElement savebutton;

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


public void clickcustomerslog() {
	
	Actions action = new Actions(driver);

	action.moveToElement(this.Customericon).build().perform();
	//Thread.sleep(2000);
	this.Customers.click();
}

public void clickeditbtn() {
	this.Editbtn.click();
}
}
