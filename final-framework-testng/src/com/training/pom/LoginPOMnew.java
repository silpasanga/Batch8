package com.training.pom;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.training.sanity.tests.TOTAL;

public class LoginPOMnew {

	
private WebDriver driver; 
	
	public LoginPOMnew(WebDriver driver) {
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
	
	//first box checked under Orders
	
	//               //*[@id="form-order"]/div/table/tbody/tr[2]/td[1]/input[1]
	//            //*[@id="form-order"]/div/table/tbody/tr[1]/td[1]/input[1]
	@FindBy(xpath="//*[@id=\"form-order\"]/div/table/tbody/tr[1]/td[1]/input[1]")
	public WebElement ordercheckbox;
	
	////*[@id="button-delete12"]
	@FindBy(xpath="//*[@id=\"button-delete18\"]")
	public WebElement pressDelete;
	
		
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
		this.Orderstab.click();
		}
		
		
	 public void checkbox() {
	this.ordercheckbox.click();
	}
	
	public void pressDelete() throws InterruptedException{
			this.pressDelete.click();
								
		   Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		
	}



