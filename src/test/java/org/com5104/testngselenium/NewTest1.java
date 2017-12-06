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
	
	@Test (dependsOnMethods= "CreateStudent")
	public void StudentLogin() {
		driver.findElement(By.id("user")).sendKeys("tithy@gmail");
		driver.findElement(By.id("password")).sendKeys("12345");
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
	
	@Test (dependsOnMethods=("ClerkLogin"))
	public void CreateCourse() {
		driver.findElement(By.id("createcourse")).click();
		driver.findElement(By.id("title")).sendKeys("Object Oriented");
		driver.findElement(By.id("code")).sendKeys("112299");
		driver.findElement(By.id("capacity")).sendKeys("27");
		driver.findElement(By.id("finalExam")).sendKeys("true");
		driver.findElement(By.id("assignment")).sendKeys("2");
		driver.findElement(By.id("midterm")).sendKeys("true");
		driver.findElement(By.id("prerequisite")).sendKeys("false");
		driver.findElement(By.id("project")).sendKeys("true");
		driver.findElement(By.id("courseSubmit")).click();
	}
	
	@Test (dependsOnMethods={"ClerkLogin","CreateCourse"})
	public void DeleteCourse() {
		driver.findElement(By.id("deletecourse")).click();
		driver.findElement(By.id("deleteCourseCode")).sendKeys("112299");
		driver.findElement(By.id("deleteCourseSubmit")).click();
		
	}
	
	@Test (dependsOnMethods={"ClerkLogin","CreateStudent"})
	public void DeleteStudent() {
		driver.findElement(By.id("deletestudent")).click();
		driver.findElement(By.id("deleteStudentNumber")).sendKeys("56789");
		driver.findElement(By.id("deleteStudentSubmit")).click();
	}
	
	
	@AfterTest
	public void ShutDriver() {
		driver.quit();
	}
}
