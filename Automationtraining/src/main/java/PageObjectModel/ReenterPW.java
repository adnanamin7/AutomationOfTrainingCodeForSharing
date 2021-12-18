package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReenterPW {
public WebDriver driver;
@FindBy(id="ap_password_check") WebElement ReenterPw;

public void ReenterPw(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}

public void Reenter() {
	ReenterPw.sendKeys("Abcd");
}
}
