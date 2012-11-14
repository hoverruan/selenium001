package com.github.hoverruan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://cn.bing.com");

        System.out.println("Page title: " + driver.getTitle());

        WebElement query = driver.findElement(By.id("sb_form_q"));
        query.sendKeys("Chengdu panda");
        query.submit();

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}
