package org.com5104.testngselenium;

import org.com5104.utilities.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {

	public static WebDriver driver;

	@BeforeTest
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://localhost:8080/login");
	}

	@Test
	public void ClerkLogin() {
		driver.findElement(By.id("user")).sendKeys("clerk");
		driver.findElement(By.id("password")).sendKeys(Config.CLERK_PASSWORD);
		driver.findElement(By.id("loginSubmit")).click();
	}
	
	@Test (dependsOnMethods=("ClerkLogin"))
	public void CreateStudent() {
		driver.findElement(By.id("createstudent")).click();
		driver.findElement(By.id("studentName")).sendKeys("tithy");
		driver.findElement(By.id("studentNumber")).sendKeys("56789");
		driver.findElement(By.id("email")).sendKeys("tithy@gmail");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("studentStatus")).sendKeys("full time");
		driver.findElement(By.id("studentSubmit")).click();
	}
	
	@AfterTest
	public void ShutDriver() {
		driver.quit();
	}
}
