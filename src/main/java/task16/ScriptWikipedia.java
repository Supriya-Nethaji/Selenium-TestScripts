package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptWikipedia {

	public static void main(String[] args) {
		
		//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Navigate to url
				driver.navigate().to("https://www.wikipedia.org/");
				
				//maximize the window
				driver.manage().window().maximize();
				
				//search input by locator
				driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence", Keys.ENTER);
				
				//Click on history link
				driver.findElement(By.linkText("History")).click();
				
				System.out.println(driver.findElement(By.id("History")).getText());
	}

}
