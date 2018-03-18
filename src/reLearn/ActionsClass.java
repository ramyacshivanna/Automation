package reLearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/droppable/");
		//driver.get("http://jqueryui.com");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("Droppable")).click();
				
		Actions action=new Actions(driver);
		WebElement frame=driver.findElement(By.className("demo-frame"));
		
		System.out.println(frame);
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(frame);
		System.out.println("Drag and drop function validation");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		  System.out.println("***Drag and drop action ****");
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(1000);
		 
		/*
		 System.out.println("***Click and hold action ****");
		 action.clickAndHold(drag).moveToElement(drop).release(drap).build().perform();
		 */
		
		System.out.println("Double click validation");
		action.doubleClick(drag);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
			
		
		
		System.out.println("******* End of test ********");
		
		driver.quit();
		
	}

}
