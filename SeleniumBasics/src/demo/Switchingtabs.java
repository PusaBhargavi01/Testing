package demo;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Switchingtabs {
	
	public static void main(String[] args) {
		
		//1)Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2)maximize it
		driver.manage().window().maximize();
		
		//3)Navigate to appliaction
		driver.get("https://www.facebook.com/");
		
		//4) Click on 'Instagram'
		driver.findElement(By.linkText("Instagram")).click();
		
		//5) Switch focus on new tab
		ArrayList<String>  tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//Wait fo rthe next page to load completely
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		//6)Write 'abc@gmail.com.com' in the email textbox of Instagram page
		//driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		
		
	}

}
