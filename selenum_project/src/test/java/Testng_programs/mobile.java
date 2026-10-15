package Testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mobile {

    WebDriver driver;

    @BeforeTest
    public void browerpage() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://live.techpanda.org/index.php/");
    }

    // Title
    @Test(priority = 1)
    public void gettingtitle() {

        String title = driver.getTitle();

        System.out.println("The title of the page is " + title);
    }

    // Click Mobile
    @Test(priority = 2)
    public void mobileclick() {

        // Click on Mobile menu
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();

        // Mobile page title
        String mobilepagetitle = driver.getTitle();

        System.out.println("The title of the page is " + mobilepagetitle);
    }

    // Sort by Name
    @Test(priority = 3)
    public void verifySortingByName() {

        // Select "Name" from Sort By dropdown
        Select dropDown = new Select(
            driver.findElement(By.cssSelector(
                "body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select"
            ))
        );

        dropDown.selectByVisibleText("Name");
    }

    @AfterTest
    public void clos() {

        driver.close();
    }
}