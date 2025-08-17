package com.cdac.LoginPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		try {
			
			String path = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Devops\\selenium\\Login.html";
			String fileUrl = "file:///" + path.replace("\\", "/");
			driver.get(fileUrl);
			Thread.sleep(2000);
			
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("NishadAanjum");
			Thread.sleep(1000);
			
			WebElement gender = driver.findElement(By.xpath("//input[@name='gender' and @value='Female']"));
			gender.click();
			Thread.sleep(1000);
			
			WebElement dropDown = driver.findElement(By.cssSelector("select#country"));
			Select selectCountry = new Select(dropDown);
			selectCountry.selectByVisibleText("India");
			
			Thread.sleep(1000);
			
			WebElement button = driver.findElement(By.xpath("//*[@id='loginbtn']"));
			button.click();
			Thread.sleep(1000);
			
			WebElement logoutbtn = driver.findElement(By.id("logoutbtn"));
			logoutbtn.click();
			Thread.sleep(1000);
			
//			WebElement resetButton = driver.findElement(By.id("resetbtn"));
//			resetButton.click();
//			
//			Thread.sleep(1000);
			
			if(driver.getCurrentUrl().contains("movies.html")) {
				System.out.println("Logged in Successfully");
			}else if(driver.getCurrentUrl().contains("Login.html")){
				System.out.println("Logged out Successfully");
			}else {
				System.out.println("Login failed");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		finally {
			driver.quit();
			System.out.println("Browser closed Successfully");
		}
	}

}
