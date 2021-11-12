package org.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Base2 {

	WebDriver driver;

	public void Browser2(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
	
		public WebElement locator (String l, String v) {
		if(l.equals("xpath")) {
			WebElement Q = driver.findElement(By.xpath(v));
			return Q;
			}
		else if(l.equals("name")){
			WebElement W = driver.findElement(By.name(v));
			return W;
		}
		else {
			WebElement I = driver.findElement(By.id(v));
			return I;	
			}
		}	
		public void selectByIndex(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);	
		}
		public void selectByValue(WebElement element, String j) {
		Select s = new Select(element);
		s.selectByValue(j);
		}
		public void selectByVisibletext(WebElement element, String k) {
		Select s = new Select(element);
		s.selectByVisibleText(k);
		}
		public void deselectbyindex(WebElement element, int l) {
		Select s = new Select(element);
		s.deselectByIndex(l);
		}
		public void deselectbyVisibleText(WebElement element, String o) {
		Select s = new Select(element);
		s.deselectByVisibleText(o);
		}
		public void selectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
		}
		public void selectedoption(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
		}
		public void selectedAlloptionl(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();
		}
		public void multiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
		}
		public void getOptions(WebElement element) {
		Select s = new Select(element);
		s.getOptions();
		}
		public void action(WebElement element ) {
		Actions A = new Actions(driver);
		A.contextClick(element);	
		}
		public void DragandDrop(WebElement element , WebElement DD) {
		Actions D =  new Actions(driver);	
		D.dragAndDrop(element, DD).perform();
		}
		public void Navigation(String url) throws InterruptedException {
		driver.navigate().to(url);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();	
		driver.navigate().refresh();
	    }
	    public void Alert(WebElement element) {
		Alert a = driver.switchTo().alert();
		a.accept();
	    }
	    public void Alert1(WebElement element) {
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	    }
	    public void Alert2(WebElement element) {
		Alert a2 = driver.switchTo().alert();
		a2.sendKeys("SHP");
	    }
	    public void bttnclick(WebElement C) {
		C.click();
		}
	    public void javaScroll(WebElement element) throws InterruptedException {
		JavascriptExecutor J = (JavascriptExecutor)driver;
		J.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		J.executeScript("window.scrollBy(0,-500)");
	    }
	    public void JAVASCRIPT(WebElement element) {
		JavascriptExecutor J1 = (JavascriptExecutor)driver;
		J1.executeScript("arguments[0].setAttribute('Value','Hp')",element );
		J1.executeScript("arguments[0].setAttribute('style','background: green; border: solid 2px red');", element);
	    }
	    public void ScreenShot() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File t = new File("F:\\Hari\\hp.pmg");
		FileUtils.copyFile(screenshotAs, t);
	    }	
		public void frame(WebElement element, String l) {
			driver.switchTo().frame(l);
		}
		public String gettext(WebElement element, String m) {
	    String text = element.getText();
	    return text;
	    }
		public void actio(WebElement element ) {
			Actions A = new Actions(driver);
			A.moveToElement(element).perform();
		}
		public void  sendText(WebElement c , String t) {
			c.sendKeys(t);
		}
		public void btnclick(WebElement C) {
			C.click();
		}
		public String excelread(String path, String sheetname, int rowindex, int cellindex) throws IOException {
			File f = new File(path);
			FileInputStream stream = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(stream);
			Sheet sheet = w.getSheet(sheetname);
			Row row = sheet.getRow(rowindex);
			Cell cell = row.getCell(cellindex);
			int cellType = cell.getCellType();
					
			if(cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
					}
					
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
				String format = s.format(dateCellValue);
				return format;
				}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long)numericCellValue;
				String valueOf = String.valueOf(l);
				return valueOf;
			}
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

	
		public static void main(String[] args) throws InterruptedException, IOException {
		Base2 a = new Base2();
		a.Browser2("http://demo.automationtesting.in/Register.html");
		String excelread = a.excelread("F:\\Hari\\Table.xlsx", "AKI", 0, 0);
		WebElement locator = a.locator("xpath", "//input[@type='text']");
		a.sendText(locator, excelread);
		String excelread2 = a.excelread("F:\\Hari\\Table.xlsx", "AKI", 1,0 );
		WebElement locator2 = a.locator("xpath", "//textarea[@rows='3']");
		a.sendText(locator2, excelread2);
		String excelread3 = a.excelread("F:\\Hari\\Table.xlsx", "AKI", 0,1);
		WebElement locator3 = a.locator("xpath","//input[@placeholder='Last Name']");
		a.sendText(locator3, excelread3);
		a.excelread("F:\\Hari\\Table.xlsx", "AKI", 1,0 );
		
		
		a.Browser2("https://www.google.co.in/");
		WebElement Lo = a.locator("xpath", "(//a[@class='gb_3 gb_4 gb_3d gb_3c'])");
		a.bttnclick(Lo);
		a.action(Lo);
		a.Browser2("http://demo.guru99.com/test/drag_drop.html");
		WebElement locator = a.locator("id", "credit2");
		WebElement locator2 = a.locator("id", "bank");
		a.DragandDrop(locator, locator2);
		a.Navigation("http://www.greenstechnologys.com/");
		a.Browser2("http://demo.automationtesting.in/Alerts.html");
		WebElement locator3 = a.locator("xpath", "//button[@class='btn btn-danger']");
		a.bttnclick(locator3);
		a.Alert(locator3);
		Thread.sleep(3000);
		a.javaScroll(locator3);
		a.Browser2("https://www.facebook.com/");
		WebElement JE = a.locator("id", "email");
		a.JAVASCRIPT(JE);
		WebElement fbh = a.locator("id", "email");
		a.JAVASCRIPT(fbh);
			
	}
		
	
