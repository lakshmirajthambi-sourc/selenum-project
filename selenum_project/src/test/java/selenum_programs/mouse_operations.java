package selenum_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_operations {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/text-box");
Robot r=new Robot();
r.mouseMove(300, 500);
r.keyPress(KeyEvent.VK_ALT);
r.keyPress(KeyEvent.VK_F);
r.keyRelease(KeyEvent.VK_F);
r.keyRelease(KeyEvent.VK_ALT);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_ALT);

r.keyPress(KeyEvent.VK_W);
r.keyRelease(KeyEvent.VK_W);
r.keyRelease(KeyEvent.VK_ALT);
driver.close();

	}

}
