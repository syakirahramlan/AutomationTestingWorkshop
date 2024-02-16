package webProjectTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class RadioButtonTest {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//To locate the checkboxes
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")); 
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input"));
		
		try {
			
		//Select radio button 1 
		radio1.click();
		System.out.println("Radio button 1 is selected");
		//add delay before selecting button 2
		Thread.sleep(2000);
		//Select radio button 2 
		radio2.click();
		System.out.println("Radio button 2 is selected");
		//add delay before selecting button 3
		Thread.sleep(2000);
		//Select radio button 3 
		radio3.click();
		System.out.println("Radio button 3 is selected");
		//add delay before closing the window
		Thread.sleep(2000);
	}catch (InterruptedException e) {
        e.printStackTrace();
	}
		// Close the browser window
	    driver.quit();
	}
}