package testNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1,groups="title")
	public void getGoogleTitle()
	{
		
		String title=driver.getTitle();
		System.out.println("title is "+ title);
		
		Assert.assertEquals(title,"Google","title is not matched"); //to compare the expected result with current result
		//parameters: actual value, expected result, message to display when it fails(assertion error)
	}
	
	@Test()
	public void googleLogoTest()
	{
		
		boolean b=driver.findElement(By.id("lst-ib")).isDisplayed();
		Assert.assertTrue(b); //
		//Assert.assertEquals(b, "true");// any one of the 2 statements are fine
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
