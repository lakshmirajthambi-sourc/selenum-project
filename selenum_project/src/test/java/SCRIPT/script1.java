package SCRIPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;

import PLAY_SONG.song;
import io.github.bonigarcia.wdm.WebDriverManager;

public class script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
ChromeOptions options=new ChromeOptions();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
song.playsong(driver);
	}

}
