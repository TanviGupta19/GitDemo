import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//Synchronization with Explicit Wait

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		
		WebElement statisDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select dropdown = new Select(statisDropdown);
		dropdown.selectByValue("consult");
		
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));// in cssSelector you can trace 'parent child' so '.classname childclassname

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();}


	}


