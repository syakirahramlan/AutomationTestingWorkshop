package webProjectTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class elementDisplayedTest {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 // Create JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page by pixel
        js.executeScript("window.scrollBy(0,500)");
        
        try {
        	//to delay before clicking show button
        	Thread.sleep(3000);	
        	//to send input inside the displayed text box
        	WebElement text = driver.findElement(By.id("displayed-text"));
        	text.sendKeys("Syakirah");
        	//to locate the hide button
        	WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        	//to delay before clicking hide button
        	Thread.sleep(3000);
        	hideButton.click();
        	//to print the output when user click the show button
        	System.out.println("The display text is hide");
		
        	//to locate the show button
        	WebElement showButton = driver.findElement(By.id("show-textbox"));
        	//to delay before clicking show button
        	Thread.sleep(3000);
        	showButton.click();
        	Thread.sleep(3000);
        	//to send input inside the displayed text box
        	text.clear();
        	Thread.sleep(3000);
        	text.sendKeys("Myname");
        	//to print the output when user click the show button
        	System.out.println("The display text is shown");
		
	}   catch (InterruptedException e) {
        e.printStackTrace();
	}
        //close the window
        driver.quit();
}
}
