package org.practiceset1.testb.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFbLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	static WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		@Test
		public static void mainScreen() {
			driver.findElement(By.id("email")).sendKeys("raunaksingh7600@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("fakeaccount");
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
			
		}
		@AfterMethod()
		public static void postcondition() {
			driver.close();
		}

}
