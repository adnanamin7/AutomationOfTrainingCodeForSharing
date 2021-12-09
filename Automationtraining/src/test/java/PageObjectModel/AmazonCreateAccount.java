package PageObjectModel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonCreateAccount {
	public static WebDriver driver;
  @Test
  public void f() {
	  ClickCreateAccount ob=new  ClickCreateAccount;
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
