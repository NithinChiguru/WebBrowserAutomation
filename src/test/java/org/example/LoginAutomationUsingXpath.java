package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationUsingXpath
{
    @Test
    public void test()
    {
        System.out.println("Program is Running");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://github.com/login");

        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("NithinChiguru");
        highlight(driver,driver.findElement(By.xpath("//input[@id='login_field']")));

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nithin.chiguru15082016");
        highlight(driver,driver.findElement(By.xpath("//input[@id='password']")));

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String str= driver.findElement(By.xpath("//div[@class='js-flash-alert']")).getText();

    }


    public static void highlight(WebDriver driver, WebElement element)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
    }

}
