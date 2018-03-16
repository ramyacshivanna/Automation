package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkInSpecificSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement box=driver.findElement(By.id("reg_form_box"));
		List<WebElement> Links=box.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(WebElement Link:Links)
		{
			System.out.println(Link.getText());
			System.out.println(Link.getAttribute("href"));
			System.out.println(Link.getAttribute("name"));
			System.out.println("************");
		}
		
		driver.quit();
	}

}
