package Testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_maltiple_test {
WebDriver driver;
@BeforeMethod
public void set() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	}
@Test(invocationCount = 10)
public void maltiple_login_test() throws InterruptedException {
	//user name and password
String username="standard_user";
String password="secret_sauce";
driver.findElement(By.id("user-name")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.id("login-button")).click();
Thread.sleep(2000);
}
@AfterMethod
public void close() {
	driver.close();
}
}
