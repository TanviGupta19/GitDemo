import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//wwebdriver.chrome.driver -> value of path		
		WebDriver  driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected()); // it will return false
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected()); //it will return true
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // no of checkboxes: find out the common locator
		
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));		

		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("India"))

		{

		option.click();
 
		break;

		}

		}

	}

}
