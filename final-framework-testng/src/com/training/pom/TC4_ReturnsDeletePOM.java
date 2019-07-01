package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC4_ReturnsDeletePOM {
	private static WebDriver driver; 
	
	
	public TC4_ReturnsDeletePOM(WebDriver driver) {
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


@FindBy(xpath="//*[@id=\"form-return\"]/div/table/tbody/tr[1]/td[1]/input")
private WebElement checkboxReturns;

@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
private WebElement clickDelete;

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
//Selection option cart and then returns
	
public  void clicksalelog() throws InterruptedException {
Actions action = new Actions(driver);

action.moveToElement(this.sale).build().perform();
Thread.sleep(2000);
this.Returns.click();
}

public void clickcheckboxReturns() {
	this.checkboxReturns.click(); 
}


public void clickDelete() throws InterruptedException{
	this.clickDelete.click();
						
   Alert alert = driver.switchTo().alert();
	alert.accept();
}



}




