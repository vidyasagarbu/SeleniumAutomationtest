package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\data\\RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//XSSFSheet sheet = workbook.getSheet("smokeTest");
		XSSFSheet sheet = workbook.getSheet("Student");
		
		//workbook.getSheetAt(1);
		int rowCount = sheet.getLastRowNum();
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		
		
		
		System.out.println("Row count are: " + rowCount);					//5
		System.out.println("Columns count are: " + columnCount);			//5
		
		
		
		
		
		for (int row = 1; row <= rowCount ; row++) {
			
			
			XSSFRow currentRow = sheet.getRow(row);
			
			
			String firstName = currentRow.getCell(0).toString();
			String address = currentRow.getCell(4).toString();
			System.out.println("--------------"+row+"------------------");
			System.out.println("FirstName: " + firstName);
			
			System.out.println("Address: " + address);
			
			System.out.println("---------------------------------");
		}
		
		

	}

}
