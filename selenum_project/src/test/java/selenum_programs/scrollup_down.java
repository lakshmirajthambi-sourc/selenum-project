package selenum_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollup_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver(); 
driver.get("https://omayo.blogspot.com/");
JavascriptExecutor javaObject = (JavascriptExecutor) driver;
javaObject.executeScript("window.scrollBy(0,9000)");
Thread.sleep(3000);
javaObject.executeScript("window.scrollBy(0,-9000)");
Thread.sleep(3000);
driver.close();
	}

}
