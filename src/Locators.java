import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - 5 seconds time out
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TanviGupta\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver (); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting for object to show on the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		driver.findElement(By.className("signInBtn")).click();
		//css selector Class name -> tagname.classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//link text: there should anchor tag "a"
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);//1 sec something to get in a stable stage
		//Xpath //Tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tanvi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("gupta.tanvi19@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("+31626623061");
		// another way to write xpath by tagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("+31626623061");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//another way of go to login button
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();		
		//driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		//Login
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath(".//button[contains(@class,'submit')]")).click();
		
		
		
		
		

	}

}
