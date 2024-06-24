package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptFirefoxBrowser {

	public static void main(String[] args) {
		
		//Launch firefox browser
		WebDriver driver=new FirefoxDriver();
		
		//Navigate to url
		driver.navigate().to("http://google.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//print the url
		System.out.println("The URL of the page displayed is: " + driver.getCurrentUrl());
		
		//reload the page
		driver.navigate().refresh();
		
		//close the browser
		driver.close();
		
		

	}

}
