package selenum_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class read_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream(new File("C:\\Users\\LAKSHMI\\Desktop\\readexl.xlsx"));
XSSFWorkbook Workbook=new XSSFWorkbook(file);
XSSFSheet Sheet=Workbook.getSheetAt(0);

for(int i=1;i<=Sheet.getLastRowNum();i++) {
	String username=Sheet.getRow(i).getCell(0).getStringCellValue();
	String password=Sheet.getRow(i).getCell(1).getStringCellValue();
	String message=Sheet.getRow(i).getCell(2).getStringCellValue();
	System.out.println("username:"+username);
	System.out.println("password:"+password);
	System.out.println("message:"+message);
}
	}

}
