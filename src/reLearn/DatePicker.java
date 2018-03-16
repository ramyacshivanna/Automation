package reLearn;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DatePicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:/Users/ramyacs/Downloads/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skyscanner.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		driver.findElement(By.cssSelector("div.form-item-2E26j  input[name$='depart-fsc-datepicker-input']")).click();
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='depart-calendar__bpk_calendar_nav_select']")));
		
		String CurrMonth=select.getFirstSelectedOption().getText();
		System.out.println(CurrMonth);
		String ExpMonth="April 2018";
		if(CurrMonth.equals(ExpMonth)) {
			System.out.println("Current month selected is "+ ExpMonth);
			
		}
		
		else
		{
			select.selectByValue("April 2018");
			if(CurrMonth.equals(ExpMonth)) 
			{
				System.out.println("Current month selected is "+ ExpMonth);
			}
			
			
		}		
		
		
		*/
		driver.findElement(By.cssSelector("input#depart-fsc-datepicker-input")).click();
		Thread.sleep(2000);
		
		String ExpMonth="january 2019";
		//driver.findElement(By.cssSelector("div.depart button[class*=next]")).click();
		driver.findElement(By.cssSelector("#depart-calendar__bpk_calendar_nav_month_nudger_next svg path")).click();
		
		
		String CurrMonth=driver.findElement(By.cssSelector("div.depart span.current")).getText();
		if(ExpMonth.equals(CurrMonth)) {
			System.out.println("Expected month is already selected");
		}
		
		else
		{
		   for(int i=1;i<=12;i++)
		   {
			driver.findElement(By.cssSelector("div.depart button[class*=next]")).click();
			Thread.sleep(1000);
		    CurrMonth=driver.findElement(By.cssSelector("div.depart span.current")).getText();
			if(ExpMonth.equals(CurrMonth)) {
				System.out.println("Month slected");
				break;
			}
		   }
		}
		
		
		
		
	}

}
