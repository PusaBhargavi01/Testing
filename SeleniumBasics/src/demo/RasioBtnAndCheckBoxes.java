package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RasioBtnAndCheckBoxes {
	public static void main(String[] args) {
		 //1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2) Maximize it
		driver.manage().window().maximize();
		
		//3) Navigate to appliaction 
		driver.get("https://letcode.in/radio");
		
		//4) Select 'Yes' radio button from 'Select any one' option
		
		driver.findElement(By.id("yes")).click();
		
		//5) Check last Check box
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
	}

}
