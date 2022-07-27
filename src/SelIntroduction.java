import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		//Invoking Browser
		//Chrome -ChromwDriver ->Methods
		//WebDriver methods + class methods
		//chromedriver.exe
		// chromedriver.exe -> Chrome browser	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//wwebdriver.chrome.driver -> value of path		
		WebDriver  driver = new ChromeDriver (); 
		
		//Firefox Launch
		//gecko driver
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\TanviGupta\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver  driver = new FirefoxDriver(); 
		
		//edge
		//System.setProperty("webdriver.edge.driver","C:\\Users\\TanviGupta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver  driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();// closes the current window
		//driver.quit();// closing all the associated windows
		
	 
	}

}
