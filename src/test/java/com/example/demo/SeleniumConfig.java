package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SeleniumConfig {

    protected WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setVersion("");
        this.driver = new RemoteWebDriver(new URL("http://157.245.12.218:4444/wd/hub"), capabilities);

        //System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
        //driver = new ChromeDriver();

        this.js = (JavascriptExecutor) this.driver;
        this.vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        this.driver.quit();
    }

}
