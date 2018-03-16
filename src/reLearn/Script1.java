package reLearn;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 String BaseUrl="https://www.google.com";
 String Pagetitle="";
 String ExpectedTitle="Google";
 driver.get(BaseUrl);
   
 driver.manage().window().maximize();
 Pagetitle=driver.getTitle();
 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // implicit wait
 if(Pagetitle.equals(ExpectedTitle))
 {
 System.out.println("Correct page is displayed "+ExpectedTitle);
 
 }
 else{
 System.out.println("Page is displayed "+Pagetitle);
	}
 
 driver.close();
}
}
