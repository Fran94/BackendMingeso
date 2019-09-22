package com.example.demo;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class InsertarAlumnoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
      System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
      driver = new ChromeDriver();
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void insertarAlumno() throws InterruptedException {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(1036, 828));
    WebElement name = driver.findElement(By.id("input-23"));
    name.sendKeys("SeleniumTest");
    WebElement rut = driver.findElement(By.id("input-27"));
    rut.sendKeys("1.111.111-1");
    WebElement dateWidget = driver.findElement(By.id("input-32"));
    dateWidget.click();

    Thread.sleep(500);
    WebElement day = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/button"));
    day.click();
    Thread.sleep(500);
    driver.findElement(By.id("button_ok")).click();

    Thread.sleep(500);
    WebElement dropDown = driver.findElement(By.cssSelector(".v-select__selections"));
    dropDown.click();

    Thread.sleep(500);
    driver.findElement(By.xpath("//*[@id=\"ingeniería-civil-en-electricidad-list-item-67\"]")).click();

    driver.findElement(By.cssSelector(".v-input--selection-controls__ripple")).click();
    driver.findElement(By.cssSelector(".success > .v-btn__content")).click();
    }
}