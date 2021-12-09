package PeopleNTech.Automationtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoard {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement Searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		Searchfield.sendKeys("Computer");
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		Searchfield.clear();
		Thread.sleep(3000);
		Searchfield.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//WebElement Searchfield6=driver.findElement(By.id("twotabsearchtextboxit"));
		
		
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.elementToBeClickable(Searchfield));
		
		
		
	}

}
