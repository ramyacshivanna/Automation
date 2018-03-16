package com.excel.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;


public class DataDrivenTest {

	public static void main(String[] args) {
	 Xls_Reader reader=new Xls_Reader("C:/Users/ramyacs/Documents/Eclipse_Workspace/Automation/src/com/testdata/HalfEbayTestdata.xlsx");
	 String firstname=reader.getCellData("RegTestData", "firstname", 2);
	 System.out.println(firstname);	 
	 
	 String lastname=reader.getCellData("RegTestData", "lastname", 2);
	 System.out.println(lastname);
	 
	 String address1=reader.getCellData("RegTestData", "address1", 2);
	 System.out.println(address1);
	 
	 String address2=reader.getCellData("RegTestData", "address2", 2);
	 System.out.println(address2);
	 
	 String city=reader.getCellData("RegTestData", "city", 2);
	 System.out.println(city);
	 
	 String state=reader.getCellData("RegTestData", "state", 2);
	 System.out.println(state);
	 
	 String zipcode=reader.getCellData("RegTestData", "zipcode", 2);
	 System.out.println(zipcode);
	 
	 String emailaddress=reader.getCellData("RegTestData", "emailaddress", 2);
	 System.out.println(emailaddress);
	  
			
	 System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usage=2943ru=");
	// driver.findElement(By.xpath("//*[id='firstname']*")).sendKeys(firstname);
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

}
