package selenum_programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
TakesScreenshot ts=(TakesScreenshot)driver;
File srcFile=ts.getScreenshotAs(OutputType.FILE);
File destfileFile=new File("C:\\Users\\LAKSHMI\\Pictures\\Screenshots.png");
Files.copy(srcFile,destfileFile);
driver.close();


	}

}
