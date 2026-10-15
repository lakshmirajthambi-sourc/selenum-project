package selenum_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_tittle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver();
WebDriver driver=new ChromeDriver();
driver.get("https://medlablive.in/#/");
String tittle=driver.getTitle();
System.out.println("the tittle of the page is "+tittle);
String currenturl=driver.getCurrentUrl();
System.out.println("the url of the page is "+currenturl);
String sourcecode=driver.getPageSource();
System.out.println("the sourece code of the page is "+sourcecode);
Thread.sleep(3000);
driver.close();
	}

}
