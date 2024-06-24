package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptToOpenGoogle {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to url
		driver.navigate().to("https://www.google.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Find google search box and enter input
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver", Keys.ENTER);
	}

}
