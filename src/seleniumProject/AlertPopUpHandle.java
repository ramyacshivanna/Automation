package seleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.findElement(By.name("proceed")).click();
				
				Thread.sleep(5000);
				
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
			 // alert.dismiss();
				
				
				driver.close();
				

	}

}
