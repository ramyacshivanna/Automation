package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usage=2943ru=");
		
		//id
		WebElement firstname=driver.findElement(By.id("firstname"));
				
		//1. xpath
		//driver.findElement(By.xpath("(\\*[@id='firstname']"));
		
		//2. Id
		firstname.clear();
		firstname.sendKeys("Ramya");
		
		//3. name
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.clear();
		lastname.sendKeys("navi");
		
		//4. linktext
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5.partiallinktext
		//driver.findElement(By.partialLinkText("how to pick")).click();
		
		//6.css selector
		//WebElement address1=driver.findElement(By.name("address1"));
		
		WebElement address1=driver.findElement(By.cssSelector("#address1"));
		address1.clear();
		address1.sendKeys("no 100, 1st cross");
		
		WebElement address2=driver.findElement(By.cssSelector("#address2"));
		address2.clear();
		address2.sendKeys("vijay nagar, mysore");
		
		//7. classname. it can be duplicate.
		//driver.findElement(By.className("ancAsb"))// signin
		
		Select select=new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("California");
				
	}

}
