package com.example.demo;

import org.junit.Test;
import org.openqa.selenium.*;

public class listarAlumnosTest extends SeleniumConfig{

    @Test
    public void listarAlumnos() throws InterruptedException {

        this.driver.get("http://157.245.12.218:80/");

        this.driver.manage().window().setSize(new Dimension(1036, 828));

        Thread.sleep(500);

        WebElement listar = this.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/aside/div[1]/div[2]/a[2]/div[2]/div"));
        listar.click();

        Thread.sleep(2000);


    }
}
