package seleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i).getText());
		}
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//absolute xpath: performance issue, it can change frequently, not reliable,
		//Customized xpath: very simple syntax, very fast, no performance issue, generic and unique
		//we can use contains, starts-with, end-with functions.
		
		//driver.findElement(By.id("gh-ac")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@classname='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-')]")).sendKeys("java");
		//driver.findElement(By.xpath("//input[ends-with(@id,'-ac')]")).sendKeys("java");
		
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		
		driver.close();

		

	}

}
