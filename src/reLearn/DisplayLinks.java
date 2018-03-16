package reLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String baseUrl="https://www.google.co.in";
		driver.get("https://in.yahoo.com");
		//driver.get(baseUrl);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement Link:links)
		{
			System.out.println(Link.getText());
			System.out.println(Link.getAttribute("a"));
			System.out.println("********************");
		}
		
		driver.quit();

	}

}
