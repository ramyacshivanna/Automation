package testNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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
	}
	
	@Test(priority=3,groups="link")
	public void mailLinkTest()
	{
		
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
		
	}
	
	@Test(priority=2,groups="logo")
	public void googleLogoTest()
	{
		
		boolean b=driver.findElement(By.id("lst-ib")).isDisplayed();
				System.out.println(b);
	}
	
	@Test(priority=5,groups="test")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=4,groups="test")
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	@Test(priority=6,groups="test",enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
