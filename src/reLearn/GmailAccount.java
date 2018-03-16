package reLearn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl="https://accounts.google.com/SignUp";
		 		 
		driver.get(baseUrl);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
			 WebElement firstName=driver.findElement(By.name("FirstName"));
			 firstName.clear();
			 firstName.sendKeys("First");
			 
			 WebElement lastName=driver.findElement(By.name("LastName"));
			 lastName.clear();
			 lastName.sendKeys("Last");
			 
			 WebElement userName=driver.findElement(By.name("GmailAddress"));
			 userName.clear();
			 userName.sendKeys("testingqaz123@gmail.com");
			 
			 WebElement password=driver.findElement(By.name("Passwd"));
			 password.clear();
			 password.sendKeys("test@123xyz");
			 
			 WebElement Repassword=driver.findElement(By.name("Passwd"));
			 Repassword.clear();
			 Repassword.sendKeys("test@123xyz");
			 
			 List<WebElement> buttons=driver.findElements(By.tagName("a"));
			 for(int i=0;i<buttons.size();i++)
			 {
				 System.out.println(buttons.get(i).toString());
			 }
			 driver.quit();
			 }
			 
		 }

	

