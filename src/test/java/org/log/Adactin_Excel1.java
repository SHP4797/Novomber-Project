package org.log;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin_Excel1 extends Adaction_Excel {
	public static void main(String[] args) throws IOException {
		Adactin_Excel1 A = new Adactin_Excel1();
		A.AdBrowser("https://adactinhotelapp.com/");
		String excelread1 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 0, 0);
		WebElement locator = A.locator("id", "username");
		A.sendText(locator, excelread1 );
		String excelread2 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 0, 1);
		WebElement locator2 = A.locator("id", "password");	
		A.sendText(locator2, excelread2);
		WebElement locator3 = A.locator("id", "login");
		A.Click(locator3);
		String excelread3 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 0);
		WebElement locator4 = A.locator("id","location");
		int parseInt = Integer.parseInt(excelread3);
		A.selectByIndex(locator4, parseInt);
		String excelread4 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 1);
		WebElement locator5 = A.locator("id","hotels");
		int parseInt1 = Integer.parseInt(excelread4);
		A.selectByIndex(locator5, parseInt1);
		String excelread5 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 3);
		WebElement locator6 = A.locator("id","room_type");
		A.selectByValue(locator6,excelread5 );
		String excelread6 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 4);
		WebElement locator7 = A.locator("id","room_nos");
		A.selectByValue(locator7,excelread6 );
		/*WebElement locator8 = A.locator("id","datepick_in");
		A.Clear(locator8);
		String excelread7 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 5);
		int parseInt2 = Integer.parseInt(excelread7);
		A.selectByIndex(locator8, parseInt2);*/
		String excelread8 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 7);
		WebElement locator9 = A.locator("id","adult_room");
		int parseInt3 = Integer.parseInt(excelread8);
		A.selectByIndex(locator9, parseInt3);
		String excelread9 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 8);
		WebElement locator10 = A.locator("id","child_room");
		int parseInt4 = Integer.parseInt(excelread9);
		A.selectByIndex(locator10, parseInt4);
		WebElement locator11 = A.locator("id", "Submit");
		A.Click(locator11);
		WebElement locator12 = A.locator("id", "radiobutton_0");
		A.Click(locator12);
		WebElement locator13 = A.locator("id", "continue");
		A.Click(locator13);
		String excelread10 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 0);
		WebElement locator14 = A.locator("id","first_name");
		A.sendText(locator14, excelread10);
		String excelread11 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 1);
		WebElement locator15 = A.locator("id","last_name");
		A.sendText(locator15, excelread11);
		String excelread12 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 2);
		WebElement locator16 = A.locator("id","address");
		A.sendText(locator16, excelread12);
		String excelread13 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 3);
		WebElement locator17 = A.locator("id","cc_num");
		A.sendText(locator17, excelread13);
		String excelread14 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 7);
		WebElement locator18 = A.locator("id","cc_cvv");
		A.sendText(locator18, excelread14);
		String excelread15 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 4);
		WebElement locator19 = A.locator("id","cc_type");
		int parseInt5 = Integer.parseInt(excelread15);
		A.selectByIndex(locator19, parseInt5);
		String excelread16 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 5);
		WebElement locator20 = A.locator("id","cc_exp_month");
		int parseInt6 = Integer.parseInt(excelread16);
		A.selectByIndex(locator20, parseInt6);
		String excelread17 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 6);
		WebElement locator21 = A.locator("id","cc_exp_year");
		int parseInt7 = Integer.parseInt(excelread17);
		A.selectByIndex(locator21, parseInt7);
		WebElement locator22 = A.locator("id", "book_now");
		A.Click(locator22);
		/*String excelread18 = A.excelwrite("F:\\Hari\\Table.xlsx", "AKI", 3, 0);
		WebElement locator23 = A.locator("xpath","hotel_name");
		String gettingAttribute = A.gettingAttribute(locator23, excelread18);
		System.out.println(gettingAttribute);
		String excelread19 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 3, 1);
		WebElement locator24 = A.locator("xpath","location");
		String gettingAttribute1 = A.gettingAttribute(locator24, excelread19);
		System.out.println(gettingAttribute1);

		String excelread20 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 3, 2);
		WebElement locator25 = A.locator("xpath","location");
		String gettingAttribute2 = A.gettingAttribute(locator24, excelread20);
		System.out.println(gettingAttribute2);

		String excelread19 = A.excelread("F:\\Hari\\Table.xlsx", "AKI", 3, 3);
		WebElement locator24 = A.locator("xpath","room_type");
		String gettingAttribute1 = A.gettingAttribute(locator24, excelread19);
		System.out.println(gettingAttribute1);*/
		
	A.excelWrite("F:\\Hari\\Table.xlsx", "AKI", 3, 0, "Hotel Hervey");
	
		
	}

	

}
