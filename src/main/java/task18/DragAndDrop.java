package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
			//Launch the browser
			WebDriver driver=new ChromeDriver();
			
			//Load the url
			driver.navigate().to("https://jqueryui.com/droppable/");
			
			//maximize the window
			driver.manage().window().maximize();
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//switch to frame
			driver.switchTo().frame(0);
			
			//find source
			WebElement src=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
			
			//find target
			WebElement dest=driver.findElement(By.xpath("//p[text()='Drop here']"));
			
			//perform drag and drop
			Actions mouse=new Actions(driver);
			mouse.dragAndDrop(src, dest).perform();
			
			//verify the color property
			System.out.println("Color of the target element is : " +dest.getCssValue("color"));
			
			//verify the target element text changed to 'Dropped'
			String droppedText= driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
			System.out.println(droppedText);

	}

}
