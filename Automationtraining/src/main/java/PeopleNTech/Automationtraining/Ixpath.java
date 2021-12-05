package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixpath {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement fields=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		fields.sendKeys("Adnan");
		WebElement fields2=driver.findElement(By.xpath("//input[@name='pass']"));
		fields2.sendKeys("1234");
		Thread.sleep(6000);
		WebElement button=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		button.click();
		Thread.sleep(6000);
		/*     //[contains(@id,'message')]     */
		/*WebElement newaccount=driver.findElement(By.xpath("//*[contains(@id,'u_0_2_8W')]"));
		newaccount.click();*/
		/*  Xpath=//*[contains(text(),'Forgot')]  */
		WebElement forgotaccount=driver.findElement(By.xpath("//*[contains(text(),'Forgot')]"));
		forgotaccount.click();
		
		
		
		
	}

}
//tagname[@attributename='value'] 