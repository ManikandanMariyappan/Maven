package com.ddframwork;

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

public class DDFrameworkString {

	public static void main(String[] args) throws IOException {

		// Giving File Location
		File f = new File("C:\\Users\\Manikandan\\eclipse-workspace\\MavenPractice\\exceldata\\Student Data.xlsx");

		// To Perform Read operations
		FileInputStream file = new FileInputStream(f);

		// To Inform Workbook
		Workbook wb = new XSSFWorkbook(file);

		// To get Sheet
		Sheet sheet = wb.getSheet("Data");

		// To get Row
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			int cellType = cell.getCellType();
			if (cellType == 1) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			} else if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("dd/MMM/YYYY");
				String format = date.format(dateCellValue);
				System.out.println(format);

			} else {

				double numericCellValue = cell.getNumericCellValue();
				int k = (int) numericCellValue;
				System.out.println(k);

			}

		}

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);
			int cellType = cell.getCellType();
			if (cellType == 1) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			} else if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				System.out.println(dateCellValue);

			} else {

				double numericCellValue = cell.getNumericCellValue();
				int k = (int) numericCellValue;
				System.out.println(k);

			}

		}
	}

}
