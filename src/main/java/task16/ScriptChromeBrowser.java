package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptChromeBrowser {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to url
		driver.navigate().to("https://www.demoblaze.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//get the title of the page
		String title=driver.getTitle();
		if(title.equals("STORE")) {
			System.out.println("Page landed on correct website");
		}else
		{
			System.out.println("Page not landed on correct website");
		}

	}

}
