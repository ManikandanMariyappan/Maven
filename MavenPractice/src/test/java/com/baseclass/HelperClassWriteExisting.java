package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HelperClassWriteExisting {
	
public static void addExistingFiles(String fileName, String sheetName, int rowNo, int cellNo, String Value) throws IOException {
		
		File f = new File("C:\\Users\\Manikandan\\eclipse-workspace\\MavenPractice\\exceldata\\"+fileName+".xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fin);
		
		Sheet sheet0 = wb.getSheet(sheetName);
		
		Row sheet0row0 = sheet0.createRow(rowNo);
		
		Cell sheet0row0cell0 = sheet0row0.createCell(cellNo);
		
		sheet0row0cell0.setCellValue(Value);
		
		FileOutputStream fout = new FileOutputStream(f);
		
		wb.write(fout);
		
		
}

//public static boolean isRowEmpty(Row row) {
//    for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
//        Cell cell = row.getCell(c);
//        if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
//            return false;
//    }
//    return true;
}


