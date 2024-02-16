package webProjectTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.Set;

public class newTabTest {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//To locate the element
		WebElement newTab = driver.findElement(By.id("opentab")); 
		//click button to open new tab
		newTab.click();
		//to get all the handles by the webdriver
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new tab
		for (String windowHandle : windowHandles) {
		driver.switchTo().window(windowHandle);
		}
		      
	}
					
}



