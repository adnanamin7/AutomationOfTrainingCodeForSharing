package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueButton {
public WebDriver driver;
@FindBy(id="continue") WebElement Continue;

public void Continue(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void ClickContinue() {
Continue.click();	
}


}
