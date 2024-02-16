package webProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webTableTest {

	public static void main(String[] args) {
		//setting up the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//find element by using xpath
		String innerText = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[4]/td[2]")).getText(); 
		//print the info from the table
		System.out.println(innerText);
		//find element by using xpath
		String innerText2 = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[4]/td[3]")).getText(); 	
		//print the info from the table
		System.out.println(innerText2);
		
		//Close the window
		driver.quit();
	}

}
