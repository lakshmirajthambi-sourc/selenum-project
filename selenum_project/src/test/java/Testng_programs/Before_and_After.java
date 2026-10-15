package Testng_programs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Before_and_After {
public String baseurl="https://www.browserstack.com/";
public WebDriver driver;
@BeforeTest
public void launchBrower() {
	System.out.println(" launching chrome brower");
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void verifyinghomepagetitle() {
	String expectedTitle="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	String actualtitle=driver.getTitle();
	assertEquals(actualtitle,expectedTitle);
}
@AfterTest
public void terminateBrower() {
	driver.close();
}
}
