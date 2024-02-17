package webProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;



public class mouseHoverTest {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Create JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page by pixel
        js.executeScript("window.scrollBy(0,1000)");	
     
		try {
            // Add a delay after scrolling
            Thread.sleep(4000);

            // Find and click the mouse hover element
            WebElement mouseHover = driver.findElement(By.id("mousehover"));
            mouseHover.click();

            // Add a delay to give time for the top link to become clickable
            Thread.sleep(2000);

            // Find and click the top link
            WebElement top = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]"));
            top.click();

            // Add a delay after clicking the top option
            Thread.sleep(3000);

            // Scroll down the page after clicking the top link
            js.executeScript("window.scrollBy(0,1000)");

            // Add a delay to give time for the mouseHover become clickable
            Thread.sleep(2000);
            mouseHover.click();
            // Find and click the reload link
            WebElement reload = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
            reload.click();
         // Add a delay to give time for the page to reload before closing the window
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
           driver.quit();
        }
    }
}
	
	


