package project_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultipleBrowser
{
  static   WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String browser;
        String  baseUrl = "https://www.saucedemo.com/";
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Browser name = ");
        browser = ob.nextLine();
        // Browser set up
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
       else if(browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name ");
        }
        // Open URL
        driver.get(baseUrl);
        // maximize page
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title
        System.out.println("Print the title = "+driver.getTitle());
        // Print the Current URL
        System.out.println("Print the current URL = "+driver.getCurrentUrl());
        // Print the page source
        System.out.println("Print the current source = "+driver.getPageSource());

        // Enter the email in email field
        driver.findElement(By.name("user-name")).sendKeys("Om@gmail.com");
        driver.findElement(By.name("password")).sendKeys("44355565");

        // close the Browser
        Thread.sleep(5000);
        driver.close();

    }
}
