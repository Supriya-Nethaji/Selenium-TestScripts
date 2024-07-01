package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//switch to top frame
		driver.switchTo().frame("frame-top");
		
		//switch to left
		driver.switchTo().frame("frame-left");
	
		String leftFrameText = driver.findElement(By.tagName("Body")).getText();
		System.out.println("Left frame text is: " + leftFrameText);
		
		driver.switchTo().defaultContent();
		
		//switch to top frame
		driver.switchTo().frame("frame-top");
		
		//switch to middle
		driver.switchTo().frame("frame-middle");
		
		String middleFrameText = driver.findElement(By.tagName("Body")).getText();
		System.out.println("Middle frame text is: " + middleFrameText);
		
		driver.switchTo().defaultContent();
		
		//switch to top frame
		driver.switchTo().frame("frame-top");
		
		//switch to Right
		driver.switchTo().frame("frame-right");
		
		String rightFrameText = driver.findElement(By.tagName("Body")).getText();
		System.out.println("Right frame text is: " + rightFrameText);
		
		driver.switchTo().defaultContent();
		
		//switch to bottom frame
		driver.switchTo().frame("frame-bottom");
		
		String bottomFrameText = driver.findElement(By.tagName("Body")).getText();
		System.out.println("Bottom frame text is: " + bottomFrameText);
		
		driver.switchTo().defaultContent();
		
		//switch to top frame
		driver.switchTo().frame("frame-top");
		System.out.println("Switched to top frame");
		
		driver.switchTo().defaultContent();
		
		System.out.println("URL of the page is : " +driver.getCurrentUrl());
	}

}
