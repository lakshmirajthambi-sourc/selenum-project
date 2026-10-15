package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM1 {
public static WebElement youtubeseacrchbar(WebDriver driver) {
	WebElement web1=driver.findElement(By.name("search_query"));
	return web1;
}
public static WebElement searchbutton(WebDriver driver) {
	WebElement web1=driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/div/button/span/span/div"));
	return web1;
}
public static WebElement thamnail(WebDriver driver) {
	WebElement web1=driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
	return web1;
}
}
