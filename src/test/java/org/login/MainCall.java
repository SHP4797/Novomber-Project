package org.login;

import java.io.IOException;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.openqa.selenium.WebElement;

public class MainCall extends BaseClass {
public static void main(String[] args) throws IOException {
	AdBrowser("https://adactinhotelapp.com/");
	Home a = new Home();
	WebElement username = a.getUsername();
	String excelread = excelread("F:\\Hari\\Table.xlsx", "AKI", 0, 0);
	sendText(username, excelread);
	WebElement password = a.getPassword();
	String excelread1 = excelread("F:\\Hari\\Table.xlsx", "AKI", 0, 1);
	sendText(password, excelread1);
	WebElement login = a.getLogin();
	Click(login);
	
	
	Home2nd b = new Home2nd();
	WebElement username1 = b.getLocation();
	String excelread2 = excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 0);
	int parseInt = Integer.parseInt(excelread2);
	selectByIndex(username1, parseInt);
	WebElement username2 = b.getHotels();
	String excelread3 = excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 1);
	int parseInt1 = Integer.parseInt(excelread3);
	selectByIndex(username2, parseInt1);
	WebElement username3 = b.getRoom();
	String excelread4 = excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 2);
	int parseInt2 = Integer.parseInt(excelread4);
	selectByIndex(username3, parseInt2);
	WebElement username4= b.getNoofroom();
	String excelread5 = excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 3);
	int parseInt3 = Integer.parseInt(excelread5);
	selectByIndex(username4, parseInt3);
	WebElement username6 = b.getAdult();
	String excelread7 = excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 6);
	int parseInt5 = Integer.parseInt(excelread7);
	selectByIndex(username6, parseInt5);
	WebElement username7 = b.getChildren();
	String excelread8 = excelread("F:\\Hari\\Table.xlsx", "AKI", 1, 7);
	int parseInt6 = Integer.parseInt(excelread8);
	selectByIndex(username7, parseInt6);
	WebElement username8 = b.getSubmit();
	Click(username8);
	
	
	Home3rd c =new  Home3rd();
	WebElement radio = c.getRadio();
	Click(radio);
	WebElement continue1 = c.getContinue();
	Click(continue1);
	
	
	
	Home4th d = new Home4th();
	WebElement fn = d.getFN();
	String excelread9 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 0);
	sendText(fn, excelread9);
	WebElement ln = d.getLN();
	String excelread10 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 1);
	sendText(ln, excelread10);
	WebElement add = d.getADD();
	String excelread11 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 2);
	sendText(add, excelread11);
	WebElement ccno = d.getCCNO();
	String excelread12 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 3);
	sendText(ccno, excelread12);
	WebElement ccType = d.getCCType();
	String excelread13 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 4);
	int parseInt11 = Integer.parseInt(excelread13);
	selectByIndex(ccType, parseInt11);
	WebElement exp = d.getExp();
	String excelread14 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 5);
	int parseInt12 = Integer.parseInt(excelread14);
	selectByIndex(exp, parseInt12);
	WebElement eXpDate = d.getEXpDate();
	String excelread15 = excelread("F:\\Hari\\Table.xlsx", "AKI", 2, 6);
	int parseInt13 = Integer.parseInt(excelread15);
	selectByIndex(eXpDate, parseInt13);
	WebElement bn = d.getBN();
	Click(bn);



}
}
