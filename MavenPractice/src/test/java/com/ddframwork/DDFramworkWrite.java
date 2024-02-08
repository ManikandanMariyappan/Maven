package com.ddframwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.baseclass.HelperClassDDFramework;

public class DDFramworkWrite extends HelperClassDDFramework{

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Manikandan\\eclipse-workspace\\MavenPractice\\exceldata\\WriteOps.xlsx");
		
		Workbook wb = new XSSFWorkbook();

		Sheet sheet0 = wb.createSheet("Student_Name");
		Sheet sheet1 = wb.createSheet("Student_Marks");
		
		Row row0 = sheet0.createRow(0);
		Row row1 = sheet0.createRow(1);
		
		Cell row0cell0 = row0.createCell(0);
		Cell row0cell1 = row0.createCell(1);
		Cell row1cell0 = row1.createCell(0);
		Cell row1cell1 = row1.createCell(1);
		
		row0cell0.setCellValue("Mani");
		row0cell1.setCellValue("Ram");
		row1cell0.setCellValue("Jai");
		row1cell1.setCellValue("Suren");
		
		Row s1Row0 = sheet1.createRow(0);
		Row s1Row1 = sheet1.createRow(1);
		
		Cell s1Row0Cell0 = s1Row0.createCell(0);
		Cell s1Row0Cell1 = s1Row0.createCell(1);
		Cell s1Row1Cell0 = s1Row1.createCell(0);
		Cell s1Row1Cell1 = s1Row1.createCell(1);
		
		s1Row0Cell0.setCellValue(70);
		s1Row0Cell1.setCellValue(80);
		s1Row1Cell0.setCellValue(88);
		s1Row1Cell1.setCellValue(91);
		
		FileOutputStream fout = new FileOutputStream(f);
		
		wb.write(fout);
		
		System.out.println("Write Operations sucessfully performed");
		
		String data = readData("Student_Name", 0, 0);
		
		System.out.println(data);
		
		System.out.println(readData("Student_Marks", 0, 0));
		
		
		
	}

}
