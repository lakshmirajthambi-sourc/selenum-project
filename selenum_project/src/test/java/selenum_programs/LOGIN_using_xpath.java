package selenum_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOGIN_using_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/V1/");
driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr664847");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("UpYmysa");
driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
Thread.sleep(3000);
driver.close();
	}

}
