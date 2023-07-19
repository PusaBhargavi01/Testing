package demo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
	ChromeDriver driver ;
	@BeforeTest
	public void launchApplication() {
		//1)Open the Browser
		driver = new ChromeDriver();
		//2)Navigate to application
		
				driver.get("https://whitecircleschool.com/explicit-wait-demo1/");		
	}
	@Test
	public void ExplicitWait() {
		//4)Click on Start button
				driver.findElement(By.id("start")).click();
				
		//5) Verify the text 'Hello World' appears on the web-page
				String expectedText = "Hello World!";

			//Wait for the text to appear
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
				
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
				
		if(actualText.equals(expectedText)) {
			System.out.println("Test Case Passed");
				}
		else {
			System.out.println("Test Case Failed");
				}
	}
   @AfterTest
   public void closeBrowser() {
	   

		//6)Close the browser
		driver.quit();
	   
   }
}
