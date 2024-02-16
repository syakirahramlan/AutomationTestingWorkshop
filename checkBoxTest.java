package webProjectTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class checkBoxTest {

	public static void main(String[] args) {
	//setting up the driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	//To locate the element
	WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1")); 
	WebElement checkbox2 = driver.findElement(By.name("checkBoxOption2"));
	WebElement checkbox3 = driver.findElement(By.name("checkBoxOption3"));
	
	try {
		//click all three checkboxes at once
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		System.out.println("All checkboxes are selected");

		// Deselect all checkboxes
		Thread.sleep(3000);
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		System.out.println("All checkboxes are deselected");

		// Select checkboxes 2 and 3 together
		//add delay before checking checkbox 2 and 3
		Thread.sleep(3000);
		checkbox2.click();
		Thread.sleep(1000);
		checkbox3.click();
		System.out.println("Checkboxes 2 and 3 are selected together");

		// Deselect checkboxes 2 and 3
		Thread.sleep(3000);
		checkbox2.click();
		checkbox3.click();
		System.out.println("Checkboxes 2 and 3 are deselected");

		//add delay before select checkbox 3
		Thread.sleep(3000);
		// Select checkbox 3 only
		checkbox3.click();
		System.out.println("Checkbox 3 is selected");
		} catch (InterruptedException e) {
        e.printStackTrace();
    
    // Close the browser window
    driver.quit();
}
	}
}

