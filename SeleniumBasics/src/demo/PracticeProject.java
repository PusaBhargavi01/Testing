package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeProject {
	public static void main(String[] args) throws InterruptedException {
		 //1) open the browser
		 ChromeDriver driver = new ChromeDriver();
		 
		//2)Maximize it
			driver.manage().window().maximize();
			
		 //3) navigate to application

		 driver.get("https://letcode.in/edit");
		 
		//4)Enter invalid password 'password@123' in the 'Password' textbox
			driver.findElement(By.cssSelector("#fullName")).sendKeys("Bhargavi");
			
			driver.get("https://letcode.in/dropdowns");
			
			//5)Select 'Java' from 3rd drop-down
			WebElement languages = driver.findElement(By.id("lang"));
			Select select = new Select(languages);
			select.selectByVisibleText("Java");
			//6)Select 'India' from 4th drop down
			WebElement country = driver.findElement(By.id("country"));
			Select select1 = new Select(country);
			select1.selectByVisibleText("India");
			
			 //7) navigate to application

			 driver.get("https://letcode.in/alert");
			 	
			//8)Click on 'Simple Alert' Button
				driver.findElement(By.id("accept")).click();
				
				Thread.sleep(3000);
				
			//9)Close the Alert Box
				driver.switchTo().alert().accept();
				
			//10)Navigate to application
				
				driver.get("https://letcode.in/buttons");
				
				driver.findElement(By.id("home")).click();
				
				
			}
			 
			
			
			
			
			
		 
	}


