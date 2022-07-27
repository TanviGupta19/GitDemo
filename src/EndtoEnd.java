import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver (); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//option[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click();
		//calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//one way
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println("its disabled");
		Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);
		}
		//checkbox senior citizen
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();
		//check no of adults
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
				
		driver.findElement(By.id("btnclosepaxoption")).click();		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult"); // it should be equal to 5 adult		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//select currency
		WebElement statisDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(statisDropdown);
		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("AED");
		//click on submit
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
