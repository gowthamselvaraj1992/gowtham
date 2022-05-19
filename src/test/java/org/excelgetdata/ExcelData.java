package org.excelgetdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPractise\\Exceltest1\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("sheet1");
	Row row = sheet.getRow(3);
	Cell cell = row.getCell(2);
	String x = cell.getStringCellValue();
	System.out.println(x);
	
	
	
	
}
}
