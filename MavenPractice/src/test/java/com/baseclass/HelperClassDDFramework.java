package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HelperClassDDFramework {
	
	public static String readData(String sheetName, int rowNo, int cellNo) throws IOException {
		
		File f = new File("C:\\Users\\Manikandan\\eclipse-workspace\\MavenPractice\\exceldata\\WriteOps.xlsx");
		
		FileInputStream file = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(file);
		
		Sheet sh = wb.getSheet(sheetName);
		
		Row row = sh.getRow(rowNo);
		
		Cell cell = row.getCell(cellNo);
		
		int cellType = cell.getCellType();
		
		String input;
		
		if (cellType == 1) {
			
		 input = cell.getStringCellValue();
			
		} else if (DateUtil.isCellDateFormatted(cell)) {
			
			Date dateCellValue = cell.getDateCellValue();
			
			SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			input = date.format(dateCellValue);
			
		} 
		else{
			
			double numericCellValue = cell.getNumericCellValue();
			
			long l= (long) numericCellValue;
			
			input = String.valueOf(l);

		}

		return input;
	}

}
