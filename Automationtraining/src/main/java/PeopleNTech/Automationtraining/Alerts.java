package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement simplealert=driver.findElement(By.id("confirmButton"));	
		simplealert.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		simplealert.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

}
