package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;


public class HandlingAllHtmlControls
{

    @Test
    public void testTextBox() throws Exception
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);

        try
        {
            WebElement textBox = driver.findElement(By.id("firstName"));
            textBox.sendKeys("Nithin");
        }
        catch (WebDriverException e)
        {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C://Users//Nithin Chiguru//Pictures//Screenshots//STM.jpg"));
            throw e;
        }
    }


    @Test
    public void testLabel() throws Exception
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);

        try
        {
            WebElement label = driver.findElement(By.id("userName-label"));
            String text = label.getText();
            System.out.println(text);
        }
        catch (WebDriverException e)
        {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C://Users//Nithin Chiguru//Pictures//Screenshots//STM.jpg"));
            throw e;
        }
    }


    @Test
    public void testCheckbox() throws Exception
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);

        try
        {
            WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
            boolean isSelected = checkBoxSelected.isSelected();
            if(isSelected == false)
            {
                checkBoxSelected.click();
            }
        }
        catch (WebDriverException e)
        {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C://Users//Nithin Chiguru//Pictures//Screenshots//STM.jpg"));
            throw e;
        }
    }


    @Test
    public void testDropdown() throws Exception
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(1000);

        try
        {
            WebElement courseElement =driver.findElement(By.id("course"));
            Select courseNameDropdown=new Select(courseElement);
            courseNameDropdown.selectByIndex(1);
            Thread.sleep(3000);
            courseNameDropdown.selectByVisibleText("Java");
            Thread.sleep(2000);
            courseNameDropdown.selectByValue("python");
        }
        catch (WebDriverException e)
        {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C://Users//Nithin Chiguru//Pictures//Screenshots//STM.jpg"));
            throw e;
        }
    }

    @Test
    public void testLink() throws Exception
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://lms.kluniversity.in/login/index.php");
        Thread.sleep(1000);

        try
        {
            WebElement link = driver.findElement(By.linkText("Lost password?"));
            link.click();
            String url = driver.getCurrentUrl();
        }
        catch (WebDriverException e)
        {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C://Users//Nithin Chiguru//Pictures//Screenshots//STM.jpg"));
            throw e;
        }
    }



}
