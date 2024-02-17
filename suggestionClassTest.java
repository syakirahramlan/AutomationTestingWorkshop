package webProjectTest;
import org.openqa.selenium.By;	
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class suggestionClassTest {

	public static void main(String[] args)throws InterruptedException {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Find the input box by its ID or any suitable locator
        WebElement inputBox = driver.findElement(By.id("autocomplete"));
        
        Thread.sleep(3000);
        
        // Type a letter into the input box
        inputBox.sendKeys("mal");

        // Wait for the country suggestions to appear
        Thread.sleep(3000);

		System.out.println("the execution is done");
        // Close the browser window
        driver.quit();
	}

}
