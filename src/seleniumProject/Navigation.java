package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//get vs navigate().to method
		//both are used launch the URl. But navigate is used specifically to launch some application again like google to amazon
		
  System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
  //WebDriver driver=new ChromeDriver();
  ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get("https://google.com");
  driver.navigate().to("https://www.amazon.com/");
  Thread.sleep(2000);
  
  driver.navigate().back();
  Thread.sleep(2000);
  
  driver.navigate().forward();
  Thread.sleep(2000);
  
  driver.navigate().refresh();
  
  driver.close();
  
	}

}
