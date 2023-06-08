package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\data\\RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		//XSSFSheet sheet = workbook.getSheet("smokeTest");
		HSSFSheet sheet = workbook.getSheet("Student");
		
		//workbook.getSheetAt(1);
		int rowCount = sheet.getLastRowNum();
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		
		
		
		System.out.println("Row count are: " + rowCount);					//5
		System.out.println("Columns count are: " + columnCount);			//5
		
		
		
		
		
		for (int row = 1; row <= rowCount ; row++) {
			
			
			HSSFRow currentRow = sheet.getRow(row);
			
			
			String firstName = currentRow.getCell(0).toString();
			String address = currentRow.getCell(4).toString();
			System.out.println("--------------"+row+"------------------");
			System.out.println("FirstName: " + firstName);
			
			System.out.println("Address: " + address);
			
			System.out.println("---------------------------------");
		}
		
		

	}

}
