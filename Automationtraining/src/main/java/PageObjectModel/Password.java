package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password {
public WebDriver driver;
@FindBy(id="ap_password") WebElement Password;

public void Password(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void EnterPassword() {
Password.sendKeys("Abcd");	
}
}
