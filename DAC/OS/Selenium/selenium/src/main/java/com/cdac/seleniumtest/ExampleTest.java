package com.cdac.seleniumtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("Example Domain")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.quit();

	}

}
