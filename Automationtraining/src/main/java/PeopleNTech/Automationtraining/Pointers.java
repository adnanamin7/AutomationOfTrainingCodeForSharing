package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointers {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement views=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.move)
		Thread.sleep(3000);
		WebElement books=driver.findElements(By.linkText(null))
	}

}
