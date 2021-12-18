package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile {
public WebDriver driver;
@FindBy(id="ap_email") WebElement MobileNumber;	


public void Mobile(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}

public void MobileNumber() {
MobileNumber.sendKeys("123");

	}
}
