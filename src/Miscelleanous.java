import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		//delete cookies
		//driver.manage().deleteAllCookies();
		//delete only 1 cookie 
		//driver.manage().deleteCookieNamed("abcd");
		
		
		//delete session cooki and land to login page
		// driver.manage().deleteCookieNamed("sessionKey");
		//click on any link
		// login page - verify login url
		
		
		driver.get("https://www.google.com/");
		//Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\TanviGupta\\screenshot.png"));
		
		//BrokenLink: broken URL
		// Step 1 - is to get all urls tied up to the links using selenium
		// Java methods will call URL's and gets you the status code
		// if status code > 400 then that url is not working -> link which tied to url is broken
		// a[href* = 'soapui"] 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	      SoftAssert a =new SoftAssert();	     

	      for(WebElement link : links)

	      {
     
	          String url= link.getAttribute("href");
		
	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
	          conn.setRequestMethod("HEAD");
	          conn.connect();
	          int respCode = conn.getResponseCode();
	          System.out.println(respCode);
	          
	          a.assertTrue(respCode<400,"The link with Test " +link.getText()+ " is broken with code"+ respCode );
	            
	      } 
		
	      a.assertAll();
	}
}
