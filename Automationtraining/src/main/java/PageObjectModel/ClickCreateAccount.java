package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickCreateAccount {
	public WebDriver driver;
	@FindBy(id="createAccountSubmit") WebElement CreateAccount;

public void ClickCreateAccount(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

public void clickcreateaccount() {
CreateAccount.click();
	}

	
}