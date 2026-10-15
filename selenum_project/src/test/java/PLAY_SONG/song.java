package PLAY_SONG;

import org.openqa.selenium.WebDriver;

import POM.POM1;

public class song {
public static void playsong(WebDriver driver) throws InterruptedException {
	POM1.youtubeseacrchbar(driver).sendKeys("kochako song");
	Thread.sleep(2000);
	POM1.searchbutton(driver).click();
	Thread.sleep(2000);
	POM1.thamnail(driver).click();
}
}
