package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourAmazonAccount {
	public WebDriver driver;
	@FindBy(id="createAccountSubmit") WebElement CreateAccount;
	@FindBy(id="ap_customer_name") WebElement Name;
	@FindBy(id="ap_email") WebElement MobileNumber;
	@FindBy(id="ap_password") WebElement Password;
	@FindBy(id="ap_password_check") WebElement ReenterPw;
	
	public void CreateAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void ClickCreateAccount() {
	CreateAccount.click();
	}
	public void Name() {
	Name.sendKeys("Adnan");			
	}
	public void MobileNumber() {
	MobileNumber.sendKeys("911");	
	}
	public void Password() {
	Password.sendKeys("1234");	
	}
	public void ReenterPw() {
	ReenterPw.sendKeys("1234");	
	}
	
}
