package com.baseclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HelperClassWriteOperation {
	
	public static void createExcel(String fileName, String sheetName, int rowNo, int cellNo, String Value) throws IOException {
		
		File f = new File("C:\\Users\\Manikandan\\eclipse-workspace\\MavenPractice\\exceldata\\"+fileName+".xlsx");
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet(sheetName);
		
		Row row = sheet.createRow(rowNo);

		Cell cell = row.createCell(cellNo);
		
		cell.setCellValue(Value);
		
		FileOutputStream fout = new FileOutputStream(f);
		
		wb.write(fout);
	}
	

}
