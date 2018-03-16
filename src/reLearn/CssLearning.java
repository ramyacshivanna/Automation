package reLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com");

		/*tags for css type of element
		 # id
		 . class
		 ^ stats-with
		 $ ends-with
		 * contains
		 */
		
		/*
		 //Examples:
		 1. span[id='id of webelement'] -- FOR ID
		 2. span#id of webelement --> # represents id eq: div#applet_p_30345894
		 3. For Class attribute
		 tagtype.classname
		 eq: div.App-Bd
		 Combination of id and classname
		 div.js-applet-view-container-main#yui_3_18_0_3_1520181282614_710
		 tagname.classname#id
		 4. Starts with
		  script[src^='https://mbp.yimg.com/sy']
		  tagname is script and src starting with 'https://mbp.yimg.com/sy'
		  
		  5. Ends With
		   script[src$='.js']
		   script is the tag name and src ending with the value '.js'
		   
		   6. Contains
			   script[src*='3pm']
			   script is the tagname and src containing 3pm			  
		  
		  */
		 

	}

}
