package org.com5104.seleniumcucumber;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.com5104.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	
	WebDriver aDriver;
	
	@When("^a user visit Google\\.ca$")
	public void a_user_visit_Google_ca() throws Throwable {
		aDriver = WebDriverUtil.getDefaultDriver();
		aDriver.get("http://localhost:8080/login");
	}

	@Then("^the use sees \"([^\"]*)\"$")
	public void the_use_sees(String arg1) throws Throwable {
		assert(aDriver.findElement(By.id("test")).getText().contains(arg1));
	}
	
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) aDriver)
                            .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); //stick it in the report
        }
        aDriver.close();
    }

}
