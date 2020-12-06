package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInFunctions {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	}

}
