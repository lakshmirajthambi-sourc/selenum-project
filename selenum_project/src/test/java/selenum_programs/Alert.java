package selenum_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.name("cusid")).sendKeys("53920");
driver.findElement(By.name("submit")).submit();
org.openqa.selenium.Alert alert= driver.switchTo().alert();
String alertmessage=driver.switchTo().alert().getText();
System.out.println("alert message"+alertmessage);
Thread.sleep(5000);
alert.accept();
alert.dismiss();
	}

}
