package seleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindow=it.next();
		System.out.println("Parent Window : " + parentwindow);
		
		String child=it.next();
		System.out.println("Child Window Id: " + child);
		
		System.out.println(driver.switchTo().window(child).getTitle());
		driver.switchTo().window(child);
		driver.close();
		
		driver.switchTo().window(parentwindow);
		//driver.switchTo().defaultContent();
		System.out.println(driver.switchTo().window(parentwindow).getTitle());
		
		driver.close();
		
			
				

	}

}
