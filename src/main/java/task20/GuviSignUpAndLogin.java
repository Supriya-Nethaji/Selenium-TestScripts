package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUpAndLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.partialLinkText("Sign up")).click();
		
		//FullName
		driver.findElement(By.id("name")).sendKeys("Supriya");
				
		//email
		driver.findElement(By.id("email")).sendKeys("supriyatest9@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("Abc@123");
				
		//mobile Number
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
				
		//signup 
		driver.findElement(By.id("signup-btn")).click();
		
		String welcomeText= driver.findElement(By.xpath("//h1[text()='Welcome to GUVI!']")).getText();
		if(welcomeText.equals("Welcome to GUVI!")) {
			System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome to GUVI!']")).getText());
			System.out.println("Registered Successfully");
		}
	
		driver.navigate().back();
		
		//click on login 
		driver.findElement(By.id("login-btn")).click();
		
		//enter email id
		driver.findElement(By.id("email")).sendKeys("supriyapalani28@gmail.com");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("Nethaji@28");
		
		//click on login
		driver.findElement(By.id("login-btn")).click();
		
		//validation
		String AfterLoginUrl="https://www.guvi.in/courses/?current_tab=myCourses";
		
		Thread.sleep(1000);
		
		if(driver.getCurrentUrl().equals(AfterLoginUrl)) {
		System.out.println("Logged in successfully");
		}

	}

}
