package PageObjectModel;// 12/15/21

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SignInAmazon extends Utility {
	
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
	public void VerificationOfText() throws InterruptedException, IOException {
	Home ob=new Home(driver);
	ob.SignToClick();
	shots();
	Thread.sleep(3000);
	SignInPage it=new SignInPage(driver); //We are creating an object to call it from its class 
	Thread.sleep(3000);
	it.EmailFieldKeys();
	Thread.sleep(3000);
	shots();
	it.ContinueButtonClick();
	shots();
	String errorit=it.text();
	System.out.println(errorit);
	SoftAssert soft=new SoftAssert();
	soft.assertAll();
	soft.assertEquals(errorit, "We cannot find an account with that email address");
	System.out.println("This is after assertion");
	}
}
	
 /* @BeforeMethod
  public void beforeMethod() {
	 browsers("chrome","https://www.amazon.com/");
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }
  public void browsers(String browser, String wbsite) {
	  String local=System.getProperty("user.dir");
	  System.out.println("local");
	  if(browser.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver", local+"\\src\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	   }else if(browser.equalsIgnoreCase("Edge")){
		  System.setProperty("webdriver.edge.driver", local+"C\\src\\Drivers\\msedgedriver.exe");
			  driver=new EdgeDriver();  
			  driver.navigate().to(wbsite);
			  driver.manage().window().maximize();
	  } else {
		 System.out.println("Correct browser name");
	  }
  }
  public void shots() throws IOException { //   12/15/21
	  Date dt= new Date();
	  System.out.println(dt);
	  String it=dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(it);
	  String local=System.getProperty("user.dir");
	  File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(stored,new File(local+"\\Picture\\"+it+"captured.jpeg"));
	  
  }

} */