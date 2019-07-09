package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC8_CatagoriesPOM {

private WebDriver driver; 
	
	public  TC8_CatagoriesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement loginBtn; 

	@FindBy(css="i.fa.fa-tags.fa-fw")
	private WebElement Categories;

	@FindBy(linkText="Categories")
	private WebElement Categoriestab;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a[1]/i")
	private WebElement AddNewcat;
	
	@FindBy(xpath="//*[@id=\"input-name1\"]")
	private WebElement CategoryName;
	
  	
	@FindBy(xpath="//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
	private WebElement Notesondescription;
	
	@FindBy(xpath="//*[@id=\"input-meta-title1\"]")
	private WebElement MetatagTitle;
	
	@FindBy(xpath="//*[@id=\"input-meta-description1\"]")
	private WebElement Metatagdescription;
	
	@FindBy(xpath="//*[@id=\"form-category\"]/ul/li[2]/a")
	private WebElement Datatab;
	
	@FindBy(xpath="//*[@id=\"form-category\"]/ul/li[3]/a")
	private WebElement Designtab;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement savebtn;
	
	@FindBy(linkText="Products")
	private WebElement Products;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a/i")
	private WebElement AddnewPrd;
	
	@FindBy(xpath="//*[@id=\"input-name1\"]")
	private WebElement ProductName;
	
	@FindBy(xpath="//*[@id=\"input-meta-title1\"]")
	private WebElement Metatagtitleprd;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")
	private WebElement Datatabprd;
	
	@FindBy(xpath="//*[@id=\"input-model\"]")
	private WebElement Model;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a")
	private WebElement Linkstab;
	
	@FindBy(xpath="//*[@id=\"input-category\"]")
	private WebElement categoriestextbox;
	
	@FindBy(linkText="Sports Uniform")
	private WebElement SportsUniform;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[4]/a")
	private WebElement Attribute; 
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[5]/a")
	private WebElement Options;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[6]/a")
	private WebElement Recurring;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[7]/a")
	private WebElement Discount;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[8]/a")
	private WebElement Special;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[9]/a")
	private WebElement Image;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
	private WebElement Rewardpoints;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
	private WebElement DESING;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
	private WebElement SavePrd;
	
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

public  void clickCatagorylog() throws InterruptedException {
	Actions action = new Actions(driver);
	
	action.moveToElement(this.Categories).build().perform();
	Thread.sleep(2000);
	this.Categoriestab.click();
	
	}

 public void clickAddcat() {
	 this.AddNewcat.click();
 }
 
 public void entercategoryname(String AddNewcat) {
	 this.CategoryName.clear();
	 this.CategoryName.sendKeys(AddNewcat);
 }
 public void enterNotesondescription(String Notesondescription) {
	 this.Notesondescription.clear();
	 this.Notesondescription.sendKeys(Notesondescription);
 }
 public void enterMetatagTitle(String MetatagTitle) {
	 this.MetatagTitle.clear();
	 this.MetatagTitle.sendKeys(MetatagTitle);
 }
 public void enterMetatagdiscription(String Metatagdescription) {
	 this.Metatagdescription.clear();
	 this.Metatagdescription.sendKeys(Metatagdescription);
 
 

 JavascriptExecutor jse = (JavascriptExecutor)driver;
 jse.executeScript("window.scrollBy(0,-250)");
}
 
 public void clickonDatatabprd() {
	 this.Datatabprd.click();
	 
 }
 
 public void clickonDesingtab() {
	 this.Designtab.click();
 }
 public void clickonsave() {
	 this.savebtn.click();
 }
 
 public  void clickCartlog() throws InterruptedException {
		Actions action = new Actions(driver);
		
		action.moveToElement(this.Categories).build().perform();
		Thread.sleep(2000);
		this.Products.click();
		
		}
 
 public void clickAddnewPrd() {
	 this.AddnewPrd.click();
 }
 
 public void clickProductName(String ProductName) {
	 this.ProductName.clear();
	 this.ProductName.sendKeys(ProductName);
 }
 
 public void enterMetatagtitleprd(String Metatagtitleprd) {
	 this.Metatagtitleprd.clear();
	 this.Metatagtitleprd.sendKeys(Metatagtitleprd);
	 
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,-250)");
	 
 }
 public void clickonDatatab() {
	 this.Datatab.click();
	 
 }
 
 public void enterModelname(String Model) {
	 this.Model.clear();
	 this.Model.sendKeys(Model);
 }
 
 public void clickLinkstab() {
	 this.Linkstab.click();
 }
 
 public void entercategories(String categoriestextbox) {
	 this.categoriestextbox.clear();
	 this.categoriestextbox.sendKeys(categoriestextbox);
 }
 
 public void clickAttribute() {
	 this.Attribute.click();
	  }
 
 public void clickoptions() {
	 this.Options.click();
 }
 
 
 public void clickRecurring() {
	 this.Recurring.click();
 }
 
 public void clickDiscount() {
	 this.Discount.click();
 }
 public void clickSpecial() {
	 this.Special.click();
 }
 
 public void clickImage() {
	 this.Image.click();
 }
 
 public void clickRewardpoints() {
	 this.Rewardpoints.click();
 }
 
 public void clickDESING() {
	 this.DESING.click();
 }
 public void clickSavePrd() {
	 this.SavePrd.click();
 }
 }


