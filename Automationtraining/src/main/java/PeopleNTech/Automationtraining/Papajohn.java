package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Papajohn {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adnan\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.papajohns.com");
		driver.manage().window().maximize();
	
		
	//Pause here
		
		WebElement Starturorder=driver.findElement(By.xpath("//*[contains(text(),'Start Your Order')]"));
		Starturorder.click();
		Thread.sleep(3000);
		
	    WebElement selectcountry=driver.findElement(By.id("locations-country"));
		Select ob=new Select(selectcountry);
		ob.selectByVisibleText("USA");
		//selectcountry.click();
		
		Thread.sleep(2000);
		WebElement selectresidence=driver.findElement(By.id("locations-addresstype"));
		Select residence=new Select(selectresidence);
		residence.selectByVisibleText("Residence");
		//selectresidence.click();
		
	
		Thread.sleep(2000);
		WebElement streetaddress=driver.findElement(By.id("autocomplete"));
		streetaddress.click();
		streetaddress.sendKeys("1235 Wilshire Drive");
		
		Thread.sleep(2000);
		WebElement aptfloor=driver.findElement(By.name("aptstefloor"));
		Select apt=new Select(aptfloor);
		apt.selectByVisibleText("Floor");
		
		Thread.sleep(2000);
		WebElement floor=driver.findElement(By.name("residential-roomnumber"));
		floor.sendKeys("1");
		
		Thread.sleep(2000);
		WebElement zipcode=driver.findElement(By.name("zipcode"));
		zipcode.sendKeys("20170");
		
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//input[@class='button button-large']"));
		submit.click();  
		
		Thread.sleep(2000);
		WebElement Menu=driver.findElement(By.xpath("//*[text()='Menu']"));
		Menu.click();
		
		/*Thread.sleep(2000);
		WebElement PepPizza=driver.findElement(By.xpath("//*[@aria-label='Pepperoni Pizza Order Now ']"));
		//PepPizza.click();*/
		
		Thread.sleep(2000);
		WebElement order=driver.findElement(By.xpath("//button[@class='button button--small d-none d-md-inline-block button--white']"));
		order.click();
		
		Thread.sleep(2000);
		WebElement checkout=driver.findElement(By.xpath("//a[@data-track-click='global|added to cart banner|checkout']"));
		checkout.click();
		
	}

}
