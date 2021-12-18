package PageObjectModel;// 12/15/21

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
	public static WebDriver driver;
	@Test(priority=1)
  public void f() throws InterruptedException {
		Home ob=new Home(driver);
		ob.SignToClick();
		Thread.sleep(3000);
		SignInPage it=new SignInPage(driver); //We are creating an object to call it from its class 
		Thread.sleep(3000);
		it.EmailFieldKeys();
		Thread.sleep(3000);
		it.ContinueButtonClick();
		
  }
	
	@Test(priority=2)
	public void VerificationOfText() throws InterruptedException {
	Home ob=new Home(driver);
	ob.SignToClick();
	Thread.sleep(3000);
	SignInPage it=new SignInPage(driver); //We are creating an object to call it from its class 
	Thread.sleep(3000);
	it.EmailFieldKeys();
	Thread.sleep(3000);
	it.ContinueButtonClick();
	String errorit=it.text();
	System.out.println(errorit);
	SoftAssert soft=new SoftAssert();
	soft.assertAll();
	soft.assertEquals(errorit, "We cannot find an account with that email address");
	System.out.println("This is after assertion");
	}
	
  @BeforeMethod
  public void beforeMethod() {
	 browsers("chrome","https://www.amazon.com/");
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }
  public void browsers(String browser, String wbsite) {
	  if(browser.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	   }else if(browser.equalsIgnoreCase("Edge")){
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\adnan\\git\\repository\\Automationtraining\\src\\Drivers\\msedgedriver.exe");
			  driver=new EdgeDriver();  
			  driver.navigate().to(wbsite);
			  driver.manage().window().maximize();
	  } else {
		 System.out.println("Correct browser name");
	  }
  }

}
