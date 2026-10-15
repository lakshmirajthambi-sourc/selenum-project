package selenum_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/LAKSHMI/Desktop/webtable.html");
List<WebElement>AllRows=driver.findElements(By.xpath("//tr"));
int totalRows=AllRows.size();
System.out.println("total number of rows present in the table is: "+totalRows);

List<WebElement>allcolums=driver.findElements(By.xpath("//th"));
int totalcolums=allcolums.size();
System.out.println("total number of colums present in the table is: "+totalcolums);

List<WebElement>allcells=driver.findElements(By.xpath("//th|//td"));
int totalcells=allcells.size();
System.out.println("total number of cells present in the table is: "+totalcells);

int sum=0;
int countnumbervalue=0;
for(WebElement cell:allcells) {
	String cellvalue=cell.getText();
	try{
		int number=Integer.parseInt(cellvalue);
		System.out.println(""+number);
		countnumbervalue++;
		sum=sum+number;}
	
	catch(Exception e) {}}
		System.out.println("total count of numeric values is: "+countnumbervalue);
		System.out.println("total sum of all the numeric values is: "+sum);
	}
}
	


