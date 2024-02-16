package webProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Create a select object and find element by name
		Select drpExample = new Select(driver.findElement(By.name("dropdown-class-example")));
		//select dropdown by visible text
		drpExample.selectByVisibleText("Option1");
		try {
            // Add a delay of 3 seconds before selecting the option
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		Select drpExample2 = new Select(driver.findElement(By.name("dropdown-class-example")));
		drpExample2.selectByVisibleText("Option2");
		
		try {
            // Add a delay of 3 seconds before selecting the option
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
            
		Select drpExample3 = new Select(driver.findElement(By.name("dropdown-class-example")));
		drpExample3.selectByVisibleText("Option3");
		
		
	}

}
