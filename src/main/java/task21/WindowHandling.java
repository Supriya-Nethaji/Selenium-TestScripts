package task21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		//get window Handles
		Set<String> windowHandles = driver.getWindowHandles();
		
		//convert set to list
		List<String> list = new ArrayList<>(windowHandles);
		
		//pick particular window
		driver.switchTo().window(list.get(1));
		
		String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println("Text in the switched window is : "+text);
		
		driver.close();
		System.out.println("Switched window closed");
		
		//closing browser instance         
		driver.quit();
		System.out.println("Browser closed");
	}

}
