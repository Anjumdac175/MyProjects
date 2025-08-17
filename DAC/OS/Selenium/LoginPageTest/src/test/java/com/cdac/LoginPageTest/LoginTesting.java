package com.cdac.LoginPageTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTesting {
	
	WebDriver driver;
	WebDriverWait wait;
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  String path = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Devops\\selenium\\Login.html";
	  String fileUrl = "file:///" + path.replace("\\", "/");
	driver.get(fileUrl);
  }
  
  @Test(priority=1)
  public void testPostiveLoginAndLogout() throws InterruptedException {
	  WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	  username.sendKeys("Nishad Anjum");
	  
	  WebElement gender = driver.findElement(By.xpath("//input[@name='gender' and @value='Female']"));
	  gender.click();
	  
	  WebElement country = driver.findElement(By.cssSelector("select#country"));
	  new Select(country).selectByVisibleText("India");
	  
	  WebElement lgnbtn = driver.findElement(By.id("loginbtn"));
	  lgnbtn.click();
	  
	 wait.until(ExpectedConditions.urlContains("movies.html"));
	 
	 
	Assert.assertTrue(driver.getCurrentUrl().contains("movies.html"),"Login page should Redirect to Movies.html");
	 Thread.sleep(3000);
	WebElement lgtbtn = driver.findElement(By.id("logoutbtn"));
	lgtbtn.click();
	Assert.assertTrue(driver.getCurrentUrl().contains("Login.html"), "Should be back to login page after logout");
	  
  }
  @Test(priority=2)
  public void testNegativeLoginAndLogout() throws InterruptedException {
//	  WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//	  username.sendKeys("Nishad Anjum");
	  Thread.sleep(2000);
	  WebElement gender = driver.findElement(By.xpath("//input[@name='gender' and @value='Female']"));
	  gender.click();
  
	  WebElement country = driver.findElement(By.cssSelector("select#country"));
	  new Select(country).selectByVisibleText("India");
	  WebElement lgnbtn = driver.findElement(By.id("loginbtn"));
	  lgnbtn.click();
	  Thread.sleep(3000);
	Assert.assertTrue(driver.getCurrentUrl().contains("Login.html"),"should not navigate to movies page as username not filled");
	  
  }
  
  @Test(priority=3)
  public void testNegativeBlankForm() throws InterruptedException {
//	  WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//	  username.sendKeys("Nishad Anjum");
//	  Thread.sleep(2000);
//	  WebElement gender = driver.findElement(By.xpath("//input[@name='gender' and @value='Female']"));
//	  gender.click();
//  
//	  WebElement country = driver.findElement(By.cssSelector("select#country"));
//	  new Select(country).selectByVisibleText("India");
	  Thread.sleep(3000);
	  WebElement lgnbtn = driver.findElement(By.id("loginbtn"));
	  lgnbtn.click();
	  Thread.sleep(3000);
	  Assert.assertTrue(driver.getCurrentUrl().contains("Login.html"),"Blank form should fail");
	  
  }

  @AfterMethod
  public void CloseBrowser() {
	  if(driver != null) {
		  driver.quit();
		  System.out.println("Browser closed");
	  }
	 
  }
  
}
