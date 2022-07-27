import java.util.Iterator;
//Window Handling Assignment

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();;
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String childId = it.next();
		String childId2 = it.next();
		driver.switchTo().window(childId2);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	}

}
