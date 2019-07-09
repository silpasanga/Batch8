package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC9_OrdplacePOM {

	private static WebDriver driver; 
	
	
	public TC9_OrdplacePOM(WebDriver driver) {
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


@FindBy(xpath="(//a[contains(@class,'btn btn-primary')])[1]")
private WebElement Addnew;


@FindBy(xpath="//*[@id=\"input-order-id\"]")
private WebElement OrderIDtextbox; 

@FindBy(xpath="//*[@id=\"input-customer\"]")
private WebElement Customertextbox;

@FindBy(xpath="//*[@id=\"input-firstname\"]")
private WebElement Firstname;

@FindBy(xpath="//*[@id=\"input-lastname\"]")
private WebElement Lastname;

@FindBy(xpath="//*[@id=\"input-email\"]")
private WebElement Email;

@FindBy(xpath="//*[@id=\"input-telephone\"]")
private WebElement Telephone;

@FindBy(xpath="//*[@id=\"input-product\"]")
private WebElement ProdTextBox;

@FindBy(xpath="//*[@id=\"input-model\"]")
private WebElement ModelTextBox;

@FindBy(xpath="//*[@class='fa fa-save']")
private WebElement Savebtn;

//@FindBy(xpath="//*[@id=\"form-return\"]/div/table/tbody/tr[1]/td[1]/input")
@FindBy(xpath="(//*[contains(@name,'selected[]')] )[1]")


private WebElement checkbox;

@FindBy(xpath="//*[@class='btn btn-danger']")
private WebElement DeleteBtn;

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

public void clickAddNew() {
	this.Addnew.click();
}

public void enterOrdIDtextbox(String OrderIDtextbox) {
	this.OrderIDtextbox.clear();
	this.OrderIDtextbox.sendKeys(OrderIDtextbox);
	
}

public void enterCustname(String Customertextbox) {
	this.Customertextbox.clear();
	this.Customertextbox.sendKeys(Customertextbox);
}
public void enterFirstname(String Firstname) {
	this.Firstname.clear();
	this.Firstname.sendKeys(Firstname);
}
public void enterLastname(String Lastname) {
	this.Lastname.clear();
	this.Lastname.sendKeys(Lastname);
}
public void enteremail(String Email) {
	this.Email.clear();
	this.Email.sendKeys(Email);
}
	public void enterTelephone(String Telephone) {
		this.Telephone.clear();
		this.Telephone.sendKeys(Telephone);
	}
	public void enterProdtextbox(String ProdTextBox) {
		this.ProdTextBox.clear();
		this.ProdTextBox.sendKeys(ProdTextBox);
	}
	
	public void enterModelTextboc(String ModelTextBox) {
		this.ModelTextBox.clear();
		this.ModelTextBox.sendKeys(ModelTextBox);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)");
	}
	
	public void clicksavebtn() {
		this.Savebtn.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	
	public void clickcheckbox() {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		this.checkbox.click();
	}
	
	public void clickDelete() {
		this.DeleteBtn.click();
	}
	
}
