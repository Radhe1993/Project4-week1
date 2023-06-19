package project_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_Saucedemo
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.saucedemo.com/";
        // Set up the Browser
        WebDriver driver = new ChromeDriver();

        // Open URl
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title
        System.out.println("Print the title = "+driver.getTitle());
        // Print the Current Url
        System.out.println("Print the Current URL = "+driver.getCurrentUrl());
        // Print the page source
        System.out.println("Print the page source = "+driver.getPageSource());
        // Enter the email in email field
        driver.findElement(By.name("user-name")).sendKeys("Om@gmail.com");
        // Enter the password in password field
        driver.findElement(By.name("password")).sendKeys("44355565");

        Thread.sleep(5000);
        driver.close();

    }
}
