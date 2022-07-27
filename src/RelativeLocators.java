import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		//above
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		

		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//below
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		

		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//left
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();


		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		//right
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());



	}

}
