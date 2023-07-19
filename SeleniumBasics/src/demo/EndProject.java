package demo;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class EndProject{
	
	public static void main(String[] args) throws InterruptedException {
		       //1)Open the browser
				ChromeDriver driver = new ChromeDriver();
				//2)Maximize it
				driver.manage().window().maximize();
				//3)Navigate to application
				driver.get("https://www.amazon.in/");
				//4)Click on 'Mobiles' in the navigation bar
				driver.findElement(By.linkText("Mobiles")).click();
				//5)Hover the pointer over 'Mobile & Accessories'
				WebElement mobile = driver.findElement(By.linkText("Mobiles & Accessories"));
				Actions actions = new Actions(driver);
				actions.moveToElement(mobile).build().perform();
				Thread.sleep(2000);
				//6)Click on'Apple' in the sub-menu
				driver.findElement(By.linkText("Apple")).click();
				//7)Click on first available phone
				driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();		
				//8)Switch focus on new tab
				Set<String> s = driver.getWindowHandles();
				ArrayList ar = new ArrayList(s);		
				driver.switchTo().window((String)ar.get(1));	
				//9)Clcik on 'Buy Now'
				driver.findElement(By.cssSelector("#buy-now-button")).click();
				if(driver.getPageSource().contains("Sign in")){
					System.out.println("Text is present");
					}else{
					System.out.println("Text is absent");
					}
				//6)Close the browser
				driver.quit();
				
	}	    
}