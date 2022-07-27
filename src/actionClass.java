import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
		 Actions a = new Actions(driver);
		 
		 //Enter in capital letter in search and select by doubleclick
		 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().click().build().perform();

		 
		 //Move to specific element
		 a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		 
		 //right click by using contextclick
		 a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		 

	}

}
