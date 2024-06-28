package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//click on date text box
		driver.findElement(By.id("datepicker")).click();
		
		String expectedDate="22";
		String expectedMonth="December";
		
		while(true){
			
			String actualMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			if(expectedMonth.equals(actualMonth)) {
			break;
			}else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='"+expectedDate+"']")).click();
		
		
	}

}
