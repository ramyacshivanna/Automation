package com.excel.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParameterizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		Xls_Reader reader=new Xls_Reader("C:/Users/ramyacs/Documents/Eclipse_Workspace/Automation/src/com/testdata/HalfEbayTestdata.xlsx");
		int rowCount=reader.getRowCount("RegTestData");
		
		//create one column called status 
		reader.addColumn("RegTestData", "status");
		
		for(int rowNum=2;rowNum<=rowCount;rowNum++)
		{
			String firstname=reader.getCellData("RegTestData", "firstname", rowNum);
			String lastname=reader.getCellData("RegTestData", "lastname", rowNum);
			String address1=reader.getCellData("RegTestData", "address1", rowNum);
			String address2=reader.getCellData("RegTestData", "address2", rowNum);
			String city=reader.getCellData("RegTestData", "city", rowNum);
			String state=reader.getCellData("RegTestData", "state", rowNum);
			String zipcode=reader.getCellData("RegTestData", "zipcode", rowNum);
			String emailaddress=reader.getCellData("RegTestData", "emailaddress", rowNum);
			
			
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
			
			//Here i want to write either pass or fail for the cell
			reader.setCellData("RegTestData", "status", rowNum,"pass" );
						
		}
			driver.quit();
	}

}
