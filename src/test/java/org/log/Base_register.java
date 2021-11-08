package org.log;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Base_register extends Base2 {
	
	public static void main(String[] args) throws IOException {
		Base_register b = new Base_register();
		b.Browser2("http://demo.automationtesting.in/Register.html");
		String excelread = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 0, 0);
		WebElement locator = b.locator("xpath", "//input[@type='text']");
		b.sendText(locator, excelread);
		String excelread2 = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 1,0 );
		WebElement locator2 = b.locator("xpath", "//textarea[@rows='3']");
		b.sendText(locator2, excelread2);
		String excelread3 = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 0,1);
		WebElement locator3 = b.locator("xpath","//input[@placeholder='Last Name']");
		b.sendText(locator3, excelread3);
		String excelread4 = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 1,1 );
		WebElement locator4 = b.locator("xpath", "//input[@type='tel']");
		b.sendText(locator4, excelread4);
		String excelread5 = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 3,0);
		WebElement locator5 = b.locator("id","//input[@type='email']");
		b.sendText(locator5, excelread5);
		String excelread6 = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 4,0);
		WebElement locator6 = b.locator("xpath","//input[@id='firstpassword']");
		b.sendText(locator6, excelread6);
		String excelread7 = b.excelread("F:\\Hari\\Table.xlsx", "AKI", 4,0);
		WebElement locator7 = b.locator("xpath","//input[@id='secondpassword']");
		b.sendText(locator7, excelread7);
		}
	}

