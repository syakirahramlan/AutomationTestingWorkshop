package webProjectTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.Set;

public class newWindowTest {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//To locate the element
		WebElement newWindowbutton = driver.findElement(By.id("openwindow")); 
		//click button to open new window
		newWindowbutton.click();
		//to get all the handles by the webdriver
		Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
      
    }
			

	}

