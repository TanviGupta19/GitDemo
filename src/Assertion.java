import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework

public class Assertion {

			public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//wwebdriver.chrome.driver -> value of path		
			WebDriver  driver = new ChromeDriver(); 
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected()); // it expects false value only : this will get fail as it is expecting false
			
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
			driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();
			
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected()); //it expects true value only
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // no of checkboxes: find out the common locator
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			/* int i =1;
			while(i<5)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
			} */
			
			for(int i=1;i<5;i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
			}
					
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult"); // it should be equal to 5 adult
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		

		

	}

}
 