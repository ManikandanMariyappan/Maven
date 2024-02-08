package com.ddframwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDFrameworkNumeric {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File fi = new File("C:\\\\Users\\\\Manikandan\\\\eclipse-workspace\\\\MavenPractice\\\\exceldata\\\\Student Marks.xlsx");
		
		FileInputStream file = new FileInputStream(fi);
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
				
			
			
			Cell cell = row.getCell(1);
			
			double numericCellValue = cell.getNumericCellValue();
			
			System.out.println(numericCellValue);
			}
		}
	}

}
