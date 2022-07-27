import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver ();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).sendKeys("unit");
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	   
	   //We can also write in below way
	   /*
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));		

		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))

		{

		option.click();
 
		break;

		}

		}
*/
	}

}
