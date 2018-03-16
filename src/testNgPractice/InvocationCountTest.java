package testNgPractice;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10) // it means it will run this 10 times
	public void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}
}
