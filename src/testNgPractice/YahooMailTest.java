package testNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooMailTest {
		
	@BeforeClass  //1
	public void launchBrowser()
	{
		System.out.println("Launch browser");
	}

	@BeforeMethod //It executes before it executes any testcases
	public void login()
	{
		System.out.println("login to app");
	}
	
	
	@Test (priority=3)
	public void composeMailTest()
	{
		System.out.println("Compose mail test");
		
	}
	
	@Test(priority=1)
	public void deleteMailTest()
	{
		System.out.println("Delete mail test");
		
	}
	
	@Test(priority=2,enabled=false) // enabled=false means , testng will not execute this. This is disabled for execution
	public void searchMailTest()
	{
		System.out.println("searchMailTest");
	}
	
	
	@Test(priority=4)
	public void sentItemMailTest()
	{
		System.out.println("Sent item mail test");
		int i=9/0;
		
	}
	
	
	
	@AfterMethod // executes after every test
	public void logOut()
	{
		System.out.println("logout");		
	}
		
	
	@AfterClass
	public void quitBrowser()  // after execution of all @test testcases, 
	{
		System.out.println("Quit browser");
	}
	
}
