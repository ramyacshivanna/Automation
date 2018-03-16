package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:/Users/ramyacs/Downloads/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("Current URL is : " + driver.getCurrentUrl());
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("title is correct: "+title);
		}
		else
			System.out.println("Incorrect title: "+title);
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		
	}

}
