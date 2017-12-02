package org.com5104.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class WebDriverUtil {
    public static long DEFAULT_WAIT = 20;
    protected static WebDriver driver=null;

    public static WebDriver getDefaultDriver() {
    	DesiredCapabilities caps = new DesiredCapabilities();
    	caps.setJavascriptEnabled(true);                
    	caps.setCapability("takesScreenshot", true);  
    	caps.setCapability(
    			PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
    	        ".\\phantomjs\\phantomjs-2.1.1-windows\\\\bin\\phantomjs.exe"
    	);
    	WebDriver driver = new  PhantomJSDriver(caps);
        return driver;
    }
}
