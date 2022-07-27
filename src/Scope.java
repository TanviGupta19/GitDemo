import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver ();
		driver.get("http://qaclickacademy.com/practice.php");
		
	// count no of links in the webpage
	
		System.out.println(driver.findElements(By.tagName("a")).size()); 
		
   // count no of links in the footer section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // limiting the scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
	// links count of only 1st column in footer section
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		
	// click on each link in the column and check if links are working
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); // to open link in another tab 
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}	
			Set<String> abc= driver.getWindowHandles(); //4
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		
	}

}
