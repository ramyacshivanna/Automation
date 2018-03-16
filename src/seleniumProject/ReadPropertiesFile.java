package seleniumProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiesFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/ramyacs/Documents/Automation/src/seleniumProject/config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("browser"));
		String URL=prop.getProperty("URL");
		System.out.println(URL);
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
			  driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/ramyacs/Downloads/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("IE"))
		{
			System.setProperty("webdriver.InternetExplorer.driver", "C:/Users/ramyacs/Downloads/InternetExplorerDriver.exe");
			 driver=new InternetExplorerDriver();
		}
		
		driver.get(URL);
	}


}
