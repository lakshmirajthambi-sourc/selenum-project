package selenum_programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFSingleXmlCell;

import com.sun.source.tree.ForLoopTree;

import sun.security.util.FilePaths;

public class write_exel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filePath="C:\\Users\\LAKSHMI\\Desktop\\writeexel.xlsx";
XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet=workbook.createSheet("sheet");
String[][]data={
{"username","pasword","message"},//header row
{"username","pass1","hello from user1"},
{"user2","pass2","hello from user2"},
{"user3","pass3","hello from user 3"},
{"user4","passout1","very good"} 
	};//writing data to the sheet
for(int i=0;i<data.length;i++){
XSSFRow row=sheet.createRow(i);
for(int j=0;j<data[i].length;j++) {
	XSSFCell cell=row.createCell(j);
	cell.setCellValue(data[i][j]);//set cell value
	}}
//write the output to the file
Object filepath;
try (FileOutputStream fileOut = new FileOutputStream(new File(filePath))) {
	workbook.write(fileOut);
	System.out.println("xecel file sucessfully" + filePath);
	}catch(IOException e) {
		e.printStackTrace();
		}
	//close the workbook
try {
	workbook.close();
	}
catch(IOException e) {
	e.printStackTrace();
}
	}}
