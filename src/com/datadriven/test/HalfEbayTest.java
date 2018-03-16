package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest {
	
WebDriver driver;
	
@BeforeMethod
public void setup()
{
	 System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
}

@DataProvider
public Iterator<Object[]> getTestData()
{
	ArrayList<Object[]> testData=TestUtil.getDataFromExcel();
	return testData.iterator();
}


@Test(dataProvider="getTestData")
public void halfEbayReg(String firstname, String lastname, String address1, String address2, String city, String state, String zipcode, String emailaddress)
{
	driver.findElement(By.name("firstname")).clear();
	driver.findElement(By.name("firstname")).sendKeys(firstname);
	
	driver.findElement(By.name("lastname")).clear();
	driver.findElement(By.name("lastname")).sendKeys(lastname);
	
	driver.findElement(By.name("address1")).clear();
	driver.findElement(By.name("address1")).sendKeys(address1);
	
	driver.findElement(By.name("address2")).clear();
	driver.findElement(By.name("address2")).sendKeys(address2);
	
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys(city);
	
	Select select=new Select(driver.findElement(By.id("state")));
	select.selectByVisibleText("Maryland");
	
	driver.findElement(By.id("zip")).clear();
	driver.findElement(By.id("zip")).sendKeys(zipcode);
	
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(emailaddress);
	
	driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
	driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailaddress);
	
		
	
}

@AfterMethod
public void tearDown()
{
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MINUTES);
	driver.quit();
}

}
