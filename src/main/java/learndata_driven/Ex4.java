package learndata_driven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex4 {
	 public static String [][] readexceldata() throws IOException {
		 
		 XSSFWorkbook wbook = new XSSFWorkbook("./Data/Logintravels.xlsx");
		 XSSFSheet sheet = wbook.getSheet("Sheet1");
		 
		 int rowcount =sheet.getLastRowNum();
		 int colcount =sheet.getRow(0).getLastCellNum();
		 
		 String data [][] = new String [rowcount] [colcount];
		 
		 for (int i=1;i<=rowcount;i++) {
			 XSSFRow row = sheet.getRow(i);
			 for (int j=0;j<colcount;j++) {
				 XSSFCell cell = row.getCell(j);
				 data [i-1][j] = cell.getStringCellValue();
			 }
		 }
		 wbook.close();
		 return data;
	 }
		
}
