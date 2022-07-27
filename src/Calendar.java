import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(2000);
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();		
		driver.findElement(By.xpath("//option[@value='BLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click();
	
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //covert a class into css is done by '.' eg .classname 
	// if there is a space in class name then we put a "." 


	}

}
