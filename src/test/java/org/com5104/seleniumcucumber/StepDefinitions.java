package org.com5104.seleniumcucumber;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.com5104.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	private WebDriver aDriver;
	
	@When("^the clerk visits login page$")
	public void the_clerk_visits_login_page() throws Throwable {
		aDriver.get("http:localhost:8080/login");
	}
	
	@When("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
		aDriver.findElement(By.id("userName")).sendKeys(arg1);
		aDriver.findElement(By.id("passWord")).sendKeys(arg2);
		aDriver.findElement(By.id("loginSb")).click();
	}
	
	@Then("^the clerk sees clerk's home page$")
	public void the_clerk_sees_clerk_s_home_page() throws Throwable {
		assert(aDriver.findElement(By.id("cHome")).getText().contains("Welcome to Clerk"));
	}

	@Then("^the use sees \"([^\"]*)\"$")
	public void the_use_sees(String arg1) throws Throwable {
		
	}
	
	@When("^the student visits login page$")
	public void the_student_visits_login_page() throws Throwable {
		aDriver.get("http:localhost:8080/login");
	}

	@When("^enters username and password$")
	public void enters_username_and_password() throws Throwable {
		//StudentTable.createFakeStudent();
	    aDriver.findElement(By.id("userName")).sendKeys("jim@gotham");
		aDriver.findElement(By.id("passWord")).sendKeys("12345");
		aDriver.findElement(By.id("loginSb")).click();
	}

	@Then("^the student sees student's home page$")
	public void the_student_sees_student_s_home_page() throws Throwable {
		assert(aDriver.findElement(By.id("sHome")).getText().contains("Welcome to Student"));
	}
	
	@Before
	public void setUp() {
		aDriver = WebDriverUtil.getDefaultDriver();
	}
    @After
    public void tearDown(Scenario scenario) {
        if (true) {
                final byte[] screenshot = ((TakesScreenshot) aDriver)
                            .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); //stick it in the report
        }
        aDriver.close();
    }

}
