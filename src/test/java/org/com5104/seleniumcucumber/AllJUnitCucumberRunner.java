package org.com5104.seleniumcucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin={ "pretty", "html:output/cucumber"},
	features = {"classpath:features"}
)
public class AllJUnitCucumberRunner{
	
}