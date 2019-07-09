package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC7_DateCalendarPOM {
	private WebDriver driver; 
	
	public  TC7_DateCalendarPOM(WebDriver driver) {
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
	
	
	@FindBy(linkText="Orders")
	private WebElement Orderstab;
	
	@FindBy(xpath="//*[@id=\"input-order-id\"]")
	private WebElement OrderID;
	
   // @FindBy(xpath="//*[contains(text(),'abc abc')]//following-sibling::td[5]//a[1]")
    //private WebElement viewbtn;
 
	 @FindBy(xpath="//*[@id=\"button-filter\"]")
	 private WebElement filterbtn;
	 
	 @FindBy(xpath="//*[@id=\"input-order-status\"]")
	 private WebElement OrdStatus;
	 
	 @FindBy(linkText="Pending")
	 private WebElement SelectPending;
	 
	 //this is for to click on Date Added calendar
	 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div/div[3]/div[1]/div/span/button/i")
	 private WebElement AddDateCalendar;
	 
	 @FindBy(xpath="//*[@id=\"input-customer\"]")
	 private WebElement Customername;
	 
	 @FindBy(xpath="//*[@id=\"input-date-added\"]")
	 private WebElement ClickAddcurrentDate;
	 
	 @FindBy(xpath="//*[@id=\"input-total\"]")
	 private WebElement Total;

	 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div/div[3]/div[2]/div/span/button")
	 private WebElement ModifiedDatecalendar;
	 
	 @FindBy(xpath="//*[@id=\"input-date-modified\"]")
	 private WebElement ClickModifiedCurrentDate;
	 
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
public  void clicksalelog() throws InterruptedException {
	Actions action = new Actions(driver);
	
	action.moveToElement(this.sale).build().perform();
	Thread.sleep(2000);
	this.Orderstab.click();
	}
	
public void enterOrdIDtextbox(String Ordertext) {
	this.OrderID.clear();
	this.OrderID.sendKeys(Ordertext);
	
	
}

/*public void vieword() {
	this.viewbtn.click();
	}*/

public void clickfilter() {
	this.filterbtn.click();
}

public void Orderstatustextbox() throws InterruptedException{
//	this.OrdStatus.click();
	 Select list = new Select(this.OrdStatus);
	    
	   int size = list.getOptions().size();
	
	    Thread.sleep(1000);
	    int i;
	    
	    for(i=0;i<size;i++) {

		
		list.selectByIndex(i);
		
		list.selectByIndex(9);
		//String listitems = list.getFirstSelectedOption().getText();
		list.selectByVisibleText("Pending");
		//list.selectByIndex(9); 
	    }
}
//this for click on Add Date calendar
public void clickAddDate() {
	this.AddDateCalendar.click();
}

//this if for click on particular here it is selecting current date
public void ClickcurrentAddDate() {
	this.ClickAddcurrentDate.click();
}


public void EnterCustomername(String Customername) {
	this.Customername.clear();
	this.Customername.sendKeys(Customername);
}


public void EnterTotalnoofprd(String Total) {
	this.Total.clear();
	this.Total.sendKeys(Total);
}
// this is for click on modify date calendar
public void ClickModifyDate() {
	this.ModifiedDatecalendar.click();
}

// this is for click on modified date (particular date)
public void ClickCurrentModifyDate() {
	this.ClickModifiedCurrentDate.click();
}
}



