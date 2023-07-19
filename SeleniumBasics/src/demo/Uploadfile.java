package demo;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	
	public static void main(String[] args) throws IOException ,InterruptedException {
		
		//1)Open the browser
		ChromeDriver driver = new ChromeDriver();
		//2)MAximize it
		driver.manage().window().maximize();
		
		//3)NAviagte to application
		driver.get("https://www.remove.bg/");
		
		//4)Click 'Select files to upload 'Button
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[3]")).click();
		
		Thread.sleep(3000);
		//5)HAndover the control to autoIT to select a file from the local machine ,click on open button
		Runtime.getRuntime().exec("resources//demo.exe");
	}

}
