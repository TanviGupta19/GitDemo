import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Dropdowns,editboxes,error validation

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("name")).sendKeys("tanvi");
		driver.findElement(By.name("email")).sendKeys("tanvi.gupta19@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Tanvi");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		
		WebElement statisDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(statisDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Male");
		
		driver.findElement(By.cssSelector("input[id=inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("19-12-1987");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		String name =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

		System.out.println(name);

	}

}