package org.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
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

public class ADACTION {
	WebDriver driver;
	public void AdBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();	
	}
	public WebElement locator(String I , String P) {
		if(I.equals("xpath")) {
			WebElement x = driver.findElement(By.xpath(P));
			return x;
		}
		else if(I.equals("id")) {
			WebElement i = driver.findElement(By.id(P));
			return i;
		}
		else {
			WebElement n = driver.findElement(By.name(P));
			return n;
		}
	}
	public String excelread(String path,String sheetname, int rindex , int cindex) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rindex);
		Cell cell = row.getCell(cindex);
		int cellType = cell.getCellType();
		if(cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		}
		else if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
			String format = D.format(dateCellValue);
			return format;
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;	
		}
	}
	public void selectByIndex(WebElement element , int Index) {
		Select S = new Select(element);
		S.selectByIndex(Index);
	}
	public void selectByValue(WebElement element, String j) {
		Select s = new Select(element);
		s.selectByValue(j);
		}
	public void Clear(WebElement c) {
		c.clear();
		
	}
	public void sendText(WebElement S,String T ) {
		S.sendKeys(T);	
	}
	public void Click(WebElement C) {
	C.click();
}
	public void excelWrite(String path, String sheetname,int rowindex,int cellindex,String value) throws IOException {
		File f1 = new File(path);
		FileOutputStream stream1 = new FileOutputStream(f1);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet1 = w.createSheet(sheetname);
		Row createRow1 = createSheet1.createRow(rowindex);
		Cell createCell1 = createRow1.createCell(cellindex);
		createCell1.setCellValue(value);
		w.write(stream1);
		}
	public String  gettingAttribute(WebElement element, String Value) {
		String attribute = element.getAttribute(Value);
		return attribute;
		
	}
}
