package org.excelgetdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skillsdrop = driver.findElement(By.id("Skills"));
		Select select = new Select(skillsdrop);
		
			File file = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPractise\\Exceltest1\\Book2.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet createSheet = workbook.createSheet("Sheet4");
			List<WebElement> getfull = select.getOptions();
			for (int i = 0; i < getfull.size(); i++) {
				WebElement ee = getfull.get(i);
				String text = ee.getText();
				System.out.println(text);
			Row createRow = createSheet.createRow(0+i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			FileOutputStream stream2 = new FileOutputStream(file);
		
			workbook.write(stream2);

			}
		}
	}


