package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Name {
public WebDriver driver;	
@FindBy(id="ap_customer_name") WebElement Name;

public void Name(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public void name() {
	Name.sendKeys("Adnan");	
	}
	
}
