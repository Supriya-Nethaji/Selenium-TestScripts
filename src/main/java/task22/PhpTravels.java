package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravels {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Firstname
		driver.findElement(By.name("first_name")).sendKeys("Supriya");
		
		//Lastname
		driver.findElement(By.name("last_name")).sendKeys("Nethaji");
		
		//Business Name
		driver.findElement(By.name("business_name")).sendKeys("abcd");
		
		//Email
		driver.findElement(By.name("email")).sendKeys("supriyatest199@gmail.com");
		
		//addition logic
		String numb1 = driver.findElement(By.id("numb1")).getText();
		int number1=Integer.parseInt(numb1);
		String numb2 = driver.findElement(By.id("numb2")).getText();
		int number2=Integer.parseInt(numb2);
		
		int sum=number1+number2;
		String sum1=Integer.toString(sum);
		driver.findElement(By.id("number")).sendKeys(sum1);
		
		//click on submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()=' Thank you!']")));
		
		String text=driver.findElement(By.xpath("//strong[text()=' Thank you!']")).getText();
		String text1=driver.findElement(By.xpath("//p[contains(@class,'cw')]")).getText();
		
		System.out.println("***Printing the displayed message after submit***");
		System.out.println(text);
		System.out.println( text1);
		
		//Capture screenshots
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\USER\\Desktop\\Java Practice\\SeleniumScript\\Screenshot\\FormSubmit.jpeg");
		FileUtils.copyFile(source, destination);
	}

}
