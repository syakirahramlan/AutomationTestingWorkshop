package webProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class alertTest {

	public static void main(String[] args)throws NoAlertPresentException,InterruptedException  {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Locate the element and give input to the box
		driver.findElement(By.id("name")).sendKeys("Syakirah");
		driver.findElement(By.id("alertbtn")).click();
		
		// Switching to Alert        
        Alert alert = driver.switchTo().alert();
        
		// Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(4000);
        		
        // Accepting alert		
        alert.accept();	
        
        //testing the confirm button
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("1234567890");
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(alertMessage);
        Thread.sleep(2000);
        alert.accept();
    }	
}

