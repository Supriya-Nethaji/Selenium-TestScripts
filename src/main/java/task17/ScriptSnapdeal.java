package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptSnapdeal {

	public static void main(String[] args) throws InterruptedException {
		
				//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Navigate to url
				driver.navigate().to("http://www.snapdeal.com");
				
				//maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//sign-in button click
				driver.findElement(By.xpath("(//span[contains(@class,'accountUserName col-xs-12 reset-padding')])")).click();
				
				//Login button click
				driver.findElement(By.xpath("(//span[contains(@class,'accountBtn btn rippleWhite')])")).click();
				
				//switching to frame
				driver.switchTo().frame("loginIframe");
				
				//enter mobile number
				driver.findElement(By.id("userName")).sendKeys("9952415959");
				//click continue button
				driver.findElement(By.id("checkUser")).click();
				
				Thread.sleep(15000);
				
				//click after entering otp
				driver.findElement(By.id("loginUsingOtp")).click();
				Thread.sleep(15000);
				String url="https://www.snapdeal.com/?loginSuccess=success&";
				
				String urlafter=driver.getCurrentUrl();
				
				
				if(urlafter.equals(url)) {
					System.out.println("Login successful");
				}
				
	}

}
