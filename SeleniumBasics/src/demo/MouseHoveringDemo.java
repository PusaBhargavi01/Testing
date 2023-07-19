package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringDemo {
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2)Maximize it
		driver.manage().window().maximize();
		
		//3)Navigate to application
		driver.get("https://ebay.com");
		
		//4)Hover the pointer over 'Motors'
		WebElement motors = driver.findElement(By.linkText("Motors"));
		Actions actions = new Actions(driver);
		actions.moveToElement(motors).build().perform();
		
		Thread.sleep(2000);
		//5)Click on'Engines & Parts ' in the sub-menu
		driver.findElement(By.linkText("Engines & Parts")).click();
		
		}
	
}