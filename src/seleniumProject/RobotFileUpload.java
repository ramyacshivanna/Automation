package seleniumProject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class RobotFileUpload {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Robot robot=new Robot();
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("imagesrc")).click();
		
		robot.setAutoDelay(2000);
		StringSelection ss=new StringSelection("C:\\Users\\ramyacs\\Downloads\\image.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.close();
			
		
	}

}
