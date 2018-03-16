package reLearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidingAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/slider/");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		
		driver.findElement(By.xpath("//a[text()='Colorpicker']")).click();
		
		driver.switchTo().frame(0);
		
		//WebElement drag=driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default"));
		WebElement drag=driver.findElement(By.xpath("div[@id='green']/span)"));
		//WebElement drag=driver.findElement(By.id("green"));
		//System.out.println(drag);		
		

		
		 action.clickAndHold(drag).moveByOffset(20, 0).release(drag).build().perform();
		 
		System.out.println("drag to right side");
		Thread.sleep(1500);
		
		action.clickAndHold(drag).moveByOffset(-20, 0).release(drag).build().perform();
		System.out.println("drag to left side");
		Thread.sleep(1000);
			
			
		driver.quit();
		
		

	}

}
