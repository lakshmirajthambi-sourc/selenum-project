package selenum_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
Select  dropDown= new Select(driver.findElement(By.cssSelector("#post-2646 > div.twelve.columns > div > div > div > p > select")));
dropDown.selectByVisibleText("India");
driver.close();
	}

}
