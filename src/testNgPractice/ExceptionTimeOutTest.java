package testNgPractice;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test(timeOut=2000)//testcase should not take more than 2secs. To make sure that it will not keep on execute for long time
	public void infiniteLoopTest()
	{
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
		
	}
	
@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class) // if we are expecting any exception,
	public void test1()						//we can mention that exception here. Then it will not fail the testcses
	{
		String x="100A";
		Integer.parseInt(x);
		
		}
		
}

