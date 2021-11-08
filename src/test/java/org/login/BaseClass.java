package org.login;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
		static WebDriver driver;
		public static void AdBrowser(String url) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();	
		}
		public static WebElement locator(String I , String P) {
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
		public  static String excelread(String path,String sheetname, int rindex , int cindex) throws IOException {
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
		public static void sendText(WebElement S,String T ) {
			S.sendKeys(T);	
		}
		public static void Click(WebElement C) {
		C.click();
	}
		public static void selectByIndex(WebElement element , int Index) {
			Select S = new Select(element);
			S.selectByIndex(Index);
		}
		public static void selectByValue(WebElement element, String j) {
			Select s = new Select(element);
			s.selectByValue(j);
			}
		
}