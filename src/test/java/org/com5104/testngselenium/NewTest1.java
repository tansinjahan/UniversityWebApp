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
	public void CreateStudentS1() {
		driver.findElement(By.id("createstudent")).click();
		driver.findElement(By.id("studentName")).sendKeys("tithy");
		driver.findElement(By.id("studentNumber")).sendKeys("67890");
		driver.findElement(By.id("email")).sendKeys("tithy@gmail");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("studentStatus")).sendKeys("full time");
		driver.findElement(By.id("studentSubmit")).click();
	}
	
	@Test (dependsOnMethods=("CreateStudentS1"))
	public void CreateCourseC1() {
		driver.findElement(By.id("createcourse")).click();
		driver.findElement(By.id("title")).sendKeys("Object Oriented");
		driver.findElement(By.id("code")).sendKeys("114466");
		driver.findElement(By.id("capacity")).sendKeys("27");
		driver.findElement(By.id("finalExam")).sendKeys("true");
		driver.findElement(By.id("assignment")).sendKeys("2");
		driver.findElement(By.id("midterm")).sendKeys("1");
		driver.findElement(By.id("prerequisite")).sendKeys("false");
		driver.findElement(By.id("project")).sendKeys("true");
		driver.findElement(By.id("courseSubmit")).click();
		//assert(driver.findElement(By.id("message")).getText().contains("successfully"));
	}
	
	
	@Test (dependsOnMethods={"CreateCourseC1"})
	public void DeleteStudentS1() {
		driver.findElement(By.id("deletestudent")).click();
		driver.findElement(By.id("studentNumber")).sendKeys("67890");
		driver.findElement(By.id("deleteStudentSubmit")).click();
	}
	
	@Test (dependsOnMethods="DeleteStudentS1")
	public void DeleteCourseC1() {
		driver.findElement(By.id("deletecourse")).click();
		driver.findElement(By.id("code")).sendKeys("114466");
		driver.findElement(By.id("deleteCourseSubmit")).click();
		
	}
	
	@Test (dependsOnMethods=("DeleteCourseC1"))
	public void CreateCourseC2() {
		driver.findElement(By.id("createcourse")).click();
		driver.findElement(By.id("title")).sendKeys("Object Oriented");
		driver.findElement(By.id("code")).sendKeys("112233");
		driver.findElement(By.id("capacity")).sendKeys("27");
		driver.findElement(By.id("finalExam")).sendKeys("true");
		driver.findElement(By.id("assignment")).sendKeys("2");
		driver.findElement(By.id("midterm")).sendKeys("1");
		driver.findElement(By.id("prerequisite")).sendKeys("false");
		driver.findElement(By.id("project")).sendKeys("true");
		driver.findElement(By.id("courseSubmit")).click();
	}
	
	@Test (dependsOnMethods=("CreateCourseC2"))
	public void CreateStudentS2() {
		driver.findElement(By.id("createstudent")).click();
		driver.findElement(By.id("studentName")).sendKeys("tithy");
		driver.findElement(By.id("studentNumber")).sendKeys("123456");
		driver.findElement(By.id("email")).sendKeys("ta@gmail");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("studentStatus")).sendKeys("full time");
		driver.findElement(By.id("studentSubmit")).click();
	}
	
	@Test (dependsOnMethods=("CreateStudentS2"))
	public void CreateCourseC3() {
		driver.findElement(By.id("createcourse")).click();
		driver.findElement(By.id("title")).sendKeys("Data Science");
		driver.findElement(By.id("code")).sendKeys("112244");
		driver.findElement(By.id("capacity")).sendKeys("27");
		driver.findElement(By.id("finalExam")).sendKeys("true");
		driver.findElement(By.id("assignment")).sendKeys("2");
		driver.findElement(By.id("midterm")).sendKeys("1");
		driver.findElement(By.id("prerequisite")).sendKeys("false");
		driver.findElement(By.id("project")).sendKeys("true");
		driver.findElement(By.id("courseSubmit")).click();
	}
	
	@Test (dependsOnMethods=("CreateCourseC3"))
	public void CreateStudentS3() {
		driver.findElement(By.id("createstudent")).click();
		driver.findElement(By.id("studentName")).sendKeys("Ahmad");
		driver.findElement(By.id("studentNumber")).sendKeys("567890");
		driver.findElement(By.id("email")).sendKeys("ah@gmail");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("studentStatus")).sendKeys("full time");
		driver.findElement(By.id("studentSubmit")).click();
	}
	
	@AfterTest
	public void ShutDriver() {
		driver.quit();
	}
	
	@Test (dependsOnMethods=("CreateStudentS3"))
	public void ClerkLogOut() {
		driver.findElement(By.id("logout")).click();
	}
	

	@Test (dependsOnMethods=("ClerkLogOut"))
	public void StudentLoginS2() {
		driver.findElement(By.id("user")).sendKeys("ta@gmail");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("loginSubmit")).click();
	}
	
	@Test (dependsOnMethods=("StudentLoginS2"))
	public void StudentS2TakeCourseC2() {
		driver.findElement(By.id("takecourse")).click();
		driver.findElement(By.id("code")).sendKeys("112233");
		driver.findElement(By.id("selectCodeSubmit")).click();
	}

	@Test (dependsOnMethods=("StudentS2TakeCourseC2"))
	public void StudentS2TakeCourseC3() {
		driver.findElement(By.id("takecourse")).click();
		driver.findElement(By.id("code")).sendKeys("112244");
		driver.findElement(By.id("selectCodeSubmit")).click();
	}
	
	@Test (dependsOnMethods=("StudentS2TakeCourseC3"))
	public void StudentS2RegisterForCourseC2(){
		driver.findElement(By.id("registercourse")).click();
		driver.findElement(By.id("code")).sendKeys("112233");
		driver.findElement(By.id("registerCodeSubmit")).click();
	}
	
	@Test (dependsOnMethods=("StudentS2RegisterForCourseC2"))
	public void StudentS2RegisterForCourseC3() {
		driver.findElement(By.id("registercourse")).click();
		driver.findElement(By.id("code")).sendKeys("112244");
		driver.findElement(By.id("registerCodeSubmit")).click();
	}
	
	@Test (dependsOnMethods=("StudentS2RegisterForCourseC3"))
	public void StudentS2DeRegisterForCourseC2() {
		driver.findElement(By.id("deregistercourse")).click();
		driver.findElement(By.id("code")).sendKeys("112233");
		driver.findElement(By.id("deregisterCodeSubmit")).click();
	}
	
	@Test (dependsOnMethods=("StudentS2DeRegisterForCourseC2"))
	public void StudentS2DropCourseC3() {
		driver.findElement(By.id("dropcourse")).click();
		driver.findElement(By.id("code")).sendKeys("112244");
		driver.findElement(By.id("dropCodeSubmit")).click();
	}
	
	@Test (dependsOnMethods=("StudentS2DropCourseC3"))
	public void StudentLogOut() {
		driver.findElement(By.id("logout")).click();
	}
	
	
	
}
