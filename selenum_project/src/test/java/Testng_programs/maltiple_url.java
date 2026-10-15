package Testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maltiple_url {
WebDriver driver;
@Test
public void google_open() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.close();
}
@Test
public void login() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/V1/");
	driver.findElement(By.name("uid")).sendKeys("mngr664847");
	driver.findElement(By.name("password")).sendKeys("UpYmysa");
	driver.findElement(By.name("btnLogin")).click();
	driver.close();
}
@Test
public void dropdown() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
	Select dropdown=new Select(driver.findElement(By.cssSelector("#post-2646 > div.twelve.columns > div > div > div > p > select")));	
	dropdown.selectByVisibleText("India");
	driver.close();
}
@Test
public void scrollup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	JavascriptExecutor javaobject=(JavascriptExecutor)driver;
	javaobject.executeScript("window.scrollBy(0,9000)");
	Thread.sleep(3000);
	javaobject.executeScript("window.scrollBy(0,-9000)");
	Thread.sleep(3000);
	driver.close();
	
}
}
