package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviRegister {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/register/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//FullName
		//driver.findElement(By.className("form-control")).sendKeys("abc");
		driver.findElement(By.id("name")).sendKeys("Supriya");
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
		//driver.findElement(By.cssSelector("input#name")).sendKeys("abc");
		//driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//email
		driver.findElement(By.id("email")).sendKeys("supriyatest180@gmail.com");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@test.com");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@test.com");
		
		//password
		driver.findElement(By.xpath("//input[contains(@class,'password-err')]")).sendKeys("Abc@123");				//used class name via xpath
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abc@123");
		//driver.findElement(By.id("password")).sendKeys("Abc@123");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("Abc@123");
		
		//mobile Number
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
		//driver.findElement(By.xpath("//input[@data-intl-tel-input-id = '0']")).sendKeys("9876543210");
		//driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9876543210");
		//driver.findElement(By.xpath("//input[contains(@class,'countrycode-left')]")).sendKeys("9876543210");		//used class name via xpath
		
		//signup 
		driver.findElement(By.id("signup-btn")).click();
		//driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.xpath("//a[contains(@class ,'btn')][1]")).click();
		
		//After signin validation
		//String dropdown =driver.findElement(By.xpath("//label[text()='Your current profile']")).getText();
		String dropdown= driver.findElement(By.xpath("//h1[text()='Welcome to GUVI!']")).getText();
		if(dropdown.equals("Welcome to GUVI!")) {
			System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome to GUVI!']")).getText());
			System.out.println(" Registered Successfully");
		}
		
	}

}
