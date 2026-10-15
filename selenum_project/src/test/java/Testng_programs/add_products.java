package Testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class add_products {

    WebDriver driver;

    @BeforeTest
    public void browerpage() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://live.techpanda.org/index.php/");
    }

    @Test
    public void mobileclick() throws InterruptedException {

        // Click on Mobile menu
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();

        Thread.sleep(2000);

        // Mobile page title
        String mobilepagetitle = driver.getTitle();

        System.out.println("The title of the page is " + mobilepagetitle);

        // Add Sony Xperia to cart
        driver.findElement(By.xpath(
                "(//span[text()='Add to Cart'])[1]"
        )).click();

        Thread.sleep(3000);

        // Change quantity to 1000
        driver.findElement(By.xpath("//input[@title='Qty']")).clear();

        driver.findElement(By.xpath("//input[@title='Qty']"))
              .sendKeys("1000");

        Thread.sleep(2000);

        // Click Update
        driver.findElement(By.xpath("//button[@title='Update']")).click();

        Thread.sleep(3000);

        
        // Verify error message
        String errormessage = driver.findElement (By.tagName("h1")).getText();

        System.out.println("The message is " + errormessage);

        
      }
        @AfterTest
        public void closing() {
        	driver.close();
        }
    }
