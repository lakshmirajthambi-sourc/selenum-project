package selenum_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/radio.html");
WebElement redio1=driver.findElement(By.id("vfb-7-1"));
WebElement redio2=driver.findElement(By.id("vfb-7-2"));
redio1.click();
System.out.println("redio button1 selected");
redio2.click();
System.out.println("redio button2 selected");
WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
checkbox1.click();
if(checkbox1.isSelected()) {
	System.out.println("check box1 is selected");
}
else {
	System.out.println("check box2 is not selected");
}
	}

}
