package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC6_CustPlaceOrdPOM {
	
private WebDriver driver; 
	
	public  TC6_CustPlaceOrdPOM(WebDriver driver) {
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
	
	// for Editbutton
	@FindBy(xpath="//*[contains(text(),'admin7 admin')]//following-sibling::td[5]//a[2]")
	private WebElement Editbtn;
	
	//for continue btn
	
	@FindBy(xpath="//*[@id=\"button-customer\"]")
	private WebElement Continuebtn;
	
	//for  remove button
	//@FindBy(xpath="//*[@id=\"cart\"]/tr[1]/td[6]/button")
	
	//@FindBy(xpath="//*[contains(text(),'TBSM-NUR-3rdSTD')]//following-sibling::td[4]//i")
	//@FindBy(xpath="//*[@id=\"cart\"]/tr[1]/td[6]/button/i")
	//@FindBy(xpath="//td[contains(text(),'TBSM-NUR-3rdSTD')]//following-sibling::td[4]//i")
	
	//@FindBy(xpath="//*[@id=\"cart\"]/tr[1]/td[6]/button/i")
	//@FindBy(xpath="//td[contains(text(),'TBSM-NUR-3rdSTD')]//following-sibling::td[4]")
	
	@FindBy(xpath="//td[contains(text(),'TBSM-NUR-3rdSTD')]//following-sibling::td[4]//i")
	private WebElement Removebtn;
	
	//for select product
	@FindBy(xpath="//*[@id=\"input-product\"]")
	private WebElement Chooseprd;
	
	
	// for quantity
	
	@FindBy(xpath="//*[@id=\"input-quantity\"]")
	private WebElement Quantity;
	//for add product
	
	@FindBy(xpath="//*[@id=\"button-product-add\"]")
	private WebElement Addproduct;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	private WebElement Countinue2btn;
	
	@FindBy(xpath="//*[@id=\"button-payment-address\"]")
	private WebElement Countinue3btn;
	
	@FindBy(xpath="//*[@id=\"button-save\"]")
	private WebElement Savebtn;
	
	/*@FindBy(xpath="//*[@id=\"featured-grid\"]/div[3]/div/div/div[2]/div[2]/button[1]/span")
	private WebElement AddtoCart;
	
	@FindBy(xpath="//*[@id=\"input-option386\"]")
	private WebElement selectsize;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	
	private WebElement AddtoCart2ndtime; this code is for userlogin and add prodct*/ 
	
	/*@FindBy(xpath="//a[@title='My Account']//span[@class='caret']")
	private WebElement MyAccount;
		
	
	@FindBy(xpath="//ul//li//a[text()='Login']")
	private WebElement loginicon;
	
		
    @FindBy(id="input-email")
	private WebElement inputemail; 
	
	//@FindBy(id="input-password")
	@FindBy(xpath="//*[@id=\"input-password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement LOGINBtn; */
	
	public void clickedit() {
		this.Editbtn.click();
	}
	
	public void clickcontinue() {
		this.Continuebtn.click();
	}
	
	public void clickRemove() {
		this.Removebtn.click();
	}
	
	public void chooseproduct(String Chooseprd) {
		this.Chooseprd.clear();
		this.Chooseprd.sendKeys(Chooseprd);
	}
	
	public void enterQnty(String Quantity) {
			this.Quantity.clear();
		    this.Quantity.sendKeys(Quantity);
		}
		
		public void addprd() {
		this.Addproduct.click();
		}
	
		public void presscountine2() {
			this.Countinue2btn.click();
			
			}
		
		public void presscountinue3() {
			this.Countinue3btn.click();
		}
		
		public void clicksave() {
			this.Savebtn.click();
		}
	/*/public void chooseproduct() throws InterruptedException {
	
      Select list = new Select(this.Chooseprd);
    
	   int size = list.getOptions().size();
	
	    Thread.sleep(1000);
	    int i;
	    
	    for(i=0;i<size;i++) {

		
		list.selectByIndex(i);
		
		String listitems = list.getFirstSelectedOption().getText();
		//list.selectByVisibleText("Complete");
		list.selectByIndex(1); 
		}
	}

	
	
	/*public void addtocart()  {
		this.AddtoCart.click();
	}*/
	
	/*public void addtocartt() {
		this.AddtoCart.click();*/
		
	
	}
	
	/*public void choosesize() {
		this.selectsize.click();
	}*/
	// this code is to select size of prodctu
/*	public void choosesize() throws InterruptedException {
	Select list = new Select(this.selectsize);
    
	int size = list.getOptions().size();
	
	Thread.sleep(1000);
	int i;
	for(i=0;i<size;i++) {

		
		list.selectByIndex(i);
		//Thread.sleep(1000);

		String listitems = list.getFirstSelectedOption().getText();
		//list.selectByVisibleText("Complete");
		list.selectByIndex(1); }
	        }
	this code is to select size of prodctu*/
	//public void addtocart2nd() {
		
		//this.AddtoCart2ndtime.click();
	//}
	
	/*public void login() throws Exception {
		
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Actions actions = new Actions(driver);
	
	actions.moveToElement(this.MyAccount).click().build().perform();
	Thread.sleep(4000);
	actions.moveToElement(loginicon).click().build().perform();
	
	}
	 	
	
	public void enteremail(String inputemail) {
		this.inputemail.clear();
		this.inputemail.s
	}
	
	public void enterPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.LOGINBtn.click(); 
	} */

	

	
//}



