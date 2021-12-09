package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();////*[text()='Flights']
		Thread.sleep(4000);
		WebElement selectdate=driver.findElement(By.xpath("//*[@class='uitk-tab-text']"));
		selectdate.click();
		Thread.sleep(4000);
		//WebElement departdate=driver.findElement(By.xpath(null))
		
		
		
	}

}
