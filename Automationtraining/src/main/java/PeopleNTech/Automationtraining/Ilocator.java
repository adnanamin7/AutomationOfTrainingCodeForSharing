package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocator {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement SearchIcon=driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(6000);
		SearchIcon.click();
		Thread.sleep(6000);
		WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));
		bestsellers.click();
		Thread.sleep(6000);
		WebElement linktxt=driver.findElement(By.partialLinkText("Epic"));
		linktxt.click();
		Thread.sleep(6000);
		WebElement searchfield=driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("Computer");
		Thread.sleep(4000);
		WebElement SearchIcon6=driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon6.click();
	}

}
