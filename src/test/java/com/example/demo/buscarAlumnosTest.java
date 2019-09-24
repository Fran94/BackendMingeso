package com.example.demo;

import org.junit.Test;
import org.openqa.selenium.*;


public class buscarAlumnosTest extends SeleniumConfig{

    @Test
    public void buscarAlumnos() throws InterruptedException {

        this.driver.get("http://157.245.12.218:80/");

        this.driver.manage().window().setSize(new Dimension(1036, 828));


        WebElement listar = this.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/aside/div[1]/div[2]/a[2]/div[2]/div"));
        listar.click();


        Thread.sleep(2000);

        WebElement buscador = this.driver.findElement(By.id("input-60"));
        buscador.sendKeys("SeleniumTest");

    }
}
