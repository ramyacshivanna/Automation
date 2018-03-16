package testNgPractice;

import org.testng.annotations.Test;

public class TestNgDependency {
	
	@Test()
	public static void loginPageTest()
	{
		System.out.println("loginPageTest");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods= {"loginPageTest"})  // If loginPageTest gets failed, it will skip homePageTest
	public static void homePageTest()     // if loginPageTest  gets passed, it will execute homePageTest also since homePageTest is dependent on loginPageTest
	{
		System.out.println("homePageTest");
	}
	
	@Test(dependsOnMethods= {"loginPageTest"})
	public static void searchPageTest()
	{
		System.out.println("serchPageTest");
		//int i=9/0;
	}


}
