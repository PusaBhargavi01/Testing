package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
	}

}
