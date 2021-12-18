package PageObjectModel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonCreateAccount {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  ClickSignin obj=new ClickSignin();
	  obj.clicksignin();
	  Thread.sleep(3000);
	  ClickCreateAccount ob=new  ClickCreateAccount();
	  ob.clickcreateaccount();
	  Thread.sleep(3000);
	  Name method1=new Name(); //Creating a new object for "Name" class
	  method1.name(); // calling the method "name" from "Name" class
	  Thread.sleep(3000);
	  Mobile method2=new Mobile();
	  method2.MobileNumber();
	  Thread.sleep(3000);
	  Password method3=new Password();
	  method3.EnterPassword();
	  Thread.sleep(3000);
	  ReenterPW method4=new ReenterPW();
	  method4.Reenter();
	  Thread.sleep(3000);
	  ContinueButton method5=new ContinueButton();
	  method5.ClickContinue();
	  
	  Thread.sleep(3000);
	  driver.close();
	  	  
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
