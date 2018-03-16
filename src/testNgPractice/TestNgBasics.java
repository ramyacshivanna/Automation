package testNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 1=@BeforeSuite
 2=@BeforeTest
 3=@BeforeClass
 4=@BeforeMethod. If more than 1 @test methods are there, before every @test method, it will be executed.
 5=@Test
 6=@AfterMethod
 7=@AfterClass
 8=@AfterTest
 9=@AfterSuite
 */
// Test Ng design testcases in systematic way
//html reports
//different annotations
//Priority/sequences
//Dependency
//grouping
//open source

public class TestNgBasics {
		
	@BeforeSuite
	public void setUp()
	{
		System.out.println("set up system property of chrome");
	}
		
	@BeforeTest  
	public void launchBrowser()
	{
		System.out.println("Launch browser");
	}
	

	@BeforeClass
		public void Login()
	{
		System.out.println("Login to system");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Test the title");
		
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search Test ");
	}
	
	@Test
	public void googleLogoTest()
	{
		System.out.println("Google Logo test");
	}
	
	
	@AfterMethod // executes after every test
	public void logOut()
	{
		System.out.println("logout");		
	}
		
	@AfterClass
	public void closeBrowser()  // after execution of all @test testcases, 
	{
		System.out.println("Close browser");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}
	
	
	/*
	@AfterSuite
	public void generateTestReport ()
	{
		System.out.println("Generate Test Report");
	}
	*/		
	
}
